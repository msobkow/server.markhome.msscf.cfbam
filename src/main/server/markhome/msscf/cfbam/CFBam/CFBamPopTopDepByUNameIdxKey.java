// Description: Java 11 implementation of a PopTopDep by UNameIdx index key object.

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

public class CFBamPopTopDepByUNameIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected long requiredContRelationTenantId;
	protected long requiredContRelationId;
	protected String requiredName;
	public CFBamPopTopDepByUNameIdxKey() {
		requiredContRelationTenantId = CFBamPopTopDepBuff.CONTRELATIONTENANTID_INIT_VALUE;
		requiredContRelationId = CFBamPopTopDepBuff.CONTRELATIONID_INIT_VALUE;
		requiredName = new String( CFBamPopTopDepBuff.NAME_INIT_VALUE );
	}

	public long getRequiredContRelationTenantId() {
		return( requiredContRelationTenantId );
	}

	public void setRequiredContRelationTenantId( long value ) {
		if( value < CFBamPopTopDepBuff.CONTRELATIONTENANTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredContRelationTenantId",
				1,
				"value",
				value,
				CFBamPopTopDepBuff.CONTRELATIONTENANTID_MIN_VALUE );
		}
		requiredContRelationTenantId = value;
	}

	public long getRequiredContRelationId() {
		return( requiredContRelationId );
	}

	public void setRequiredContRelationId( long value ) {
		if( value < CFBamPopTopDepBuff.CONTRELATIONID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredContRelationId",
				1,
				"value",
				value,
				CFBamPopTopDepBuff.CONTRELATIONID_MIN_VALUE );
		}
		requiredContRelationId = value;
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
		else if( obj instanceof CFBamPopTopDepByUNameIdxKey ) {
			CFBamPopTopDepByUNameIdxKey rhs = (CFBamPopTopDepByUNameIdxKey)obj;
			if( getRequiredContRelationTenantId() != rhs.getRequiredContRelationTenantId() ) {
				return( false );
			}
			if( getRequiredContRelationId() != rhs.getRequiredContRelationId() ) {
				return( false );
			}
			if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamPopTopDepBuff ) {
			CFBamPopTopDepBuff rhs = (CFBamPopTopDepBuff)obj;
			if( getRequiredContRelationTenantId() != rhs.getRequiredContRelationTenantId() ) {
				return( false );
			}
			if( getRequiredContRelationId() != rhs.getRequiredContRelationId() ) {
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
		hashCode = hashCode + (int)( getRequiredContRelationTenantId() );
		hashCode = hashCode + (int)( getRequiredContRelationId() );
		if( getRequiredName() != null ) {
			hashCode = hashCode + getRequiredName().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFBamPopTopDepByUNameIdxKey ) {
			CFBamPopTopDepByUNameIdxKey rhs = (CFBamPopTopDepByUNameIdxKey)obj;
			if( getRequiredContRelationTenantId() < rhs.getRequiredContRelationTenantId() ) {
				return( -1 );
			}
			else if( getRequiredContRelationTenantId() > rhs.getRequiredContRelationTenantId() ) {
				return( 1 );
			}
			if( getRequiredContRelationId() < rhs.getRequiredContRelationId() ) {
				return( -1 );
			}
			else if( getRequiredContRelationId() > rhs.getRequiredContRelationId() ) {
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
		else if( obj instanceof CFBamPopTopDepBuff ) {
			CFBamPopTopDepBuff rhs = (CFBamPopTopDepBuff)obj;
			if( getRequiredContRelationTenantId() < rhs.getRequiredContRelationTenantId() ) {
				return( -1 );
			}
			else if( getRequiredContRelationTenantId() > rhs.getRequiredContRelationTenantId() ) {
				return( 1 );
			}
			if( getRequiredContRelationId() < rhs.getRequiredContRelationId() ) {
				return( -1 );
			}
			else if( getRequiredContRelationId() > rhs.getRequiredContRelationId() ) {
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
		String ret = "<CFBamPopTopDepByUNameIdx"
			+ " RequiredContRelationTenantId=" + "\"" + Long.toString( getRequiredContRelationTenantId() ) + "\""
			+ " RequiredContRelationId=" + "\"" + Long.toString( getRequiredContRelationId() ) + "\""
			+ " RequiredName=" + "\"" + CFBamSchema.xmlEncodeString( getRequiredName() ) + "\""
			+ "/>";
		return( ret );
	}
}
