package org.alfresco.filesys.smb;

/**
 * SMB exception class
 * <p>
 * This class holds the detail of an SMB network error. The SMB error class and error code are
 * available to give extra detail about the error condition.
 */
public class SMBException extends Exception
{
    private static final long serialVersionUID = 3256719593644176946L;

    // SMB error class

    protected int m_errorclass;

    // SMB error code

    protected int m_errorcode;

    /**
     * Construct an SMB exception with the specified error class/error code.
     */

    public SMBException(int errclass, int errcode)
    {
        super(SMBErrorText.ErrorString(errclass, errcode));
        m_errorclass = errclass;
        m_errorcode = errcode;
    }

    /**
     * Construct an SMB exception with the specified error class/error code and additional text
     * error message.
     */

    public SMBException(int errclass, int errcode, String msg)
    {
        super(msg);
        m_errorclass = errclass;
        m_errorcode = errcode;
    }

    /**
     * Return the error class for this SMB exception.
     * 
     * @return SMB error class.
     */

    public int getErrorClass()
    {
        return m_errorclass;
    }

    /**
     * Return the error code for this SMB exception
     * 
     * @return SMB error code
     */

    public int getErrorCode()
    {
        return m_errorcode;
    }

    /**
     * Return the error text for the SMB exception
     * 
     * @return Error text string.
     */

    public String getErrorText()
    {
        return SMBErrorText.ErrorString(m_errorclass, m_errorcode);
    }
}