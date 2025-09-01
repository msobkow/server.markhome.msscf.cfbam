// Description: Java 11 implementation of a DelSubDep3 by DelSubDep2Idx index key object.

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

public class CFBamDelSubDep3ByDelSubDep2IdxKey
	implements Comparable<Object>,
		Serializable
{
	protected long requiredDelSubDep2TenantId;
	protected long requiredDelSubDep2Id;
	public CFBamDelSubDep3ByDelSubDep2IdxKey() {
		requiredDelSubDep2TenantId = CFBamDelSubDep3Buff.DELSUBDEP2TENANTID_INIT_VALUE;
		requiredDelSubDep2Id = CFBamDelSubDep3Buff.DELSUBDEP2ID_INIT_VALUE;
	}

	public long getRequiredDelSubDep2TenantId() {
		return( requiredDelSubDep2TenantId );
	}

	public void setRequiredDelSubDep2TenantId( long value ) {
		if( value < CFBamDelSubDep3Buff.DELSUBDEP2TENANTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredDelSubDep2TenantId",
				1,
				"value",
				value,
				CFBamDelSubDep3Buff.DELSUBDEP2TENANTID_MIN_VALUE );
		}
		requiredDelSubDep2TenantId = value;
	}

	public long getRequiredDelSubDep2Id() {
		return( requiredDelSubDep2Id );
	}

	public void setRequiredDelSubDep2Id( long value ) {
		if( value < CFBamDelSubDep3Buff.DELSUBDEP2ID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredDelSubDep2Id",
				1,
				"value",
				value,
				CFBamDelSubDep3Buff.DELSUBDEP2ID_MIN_VALUE );
		}
		requiredDelSubDep2Id = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFBamDelSubDep3ByDelSubDep2IdxKey ) {
			CFBamDelSubDep3ByDelSubDep2IdxKey rhs = (CFBamDelSubDep3ByDelSubDep2IdxKey)obj;
			if( getRequiredDelSubDep2TenantId() != rhs.getRequiredDelSubDep2TenantId() ) {
				return( false );
			}
			if( getRequiredDelSubDep2Id() != rhs.getRequiredDelSubDep2Id() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamDelSubDep3Buff ) {
			CFBamDelSubDep3Buff rhs = (CFBamDelSubDep3Buff)obj;
			if( getRequiredDelSubDep2TenantId() != rhs.getRequiredDelSubDep2TenantId() ) {
				return( false );
			}
			if( getRequiredDelSubDep2Id() != rhs.getRequiredDelSubDep2Id() ) {
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
		hashCode = hashCode + (int)( getRequiredDelSubDep2TenantId() );
		hashCode = hashCode + (int)( getRequiredDelSubDep2Id() );
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFBamDelSubDep3ByDelSubDep2IdxKey ) {
			CFBamDelSubDep3ByDelSubDep2IdxKey rhs = (CFBamDelSubDep3ByDelSubDep2IdxKey)obj;
			if( getRequiredDelSubDep2TenantId() < rhs.getRequiredDelSubDep2TenantId() ) {
				return( -1 );
			}
			else if( getRequiredDelSubDep2TenantId() > rhs.getRequiredDelSubDep2TenantId() ) {
				return( 1 );
			}
			if( getRequiredDelSubDep2Id() < rhs.getRequiredDelSubDep2Id() ) {
				return( -1 );
			}
			else if( getRequiredDelSubDep2Id() > rhs.getRequiredDelSubDep2Id() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFBamDelSubDep3Buff ) {
			CFBamDelSubDep3Buff rhs = (CFBamDelSubDep3Buff)obj;
			if( getRequiredDelSubDep2TenantId() < rhs.getRequiredDelSubDep2TenantId() ) {
				return( -1 );
			}
			else if( getRequiredDelSubDep2TenantId() > rhs.getRequiredDelSubDep2TenantId() ) {
				return( 1 );
			}
			if( getRequiredDelSubDep2Id() < rhs.getRequiredDelSubDep2Id() ) {
				return( -1 );
			}
			else if( getRequiredDelSubDep2Id() > rhs.getRequiredDelSubDep2Id() ) {
				return( 1 );
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
		String ret = "<CFBamDelSubDep3ByDelSubDep2Idx"
			+ " RequiredDelSubDep2TenantId=" + "\"" + Long.toString( getRequiredDelSubDep2TenantId() ) + "\""
			+ " RequiredDelSubDep2Id=" + "\"" + Long.toString( getRequiredDelSubDep2Id() ) + "\""
			+ "/>";
		return( ret );
	}
}
