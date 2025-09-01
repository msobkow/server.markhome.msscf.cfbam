// Description: Java 11 implementation of a DelSubDep1 by DelTopDepIdx index key object.

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

public class CFBamDelSubDep1ByDelTopDepIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected long requiredDelTopDepTenantId;
	protected long requiredDelTopDepId;
	public CFBamDelSubDep1ByDelTopDepIdxKey() {
		requiredDelTopDepTenantId = CFBamDelSubDep1Buff.DELTOPDEPTENANTID_INIT_VALUE;
		requiredDelTopDepId = CFBamDelSubDep1Buff.DELTOPDEPID_INIT_VALUE;
	}

	public long getRequiredDelTopDepTenantId() {
		return( requiredDelTopDepTenantId );
	}

	public void setRequiredDelTopDepTenantId( long value ) {
		if( value < CFBamDelSubDep1Buff.DELTOPDEPTENANTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredDelTopDepTenantId",
				1,
				"value",
				value,
				CFBamDelSubDep1Buff.DELTOPDEPTENANTID_MIN_VALUE );
		}
		requiredDelTopDepTenantId = value;
	}

	public long getRequiredDelTopDepId() {
		return( requiredDelTopDepId );
	}

	public void setRequiredDelTopDepId( long value ) {
		if( value < CFBamDelSubDep1Buff.DELTOPDEPID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredDelTopDepId",
				1,
				"value",
				value,
				CFBamDelSubDep1Buff.DELTOPDEPID_MIN_VALUE );
		}
		requiredDelTopDepId = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFBamDelSubDep1ByDelTopDepIdxKey ) {
			CFBamDelSubDep1ByDelTopDepIdxKey rhs = (CFBamDelSubDep1ByDelTopDepIdxKey)obj;
			if( getRequiredDelTopDepTenantId() != rhs.getRequiredDelTopDepTenantId() ) {
				return( false );
			}
			if( getRequiredDelTopDepId() != rhs.getRequiredDelTopDepId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamDelSubDep1Buff ) {
			CFBamDelSubDep1Buff rhs = (CFBamDelSubDep1Buff)obj;
			if( getRequiredDelTopDepTenantId() != rhs.getRequiredDelTopDepTenantId() ) {
				return( false );
			}
			if( getRequiredDelTopDepId() != rhs.getRequiredDelTopDepId() ) {
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
		hashCode = hashCode + (int)( getRequiredDelTopDepTenantId() );
		hashCode = hashCode + (int)( getRequiredDelTopDepId() );
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFBamDelSubDep1ByDelTopDepIdxKey ) {
			CFBamDelSubDep1ByDelTopDepIdxKey rhs = (CFBamDelSubDep1ByDelTopDepIdxKey)obj;
			if( getRequiredDelTopDepTenantId() < rhs.getRequiredDelTopDepTenantId() ) {
				return( -1 );
			}
			else if( getRequiredDelTopDepTenantId() > rhs.getRequiredDelTopDepTenantId() ) {
				return( 1 );
			}
			if( getRequiredDelTopDepId() < rhs.getRequiredDelTopDepId() ) {
				return( -1 );
			}
			else if( getRequiredDelTopDepId() > rhs.getRequiredDelTopDepId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFBamDelSubDep1Buff ) {
			CFBamDelSubDep1Buff rhs = (CFBamDelSubDep1Buff)obj;
			if( getRequiredDelTopDepTenantId() < rhs.getRequiredDelTopDepTenantId() ) {
				return( -1 );
			}
			else if( getRequiredDelTopDepTenantId() > rhs.getRequiredDelTopDepTenantId() ) {
				return( 1 );
			}
			if( getRequiredDelTopDepId() < rhs.getRequiredDelTopDepId() ) {
				return( -1 );
			}
			else if( getRequiredDelTopDepId() > rhs.getRequiredDelTopDepId() ) {
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
		String ret = "<CFBamDelSubDep1ByDelTopDepIdx"
			+ " RequiredDelTopDepTenantId=" + "\"" + Long.toString( getRequiredDelTopDepTenantId() ) + "\""
			+ " RequiredDelTopDepId=" + "\"" + Long.toString( getRequiredDelTopDepId() ) + "\""
			+ "/>";
		return( ret );
	}
}
