import React from "react"
import * as ReactDOMClient from "react-dom/client"

const app = ReactDOMClient.createRoot(document.getElementById("app"))
app.render(<DataComponent />)
