// Description: Java 11 implementation of a StringType buffer object.

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

public class CFBamStringTypeBuff
	extends CFBamStringDefBuff
	implements Comparable<Object>,
		Serializable
{
	public final static String CLASS_CODE = "a839";
	public static final long TENANTID_INIT_VALUE = 0L;
	public static final long ID_INIT_VALUE = 0L;
	public static final long SCHEMADEFID_INIT_VALUE = 0L;
	public static final long TENANTID_MIN_VALUE = 0L;
	public static final long ID_MIN_VALUE = 0L;
	public static final long SCHEMADEFID_MIN_VALUE = 0L;
	protected long requiredSchemaDefId;
	public CFBamStringTypeBuff() {
		super();
		requiredSchemaDefId = CFBamStringTypeBuff.SCHEMADEFID_INIT_VALUE;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public long getRequiredSchemaDefId() {
		return( requiredSchemaDefId );
	}

	public void setRequiredSchemaDefId( long value ) {
		if( value < CFBamStringTypeBuff.SCHEMADEFID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredSchemaDefId",
				1,
				"value",
				value,
				CFBamStringTypeBuff.SCHEMADEFID_MIN_VALUE );
		}
		requiredSchemaDefId = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFBamStringTypeBuff ) {
			CFBamStringTypeBuff rhs = (CFBamStringTypeBuff)obj;
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
		else if( obj instanceof CFBamStringTypeHBuff ) {
			CFBamStringTypeHBuff rhs = (CFBamStringTypeHBuff)obj;
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
		else if( obj instanceof CFBamStringTypeBySchemaIdxKey ) {
			CFBamStringTypeBySchemaIdxKey rhs = (CFBamStringTypeBySchemaIdxKey)obj;
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
		else if( obj instanceof CFBamStringTypeBuff ) {
			CFBamStringTypeBuff rhs = (CFBamStringTypeBuff)obj;
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
		else if( obj instanceof CFBamStringTypeHBuff ) {
			CFBamStringTypeHBuff rhs = (CFBamStringTypeHBuff)obj;
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
		else if( obj instanceof CFBamStringTypeBySchemaIdxKey ) {
			CFBamStringTypeBySchemaIdxKey rhs = (CFBamStringTypeBySchemaIdxKey)obj;

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
		if( src instanceof CFBamStringTypeBuff ) {
			setStringTypeBuff( (CFBamStringTypeBuff)src );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"CFBamStringTypeBuff" );
		}
	}

	public void setStringTypeBuff( CFBamStringTypeBuff src ) {
		super.setStringDefBuff( src );
		setRequiredSchemaDefId( src.getRequiredSchemaDefId() );
	}

	public void set( CFBamValueHBuff src ) {
		if( src instanceof CFBamStringTypeHBuff ) {
			setStringTypeBuff( (CFBamStringTypeHBuff)src );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"CFBamStringTypeHBuff" );
		}
	}

	public void setStringTypeBuff( CFBamStringTypeHBuff src ) {
		super.setStringDefBuff( src );
		setRequiredSchemaDefId( src.getRequiredSchemaDefId() );
	}
}
