import "./App.css";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import GetHomeController from "./controller/home/GetHomeController";

function App() {
    return (
        <BrowserRouter>
            <Routes>
                <Route path='/' element={<GetHomeController />} />
            </Routes>
        </BrowserRouter>
    );
}

export default App;
