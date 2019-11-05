package com.example.resultcalculator;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String[] stock23oct = {" GHCL Limited " , " Bajaj Holdings & Investment Limited " , " JM Financial Limited " , " Hexaware Technologies Limited " , " Dishman Carbogen Amcis Limited " , " Tejas Networks Limited " , " INOX Leisure Limited " , " Indian Bank " , " NELCO Limited " , " Castrol India Limited " , " Orient Paper & Industries Limited " , " Texmaco Infrastructure & Holdings Limited " , " Accelya Solutions India Limited " , " Praj Industries Limited " , " Onward Technologies Limited " , " Arvind Fashions Limited " , " Tata Steel Long Products Limited " , " Genus Power Infrastructures Limited " , " Nucleus Software Exports Limited " , " Shoppers Stop Limited " , " Bharat Bijlee Limited " , " Rane Engine Valve Limited " , " Orient Paper & Industries Limited " , " Bajaj Auto Limited " , " HCL Technologies Limited " , " Agro Tech Foods Limited " , " Havells India Limited " , " Everest Industries Limited " , " Control Print Limited " , " JSW Steel Limited " , " HDFC Life Insurance Company Limited " , " Torrent Pharmaceuticals Limited " , " Texmaco Rail & Engineering Limited " , " Navin Fluorine International Limited " , " PI Industries Limited "  , " NIIT Technologies Limited " , " Mahindra CIE Automotive Limited " , " Allsec Technologies Limited " , " PTC India Financial Services Limited " , " Aarti Drugs Limited " , " Biocon Limited " , " Hero MotoCorp Limited " , " Kajaria Ceramics Limited " , " Crompton Greaves Consumer Electricals Limited " , " Zee Media Corporation Limited " , " Larsen & Toubro Limited " , " IIFL Finance Limited " , " Apcotex Industries Limited " , " KPIT Technologies Limited " , " JK Paper Limited " , " IRB Infrastructure Developers Limited "};
        final String[] stock24oct = {" AYM Syntex Limited " , " Motilal Oswal Financial Services Limited " , " Kopran Limited " , " Aptech Limited " , " Johnson Controls - Hitachi Air Conditioning India Limited " , " Responsive Industries Limited " , " Arvind SmartSpaces Limited " , " Kalyani Steels Limited " , " Indian Energy Exchange Limited " , " Sterlite Technologies Limited " , " Banaras Beads Limited " , " Kothari Petrochemicals Limited " , " Tata Steel Bsl Limited " , " DCM Shriram Limited " , " Bandhan Bank Limited " , " Mold-Tek Technologies Limited " , " ICRA Limited " , " ITC Limited" , " Oriental Carbon & Chemicals Limited " , " Compucom Software Limited " , " The Anup Engineering Limited " , " DFM Foods Limited " , " Reliance Nippon Life Asset Management Limited " , " Alembic Pharmaceuticals Limited " , " Shriram Transport Finance Company Limited " , " Mold-Tek Packaging Limited " , " Gujarat State Fertilizers & Chemicals Limited " , " Jayant Agro Organics Limited " , " Kirloskar Oil Engines Limited " , " K.P.R. Mill Limited " , " IDFC First Bank Limited " , " Reliance Naval and Engineering Limited " , " Tokyo Plast International Limited " , " Gujarat Lease Financing Limited " , " Vascon Engineers Limited " , " Oriental Carbon & Chemicals Limited " , " Kaya Limited " , " Deepak Nitrite Limited " , " Colgate Palmolive (India) Limited " , " InterGlobe Aviation Limited " , " NIIT Limited " , " Balkrishna Paper Mills Limited " , " Parag Milk Foods Limited " , " Cummins India Limited " , " Maruti Suzuki India Limited " , " United Spirits Limited " , " Security and Intelligence Services (India) Limited " , " Oriental Hotels Limited " , " Raymond Limited " , " Dalmia Bharat Sugar and Industries Limited " , " Jubilant Industries Limited " , " PNB Housing Finance Limited " , " Astral Poly Technik Limited " , " Gujarat Pipavav Port Limited "};
        final String[] stock25oct = {" Kothari Sugars And Chemicals Limited" , " Timken India Limited" , " Marico Limited" , " TECIL Chemicals and Hydro Power Limited" , " Atul Limited " , " Astec LifeSciences Limited " , " Tata Motors Limited " , " State Bank of India " , " Aavas Financiers Limited " , " Strides Pharma Science Limited " , " S H Kelkar and Company Limited " , " Ratnamani Metals & Tubes Limited " , " Jubilant Life Sciences Limited " , " Honeywell Automation India Limited " , " Supreme Industries Limited " , " IRB InvIT Fund " , " HeidelbergCement India Limited " , " Atul Limited " , " Tata Coffee Limited " , " Shriram City Union Finance Limited " , " Carborundum Universal Limited " , " Infibeam Avenues Limited " , " Zuari Agro Chemicals Limited " , " Tata Motors Limited " , " Prajay Engineers Syndicate Limited " , " India Grid Trust " , " Hikal Limited " , " Arvind Limited " , " Kirloskar Industries Limited " , " V2 Retail Limited " , " HDFC Asset Management Company Limited " , " Reliance Capital Limited " , " NRB Bearing Limited " , " Easun Reyrolle Limited " , " Huhtamaki PPL Limited " , " R Systems International Limited "};
        final String[] stock26oct = {" ICICI Bank Limited " , " Pfizer Limited "};
        final String[] stock29oct = {" Wonderla Holidays Limited " , " Bharti Airtel Limited " , " Balaxi Ventures Limited " , " Hindustan Zinc Limited " , " Tata Metaliks Limited " , " SKF India Limited "};
        final String[] stock30oct = {" Heritage Foods Limited " , " Container Corporation of India Limited " , " Lakshmi Machine Works Limited " , " Mishra Dhatu Nigam Limited " , " PTC India Limited " , " Stampede Capital Limited " , " Caplin Point Laboratories Limited " , " Ramco Industries Limited " , " Balaji Amines Limited " , " IFB Industries Limited " , " OnMobile Global Limited " , " Tata Global Beverages Limited " , " Indoco Remedies Limited " , " United Bank of India " , " Graphite India Limited " , " Sonata Software Limited " , " Chemfab Alkalis Limited " , " The Ramco Cements Limited " , " CREDITACCESS GRAMEEN LIMITED " , " Phillips Carbon Black Limited " , " Nava Bharat Ventures Limited " , " Stampede Capital Limited " , " Tata Chemicals Limited " , " India Nippon Electricals Limited " , " International Paper APPM Limited " , " Quess Corp Limited " , " Ramco Systems Limited "};
        final String[] stock31oct = {" Laurus Labs Limited " , " Dhanlaxmi Bank Limited " , " Foseco India Limited " , " Next Mediaworks Limited " , " Syndicate Bank " , " Savita Oil Technologies Limited " , " Foseco India Limited " , " Srikalahasthi Pipes Limited " , " Vaibhav Global Limited " , " Tube Investments of India Limited " , " Blue Dart Express Limited " , " LG Balakrishnan & Bros Limited " , " Prakash Pipes Limited " , " Ramco Industries Limited " , " Thirumalai Chemicals Limited " , " JBM Auto Limited " , " Garden Reach Shipbuilders & Engineers Limited " , " Thangamayil Jewellery Limited " , " IFB Agro Industries Limited " , " Jindal Saw Limited " , " Indian Oil Corporation Limited "};
        final String[] stock1nov = {" Hindustan Media Ventures Limited " , " Yes Bank Limited " , " Karur Vysya Bank Limited " , " GIC Housing Finance Limited " , " LGB Forge Limited " , " Kansai Nerolac Paints Limited" , " Visaka Industries Limited " , " JK Lakshmi Cement Limited " , " Cigniti Technologies Limited " , " Shriram Pistons & Rings Limited " , " Dr. Reddy's Laboratories Limited "};
        final String[] stock2nov = {" Jocil Limited " , " Super Spinning Mills Limited " , " Escorts Limited " , " Unichem Laboratories Limited " , " Relaxo Footwears Limited "};
        final String[] stock4nov = {" Housing Development Finance Corporation Limited " , " HT Media Limited " , " Can Fin Homes Limited " , " Vesuvius India Limited " , " VST Industries Limited " , " NOCIL Limited " , " KRBL Limited " , " TCI Express Limited " , " Kirloskar Brothers Limited " , " WABCO India Limited " , " Intellect Design Arena Limited " , " Sutlej Textiles and Industries Limited " , " Sudarshan Chemical Industries Limited " , " Sun Pharma Advanced Research Company Limited " , " IVP Limited " , " NACL Industries Limited " , " TCI Developers Limited " , " Sundram Fasteners Limited " , " CARE Ratings Limited " , " Wheels India Limited " , " EIH Associated Hotels Limited " , " Mahindra Logistics Limited " , " Persistent Systems Limited " , " Bharat Electronics Limited "};
        final String[] stock5nov = {" Grindwell Norton Limited " , " Redington (India) Limited " , " Mafatlal Finance Limited " , " Godrej Properties Limited " , " Ksb Limited " , " Gillette India Limited " , " Tech Mahindra Limited " , " PTL Enterprises Limited " , " V.S.T Tillers Tractors Limited " , " Torrent Power Limited " , " Procter & Gamble Hygiene and Health Care Limited " , " Gujarat Gas Limited " , " PTL Enterprises Limited " , " EIH Limited " , " BEML Limited " , " Torrent Power Limited " , " Berger Paints (I) Limited " , " Sandhar Technologies Limited " , " Titan Company Limited " , " Cholamandalam Investment and Finance Company Limited " , " NCC Limited " , " National Fertilizers Limited " , " Gujarat Narmada Valley Fertilizers and Chemicals Limited " , " Dabur India Limited " , " Prism Johnson Limited "};
        final String[] stock6nov = {" Xpro India Limited " , " Cipla Limited " , " Maral Overseas Limited " , " EID Parry India Limited " , " Honda Siel Power Products Limited " , " Nitco Limited " , " Kalpataru Power Transmission Limited " , " Taj GVK Hotels & Resorts Limited " , " Cipla Limited " , " Clariant Chemicals (India) Limited " , " Max Financial Services Limited " , " Alkyl Amines Chemicals Limited " , " Voltas Limited " , " Triveni Turbine Limited " , " Emami Limited " , " Bannari Amman Sugars Limited " , " Godrej Consumer Products Limited " , " Firstsource Solutions Limited " , " Exide Industries Limited " , " Indiabulls Housing Finance Limited " , " BSE Limited " , " Bosch Limited "};
        final String[] stock7nov = {" Esab India Limited " , " Harita Seating Systems Limited " , " Emami Paper Mills Limited " , " Trent Limited " , " Inspirisys Solutions Limited " , " Orient Green Power Company Limited " , " Bharat Petroleum Corporation Limited " , " Solar Industries India Limited " , " United Breweries Limited " , " Cyber Media (India) Limited " , " Precot Meridian Limited " , " Engineers India Limited " , " GMM Pfaudler Limited " , " TTK Healthcare Limited " , " Hindustan Petroleum Corporation Limited "};
        final String[] stock8nov = {" JSW Holdings Limited " , " Madras Fertilizers Limited " , " Teamlease Services Limited " , " D-Link (India) Limited " , " Camlin Fine Sciences Limited " , " Excel Industries Limited " , " GAIL (India) Limited " , " GKW Limited " , " Dr. Lal Path Labs Ltd. " , " Tata Power Company Limited " , " Ponni Sugars (Erode) Limited " , " Mahindra & Mahindra Limited " , " Zuari Global Limited " , " RSWM Limited " , " Sical Logistics Limited " , " Max Ventures and Industries Limited " , " BSL Limited " , " Rane Holdings Limited " , " Max India Limited " , " IDFC Limited " , " Triveni Engineering & Industries Limited " , " Chambal Fertilizers & Chemicals Limited " , " Magma Fincorp Limited " , " TTK Prestige Limited " , " Himatsingka Seide Limited " , " Matrimony.Com Limited " , " The State Trading Corporation of India Limited "};
        final String[] stock9nov = {" Amara Raja Batteries Limited " , " Salzer Electronics Limited " , " Meghmani Organics Limited " , " Seshasayee Paper and Boards Limited " , " JK Cement Limited " , " Amara Raja Batteries Limited " , " SIL Investments Limited " , " Sundaram Brake Linings Limited " , " Amara Raja Batteries Limited " , " Cholamandalam Financial Holdings Limited "};
        final String[] stock11nov = {" Mahanagar Gas Limited " , " Rushil Decor Limited " , " SREI Infrastructure Finance Limited " , " Motherson Sumi Systems Limited " , " New Delhi Television Limited " , " Alkem Laboratories Limited " , " Oil Country Tubular Limited " , " Balmer Lawrie & Company Limited " , "Astron Paper & Board Mill Limited "};
        final String[] stock12nov = {" Vinyl Chemicals (India) Limited " , " Sumeet Industries Limited " , " Aditya Birla Fashion and Retail Limited " , " Insecticides (India) Limited " , " Vinati Organics Limited " , " Info Edge (India) Limited " , " TCPL Packaging Limited " , " Aster DM Healthcare Limited " , " Asian Granito India Limited " , " Insecticides (India) Limited " , " JB Chemicals & Pharmaceuticals Limited " , " Rossell India Limited " , " Asian Hotels (West) Limited "};
        final String[] stock13nov = {" Jai Corp Limited " , " Zydus Wellness Limited " , " Mukand Limited " , " The Motor & General Finance Limited " , " Cadila Healthcare Limited " , " Rain Industries Limited " , " Mukand Engineers Limited " , " ABB India Limited " , " Lemon Tree Hotels Limited " , " MphasiS Limited " , " Bharat Heavy Electricals Limited " , " Mindteck (India) Limited " , " Sicagen India Limited " , " Girdharilal Sugar and Allied Industries Limited " , " Pidilite Industries Limited " , " IFGL Refractories Limited " , " Vipul Limited " , " Cera Sanitaryware Limited " , " The Western India Plywoods Limited " , " Shiva Mills Limited " , " Gayatri Highways Limited " , " IFGL Refractories Limited " , " Indo Tech Transformers Limited "};
        final String[] stock14nov = {" Hindustan Copper Limited " , " Shreyas Shipping & Logistics Limited " , " GVK Power & Infrastructure Limited " , " Everest Kanto Cylinder Limited " , " Orient Refractories Limited " , " Endurance Technologies Limited " , " Bannari Amman Spinning Mills Limited " , " Emkay Global Financial Services Limited " , " T T Limited " , " Bharat Gears Limited " , " Jullundur Motor Agency (Delhi) Limited " , " Apollo Hospitals Enterprise Limited " , " HEG Limited " , " R.P.P. Infra Projects Limited " , " N. B. I. Industrial Finance Company Limited "};
        final String[] empty = {"No Results"};
        listView=findViewById(R.id.list);
        final ArrayAdapter<String> arrayAdapter23oct=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,stock23oct);
        final ArrayAdapter<String> arrayAdapter24oct=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,stock24oct);
        final ArrayAdapter<String> arrayAdapter25oct=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,stock25oct);
        final ArrayAdapter<String> arrayAdapter26oct=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,stock26oct);
        final ArrayAdapter<String> arrayAdapter29oct=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,stock29oct);
        final ArrayAdapter<String> arrayAdapter30oct=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,stock30oct);
        final ArrayAdapter<String> arrayAdapter31oct=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,stock31oct);
        final ArrayAdapter<String> arrayAdapter1nov=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,stock1nov);
        final ArrayAdapter<String> arrayAdapter2nov=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,stock2nov);
        final ArrayAdapter<String> arrayAdapter4nov=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,stock4nov);
        final ArrayAdapter<String> arrayAdapter5nov=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,stock5nov);
        final ArrayAdapter<String> arrayAdapter6nov=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,stock6nov);
        final ArrayAdapter<String> arrayAdapter7nov=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,stock7nov);
        final ArrayAdapter<String> arrayAdapter8nov=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,stock8nov);
        final ArrayAdapter<String> arrayAdapter9nov=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,stock9nov);
        final ArrayAdapter<String> arrayAdapter11nov=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,stock11nov);
        final ArrayAdapter<String> arrayAdapter12nov=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,stock12nov);
        final ArrayAdapter<String> arrayAdapter13nov=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,stock13nov);
        final ArrayAdapter<String> arrayAdapter14nov=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,stock14nov);
        final ArrayAdapter<String> arrayAdapterempty=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,empty);
        spinner=findViewById(R.id.spinner);
        String[] date = {"23 October 2019" , "24 October 2019" , "25 October 2019" , "26 October 2019" , "29 October 2019" , "30 October 2019" , "31 October 2019" , "1 November 2019" , "2 November 2019" , "4 November 2019", "5 November 2019" , "6 November 2019" , "7 November 2019" , "8 November 2019" , "9 November 2019" , "11 November 2019" , "12 November 2019" , "13 November 2019" , "14 November 2019" };
        ArrayAdapter<String> arrayAdapter2=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,date);
        spinner.setAdapter(arrayAdapter2);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(spinner.getSelectedItemPosition()==0)
                {
                    listView.setAdapter(arrayAdapter23oct);
                }
                if (spinner.getSelectedItemPosition()==1)
                {
                    listView.setAdapter(arrayAdapter24oct);
                }
                if(spinner.getSelectedItemPosition()==2)
                {
                    listView.setAdapter(arrayAdapter25oct);
                }
                if(spinner.getSelectedItemPosition()==3)
                {
                    listView.setAdapter(arrayAdapter26oct);
                }
                if(spinner.getSelectedItemPosition()==4)
                {
                    listView.setAdapter(arrayAdapter29oct);
                }
                if(spinner.getSelectedItemPosition()==5)
                {
                    listView.setAdapter(arrayAdapter30oct);
                }
                if(spinner.getSelectedItemPosition()==6)
                {
                    listView.setAdapter(arrayAdapter31oct);
                }
                if(spinner.getSelectedItemPosition()==7)
                {
                    listView.setAdapter(arrayAdapter1nov);
                }
                if(spinner.getSelectedItemPosition()==8)
                {
                    listView.setAdapter(arrayAdapter2nov);
                }
                if(spinner.getSelectedItemPosition()==9)
                {
                    listView.setAdapter(arrayAdapter4nov);
                }
                if(spinner.getSelectedItemPosition()==10)
                {
                    listView.setAdapter(arrayAdapter5nov);
                }
                if(spinner.getSelectedItemPosition()==11)
                {
                    listView.setAdapter(arrayAdapter6nov);
                }
                if(spinner.getSelectedItemPosition()==12)
                {
                    listView.setAdapter(arrayAdapter7nov);
                }
                if(spinner.getSelectedItemPosition()==13)
                {
                    listView.setAdapter(arrayAdapter8nov);
                }
                if(spinner.getSelectedItemPosition()==14)
                {
                    listView.setAdapter(arrayAdapter9nov);
                }
                if(spinner.getSelectedItemPosition()==15)
                {
                    listView.setAdapter(arrayAdapter11nov);
                }
                if(spinner.getSelectedItemPosition()==16)
                {
                    listView.setAdapter(arrayAdapter12nov);
                }
                if(spinner.getSelectedItemPosition()==17)
                {
                    listView.setAdapter(arrayAdapter13nov);
                }
                if(spinner.getSelectedItemPosition()==18)
                {
                    listView.setAdapter(arrayAdapter14nov);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
