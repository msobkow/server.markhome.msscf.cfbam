// Description: Java 11 implementation of a PopSubDep3 by UNameIdx index key object.

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

public class CFBamPopSubDep3ByUNameIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected long requiredPopSubDep2TenantId;
	protected long requiredPopSubDep2Id;
	protected String requiredName;
	public CFBamPopSubDep3ByUNameIdxKey() {
		requiredPopSubDep2TenantId = CFBamPopSubDep3Buff.POPSUBDEP2TENANTID_INIT_VALUE;
		requiredPopSubDep2Id = CFBamPopSubDep3Buff.POPSUBDEP2ID_INIT_VALUE;
		requiredName = new String( CFBamPopSubDep3Buff.NAME_INIT_VALUE );
	}

	public long getRequiredPopSubDep2TenantId() {
		return( requiredPopSubDep2TenantId );
	}

	public void setRequiredPopSubDep2TenantId( long value ) {
		if( value < CFBamPopSubDep3Buff.POPSUBDEP2TENANTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredPopSubDep2TenantId",
				1,
				"value",
				value,
				CFBamPopSubDep3Buff.POPSUBDEP2TENANTID_MIN_VALUE );
		}
		requiredPopSubDep2TenantId = value;
	}

	public long getRequiredPopSubDep2Id() {
		return( requiredPopSubDep2Id );
	}

	public void setRequiredPopSubDep2Id( long value ) {
		if( value < CFBamPopSubDep3Buff.POPSUBDEP2ID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredPopSubDep2Id",
				1,
				"value",
				value,
				CFBamPopSubDep3Buff.POPSUBDEP2ID_MIN_VALUE );
		}
		requiredPopSubDep2Id = value;
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
		else if( obj instanceof CFBamPopSubDep3ByUNameIdxKey ) {
			CFBamPopSubDep3ByUNameIdxKey rhs = (CFBamPopSubDep3ByUNameIdxKey)obj;
			if( getRequiredPopSubDep2TenantId() != rhs.getRequiredPopSubDep2TenantId() ) {
				return( false );
			}
			if( getRequiredPopSubDep2Id() != rhs.getRequiredPopSubDep2Id() ) {
				return( false );
			}
			if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamPopSubDep3Buff ) {
			CFBamPopSubDep3Buff rhs = (CFBamPopSubDep3Buff)obj;
			if( getRequiredPopSubDep2TenantId() != rhs.getRequiredPopSubDep2TenantId() ) {
				return( false );
			}
			if( getRequiredPopSubDep2Id() != rhs.getRequiredPopSubDep2Id() ) {
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
		hashCode = hashCode + (int)( getRequiredPopSubDep2TenantId() );
		hashCode = hashCode + (int)( getRequiredPopSubDep2Id() );
		if( getRequiredName() != null ) {
			hashCode = hashCode + getRequiredName().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFBamPopSubDep3ByUNameIdxKey ) {
			CFBamPopSubDep3ByUNameIdxKey rhs = (CFBamPopSubDep3ByUNameIdxKey)obj;
			if( getRequiredPopSubDep2TenantId() < rhs.getRequiredPopSubDep2TenantId() ) {
				return( -1 );
			}
			else if( getRequiredPopSubDep2TenantId() > rhs.getRequiredPopSubDep2TenantId() ) {
				return( 1 );
			}
			if( getRequiredPopSubDep2Id() < rhs.getRequiredPopSubDep2Id() ) {
				return( -1 );
			}
			else if( getRequiredPopSubDep2Id() > rhs.getRequiredPopSubDep2Id() ) {
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
		else if( obj instanceof CFBamPopSubDep3Buff ) {
			CFBamPopSubDep3Buff rhs = (CFBamPopSubDep3Buff)obj;
			if( getRequiredPopSubDep2TenantId() < rhs.getRequiredPopSubDep2TenantId() ) {
				return( -1 );
			}
			else if( getRequiredPopSubDep2TenantId() > rhs.getRequiredPopSubDep2TenantId() ) {
				return( 1 );
			}
			if( getRequiredPopSubDep2Id() < rhs.getRequiredPopSubDep2Id() ) {
				return( -1 );
			}
			else if( getRequiredPopSubDep2Id() > rhs.getRequiredPopSubDep2Id() ) {
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
		String ret = "<CFBamPopSubDep3ByUNameIdx"
			+ " RequiredPopSubDep2TenantId=" + "\"" + Long.toString( getRequiredPopSubDep2TenantId() ) + "\""
			+ " RequiredPopSubDep2Id=" + "\"" + Long.toString( getRequiredPopSubDep2Id() ) + "\""
			+ " RequiredName=" + "\"" + CFBamSchema.xmlEncodeString( getRequiredName() ) + "\""
			+ "/>";
		return( ret );
	}
}
