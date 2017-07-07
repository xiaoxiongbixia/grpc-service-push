#根证书的生成方式
#step 1，输入密码123456，生成文件cakey.pem
openssl genrsa -aes256 -out cakey.pem 2048
#step2，校验密码123456，生成文件ca.key
openssl pkcs8 -topk8 -in cakey.pem -out ca.key -nocrypt
#step3 生成根证书签发申请文件，生成文件ca.csr
openssl req -new -key ca.key -out ca.csr -subj "/C=CN/ST=LiaoNing/L=ShenYang/O=Neusoft/OU=Neusoft/CN=test.grpc.com"
#step4 自签发根证书(cer文件)，生成文件ca.cer
openssl x509 -req -days 365 -sha1 -extensions v3_ca -signkey ca.key -in ca.csr -out ca.cer


#签发自建证书
#生成证书私钥, 密码都是123456
openssl genrsa -aes256 -out server.pem 2048
openssl pkcs8 -topk8 -in server.pem -out server.key -nocrypt

#生成证书签发申请文件
openssl req -new -key server.key -out server.csr -subj "/C=CN/ST=LiaoNing/L=ShenYang/O=Neusoft/OU=Neusoft/CN=test.grpc.com"

#使用根证书签发服务端证书
openssl x509 -req -days 365 -sha1 -extensions v3_req -CA ca.cer -CAkey ca.key -CAserial ca.srl -CAcreateserial -in server.csr -out server.cer

#最终服务端使用的是server.cer和server.key
#客户端使用的是server.cer
#并且需要指定服务器的域名是test.grpc.com