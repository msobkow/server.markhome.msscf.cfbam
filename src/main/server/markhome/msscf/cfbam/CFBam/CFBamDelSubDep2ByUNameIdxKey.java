// Description: Java 11 implementation of a DelSubDep2 by UNameIdx index key object.

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

public class CFBamDelSubDep2ByUNameIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected long requiredDelSubDep1TenantId;
	protected long requiredDelSubDep1Id;
	protected String requiredName;
	public CFBamDelSubDep2ByUNameIdxKey() {
		requiredDelSubDep1TenantId = CFBamDelSubDep2Buff.DELSUBDEP1TENANTID_INIT_VALUE;
		requiredDelSubDep1Id = CFBamDelSubDep2Buff.DELSUBDEP1ID_INIT_VALUE;
		requiredName = new String( CFBamDelSubDep2Buff.NAME_INIT_VALUE );
	}

	public long getRequiredDelSubDep1TenantId() {
		return( requiredDelSubDep1TenantId );
	}

	public void setRequiredDelSubDep1TenantId( long value ) {
		if( value < CFBamDelSubDep2Buff.DELSUBDEP1TENANTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredDelSubDep1TenantId",
				1,
				"value",
				value,
				CFBamDelSubDep2Buff.DELSUBDEP1TENANTID_MIN_VALUE );
		}
		requiredDelSubDep1TenantId = value;
	}

	public long getRequiredDelSubDep1Id() {
		return( requiredDelSubDep1Id );
	}

	public void setRequiredDelSubDep1Id( long value ) {
		if( value < CFBamDelSubDep2Buff.DELSUBDEP1ID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredDelSubDep1Id",
				1,
				"value",
				value,
				CFBamDelSubDep2Buff.DELSUBDEP1ID_MIN_VALUE );
		}
		requiredDelSubDep1Id = value;
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
		else if( obj instanceof CFBamDelSubDep2ByUNameIdxKey ) {
			CFBamDelSubDep2ByUNameIdxKey rhs = (CFBamDelSubDep2ByUNameIdxKey)obj;
			if( getRequiredDelSubDep1TenantId() != rhs.getRequiredDelSubDep1TenantId() ) {
				return( false );
			}
			if( getRequiredDelSubDep1Id() != rhs.getRequiredDelSubDep1Id() ) {
				return( false );
			}
			if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamDelSubDep2Buff ) {
			CFBamDelSubDep2Buff rhs = (CFBamDelSubDep2Buff)obj;
			if( getRequiredDelSubDep1TenantId() != rhs.getRequiredDelSubDep1TenantId() ) {
				return( false );
			}
			if( getRequiredDelSubDep1Id() != rhs.getRequiredDelSubDep1Id() ) {
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
		hashCode = hashCode + (int)( getRequiredDelSubDep1TenantId() );
		hashCode = hashCode + (int)( getRequiredDelSubDep1Id() );
		if( getRequiredName() != null ) {
			hashCode = hashCode + getRequiredName().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFBamDelSubDep2ByUNameIdxKey ) {
			CFBamDelSubDep2ByUNameIdxKey rhs = (CFBamDelSubDep2ByUNameIdxKey)obj;
			if( getRequiredDelSubDep1TenantId() < rhs.getRequiredDelSubDep1TenantId() ) {
				return( -1 );
			}
			else if( getRequiredDelSubDep1TenantId() > rhs.getRequiredDelSubDep1TenantId() ) {
				return( 1 );
			}
			if( getRequiredDelSubDep1Id() < rhs.getRequiredDelSubDep1Id() ) {
				return( -1 );
			}
			else if( getRequiredDelSubDep1Id() > rhs.getRequiredDelSubDep1Id() ) {
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
		else if( obj instanceof CFBamDelSubDep2Buff ) {
			CFBamDelSubDep2Buff rhs = (CFBamDelSubDep2Buff)obj;
			if( getRequiredDelSubDep1TenantId() < rhs.getRequiredDelSubDep1TenantId() ) {
				return( -1 );
			}
			else if( getRequiredDelSubDep1TenantId() > rhs.getRequiredDelSubDep1TenantId() ) {
				return( 1 );
			}
			if( getRequiredDelSubDep1Id() < rhs.getRequiredDelSubDep1Id() ) {
				return( -1 );
			}
			else if( getRequiredDelSubDep1Id() > rhs.getRequiredDelSubDep1Id() ) {
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
		String ret = "<CFBamDelSubDep2ByUNameIdx"
			+ " RequiredDelSubDep1TenantId=" + "\"" + Long.toString( getRequiredDelSubDep1TenantId() ) + "\""
			+ " RequiredDelSubDep1Id=" + "\"" + Long.toString( getRequiredDelSubDep1Id() ) + "\""
			+ " RequiredName=" + "\"" + CFBamSchema.xmlEncodeString( getRequiredName() ) + "\""
			+ "/>";
		return( ret );
	}
}
