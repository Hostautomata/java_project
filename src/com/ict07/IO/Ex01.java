package com.ict07.IO;

public class Ex01 {
//File 클래스 : 특정위치에 존재하는 파일이나 디렉토리(폴더)를 처리하는 클래스
//생성자 : File(File parent, String child), File(String pathname), 
//		File(String parent, String child), File(URI uri)
	
//		parent 상위경로, child 하위경로
//		parent + child = 전체경로
//		pathname = 전체경로
//		uri -> 네트워크할때
	
//	주요메서드
//	createNewFile() : boolean >파일을 생성하면 true, 못하면 false (같은 이름이 있으면 생성못함.)

	//	mkdir(), mkdirs() : 디렉토리를 생성하면 true, 못하면 false
//	차이점 : 만들고자 하는 디렉토리의 상위 디렉토리가 존재하지 않으면 생성 불가mkdir();
//	예) c:\base\want -> want 디렉토리를 만들 때 base디렉토리가 없으면 mkdir()은 want를 생성 못함.
//	반면에 mkdirs()는 want 뿐만 아니라 base까지 만들어줌.
	
//	delete() : 파일, 디렉토리 삭제
	
//	isDirectory() : 디렉토리면 true 아니면 false
//	isFile() : 파일이면 true 아니면 false
//	컴퓨터에서 저장 측면에서 파일과 디렉토리 외에는 존재하지 않는다.(이분법)

//	**list() : 지정한 위치의 파일 및 디렉토리를 String[]에 담아서 사용한다.
//				웹디스크 만들때 필요
	
//	length() : 배열이나 String에서는 길이를 뜻하지만, 파일클래스에서는 길이가 아닌 파일의 크기를 byte로 표기
//	getAbsolutePath() : 절대경로 표기(경로의 풀네임 root부터)
//	getPath() : 상대경로 표기(현 위치에서 해당 파일까지 접근하기위해 거쳐야 하는 경로)
//	getCanonicalPath() : 정규화 경로(나중에 배울 예정)
//	lastModified() : 마지막 수정한 날짜 
} 
