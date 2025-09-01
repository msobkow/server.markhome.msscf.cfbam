// Description: Java 11 implementation of a SchemaDef by MinorVersionIdx index key object.

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

public class CFBamSchemaDefByMinorVersionIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected long requiredTenantId;
	protected long requiredMinorVersionId;
	public CFBamSchemaDefByMinorVersionIdxKey() {
		requiredTenantId = CFBamSchemaDefBuff.TENANTID_INIT_VALUE;
		requiredMinorVersionId = CFBamSchemaDefBuff.MINORVERSIONID_INIT_VALUE;
	}

	public long getRequiredTenantId() {
		return( requiredTenantId );
	}

	public void setRequiredTenantId( long value ) {
		if( value < CFBamSchemaDefBuff.TENANTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredTenantId",
				1,
				"value",
				value,
				CFBamSchemaDefBuff.TENANTID_MIN_VALUE );
		}
		requiredTenantId = value;
	}

	public long getRequiredMinorVersionId() {
		return( requiredMinorVersionId );
	}

	public void setRequiredMinorVersionId( long value ) {
		if( value < CFBamSchemaDefBuff.MINORVERSIONID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredMinorVersionId",
				1,
				"value",
				value,
				CFBamSchemaDefBuff.MINORVERSIONID_MIN_VALUE );
		}
		requiredMinorVersionId = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFBamSchemaDefByMinorVersionIdxKey ) {
			CFBamSchemaDefByMinorVersionIdxKey rhs = (CFBamSchemaDefByMinorVersionIdxKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredMinorVersionId() != rhs.getRequiredMinorVersionId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamSchemaDefBuff ) {
			CFBamSchemaDefBuff rhs = (CFBamSchemaDefBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredMinorVersionId() != rhs.getRequiredMinorVersionId() ) {
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
		hashCode = hashCode + (int)( getRequiredMinorVersionId() );
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFBamSchemaDefByMinorVersionIdxKey ) {
			CFBamSchemaDefByMinorVersionIdxKey rhs = (CFBamSchemaDefByMinorVersionIdxKey)obj;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredMinorVersionId() < rhs.getRequiredMinorVersionId() ) {
				return( -1 );
			}
			else if( getRequiredMinorVersionId() > rhs.getRequiredMinorVersionId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFBamSchemaDefBuff ) {
			CFBamSchemaDefBuff rhs = (CFBamSchemaDefBuff)obj;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredMinorVersionId() < rhs.getRequiredMinorVersionId() ) {
				return( -1 );
			}
			else if( getRequiredMinorVersionId() > rhs.getRequiredMinorVersionId() ) {
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
		String ret = "<CFBamSchemaDefByMinorVersionIdx"
			+ " RequiredTenantId=" + "\"" + Long.toString( getRequiredTenantId() ) + "\""
			+ " RequiredMinorVersionId=" + "\"" + Long.toString( getRequiredMinorVersionId() ) + "\""
			+ "/>";
		return( ret );
	}
}
