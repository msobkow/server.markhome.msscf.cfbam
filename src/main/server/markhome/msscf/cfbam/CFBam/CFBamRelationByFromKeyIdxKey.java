// Description: Java 11 implementation of a Relation by FromKeyIdx index key object.

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

public class CFBamRelationByFromKeyIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected long requiredTenantId;
	protected long requiredFromIndexId;
	public CFBamRelationByFromKeyIdxKey() {
		requiredTenantId = CFBamRelationBuff.TENANTID_INIT_VALUE;
		requiredFromIndexId = CFBamRelationBuff.FROMINDEXID_INIT_VALUE;
	}

	public long getRequiredTenantId() {
		return( requiredTenantId );
	}

	public void setRequiredTenantId( long value ) {
		if( value < CFBamRelationBuff.TENANTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredTenantId",
				1,
				"value",
				value,
				CFBamRelationBuff.TENANTID_MIN_VALUE );
		}
		requiredTenantId = value;
	}

	public long getRequiredFromIndexId() {
		return( requiredFromIndexId );
	}

	public void setRequiredFromIndexId( long value ) {
		if( value < CFBamRelationBuff.FROMINDEXID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredFromIndexId",
				1,
				"value",
				value,
				CFBamRelationBuff.FROMINDEXID_MIN_VALUE );
		}
		requiredFromIndexId = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFBamRelationByFromKeyIdxKey ) {
			CFBamRelationByFromKeyIdxKey rhs = (CFBamRelationByFromKeyIdxKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredFromIndexId() != rhs.getRequiredFromIndexId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamRelationBuff ) {
			CFBamRelationBuff rhs = (CFBamRelationBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredFromIndexId() != rhs.getRequiredFromIndexId() ) {
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
		hashCode = hashCode + (int)( getRequiredFromIndexId() );
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFBamRelationByFromKeyIdxKey ) {
			CFBamRelationByFromKeyIdxKey rhs = (CFBamRelationByFromKeyIdxKey)obj;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredFromIndexId() < rhs.getRequiredFromIndexId() ) {
				return( -1 );
			}
			else if( getRequiredFromIndexId() > rhs.getRequiredFromIndexId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFBamRelationBuff ) {
			CFBamRelationBuff rhs = (CFBamRelationBuff)obj;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredFromIndexId() < rhs.getRequiredFromIndexId() ) {
				return( -1 );
			}
			else if( getRequiredFromIndexId() > rhs.getRequiredFromIndexId() ) {
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
		String ret = "<CFBamRelationByFromKeyIdx"
			+ " RequiredTenantId=" + "\"" + Long.toString( getRequiredTenantId() ) + "\""
			+ " RequiredFromIndexId=" + "\"" + Long.toString( getRequiredFromIndexId() ) + "\""
			+ "/>";
		return( ret );
	}
}
