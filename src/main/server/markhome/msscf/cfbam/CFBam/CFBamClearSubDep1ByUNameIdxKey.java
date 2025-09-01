// Description: Java 11 implementation of a ClearSubDep1 by UNameIdx index key object.

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

public class CFBamClearSubDep1ByUNameIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected long requiredClearTopDepTenantId;
	protected long requiredClearTopDepId;
	protected String requiredName;
	public CFBamClearSubDep1ByUNameIdxKey() {
		requiredClearTopDepTenantId = CFBamClearSubDep1Buff.CLEARTOPDEPTENANTID_INIT_VALUE;
		requiredClearTopDepId = CFBamClearSubDep1Buff.CLEARTOPDEPID_INIT_VALUE;
		requiredName = new String( CFBamClearSubDep1Buff.NAME_INIT_VALUE );
	}

	public long getRequiredClearTopDepTenantId() {
		return( requiredClearTopDepTenantId );
	}

	public void setRequiredClearTopDepTenantId( long value ) {
		if( value < CFBamClearSubDep1Buff.CLEARTOPDEPTENANTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredClearTopDepTenantId",
				1,
				"value",
				value,
				CFBamClearSubDep1Buff.CLEARTOPDEPTENANTID_MIN_VALUE );
		}
		requiredClearTopDepTenantId = value;
	}

	public long getRequiredClearTopDepId() {
		return( requiredClearTopDepId );
	}

	public void setRequiredClearTopDepId( long value ) {
		if( value < CFBamClearSubDep1Buff.CLEARTOPDEPID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredClearTopDepId",
				1,
				"value",
				value,
				CFBamClearSubDep1Buff.CLEARTOPDEPID_MIN_VALUE );
		}
		requiredClearTopDepId = value;
	}

	public String getRequiredName() {
		return( requiredName );
	}

	public void setRequiredName( String value ) {
		if( value == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"setRequiredName",
				1,
				"value" );
		}
		if( value.length() > 192 ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setRequiredName",
				1,
				"value.length()",
				value.length(),
				192 );
		}
		requiredName = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFBamClearSubDep1ByUNameIdxKey ) {
			CFBamClearSubDep1ByUNameIdxKey rhs = (CFBamClearSubDep1ByUNameIdxKey)obj;
			if( getRequiredClearTopDepTenantId() != rhs.getRequiredClearTopDepTenantId() ) {
				return( false );
			}
			if( getRequiredClearTopDepId() != rhs.getRequiredClearTopDepId() ) {
				return( false );
			}
			if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamClearSubDep1Buff ) {
			CFBamClearSubDep1Buff rhs = (CFBamClearSubDep1Buff)obj;
			if( getRequiredClearTopDepTenantId() != rhs.getRequiredClearTopDepTenantId() ) {
				return( false );
			}
			if( getRequiredClearTopDepId() != rhs.getRequiredClearTopDepId() ) {
				return( false );
			}
			if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
				return( false );
			}
			return( true );
		}
		else {
			return( false );
		}
	}

	public int hashCode() {
		int hashCode = 0;
		hashCode = hashCode + (int)( getRequiredClearTopDepTenantId() );
		hashCode = hashCode + (int)( getRequiredClearTopDepId() );
		if( getRequiredName() != null ) {
			hashCode = hashCode + getRequiredName().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFBamClearSubDep1ByUNameIdxKey ) {
			CFBamClearSubDep1ByUNameIdxKey rhs = (CFBamClearSubDep1ByUNameIdxKey)obj;
			if( getRequiredClearTopDepTenantId() < rhs.getRequiredClearTopDepTenantId() ) {
				return( -1 );
			}
			else if( getRequiredClearTopDepTenantId() > rhs.getRequiredClearTopDepTenantId() ) {
				return( 1 );
			}
			if( getRequiredClearTopDepId() < rhs.getRequiredClearTopDepId() ) {
				return( -1 );
			}
			else if( getRequiredClearTopDepId() > rhs.getRequiredClearTopDepId() ) {
				return( 1 );
			}
			{
				int cmp = getRequiredName().compareTo( rhs.getRequiredName() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			return( 0 );
		}
		else if( obj instanceof CFBamClearSubDep1Buff ) {
			CFBamClearSubDep1Buff rhs = (CFBamClearSubDep1Buff)obj;
			if( getRequiredClearTopDepTenantId() < rhs.getRequiredClearTopDepTenantId() ) {
				return( -1 );
			}
			else if( getRequiredClearTopDepTenantId() > rhs.getRequiredClearTopDepTenantId() ) {
				return( 1 );
			}
			if( getRequiredClearTopDepId() < rhs.getRequiredClearTopDepId() ) {
				return( -1 );
			}
			else if( getRequiredClearTopDepId() > rhs.getRequiredClearTopDepId() ) {
				return( 1 );
			}
			{
				int cmp = getRequiredName().compareTo( rhs.getRequiredName() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			return( 0 );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"obj",
				obj,
				null );
		}
	}

	public String toString() {
		String ret = "<CFBamClearSubDep1ByUNameIdx"
			+ " RequiredClearTopDepTenantId=" + "\"" + Long.toString( getRequiredClearTopDepTenantId() ) + "\""
			+ " RequiredClearTopDepId=" + "\"" + Long.toString( getRequiredClearTopDepId() ) + "\""
			+ " RequiredName=" + "\"" + CFBamSchema.xmlEncodeString( getRequiredName() ) + "\""
			+ "/>";
		return( ret );
	}
}
