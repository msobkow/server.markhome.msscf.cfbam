// Description: Java 11 implementation of a SchemaRef by SchemaIdx index key object.

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

public class CFBamSchemaRefBySchemaIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected long requiredTenantId;
	protected long requiredSchemaId;
	public CFBamSchemaRefBySchemaIdxKey() {
		requiredTenantId = CFBamSchemaRefBuff.TENANTID_INIT_VALUE;
		requiredSchemaId = CFBamSchemaRefBuff.SCHEMAID_INIT_VALUE;
	}

	public long getRequiredTenantId() {
		return( requiredTenantId );
	}

	public void setRequiredTenantId( long value ) {
		if( value < CFBamSchemaRefBuff.TENANTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredTenantId",
				1,
				"value",
				value,
				CFBamSchemaRefBuff.TENANTID_MIN_VALUE );
		}
		requiredTenantId = value;
	}

	public long getRequiredSchemaId() {
		return( requiredSchemaId );
	}

	public void setRequiredSchemaId( long value ) {
		if( value < CFBamSchemaRefBuff.SCHEMAID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredSchemaId",
				1,
				"value",
				value,
				CFBamSchemaRefBuff.SCHEMAID_MIN_VALUE );
		}
		requiredSchemaId = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFBamSchemaRefBySchemaIdxKey ) {
			CFBamSchemaRefBySchemaIdxKey rhs = (CFBamSchemaRefBySchemaIdxKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredSchemaId() != rhs.getRequiredSchemaId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamSchemaRefBuff ) {
			CFBamSchemaRefBuff rhs = (CFBamSchemaRefBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredSchemaId() != rhs.getRequiredSchemaId() ) {
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
		hashCode = hashCode + (int)( getRequiredSchemaId() );
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFBamSchemaRefBySchemaIdxKey ) {
			CFBamSchemaRefBySchemaIdxKey rhs = (CFBamSchemaRefBySchemaIdxKey)obj;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredSchemaId() < rhs.getRequiredSchemaId() ) {
				return( -1 );
			}
			else if( getRequiredSchemaId() > rhs.getRequiredSchemaId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFBamSchemaRefBuff ) {
			CFBamSchemaRefBuff rhs = (CFBamSchemaRefBuff)obj;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredSchemaId() < rhs.getRequiredSchemaId() ) {
				return( -1 );
			}
			else if( getRequiredSchemaId() > rhs.getRequiredSchemaId() ) {
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
		String ret = "<CFBamSchemaRefBySchemaIdx"
			+ " RequiredTenantId=" + "\"" + Long.toString( getRequiredTenantId() ) + "\""
			+ " RequiredSchemaId=" + "\"" + Long.toString( getRequiredSchemaId() ) + "\""
			+ "/>";
		return( ret );
	}
}
