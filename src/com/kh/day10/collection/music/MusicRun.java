package com.kh.day10.collection.music;

public class MusicRun {
	public static void main(String[] args) {
		MusicFunction mFunc = new MusicFunction();
		end: 
		while (true) {
			int value = mFunc.printMenu();
			switch (value) {
				case 1:
					mFunc.inputMusicInfo();
					break;
				case 2:
					mFunc.inputMusicAtFirst();
					break;
				case 3:
					mFunc.printAllMusics();
					break;
				case 4:
					mFunc.searchMusic();
					break;
				case 5:
					mFunc.removeMusicByTitle();
					break;
				case 6:
					mFunc.modifyMusicInfo();
					break;
				case 7:
					break;
				case 8:
					break;
				case 9:
					break;
				case 10:
					break;
				case 0:
					break end;
			}
		}
	}

//=== === 메인 메뉴 === ===
//		1. 마지막 위치에 곡 추가
//		2. 첫 위치에 곡 추가
//		3. 전체 곡 목록 출력
//		4. 특정 곡 검색
//		5. 특정 곡 삭제
//		6. 특정 곡 정보수정
//		7. 곡명 오름차순 정렬
//		8. 곡명 내림차순 정렬
//		9. 가수명 오름차순 정렬
//		10. 가수명 내림차순 정렬
//		0. 종료
//		메뉴 선택 >> 1
//		마지막 위치에 곡 추가
//		곡명 : 보고싶다
//		가수명 : 김범수
//		[서비스 성공] : 추가 성공!
//		=== === 메인 메뉴 === ===
//		1. 마지막 위치에 곡 추가
//		2. 첫 위치에 곡 추가
//		3. 전체 곡 목록 출력
//		4. 특정 곡 검색
//		5. 특정 곡 삭제
//		6. 특정 곡 정보수정
//		7. 곡명 오름차순 정렬
//		8. 곡명 내림차순 정렬
//		9. 가수명 오름차순 정렬
//		10. 가수명 내림차순 정렬
//		0. 종료
//		메뉴 선택 >> 3
//		====== 전체 곡 목록 출력 ======
//		1번째 노래 -> 곡명 : 보고싶다, 가수명 : 김범수
//		[서비스 성공] : 조회 성공!
//=== === 메인 메뉴 === ===
//		1. 마지막 위치에 곡 추가
//		2. 첫 위치에 곡 추가
//		3. 전체 곡 목록 출력
//		4. 특정 곡 검색
//		5. 특정 곡 삭제
//		6. 특정 곡 정보수정
//		7. 곡명 오름차순 정렬
//		8. 곡명 내림차순 정렬
//		9. 가수명 오름차순 정렬
//		10. 가수명 내림차순 정렬
//		0. 종료
//		메뉴 선택 >> 5
//		삭제할 곡 입력 : 가슴아파도
//		[서비스 성공] : 삭제 성공!
//		=== === 메인 메뉴 === ===
//		1. 마지막 위치에 곡 추가
//		2. 첫 위치에 곡 추가
//		3. 전체 곡 목록 출력
//		4. 특정 곡 검색
//		5. 특정 곡 삭제
//		6. 특정 곡 정보수정
//		7. 곡명 오름차순 정렬
//		8. 곡명 내림차순 정렬
//		9. 가수명 오름차순 정렬
//		10. 가수명 내림차순 정렬
//		0. 종료
//		메뉴 선택 >> 6
//		수정할 곡 입력 : 보고싶다
//		수정할 곡명 입력 : 안보고싶다
//		수정할 가수명 입력 : 김범목
}
