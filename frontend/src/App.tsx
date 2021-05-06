import BarChart from "components/BarChart";
import Datatable from "components/Datatable";
import DonutChart from "components/DonutChart";
import Footer from "components/Footer";
import Navbar from "components/Navbar";

function App() {
  return (
   <>
      <Navbar />
      <div className="container">
        
        <h1>Preparing to launch...</h1>
        <div className="row py-3">
          <div className="col-sm-6">
            
            <h5 className="text-center text-secondary">Taxa de sucesso</h5>
            <BarChart/>

          </div>
          <div className="col-sm-6">
            
            <h5 className="text-center text-secondary">Todas vendas</h5>
            <DonutChart/>

          </div>

        </div>
        <div className="py-3">
          <h2 className="text-primary">Todas as vendas</h2>
        </div>

        <Datatable/>

      </div>
      <Footer/>
   </>
  );
}

export default App;
