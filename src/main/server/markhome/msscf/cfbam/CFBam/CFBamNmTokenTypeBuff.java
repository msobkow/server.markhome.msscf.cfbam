// Description: Java 11 implementation of a NmTokenType buffer object.

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

public class CFBamNmTokenTypeBuff
	extends CFBamNmTokenDefBuff
	implements Comparable<Object>,
		Serializable
{
	public final static String CLASS_CODE = "a82a";
	public static final long TENANTID_INIT_VALUE = 0L;
	public static final long ID_INIT_VALUE = 0L;
	public static final long SCHEMADEFID_INIT_VALUE = 0L;
	public static final long TENANTID_MIN_VALUE = 0L;
	public static final long ID_MIN_VALUE = 0L;
	public static final long SCHEMADEFID_MIN_VALUE = 0L;
	protected long requiredSchemaDefId;
	public CFBamNmTokenTypeBuff() {
		super();
		requiredSchemaDefId = CFBamNmTokenTypeBuff.SCHEMADEFID_INIT_VALUE;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public long getRequiredSchemaDefId() {
		return( requiredSchemaDefId );
	}

	public void setRequiredSchemaDefId( long value ) {
		if( value < CFBamNmTokenTypeBuff.SCHEMADEFID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredSchemaDefId",
				1,
				"value",
				value,
				CFBamNmTokenTypeBuff.SCHEMADEFID_MIN_VALUE );
		}
		requiredSchemaDefId = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFBamNmTokenTypeBuff ) {
			CFBamNmTokenTypeBuff rhs = (CFBamNmTokenTypeBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			if( getRequiredSchemaDefId() != rhs.getRequiredSchemaDefId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamValuePKey ) {
			CFBamValuePKey rhs = (CFBamValuePKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamNmTokenTypeHBuff ) {
			CFBamNmTokenTypeHBuff rhs = (CFBamNmTokenTypeHBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			if( getRequiredSchemaDefId() != rhs.getRequiredSchemaDefId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamValueHPKey ) {
			CFBamValueHPKey rhs = (CFBamValueHPKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamNmTokenTypeBySchemaIdxKey ) {
			CFBamNmTokenTypeBySchemaIdxKey rhs = (CFBamNmTokenTypeBySchemaIdxKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredSchemaDefId() != rhs.getRequiredSchemaDefId() ) {
				return( false );
			}
			return( true );
		}
		else {
			boolean retval = super.equals( obj );
			return( retval );
		}
	}

	public int hashCode() {
		int hashCode = super.hashCode();
		hashCode = hashCode + (int)( getRequiredSchemaDefId() );
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof CFBamNmTokenTypeBuff ) {
			CFBamNmTokenTypeBuff rhs = (CFBamNmTokenTypeBuff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
			if( getRequiredSchemaDefId() < rhs.getRequiredSchemaDefId() ) {
				return( -1 );
			}
			else if( getRequiredSchemaDefId() > rhs.getRequiredSchemaDefId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFBamValuePKey ) {
			CFBamValuePKey rhs = (CFBamValuePKey)obj;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredId() < rhs.getRequiredId() ) {
				return( -1 );
			}
			else if( getRequiredId() > rhs.getRequiredId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFBamValueHPKey ) {
			CFBamValueHPKey rhs = (CFBamValueHPKey)obj;
			{
				int lhsRequiredRevision = getRequiredRevision();
				int rhsRequiredRevision = rhs.getRequiredRevision();
				if( lhsRequiredRevision < rhsRequiredRevision ) {
					return( -1 );
				}
				else if( lhsRequiredRevision > rhsRequiredRevision ) {
					return( 1 );
				}
			}
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredId() < rhs.getRequiredId() ) {
				return( -1 );
			}
			else if( getRequiredId() > rhs.getRequiredId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFBamNmTokenTypeHBuff ) {
			CFBamNmTokenTypeHBuff rhs = (CFBamNmTokenTypeHBuff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
			if( getRequiredSchemaDefId() < rhs.getRequiredSchemaDefId() ) {
				return( -1 );
			}
			else if( getRequiredSchemaDefId() > rhs.getRequiredSchemaDefId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFBamNmTokenTypeBySchemaIdxKey ) {
			CFBamNmTokenTypeBySchemaIdxKey rhs = (CFBamNmTokenTypeBySchemaIdxKey)obj;

			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredSchemaDefId() < rhs.getRequiredSchemaDefId() ) {
				return( -1 );
			}
			else if( getRequiredSchemaDefId() > rhs.getRequiredSchemaDefId() ) {
				return( 1 );
			}			return( 0 );
		}
		else {
			int retval = super.compareTo( obj );
			return( retval );
		}
	}

	public void set( CFBamValueBuff src ) {
		if( src instanceof CFBamNmTokenTypeBuff ) {
			setNmTokenTypeBuff( (CFBamNmTokenTypeBuff)src );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"CFBamNmTokenTypeBuff" );
		}
	}

	public void setNmTokenTypeBuff( CFBamNmTokenTypeBuff src ) {
		super.setNmTokenDefBuff( src );
		setRequiredSchemaDefId( src.getRequiredSchemaDefId() );
	}

	public void set( CFBamValueHBuff src ) {
		if( src instanceof CFBamNmTokenTypeHBuff ) {
			setNmTokenTypeBuff( (CFBamNmTokenTypeHBuff)src );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"CFBamNmTokenTypeHBuff" );
		}
	}

	public void setNmTokenTypeBuff( CFBamNmTokenTypeHBuff src ) {
		super.setNmTokenDefBuff( src );
		setRequiredSchemaDefId( src.getRequiredSchemaDefId() );
	}
}
