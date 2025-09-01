// Description: Java 11 implementation of a ClearSubDep2 by UNameIdx index key object.

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

public class CFBamClearSubDep2ByUNameIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected long requiredClearSubDep1TenantId;
	protected long requiredClearSubDep1Id;
	protected String requiredName;
	public CFBamClearSubDep2ByUNameIdxKey() {
		requiredClearSubDep1TenantId = CFBamClearSubDep2Buff.CLEARSUBDEP1TENANTID_INIT_VALUE;
		requiredClearSubDep1Id = CFBamClearSubDep2Buff.CLEARSUBDEP1ID_INIT_VALUE;
		requiredName = new String( CFBamClearSubDep2Buff.NAME_INIT_VALUE );
	}

	public long getRequiredClearSubDep1TenantId() {
		return( requiredClearSubDep1TenantId );
	}

	public void setRequiredClearSubDep1TenantId( long value ) {
		if( value < CFBamClearSubDep2Buff.CLEARSUBDEP1TENANTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredClearSubDep1TenantId",
				1,
				"value",
				value,
				CFBamClearSubDep2Buff.CLEARSUBDEP1TENANTID_MIN_VALUE );
		}
		requiredClearSubDep1TenantId = value;
	}

	public long getRequiredClearSubDep1Id() {
		return( requiredClearSubDep1Id );
	}

	public void setRequiredClearSubDep1Id( long value ) {
		if( value < CFBamClearSubDep2Buff.CLEARSUBDEP1ID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredClearSubDep1Id",
				1,
				"value",
				value,
				CFBamClearSubDep2Buff.CLEARSUBDEP1ID_MIN_VALUE );
		}
		requiredClearSubDep1Id = value;
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
		else if( obj instanceof CFBamClearSubDep2ByUNameIdxKey ) {
			CFBamClearSubDep2ByUNameIdxKey rhs = (CFBamClearSubDep2ByUNameIdxKey)obj;
			if( getRequiredClearSubDep1TenantId() != rhs.getRequiredClearSubDep1TenantId() ) {
				return( false );
			}
			if( getRequiredClearSubDep1Id() != rhs.getRequiredClearSubDep1Id() ) {
				return( false );
			}
			if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamClearSubDep2Buff ) {
			CFBamClearSubDep2Buff rhs = (CFBamClearSubDep2Buff)obj;
			if( getRequiredClearSubDep1TenantId() != rhs.getRequiredClearSubDep1TenantId() ) {
				return( false );
			}
			if( getRequiredClearSubDep1Id() != rhs.getRequiredClearSubDep1Id() ) {
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
		hashCode = hashCode + (int)( getRequiredClearSubDep1TenantId() );
		hashCode = hashCode + (int)( getRequiredClearSubDep1Id() );
		if( getRequiredName() != null ) {
			hashCode = hashCode + getRequiredName().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFBamClearSubDep2ByUNameIdxKey ) {
			CFBamClearSubDep2ByUNameIdxKey rhs = (CFBamClearSubDep2ByUNameIdxKey)obj;
			if( getRequiredClearSubDep1TenantId() < rhs.getRequiredClearSubDep1TenantId() ) {
				return( -1 );
			}
			else if( getRequiredClearSubDep1TenantId() > rhs.getRequiredClearSubDep1TenantId() ) {
				return( 1 );
			}
			if( getRequiredClearSubDep1Id() < rhs.getRequiredClearSubDep1Id() ) {
				return( -1 );
			}
			else if( getRequiredClearSubDep1Id() > rhs.getRequiredClearSubDep1Id() ) {
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
		else if( obj instanceof CFBamClearSubDep2Buff ) {
			CFBamClearSubDep2Buff rhs = (CFBamClearSubDep2Buff)obj;
			if( getRequiredClearSubDep1TenantId() < rhs.getRequiredClearSubDep1TenantId() ) {
				return( -1 );
			}
			else if( getRequiredClearSubDep1TenantId() > rhs.getRequiredClearSubDep1TenantId() ) {
				return( 1 );
			}
			if( getRequiredClearSubDep1Id() < rhs.getRequiredClearSubDep1Id() ) {
				return( -1 );
			}
			else if( getRequiredClearSubDep1Id() > rhs.getRequiredClearSubDep1Id() ) {
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
		String ret = "<CFBamClearSubDep2ByUNameIdx"
			+ " RequiredClearSubDep1TenantId=" + "\"" + Long.toString( getRequiredClearSubDep1TenantId() ) + "\""
			+ " RequiredClearSubDep1Id=" + "\"" + Long.toString( getRequiredClearSubDep1Id() ) + "\""
			+ " RequiredName=" + "\"" + CFBamSchema.xmlEncodeString( getRequiredName() ) + "\""
			+ "/>";
		return( ret );
	}
}
