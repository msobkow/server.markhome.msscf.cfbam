// Description: Java 11 implementation of a PopTopDep buffer object.

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

public class CFBamPopTopDepBuff
	extends CFBamPopDepBuff
	implements Comparable<Object>,
		Serializable
{
	public final static String CLASS_CODE = "a834";
	public static final long TENANTID_INIT_VALUE = 0L;
	public static final long ID_INIT_VALUE = 0L;
	public static final long CONTRELATIONTENANTID_INIT_VALUE = 0L;
	public static final long CONTRELATIONID_INIT_VALUE = 0L;
	public static final String NAME_INIT_VALUE = new String( "" );
	public static final long TENANTID_MIN_VALUE = 0L;
	public static final long ID_MIN_VALUE = 0L;
	public static final long CONTRELATIONTENANTID_MIN_VALUE = 0L;
	public static final long CONTRELATIONID_MIN_VALUE = 0L;
	protected long requiredContRelationTenantId;
	protected long requiredContRelationId;
	protected String requiredName;
	public CFBamPopTopDepBuff() {
		super();
		requiredContRelationTenantId = CFBamPopTopDepBuff.CONTRELATIONTENANTID_INIT_VALUE;
		requiredContRelationId = CFBamPopTopDepBuff.CONTRELATIONID_INIT_VALUE;
		requiredName = new String( CFBamPopTopDepBuff.NAME_INIT_VALUE );
	}

	public String getClassCode() {
		return( CLASS_CODE );
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
		else if( obj instanceof CFBamPopTopDepBuff ) {
			CFBamPopTopDepBuff rhs = (CFBamPopTopDepBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
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
		else if( obj instanceof CFBamScopePKey ) {
			CFBamScopePKey rhs = (CFBamScopePKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamPopTopDepHBuff ) {
			CFBamPopTopDepHBuff rhs = (CFBamPopTopDepHBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
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
		else if( obj instanceof CFBamScopeHPKey ) {
			CFBamScopeHPKey rhs = (CFBamScopeHPKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamPopTopDepByContRelIdxKey ) {
			CFBamPopTopDepByContRelIdxKey rhs = (CFBamPopTopDepByContRelIdxKey)obj;
			if( getRequiredContRelationTenantId() != rhs.getRequiredContRelationTenantId() ) {
				return( false );
			}
			if( getRequiredContRelationId() != rhs.getRequiredContRelationId() ) {
				return( false );
			}
			return( true );
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
		else {
			boolean retval = super.equals( obj );
			return( retval );
		}
	}

	public int hashCode() {
		int hashCode = super.hashCode();
		hashCode = hashCode + (int)( getRequiredContRelationTenantId() );
		hashCode = hashCode + (int)( getRequiredContRelationId() );
		if( getRequiredName() != null ) {
			hashCode = hashCode + getRequiredName().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof CFBamPopTopDepBuff ) {
			CFBamPopTopDepBuff rhs = (CFBamPopTopDepBuff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
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
		else if( obj instanceof CFBamScopePKey ) {
			CFBamScopePKey rhs = (CFBamScopePKey)obj;
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
		else if( obj instanceof CFBamScopeHPKey ) {
			CFBamScopeHPKey rhs = (CFBamScopeHPKey)obj;
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
		else if( obj instanceof CFBamPopTopDepHBuff ) {
			CFBamPopTopDepHBuff rhs = (CFBamPopTopDepHBuff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
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
		else if( obj instanceof CFBamPopTopDepByContRelIdxKey ) {
			CFBamPopTopDepByContRelIdxKey rhs = (CFBamPopTopDepByContRelIdxKey)obj;

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
			}			return( 0 );
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
			}			return( 0 );
		}
		else {
			int retval = super.compareTo( obj );
			return( retval );
		}
	}

	public void set( CFBamScopeBuff src ) {
		if( src instanceof CFBamPopTopDepBuff ) {
			setPopTopDepBuff( (CFBamPopTopDepBuff)src );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"CFBamPopTopDepBuff" );
		}
	}

	public void setPopTopDepBuff( CFBamPopTopDepBuff src ) {
		super.setPopDepBuff( src );
		setRequiredContRelationTenantId( src.getRequiredContRelationTenantId() );
		setRequiredContRelationId( src.getRequiredContRelationId() );
		setRequiredName( src.getRequiredName() );
	}

	public void set( CFBamScopeHBuff src ) {
		if( src instanceof CFBamPopTopDepHBuff ) {
			setPopTopDepBuff( (CFBamPopTopDepHBuff)src );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"CFBamPopTopDepHBuff" );
		}
	}

	public void setPopTopDepBuff( CFBamPopTopDepHBuff src ) {
		super.setPopDepBuff( src );
		setRequiredContRelationTenantId( src.getRequiredContRelationTenantId() );
		setRequiredContRelationId( src.getRequiredContRelationId() );
		setRequiredName( src.getRequiredName() );
	}
}
