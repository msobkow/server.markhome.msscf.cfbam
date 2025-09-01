// Description: Java 11 implementation of a ClearSubDep2 buffer object.

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

public class CFBamClearSubDep2Buff
	extends CFBamClearDepBuff
	implements Comparable<Object>,
		Serializable
{
	public final static String CLASS_CODE = "a812";
	public static final long TENANTID_INIT_VALUE = 0L;
	public static final long ID_INIT_VALUE = 0L;
	public static final long CLEARSUBDEP1TENANTID_INIT_VALUE = 0L;
	public static final long CLEARSUBDEP1ID_INIT_VALUE = 0L;
	public static final String NAME_INIT_VALUE = new String( "" );
	public static final long TENANTID_MIN_VALUE = 0L;
	public static final long ID_MIN_VALUE = 0L;
	public static final long CLEARSUBDEP1TENANTID_MIN_VALUE = 0L;
	public static final long CLEARSUBDEP1ID_MIN_VALUE = 0L;
	protected long requiredClearSubDep1TenantId;
	protected long requiredClearSubDep1Id;
	protected String requiredName;
	public CFBamClearSubDep2Buff() {
		super();
		requiredClearSubDep1TenantId = CFBamClearSubDep2Buff.CLEARSUBDEP1TENANTID_INIT_VALUE;
		requiredClearSubDep1Id = CFBamClearSubDep2Buff.CLEARSUBDEP1ID_INIT_VALUE;
		requiredName = new String( CFBamClearSubDep2Buff.NAME_INIT_VALUE );
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public long getRequiredClearSubDep1TenantId() {
		return( requiredClearSubDep1TenantId );
	}

	public void setRequiredClearSubDep1TenantId( long value ) {
		if( value < CFBamClearSubDep2Buff.CLEARSUBDEP1TENANTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredClearSubDep1TenantId",
				1,
				"value",
				value,
				CFBamClearSubDep2Buff.CLEARSUBDEP1TENANTID_MIN_VALUE );
		}
		requiredClearSubDep1TenantId = value;
	}

	public long getRequiredClearSubDep1Id() {
		return( requiredClearSubDep1Id );
	}

	public void setRequiredClearSubDep1Id( long value ) {
		if( value < CFBamClearSubDep2Buff.CLEARSUBDEP1ID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredClearSubDep1Id",
				1,
				"value",
				value,
				CFBamClearSubDep2Buff.CLEARSUBDEP1ID_MIN_VALUE );
		}
		requiredClearSubDep1Id = value;
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
		else if( obj instanceof CFBamClearSubDep2Buff ) {
			CFBamClearSubDep2Buff rhs = (CFBamClearSubDep2Buff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			if( getRequiredClearSubDep1TenantId() != rhs.getRequiredClearSubDep1TenantId() ) {
				return( false );
			}
			if( getRequiredClearSubDep1Id() != rhs.getRequiredClearSubDep1Id() ) {
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
		else if( obj instanceof CFBamClearSubDep2HBuff ) {
			CFBamClearSubDep2HBuff rhs = (CFBamClearSubDep2HBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredId() != rhs.getRequiredId() ) {
				return( false );
			}
			if( getRequiredClearSubDep1TenantId() != rhs.getRequiredClearSubDep1TenantId() ) {
				return( false );
			}
			if( getRequiredClearSubDep1Id() != rhs.getRequiredClearSubDep1Id() ) {
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
		else if( obj instanceof CFBamClearSubDep2ByClearSubDep1IdxKey ) {
			CFBamClearSubDep2ByClearSubDep1IdxKey rhs = (CFBamClearSubDep2ByClearSubDep1IdxKey)obj;
			if( getRequiredClearSubDep1TenantId() != rhs.getRequiredClearSubDep1TenantId() ) {
				return( false );
			}
			if( getRequiredClearSubDep1Id() != rhs.getRequiredClearSubDep1Id() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFBamClearSubDep2ByUNameIdxKey ) {
			CFBamClearSubDep2ByUNameIdxKey rhs = (CFBamClearSubDep2ByUNameIdxKey)obj;
			if( getRequiredClearSubDep1TenantId() != rhs.getRequiredClearSubDep1TenantId() ) {
				return( false );
			}
			if( getRequiredClearSubDep1Id() != rhs.getRequiredClearSubDep1Id() ) {
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
		hashCode = hashCode + (int)( getRequiredClearSubDep1TenantId() );
		hashCode = hashCode + (int)( getRequiredClearSubDep1Id() );
		if( getRequiredName() != null ) {
			hashCode = hashCode + getRequiredName().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof CFBamClearSubDep2Buff ) {
			CFBamClearSubDep2Buff rhs = (CFBamClearSubDep2Buff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
			if( getRequiredClearSubDep1TenantId() < rhs.getRequiredClearSubDep1TenantId() ) {
				return( -1 );
			}
			else if( getRequiredClearSubDep1TenantId() > rhs.getRequiredClearSubDep1TenantId() ) {
				return( 1 );
			}
			if( getRequiredClearSubDep1Id() < rhs.getRequiredClearSubDep1Id() ) {
				return( -1 );
			}
			else if( getRequiredClearSubDep1Id() > rhs.getRequiredClearSubDep1Id() ) {
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
		else if( obj instanceof CFBamClearSubDep2HBuff ) {
			CFBamClearSubDep2HBuff rhs = (CFBamClearSubDep2HBuff)obj;
			int retval = super.compareTo( rhs );
			if( retval != 0 ) {
				return( retval );
			}
			if( getRequiredClearSubDep1TenantId() < rhs.getRequiredClearSubDep1TenantId() ) {
				return( -1 );
			}
			else if( getRequiredClearSubDep1TenantId() > rhs.getRequiredClearSubDep1TenantId() ) {
				return( 1 );
			}
			if( getRequiredClearSubDep1Id() < rhs.getRequiredClearSubDep1Id() ) {
				return( -1 );
			}
			else if( getRequiredClearSubDep1Id() > rhs.getRequiredClearSubDep1Id() ) {
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
		else if( obj instanceof CFBamClearSubDep2ByClearSubDep1IdxKey ) {
			CFBamClearSubDep2ByClearSubDep1IdxKey rhs = (CFBamClearSubDep2ByClearSubDep1IdxKey)obj;

			if( getRequiredClearSubDep1TenantId() < rhs.getRequiredClearSubDep1TenantId() ) {
				return( -1 );
			}
			else if( getRequiredClearSubDep1TenantId() > rhs.getRequiredClearSubDep1TenantId() ) {
				return( 1 );
			}
			if( getRequiredClearSubDep1Id() < rhs.getRequiredClearSubDep1Id() ) {
				return( -1 );
			}
			else if( getRequiredClearSubDep1Id() > rhs.getRequiredClearSubDep1Id() ) {
				return( 1 );
			}			return( 0 );
		}
		else if( obj instanceof CFBamClearSubDep2ByUNameIdxKey ) {
			CFBamClearSubDep2ByUNameIdxKey rhs = (CFBamClearSubDep2ByUNameIdxKey)obj;

			if( getRequiredClearSubDep1TenantId() < rhs.getRequiredClearSubDep1TenantId() ) {
				return( -1 );
			}
			else if( getRequiredClearSubDep1TenantId() > rhs.getRequiredClearSubDep1TenantId() ) {
				return( 1 );
			}
			if( getRequiredClearSubDep1Id() < rhs.getRequiredClearSubDep1Id() ) {
				return( -1 );
			}
			else if( getRequiredClearSubDep1Id() > rhs.getRequiredClearSubDep1Id() ) {
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
		if( src instanceof CFBamClearSubDep2Buff ) {
			setClearSubDep2Buff( (CFBamClearSubDep2Buff)src );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"CFBamClearSubDep2Buff" );
		}
	}

	public void setClearSubDep2Buff( CFBamClearSubDep2Buff src ) {
		super.setClearDepBuff( src );
		setRequiredClearSubDep1TenantId( src.getRequiredClearSubDep1TenantId() );
		setRequiredClearSubDep1Id( src.getRequiredClearSubDep1Id() );
		setRequiredName( src.getRequiredName() );
	}

	public void set( CFBamScopeHBuff src ) {
		if( src instanceof CFBamClearSubDep2HBuff ) {
			setClearSubDep2Buff( (CFBamClearSubDep2HBuff)src );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"src",
				src,
				"CFBamClearSubDep2HBuff" );
		}
	}

	public void setClearSubDep2Buff( CFBamClearSubDep2HBuff src ) {
		super.setClearDepBuff( src );
		setRequiredClearSubDep1TenantId( src.getRequiredClearSubDep1TenantId() );
		setRequiredClearSubDep1Id( src.getRequiredClearSubDep1Id() );
		setRequiredName( src.getRequiredName() );
	}
}
