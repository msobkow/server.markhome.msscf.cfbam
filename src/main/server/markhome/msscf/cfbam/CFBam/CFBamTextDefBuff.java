// Description: Java 11 implementation of a TextDef buffer object.

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBam;

import java.lang.reflect.*;
import java.io.*;
import java.math.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;

public class CFBamTextDefBuff
	extends CFBamAtomBuff
	implements Comparable<Object>,
		Serializable
{
	public final static String CLASS_CODE = "a841";
	public static final long TENANTID_INIT_VALUE = 0L;
	public static final long ID_INIT_VALUE = 0L;
	public static final int MAXLEN_INIT_VALUE = 0;
	public static final String XMLELEMENTNAME_INIT_VALUE = new String( "" );
	public static final long TENANTID_MIN_VALUE = 0L;
	public static final long ID_MIN_VALUE = 0L;
	public static final int MAXLEN_MIN_VALUE = 0;
	public static final int MAXLEN_MAX_VALUE = 2147483647;
	protected int requiredMaxLen;
	protected String optionalInitValue;
	protected String optionalXmlElementName;
	public CFBamTextDefBuff() {
		super();
		requiredMaxLen = CFBamTextDefBuff.MAXLEN_INIT_VALUE;
		optionalInitValue = null;
		optionalXmlElementName = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public int getRequiredMaxLen() {
		return( requiredMaxLen );
	}

	public void setRequiredMaxLen( int value ) {
		if( value < CFBamTextDefBuff.MAXLEN_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredMaxLen",
				1,
				"value",
				value,
				CFBamTextDefBuff.MAXLEN_MIN_VALUE );
		}
		if( value > CFBamTextDefBuff.MAXLEN_MAX_VALUE ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setRequiredMaxLen",
				1,
				"value",
				value,
				CFBamTextDefBuff.MAXLEN_MAX_VALUE );
		}
		requiredMaxLen = value;
	}

	public String getOptionalInitValue() {
		return( optionalInitValue );
	}

	public void setOptionalInitValue( String value ) {
		if( value == null ) {
			optionalInitValue = null;
		}
		else if( value.length() > 65535 ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setOptionalInitValue",
				1,
				"value.length()",
				value.length(),
				65535 );
		}
		else {
			optionalInitValue = value;
		}
	}

	public String getOptionalXmlElementName() {
		return( optionalXmlElementName );
	}

	public void setOptionalXmlElementName( String value ) {
		if( value == null ) {
			optionalXmlElementName = null;
		}
		else if( value.length() > 192 ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setOptionalXmlElementName",
				1,
				"value.length()",
				value.length(),
				192 );
		}
		else {
			optionalXmlElementName = value;
		}
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFBamTextDefBuff ) {
			CFBamTextDefBuff rhs = (CFBamTextDefBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			if( getRequiredMaxLen() != rhs.getRequiredMaxLen() ) {
				return( false );
			}
			if( getOptionalInitValue() != null ) {
				if( rhs.getOptionalInitValue() != null ) {
					if( ! getOptionalInitValue().equals( rhs.getOptionalInitValue() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalInitValue() != null ) {
					return( false );
				}
			}
			if( getOptionalXmlElementName() != null ) {
				if( rhs.getOptionalXmlElementName() != null ) {
					if( ! getOptionalXmlElementName().equals( rhs.getOptionalXmlElementName() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalXmlElementName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof CFBamValuePKey ) {
			CFBamValuePKey rhs = (CFBamValuePKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamTextDefHBuff ) {
			CFBamTextDefHBuff rhs = (CFBamTextDefHBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			if( getRequiredMaxLen() != rhs.getRequiredMaxLen() ) {
				return( false );
			}
			if( getOptionalInitValue() != null ) {
				if( rhs.getOptionalInitValue() != null ) {
					if( ! getOptionalInitValue().equals( rhs.getOptionalInitValue() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalInitValue() != null ) {
					return( false );
				}
			}
			if( getOptionalXmlElementName() != null ) {
				if( rhs.getOptionalXmlElementName() != null ) {
					if( ! getOptionalXmlElementName().equals( rhs.getOptionalXmlElementName() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalXmlElementName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof CFBamValueHPKey ) {
			CFBamValueHPKey rhs = (CFBamValueHPKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			return( true );
		}
		else {
			boolean retval = super.equals( obj );
			return( retval );
		}
	}

	public int hashCode() {
		int hashCode = super.hashCode();
		hashCode = hashCode + getRequiredMaxLen();
		if( getOptionalInitValue() != null ) {
			hashCode = hashCode + getOptionalInitValue().hashCode();
		}
		if( getOptionalXmlElementName() != null ) {
			hashCode = hashCode + getOptionalXmlElementName().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof CFBamTextDefBuff ) {
			CFBamTextDefBuff rhs = (CFBamTextDefBuff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
			if( getRequiredMaxLen() < rhs.getRequiredMaxLen() ) {
				return( -1 );
			}
			else if( getRequiredMaxLen() > rhs.getRequiredMaxLen() ) {
				return( 1 );
			}
			if( getOptionalInitValue() != null ) {
				if( rhs.getOptionalInitValue() != null ) {
					int cmp = getOptionalInitValue().compareTo( rhs.getOptionalInitValue() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalInitValue() != null ) {
					return( -1 );
				}
			}
			if( getOptionalXmlElementName() != null ) {
				if( rhs.getOptionalXmlElementName() != null ) {
					int cmp = getOptionalXmlElementName().compareTo( rhs.getOptionalXmlElementName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalXmlElementName() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof CFBamValuePKey ) {
			CFBamValuePKey rhs = (CFBamValuePKey)obj;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredId() < rhs.getRequiredId() ) {
				return( -1 );
			}
			else if( getRequiredId() > rhs.getRequiredId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFBamValueHPKey ) {
			CFBamValueHPKey rhs = (CFBamValueHPKey)obj;
			{
				int lhsRequiredRevision = getRequiredRevision();
				int rhsRequiredRevision = rhs.getRequiredRevision();
				if( lhsRequiredRevision < rhsRequiredRevision ) {
					return( -1 );
				}
				else if( lhsRequiredRevision > rhsRequiredRevision ) {
					return( 1 );
				}
			}
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredId() < rhs.getRequiredId() ) {
				return( -1 );
			}
			else if( getRequiredId() > rhs.getRequiredId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFBamTextDefHBuff ) {
			CFBamTextDefHBuff rhs = (CFBamTextDefHBuff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
			if( getRequiredMaxLen() < rhs.getRequiredMaxLen() ) {
				return( -1 );
			}
			else if( getRequiredMaxLen() > rhs.getRequiredMaxLen() ) {
				return( 1 );
			}
			if( getOptionalInitValue() != null ) {
				if( rhs.getOptionalInitValue() != null ) {
					int cmp = getOptionalInitValue().compareTo( rhs.getOptionalInitValue() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalInitValue() != null ) {
					return( -1 );
				}
			}
			if( getOptionalXmlElementName() != null ) {
				if( rhs.getOptionalXmlElementName() != null ) {
					int cmp = getOptionalXmlElementName().compareTo( rhs.getOptionalXmlElementName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalXmlElementName() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else {
			int retval = super.compareTo( obj );
			return( retval );
		}
	}

	public void set( CFBamValueBuff src ) {
		if( src instanceof CFBamTextDefBuff ) {
			setTextDefBuff( (CFBamTextDefBuff)src );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"CFBamTextDefBuff" );
		}
	}

	public void setTextDefBuff( CFBamTextDefBuff src ) {
		super.setAtomBuff( src );
		setRequiredMaxLen( src.getRequiredMaxLen() );
		setOptionalInitValue( src.getOptionalInitValue() );
		setOptionalXmlElementName( src.getOptionalXmlElementName() );
	}

	public void set( CFBamValueHBuff src ) {
		if( src instanceof CFBamTextDefHBuff ) {
			setTextDefBuff( (CFBamTextDefHBuff)src );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"CFBamTextDefHBuff" );
		}
	}

	public void setTextDefBuff( CFBamTextDefHBuff src ) {
		super.setAtomBuff( src );
		setRequiredMaxLen( src.getRequiredMaxLen() );
		setOptionalInitValue( src.getOptionalInitValue() );
		setOptionalXmlElementName( src.getOptionalXmlElementName() );
	}
}
