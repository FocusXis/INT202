package sit.int202.classicmodels.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import sit.int202.classicmodels.entities.Office;
import sit.int202.classicmodels.repository.OfficeRepository;

import java.io.IOException;

@WebServlet(name = "OfficeUpdateServlet", value = "/office-update")
public class OfficeUpdateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String officeCode = request.getParameter("officeCode");
    OfficeRepository officeRepository = new OfficeRepository();
    request.setAttribute("selected", officeRepository.find(officeCode));
    getServletContext().getRequestDispatcher("/office_update.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Office newOffice = new Office();
        String officeCode = request.getParameter("officeCode");
        String city = request.getParameter("city");
        String phone = request.getParameter("phone");
        String addressLine1 = request.getParameter("addressLine1");
        String addressLine2 = request.getParameter("addressLine2");
        String state = request.getParameter("state");
        String country = request.getParameter("country");
        String postalCode = request.getParameter("postalCode");
        String territory = request.getParameter("territory");

        newOffice.setOfficeCode(officeCode);
        newOffice.setCity(city);
        newOffice.setPhone(phone);
        newOffice.setAddressLine1(addressLine1);
        newOffice.setAddressLine2(addressLine2);
        newOffice.setState(state);
        newOffice.setCountry(country);
        newOffice.setPostalCode(postalCode);
        newOffice.setTerritory(territory);

        OfficeRepository officeRepository = new OfficeRepository();
        officeRepository.update(newOffice);
        getServletContext().getRequestDispatcher("/office_update.jsp").forward(request, response);
    }
}