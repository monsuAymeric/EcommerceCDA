import Header from "../components/Header";

export default function cartView() {
    return (
        <>
            <Header />
            <div className='columns'>
                <div className='column is-8 is-offset-2'>
                    <h1 className='title'>Cart</h1>
                </div>
            </div>
        </>
    );
}
