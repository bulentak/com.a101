Feature:A101 Test Otomasyon Practicum
  @US01
  Scenario: TC01 - Giyim_Aksesuar_Kadın_İç_Giyim_Dizaltı_Çorap_siyah
    Given kullanici url'ye gider
    And  Giyim ve aksesuara tiklar
    And  Kadin icgiyim tiklanir
    And  Dizalti corap tiklanir
    And  Secilen urun siyah oldugu dogrulanir
    And  Sepete ekle butonuna tiklanir
    And  Sepeti Goruntule butonuna tıklanir.
    And  Sepeti Onayla butonuna tıklanır.
    And  Uye olmadan devam et butonuna tiklanir.
    And  Mail ekranina mail girilir
    And  Yeni adres olustura tiklanir adres olusturulur kaydet ve devam et tiklanir
    And  Odeme ekranina bilgiler girilir siparise tamamla tiklanir
