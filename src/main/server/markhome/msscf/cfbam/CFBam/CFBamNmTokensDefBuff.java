// Description: Java 11 implementation of a NmTokensDef buffer object.

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

public class CFBamNmTokensDefBuff
	extends CFBamAtomBuff
	implements Comparable<Object>,
		Serializable
{
	public final static String CLASS_CODE = "a82b";
	public static final long TENANTID_INIT_VALUE = 0L;
	public static final long ID_INIT_VALUE = 0L;
	public static final int MAXLEN_INIT_VALUE = 0;
	public static final long TENANTID_MIN_VALUE = 0L;
	public static final long ID_MIN_VALUE = 0L;
	public static final int MAXLEN_MIN_VALUE = 0;
	public static final int MAXLEN_MAX_VALUE = 2147483647;
	protected int requiredMaxLen;
	protected String optionalInitValue;
	public CFBamNmTokensDefBuff() {
		super();
		requiredMaxLen = CFBamNmTokensDefBuff.MAXLEN_INIT_VALUE;
		optionalInitValue = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public int getRequiredMaxLen() {
		return( requiredMaxLen );
	}

	public void setRequiredMaxLen( int value ) {
		if( value < CFBamNmTokensDefBuff.MAXLEN_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredMaxLen",
				1,
				"value",
				value,
				CFBamNmTokensDefBuff.MAXLEN_MIN_VALUE );
		}
		if( value > CFBamNmTokensDefBuff.MAXLEN_MAX_VALUE ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setRequiredMaxLen",
				1,
				"value",
				value,
				CFBamNmTokensDefBuff.MAXLEN_MAX_VALUE );
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
		else if( value.length() > 256 ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setOptionalInitValue",
				1,
				"value.length()",
				value.length(),
				256 );
		}
		else {
			optionalInitValue = value;
		}
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFBamNmTokensDefBuff ) {
			CFBamNmTokensDefBuff rhs = (CFBamNmTokensDefBuff)obj;
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
		else if( obj instanceof CFBamNmTokensDefHBuff ) {
			CFBamNmTokensDefHBuff rhs = (CFBamNmTokensDefHBuff)obj;
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
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof CFBamNmTokensDefBuff ) {
			CFBamNmTokensDefBuff rhs = (CFBamNmTokensDefBuff)obj;
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
		else if( obj instanceof CFBamNmTokensDefHBuff ) {
			CFBamNmTokensDefHBuff rhs = (CFBamNmTokensDefHBuff)obj;
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
			return( 0 );
		}
		else {
			int retval = super.compareTo( obj );
			return( retval );
		}
	}

	public void set( CFBamValueBuff src ) {
		if( src instanceof CFBamNmTokensDefBuff ) {
			setNmTokensDefBuff( (CFBamNmTokensDefBuff)src );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"CFBamNmTokensDefBuff" );
		}
	}

	public void setNmTokensDefBuff( CFBamNmTokensDefBuff src ) {
		super.setAtomBuff( src );
		setRequiredMaxLen( src.getRequiredMaxLen() );
		setOptionalInitValue( src.getOptionalInitValue() );
	}

	public void set( CFBamValueHBuff src ) {
		if( src instanceof CFBamNmTokensDefHBuff ) {
			setNmTokensDefBuff( (CFBamNmTokensDefHBuff)src );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"CFBamNmTokensDefHBuff" );
		}
	}

	public void setNmTokensDefBuff( CFBamNmTokensDefHBuff src ) {
		super.setAtomBuff( src );
		setRequiredMaxLen( src.getRequiredMaxLen() );
		setOptionalInitValue( src.getOptionalInitValue() );
	}
}
