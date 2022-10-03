package Common;


import PageObjects_Methods.Android.Objects.LoginDetailsPOJO;
import PageObjects_Methods.Android.Objects.SignupDetailsPOJO;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ExcelUtils {

    public static Iterator<Object[]> getSignUpUserDetails(File file, String sheetName) {
        ArrayList<SignupDetailsPOJO> listPOJOSignupDetails = new ArrayList<>();
        SignupDetailsPOJO signupDetailsPOJO;
        try {
            //Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(file);

            //Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheet(sheetName);

            int rowCount = sheet.getPhysicalNumberOfRows();
            int columnCount = sheet.getRow(0).getLastCellNum();

            for (int row = 1; row < rowCount; row++) {
                signupDetailsPOJO = new SignupDetailsPOJO();
                for (int column = 0; column < columnCount; column++) {
                    Cell cell = sheet.getRow(row).getCell(column);
                    switch (cell.getCellType()) {
                        case STRING:
                            if (column == 0) {
                                signupDetailsPOJO.setRegisterFirstname(cell.getStringCellValue());
                            } else if (column == 1) {
                                signupDetailsPOJO.setRegisterLastname(cell.getStringCellValue());
                            } else if (column == 2) {
                                signupDetailsPOJO.setRegisterEmail(cell.getStringCellValue());
                            } else if (column == 4) {
                                signupDetailsPOJO.setRegisterPassword(cell.getStringCellValue());
                            } else if (column == 5) {
                                signupDetailsPOJO.setRegisterConfirmpassword(cell.getStringCellValue());
                            } else if (column == 6) {
                                signupDetailsPOJO.setRegisterExpectedResult(cell.getStringCellValue());
                            } else if (column == 7) {
                                signupDetailsPOJO.setApplicationalHomePhone(cell.getStringCellValue());
                            } else if (column == 8) {
                                signupDetailsPOJO.setApplicationalSsn(cell.getStringCellValue());
                            } else if (column == 9) {
                                signupDetailsPOJO.setApplicationalPassportid(cell.getStringCellValue());
                            } else if (column == 10) {
                                signupDetailsPOJO.setApplicationalAddress1(cell.getStringCellValue());
                            } else if (column == 11) {
                                signupDetailsPOJO.setApplicationalAddress2(cell.getStringCellValue());
                            } else if (column == 12) {
                                signupDetailsPOJO.setApplicationalPriorAddress1(cell.getStringCellValue());
                            } else if (column == 13) {
                                signupDetailsPOJO.setApplicationalPriorAddress2(cell.getStringCellValue());
                            } else if (column == 14) {
                                signupDetailsPOJO.setApplicationalPriorApt(cell.getStringCellValue());
                            } else if (column == 15) {
                                signupDetailsPOJO.setReference1(cell.getStringCellValue());
                            } else if (column == 16) {
                                signupDetailsPOJO.setReference1PhoneNumber(cell.getStringCellValue());
                            } else if (column == 17) {
                                signupDetailsPOJO.setReference1AddressLine2(cell.getStringCellValue());
                            } else if (column == 18) {
                                signupDetailsPOJO.setReference1Apt(cell.getStringCellValue());
                            } else if (column == 19) {
                                signupDetailsPOJO.setEmergencyName(cell.getStringCellValue());
                            } else if (column == 20) {
                                signupDetailsPOJO.setEmergencyPhone(cell.getStringCellValue());
                            } else if (column == 21) {
                                signupDetailsPOJO.setEmergencyAddress(cell.getStringCellValue());
                            } else if (column == 22) {
                                signupDetailsPOJO.setEmergencyApt(cell.getStringCellValue());
                            } else if (column == 23) {
                                signupDetailsPOJO.setEducationInstituteName(cell.getStringCellValue());
                            } else if (column == 24) {
                                signupDetailsPOJO.setEducationAddrss2(cell.getStringCellValue());
                            } else if (column == 25) {
                                signupDetailsPOJO.setEducationApt(cell.getStringCellValue());
                            } else if (column == 26) {
                                signupDetailsPOJO.setEducationFellowshipProgramName(cell.getStringCellValue());
                            } else if (column == 27) {
                                signupDetailsPOJO.setProfessionalSsn(cell.getStringCellValue());
                            } else if (column == 28) {
                                signupDetailsPOJO.setProfessionalAddress2(cell.getStringCellValue());
                            } else if (column == 29) {
                                signupDetailsPOJO.setProfessionalApt(cell.getStringCellValue());
                            } else if (column == 30) {
                                signupDetailsPOJO.setProfessionalName(cell.getStringCellValue());
                            } else if (column == 31) {
                                signupDetailsPOJO.setProfessionalPassword(cell.getStringCellValue());
                            } else if (column == 32) {
                                signupDetailsPOJO.setWorkHistoryName(cell.getStringCellValue());
                            } else if (column == 33) {
                                signupDetailsPOJO.setWorkHistoryPosition(cell.getStringCellValue());
                            } else if (column == 34) {
                                signupDetailsPOJO.setWorkHistoryAddress2(cell.getStringCellValue());
                            } else if (column == 35) {
                                signupDetailsPOJO.setWorkHistoryApt(cell.getStringCellValue());
                            } else if (column == 36) {
                                signupDetailsPOJO.setPayrollDependentsUnder17(cell.getStringCellValue());
                            }else if (column == 37) {
                                signupDetailsPOJO.setPayrollOtherDependents(cell.getStringCellValue());
                            }else if (column == 38) {
                                signupDetailsPOJO.setPayrollAccountNumber(cell.getStringCellValue());
                            }else if (column == 39) {
                                signupDetailsPOJO.setPayrollConfirmAccountNumber(cell.getStringCellValue());
                            }else if (column == 40) {
                                signupDetailsPOJO.setDocumentVerificationECFMGID(cell.getStringCellValue());
                            }
                        default:
                            if (column == 3) {
                                signupDetailsPOJO.setRegisterCellphone(cell.getStringCellValue());
                            }
                            break;
                    }
                }
                listPOJOSignupDetails.add(signupDetailsPOJO);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Collection<Object[]> collectionObject = new ArrayList<>();
        for (SignupDetailsPOJO signupDetailslistPOJO : listPOJOSignupDetails) {
            collectionObject.add(new Object[]{signupDetailslistPOJO});
        }
        return collectionObject.iterator();
    }

    public static Iterator<Object[]> getLoginUserDetails(File file, String sheetName) {
        ArrayList<LoginDetailsPOJO> listPOJOSignupDetails = new ArrayList<>();
        LoginDetailsPOJO loginDetailsPOJO;
        try {
            //Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(file);

            //Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheet(sheetName);

            int rowCount = sheet.getPhysicalNumberOfRows();
            int columnCount = sheet.getRow(0).getLastCellNum();

            for (int row = 1; row < rowCount; row++) {
                loginDetailsPOJO = new LoginDetailsPOJO();
                for (int column = 0; column < columnCount; column++) {
                    Cell cell = sheet.getRow(row).getCell(column);
                    switch (cell.getCellType()) {
                        case NUMERIC:
                            break;
                        case STRING:
                            if (column == 0) {
                                loginDetailsPOJO.setUsername(cell.getStringCellValue());

                            } else if (column == 1) {
                                loginDetailsPOJO.setPassword(cell.getStringCellValue());
                            } else if (column == 2) {
                                loginDetailsPOJO.setExpectedResult(cell.getStringCellValue());
                            }
                            break;
                    }
                }
                listPOJOSignupDetails.add(loginDetailsPOJO);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Collection<Object[]> collectionObject = new ArrayList<>();
        for (LoginDetailsPOJO loginDetailsPOJO1 : listPOJOSignupDetails) {
            collectionObject.add(new Object[]{loginDetailsPOJO1});
        }
        return collectionObject.iterator();
    }
}