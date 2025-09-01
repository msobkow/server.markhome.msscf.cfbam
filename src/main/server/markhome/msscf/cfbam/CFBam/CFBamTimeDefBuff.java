// Description: Java 11 implementation of a TimeDef buffer object.

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

public class CFBamTimeDefBuff
	extends CFBamAtomBuff
	implements Comparable<Object>,
		Serializable
{
	public final static String CLASS_CODE = "a843";
	public static final long TENANTID_INIT_VALUE = 0L;
	public static final long ID_INIT_VALUE = 0L;
	public static final long TENANTID_MIN_VALUE = 0L;
	public static final long ID_MIN_VALUE = 0L;
	protected String optionalDummy;
	public CFBamTimeDefBuff() {
		super();
		optionalDummy = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getOptionalDummy() {
		return( optionalDummy );
	}

	public void setOptionalDummy( String value ) {
		if( value == null ) {
			optionalDummy = null;
		}
		else if( value.length() > 4 ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setOptionalDummy",
				1,
				"value.length()",
				value.length(),
				4 );
		}
		else {
			optionalDummy = value;
		}
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFBamTimeDefBuff ) {
			CFBamTimeDefBuff rhs = (CFBamTimeDefBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			if( getOptionalDummy() != null ) {
				if( rhs.getOptionalDummy() != null ) {
					if( ! getOptionalDummy().equals( rhs.getOptionalDummy() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalDummy() != null ) {
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
		else if( obj instanceof CFBamTimeDefHBuff ) {
			CFBamTimeDefHBuff rhs = (CFBamTimeDefHBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			if( getOptionalDummy() != null ) {
				if( rhs.getOptionalDummy() != null ) {
					if( ! getOptionalDummy().equals( rhs.getOptionalDummy() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalDummy() != null ) {
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
		if( getOptionalDummy() != null ) {
			hashCode = hashCode + getOptionalDummy().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof CFBamTimeDefBuff ) {
			CFBamTimeDefBuff rhs = (CFBamTimeDefBuff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
			if( getOptionalDummy() != null ) {
				if( rhs.getOptionalDummy() != null ) {
					int cmp = getOptionalDummy().compareTo( rhs.getOptionalDummy() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDummy() != null ) {
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
		else if( obj instanceof CFBamTimeDefHBuff ) {
			CFBamTimeDefHBuff rhs = (CFBamTimeDefHBuff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
			if( getOptionalDummy() != null ) {
				if( rhs.getOptionalDummy() != null ) {
					int cmp = getOptionalDummy().compareTo( rhs.getOptionalDummy() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDummy() != null ) {
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
		if( src instanceof CFBamTimeDefBuff ) {
			setTimeDefBuff( (CFBamTimeDefBuff)src );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"CFBamTimeDefBuff" );
		}
	}

	public void setTimeDefBuff( CFBamTimeDefBuff src ) {
		super.setAtomBuff( src );
		setOptionalDummy( src.getOptionalDummy() );
	}

	public void set( CFBamValueHBuff src ) {
		if( src instanceof CFBamTimeDefHBuff ) {
			setTimeDefBuff( (CFBamTimeDefHBuff)src );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"CFBamTimeDefHBuff" );
		}
	}

	public void setTimeDefBuff( CFBamTimeDefHBuff src ) {
		super.setAtomBuff( src );
		setOptionalDummy( src.getOptionalDummy() );
	}
}
