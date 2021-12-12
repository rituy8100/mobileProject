package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView myRecyclerView;
    private RecyclerView.LayoutManager myLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        myRecyclerView.setHasFixedSize(true);
        myLayoutManager = new LinearLayoutManager(this);
        myRecyclerView.setLayoutManager(myLayoutManager);
        ArrayList<Coins> coinInfo=new ArrayList<>();
        coinInfo.add(new Coins(R.drawable.bitlogo,"비트코인","1196$",R.drawable.bitdesc1,"비트코인은 블록체인 기술을 기반으로 만들어진 최초의 온라인 암호화폐이다.",R.drawable.bitdesc2,"최근에 만들어지는 블록체인 기반 코인들과는 다르게 결제나 거래 관련 시스템 즉 화폐로서의 기능에 집중되어 있다. 예를 들어 이더리움은 다양한 어플리케이션으로 발전 될 수 있는 플랫폼적 기능을 하는데 그에 따라 베이직 어텐션 토큰(BAT), 골렘(GOLEM), 어거(AUGUR), 노시스(Gnosis) 등 많은 코인이 만들어지는 데 기초 플랫폼을 제공하였다.","tel:01026418169","rituy8100@gmail.com",37.55827, 126.998425,"https://bitcoin.org/ko/"));
        coinInfo.add(new Coins(R.drawable.ethlogo,"이더리움","220$",R.drawable.ethdesc1,"명실상부 코인계의 절대적 2인자인 이더리움은 비트코인의 문제점을 보완한 컨셉과 다양한 활용성을 위해 개발되었습니다. ",R.drawable.ethdesc2,"비트코인과 이더리움의 가장 큰 차이는 적용 범위에 있다. 비트코인이 결제나 거래 관련 시스템, 즉 화폐로서의 기능에 집중하는 반면, 이더리움은 핵심 기술인 블록체인(blockchain)을 기반으로 거래나 결제뿐 아니라 계약서, SNS, 이메일, 전자투표 등 다양한 애플리케이션을 투명하게 운영할 수 있게 확장성을 제공한다. 즉 화폐로서뿐 아니라 다른 용도, 줄여서 dApp(댑)이라고 부르는 분산 애플리케이션(Decentralized Application)을 누구나 만들고 사용할 수 있게끔 하는 플랫폼이다.","tel:01026418169","rituy8100@gmail.com",37.55827, 126.998425,"https://ethereum.org/en/"));
        coinInfo.add(new Coins(R.drawable.ripplelogo,"리플","92$",R.drawable.rippledesc1,"리플은 전 세계 어느 곳에서도 송금 결제를 안정적이고 효율적으로 즉시 처리하기 위해 개발되었습니다. ",R.drawable.rippledesc2,"장점으로는 다른 화폐보다 국제 결제 속도(약 2초)가 빠르다는 점, 송금 시 타이핑 오류를 제외하고 금융 사고 발생횟수가 전무하다는 점, 확장성이 뛰어난 장점이 있다.","tel:01026418169","rituy8100@gmail.com",37.55827, 126.998425,"https://ripple.com/"));
        coinInfo.add(new Coins(R.drawable.claylogo,"클레이튼","41$",R.drawable.claydesc1,"카카오의 블록체인 관련 자회사 그라운드X가 개발한 클레이튼은 비트코인처럼 하나의 코인이 아닌 이더리움이나 이오스 같이 분산어플리케이션 디앱을 만들기 위한 블록체인 개발 플랫폼이다.",R.drawable.claydesc2,"클레이튼 플랫폼의 가장 큰 특징은 블록체인 기술의 핵심 요소인 탈중앙화를 현시점에서는 다소 포기하더라도 대중화에 필요한 제도적인 기반을 먼저 갖추는 것이다. 사실 다른 블록체인들도 탈중앙화를 강조하지만 실제로는 특정 이익 집단들에 의해 좌지우지 되는 경우가 많고 탈중앙화 보다는 우선 규제를 지키며 실용적이고 사용자에게 필요한 서비스를 위주로 개발하는 것에 목표를 두고 있다.","tel:01026418169","rituy8100@gmail.com",37.55827, 126.998425,"https://www.klaytn.com/"));
        coinInfo.add(new Coins(R.drawable.adalogo,"에이다 ADA","51$",R.drawable.adadesc1,"에이다는 스마트 계약 기반의 블록체인 플랫폼으로 랜덤성 지분증명방식을 택하고 있는 퍼블릭 블록체인입니다.",R.drawable.adadesc2,"카르다노는 기본적으로 금융 애플리케이션을 위한 스마트 컨트랙트 플랫폼이다.\n" +
                "\n" +
                "카르다노는 2015년부터 시작한 프로젝트이며 이더리움에서 영감을 얻은 카르다노 팀은 스마트 컨트랙트 플랫폼을 만들기로 한다. 여러 학술조사와 암호화 연구를 통해 암호화폐 개발 언어로 적합한 하스켈 언어를 선택하였으며 맨땅에 헤딩 마인드로 처음부터 설계하였다. 하스켈은 함수형 언어이며 카르다노 백서에 제시된 수학적 표현을 완벽하게 설명하고 입증한다. 정적 코드 분석이 가능한 강력한 입력 기능이 가능하다.","tel:01026418169","rituy8100@gmail.com",37.55827, 126.998425,"https://cardano.org/"));
        coinInfo.add(new Coins(R.drawable.polkalogo,"폴카닷 DOT","44$",R.drawable.polkadesc1,"폴카닷은 어떤 코인도 전송 가능한 우수한 거래 확장성이 강점입니다.",R.drawable.polkadesc2,"폴카닷은 서로 다른 블록체인을 연결하는 인터체인 프로젝트로, 체인 간 원활한 데이터 전송을 가능하게 한다. 폴카닷은 릴레이체인(relay chain), 파라체인(parachain)으로 구성되는데 이 중 릴레이체인은 거래 여부를 결정하는 중앙 관리자, 파라체인은 거래를 수집하고 처리하는 보조적 체인 역할을 한다.","tel:01026418169","rituy8100@gmail.com",37.55827, 126.998425,"https://polkadot.network/"));
        coinInfo.add(new Coins(R.drawable.litelogo,"라이트코인","20$",R.drawable.litedesc1,"비트코인에서 하드포크하여 만들어졌고 비트코인의 늘어난 거래량으로 거래속도가 늦어져 보완용으로 개발되었습니다.",R.drawable.litedesc2,"라이트코인은 개인간 피투피(P2P) 거래에 직접 주고받을 수 있는 암호화폐로서, 거의 제로에 가까운 비용으로 전 세계 사람들에게 즉각적으로 전송할 수 있다. 라이트코인은 비트코인의 하드포크로 파생돼 나온 최초의 암호화폐이다. 2011년 10월에 처음 등장했고, 현재 코인마켓캡 기준 시가 총액 6위에 달하는 메이저 알트코인이다.","tel:01026418169","rituy8100@gmail.com",37.55827, 126.998425,"https://litecoin.org/"));
        coinInfo.add(new Coins(R.drawable.stelllogo,"스텔라루멘","16$",R.drawable.stelldesc1,"스텔라루멘은 리플에서 하드포크하여 만들어졌고 은행과 개인간의 해외 송금 및 결제, 개발도상국의 금융시스템 개발에 포커싱되어 개발되었습니다.",R.drawable.stelldesc2,"리플의 업그레이드 버전이라고도 불리는 스텔라루멘(Stellarlumen)은 국제 송금을 위해 만들어진 블록체인 기반의 오픈 소스 프로토콜로, 개인과 은행과 송금 전문회사의 해외송금 및 결제, 개발도상국의 금융시스템 개발에 초점을 두고 있다. 스텔라는 은행, 결제 시스템, 사람을 연결하는 플랫폼으로, 거의 수수료 없이 쉽고 빠르고 안정적으로 자금을 이동시킬 수 있다.","tel:01026418169","rituy8100@gmail.com",37.55827, 126.998425,"https://www.stellar.org/"));
        coinInfo.add(new Coins(R.drawable.eoslogo,"이오스 EOS","8$",R.drawable.eosdesc1,"기술적인 측면은 이더리움과 흡사하나 기존의 고액 수수료와 연산능력의 문제를 보완한 코인입니다.",R.drawable.eosdesc2,"이오스는 \"이더리움 킬러\"라고 불린다. 이오스는 이더리움의 느린 처리 속도와 높은 수수료 문제를 해결하기 위한 대안으로 등장하였다. 이오스는 분산 애플리케이션인 디앱(DApp)을 구동할 수 있는 플랫폼을 제공함으로써 범용적인 블록체인 운영체제(OS)를 만드는 것을 목표로 한다.","tel:01026418169","rituy8100@gmail.com",37.55827, 126.998425,"https://eos.io/"));
        coinInfo.add(new Coins(R.drawable.doglogo,"도지코인","41$",R.drawable.dogdesc1,"월월!",R.drawable.dogdesc2,"도지코인이란 이름이나 로고만 봐도 알 수 있듯이 Shibe doge 밈에서 따왔는데, 시베 도지 밈이 가볍고 재미를 위한 밈인 것처럼 도지코인도 원래는 비트 코인을 위시한 암호화폐 시장의 열풍을 풍자하기 위해 만들어진 장난식 화폐이다. 그렇기에 진지하게 화폐 단위로 사용되는 비트코인과는 달리, 도지코인은 실험성과 재미를 위해서 운영되는 측면이 강했다. 즉 커뮤니티형 코인이란 얘기. 이런 류의 코인은 커뮤니티의 힘이 강할수록 가격이나 가치에 영향을 받기도 한다.","tel:01026418169","rituy8100@gmail.com",37.55827, 126.998425,"https://dogecoin.com/"));

        MyAdapter myadapter = new MyAdapter(coinInfo);
        // 어댑터를 뷰에 연결해 준다.
        myRecyclerView.setAdapter(myadapter);
    }
}