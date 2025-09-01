// Description: Java 11 implementation of a RelationCol by ToColIdx index key object.

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

public class CFBamRelationColByToColIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected long requiredTenantId;
	protected long requiredToColId;
	public CFBamRelationColByToColIdxKey() {
		requiredTenantId = CFBamRelationColBuff.TENANTID_INIT_VALUE;
		requiredToColId = CFBamRelationColBuff.TOCOLID_INIT_VALUE;
	}

	public long getRequiredTenantId() {
		return( requiredTenantId );
	}

	public void setRequiredTenantId( long value ) {
		if( value < CFBamRelationColBuff.TENANTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredTenantId",
				1,
				"value",
				value,
				CFBamRelationColBuff.TENANTID_MIN_VALUE );
		}
		requiredTenantId = value;
	}

	public long getRequiredToColId() {
		return( requiredToColId );
	}

	public void setRequiredToColId( long value ) {
		if( value < CFBamRelationColBuff.TOCOLID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredToColId",
				1,
				"value",
				value,
				CFBamRelationColBuff.TOCOLID_MIN_VALUE );
		}
		requiredToColId = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFBamRelationColByToColIdxKey ) {
			CFBamRelationColByToColIdxKey rhs = (CFBamRelationColByToColIdxKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredToColId() != rhs.getRequiredToColId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamRelationColBuff ) {
			CFBamRelationColBuff rhs = (CFBamRelationColBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredToColId() != rhs.getRequiredToColId() ) {
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
		hashCode = hashCode + (int)( getRequiredTenantId() );
		hashCode = hashCode + (int)( getRequiredToColId() );
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFBamRelationColByToColIdxKey ) {
			CFBamRelationColByToColIdxKey rhs = (CFBamRelationColByToColIdxKey)obj;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredToColId() < rhs.getRequiredToColId() ) {
				return( -1 );
			}
			else if( getRequiredToColId() > rhs.getRequiredToColId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFBamRelationColBuff ) {
			CFBamRelationColBuff rhs = (CFBamRelationColBuff)obj;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredToColId() < rhs.getRequiredToColId() ) {
				return( -1 );
			}
			else if( getRequiredToColId() > rhs.getRequiredToColId() ) {
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
		String ret = "<CFBamRelationColByToColIdx"
			+ " RequiredTenantId=" + "\"" + Long.toString( getRequiredTenantId() ) + "\""
			+ " RequiredToColId=" + "\"" + Long.toString( getRequiredToColId() ) + "\""
			+ "/>";
		return( ret );
	}
}
