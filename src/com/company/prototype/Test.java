package com.company.prototype;

public class Test {
	public static void main(String[] args) {
		try{
			ProtoType protoType = new ProtoType();
			protoType.setData("aaqa");
			//앝은 복사 = 자신의 주소값을 보내줌(같은 인스턴스)
			ProtoType shallowCloneProtoType = protoType;
			//깊은 복사 = 자신의 값과 똑같은 값을 가지는 인스턴스 생성후 주소를 줌(다른 인스턴스)
			ProtoType deapCloneProtoType = protoType.copy();

			System.out.println(protoType.getData());
			System.out.println(shallowCloneProtoType.getData());
			System.out.println(deapCloneProtoType.getData());

			protoType.setData("qwer");
			System.out.println(protoType.getData());
			System.out.println(shallowCloneProtoType.getData());
			System.out.println(deapCloneProtoType.getData());

		}catch (Exception e){
			e.printStackTrace();
		}


	}
}
