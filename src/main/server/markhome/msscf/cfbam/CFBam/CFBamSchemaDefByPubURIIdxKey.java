// Description: Java 11 implementation of a SchemaDef by PubURIIdx index key object.

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

public class CFBamSchemaDefByPubURIIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected long requiredTenantId;
	protected String requiredPublishURI;
	public CFBamSchemaDefByPubURIIdxKey() {
		requiredTenantId = CFBamSchemaDefBuff.TENANTID_INIT_VALUE;
		requiredPublishURI = new String( CFBamSchemaDefBuff.PUBLISHURI_INIT_VALUE );
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

	public String getRequiredPublishURI() {
		return( requiredPublishURI );
	}

	public void setRequiredPublishURI( String value ) {
		if( value == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"setRequiredPublishURI",
				1,
				"value" );
		}
		if( value.length() > 512 ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setRequiredPublishURI",
				1,
				"value.length()",
				value.length(),
				512 );
		}
		requiredPublishURI = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFBamSchemaDefByPubURIIdxKey ) {
			CFBamSchemaDefByPubURIIdxKey rhs = (CFBamSchemaDefByPubURIIdxKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( ! getRequiredPublishURI().equals( rhs.getRequiredPublishURI() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamSchemaDefBuff ) {
			CFBamSchemaDefBuff rhs = (CFBamSchemaDefBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( ! getRequiredPublishURI().equals( rhs.getRequiredPublishURI() ) ) {
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
		if( getRequiredPublishURI() != null ) {
			hashCode = hashCode + getRequiredPublishURI().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFBamSchemaDefByPubURIIdxKey ) {
			CFBamSchemaDefByPubURIIdxKey rhs = (CFBamSchemaDefByPubURIIdxKey)obj;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			{
				int cmp = getRequiredPublishURI().compareTo( rhs.getRequiredPublishURI() );
				if( cmp != 0 ) {
					return( cmp );
				}
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
			{
				int cmp = getRequiredPublishURI().compareTo( rhs.getRequiredPublishURI() );
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
		String ret = "<CFBamSchemaDefByPubURIIdx"
			+ " RequiredTenantId=" + "\"" + Long.toString( getRequiredTenantId() ) + "\""
			+ " RequiredPublishURI=" + "\"" + CFBamSchema.xmlEncodeString( getRequiredPublishURI() ) + "\""
			+ "/>";
		return( ret );
	}
}
