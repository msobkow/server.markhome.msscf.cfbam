// Description: Java 11 implementation of a IndexCol by ColIdx index key object.

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

public class CFBamIndexColByColIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected long requiredTenantId;
	protected long requiredColumnId;
	public CFBamIndexColByColIdxKey() {
		requiredTenantId = CFBamIndexColBuff.TENANTID_INIT_VALUE;
		requiredColumnId = CFBamIndexColBuff.COLUMNID_INIT_VALUE;
	}

	public long getRequiredTenantId() {
		return( requiredTenantId );
	}

	public void setRequiredTenantId( long value ) {
		if( value < CFBamIndexColBuff.TENANTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredTenantId",
				1,
				"value",
				value,
				CFBamIndexColBuff.TENANTID_MIN_VALUE );
		}
		requiredTenantId = value;
	}

	public long getRequiredColumnId() {
		return( requiredColumnId );
	}

	public void setRequiredColumnId( long value ) {
		if( value < CFBamIndexColBuff.COLUMNID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredColumnId",
				1,
				"value",
				value,
				CFBamIndexColBuff.COLUMNID_MIN_VALUE );
		}
		requiredColumnId = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFBamIndexColByColIdxKey ) {
			CFBamIndexColByColIdxKey rhs = (CFBamIndexColByColIdxKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredColumnId() != rhs.getRequiredColumnId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamIndexColBuff ) {
			CFBamIndexColBuff rhs = (CFBamIndexColBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredColumnId() != rhs.getRequiredColumnId() ) {
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
		hashCode = hashCode + (int)( getRequiredColumnId() );
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFBamIndexColByColIdxKey ) {
			CFBamIndexColByColIdxKey rhs = (CFBamIndexColByColIdxKey)obj;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredColumnId() < rhs.getRequiredColumnId() ) {
				return( -1 );
			}
			else if( getRequiredColumnId() > rhs.getRequiredColumnId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFBamIndexColBuff ) {
			CFBamIndexColBuff rhs = (CFBamIndexColBuff)obj;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredColumnId() < rhs.getRequiredColumnId() ) {
				return( -1 );
			}
			else if( getRequiredColumnId() > rhs.getRequiredColumnId() ) {
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
		String ret = "<CFBamIndexColByColIdx"
			+ " RequiredTenantId=" + "\"" + Long.toString( getRequiredTenantId() ) + "\""
			+ " RequiredColumnId=" + "\"" + Long.toString( getRequiredColumnId() ) + "\""
			+ "/>";
		return( ret );
	}
}
