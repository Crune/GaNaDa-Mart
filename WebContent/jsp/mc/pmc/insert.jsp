<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <button id="main">관리자 메인으로</button>
    <button id="list">목록으로</button>
    
    
    <form id="inform" action="/jsp/mc/pmc/insertPro.jsp" method="post" enctype="multipart/form-data"></form>
    <div id="productForm" class="box">
    <ul>
    <li><label for="pd_code">PD_CODE선택</label>
    <select id="pd_code" name="pd_code">
    <option value="1">1</option>
    <option value="2">2</option>
    <option value="3">3</option>
    <option value="4">4</option>
    <option value="5">5</option>
    <option value="6">6</option>
    <option value="7">7</option>
    <option value="8">8</option>
    <option value="9">9</option>
    <option value="10">10</option>
    <option value="11">11</option>
    <option value="12">12</option>
    <option value="13">13</option>
    <option value="14">14</option>
    <option value="15">15</option>
    <option value="16">16</option>
    <option value="17">17</option>
    <option value="18">18</option>
    <option value="19">19</option>
    <option value="20">20</option>
    <option value="21">21</option>
    </select>
    
    <li><label for="menu_code">menu_code선택</label>
       <select id="menu_code" name="menu_code">
    <option value="1">1</option>
    <option value="2">2</option>
    <option value="3">3</option>
    <option value="4">4</option>
    <option value="5">5</option>
    <option value="6">6</option>
    <option value="7">7</option>
    <option value="8">8</option>
    <option value="9">9</option>
    <option value="10">10</option>
    <option value="11">11</option>
    <option value="12">12</option>
    <option value="13">13</option>
    <option value="14">14</option>
    <option value="15">15</option>
    <option value="16">16</option>
    <option value="17">17</option>
    <option value="18">18</option>
    <option value="19">19</option>
    <option value="20">20</option>
    <option value="21">21</option>
    <option value="1234">1234</option>
    </select>
    
    <li><label for="pd_name">상품명</label>
    <input id="pd_name" name="pd_name" type="text" size="50" placeholder="상품명" maxlength="50">
    <li><label for="pd_price">가격</label>
    <input id="pd_price" name="pd_price" type="text" size="10" placeholder="가격" maxlength="10">원
    <li><label for="c_code">c_code</label>
    <select id="c_code" name="c_code">
    <option value="1">1</option>
    <option value="2">2</option>
    <option value="3">3</option>
    <option value="4">4</option>
    <option value="5">5</option>
    <option value="6">6</option>
    <option value="7">7</option>
    <option value="8">8</option>
    <option value="9">9</option>
    <option value="10">10</option>
    <option value="11">11</option>
    <option value="12">12</option>
    <option value="13">13</option>
    <option value="14">14</option>
    <option value="15">15</option>
    <option value="16">16</option>
    <option value="17">17</option>
    <option value="18">18</option>
    <option value="19">19</option>
    <option value="20">20</option>
    <option value="21">21</option>
    </select>
    <li><label for="im_code">im_code</label>
    <select id="im_code" name="im_code">
    <option value="1">1</option>
    <option value="2">2</option>
    <option value="3">3</option>
    <option value="4">4</option>
    <option value="5">5</option>
    <option value="6">6</option>
    <option value="7">7</option>
    <option value="8">8</option>
    <option value="9">9</option>
    <option value="10">10</option>
    <option value="11">11</option>
    <option value="12">12</option>
    <option value="13">13</option>
    <option value="14">14</option>
    <option value="15">15</option>
    <option value="16">16</option>
    <option value="17">17</option>
    <option value="18">18</option>
    <option value="19">19</option>
    <option value="20">20</option>
    <option value="21">21</option>
    </select>
      <li><label for="c_name">c_name</label>
<input id="c_name" name="c_name" type="text" size="10" placeholder="c_name" maxlength="10">
      <li><label for="im_order">im_order</label>
    <select id="im_order" name="im_order">
    <option value="1">1</option>
    <option value="2">2</option>
    <option value="3">3</option>
    <option value="4">4</option>
    <option value="5">5</option>
    <option value="6">6</option>
    <option value="7">7</option>
    <option value="8">8</option>
    <option value="9">9</option>
    <option value="10">10</option>
    <option value="11">11</option>
    <option value="12">12</option>
    <option value="13">13</option>
    <option value="14">14</option>
    <option value="15">15</option>
    <option value="16">16</option>
    <option value="17">17</option>
    <option value="18">18</option>
    <option value="19">19</option>
    <option value="20">20</option>
    <option value="21">21</option>
    </select>
    
    
   
    <li><label for="im_name">이미지</label>
    <input id="im_name" name="im_name" type="file">
    
    
    <li><label for="pd_infocode1">상품정보</label>
    <input id="pd_infocode1" name="pd_infocode1" type="text" size="50" placeholder="상품정보" maxlenth="50">
    <li><label for="pd_infocode2">배송결제정보</label>
    <input id="pd_infocode2" name="pd_infocode2" type="text" size="50" placeholder="배송결제정보" maxlenth="50">
    <li><label for="pd_infocode3">유의사항</label>
    <input id="pd_infocode3" name="pd_infocode3" type="text" size="50" placeholder="유의사항" maxlenth="50">
    <li><label for="pd_infocode4">as정보</label>
    <input id="pd_infocode4" name="pd_infocode4" type="text" size="50" placeholder="as정보" maxlenth="50">
    
    <li class="label2">
    <input type="submit" id="inProduct" value="상품등록">
    
    </ul>
    </div>
    </form>