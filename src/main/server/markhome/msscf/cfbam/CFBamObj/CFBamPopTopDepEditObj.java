// Description: Java 11 edit object instance implementation for CFBam PopTopDep.

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBamObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfint.CFIntObj.*;
import server.markhome.msscf.cfbam.CFBam.*;

public class CFBamPopTopDepEditObj
	extends CFBamPopDepEditObj

	implements ICFBamPopTopDepEditObj
{
	protected ICFBamRelationObj requiredContainerContRelation;

	public CFBamPopTopDepEditObj( ICFBamPopTopDepObj argOrig ) {
		super( argOrig );
		requiredContainerContRelation = null;
	}

	public String getClassCode() {
		return( CFBamPopTopDepObj.CLASS_CODE );
	}

	public String getGenDefName() {
		return( "PopTopDep" );
	}

	public ICFLibAnyObj getScope() {
		ICFBamRelationObj scope = getRequiredContainerContRelation();
		return( scope );
	}

	public ICFLibAnyObj getObjScope() {
		ICFBamRelationObj scope = getRequiredContainerContRelation();
		return( scope );
	}

	public String getObjName() {
		String objName;
		objName = getRequiredName();
		return( objName );
	}

	public ICFLibAnyObj getObjQualifier( Class qualifyingClass ) {
		ICFLibAnyObj container = this;
		if( qualifyingClass != null ) {
			while( container != null ) {
				if( container instanceof ICFBamClusterObj ) {
					break;
				}
				else if( container instanceof ICFBamTenantObj ) {
					break;
				}
				else if( qualifyingClass.isInstance( container ) ) {
					break;
				}
				container = container.getObjScope();
			}
		}
		else {
			while( container != null ) {
				if( container instanceof ICFBamClusterObj ) {
					break;
				}
				else if( container instanceof ICFBamTenantObj ) {
					break;
				}
				container = container.getObjScope();
			}
		}
		return( container );
	}

	public ICFLibAnyObj getNamedObject( String objName ) {
		String nextName;
		String remainingName;
		ICFLibAnyObj subObj = null;
		ICFLibAnyObj retObj;
		int nextDot = objName.indexOf( '.' );
		if( nextDot >= 0 ) {
			nextName = objName.substring( 0, nextDot );
			remainingName = objName.substring( nextDot + 1 );
		}
		else {
			nextName = objName;
			remainingName = null;
		}
		if( remainingName == null ) {
			retObj = subObj;
		}
		else if( subObj == null ) {
			retObj = null;
		}
		else {
			retObj = subObj.getNamedObject( remainingName );
		}
		return( retObj );
	}

	public String getObjQualifiedName() {
		String qualName = getObjName();
		ICFLibAnyObj container = getObjScope();
		String containerName;
		while( container != null ) {
			if( container instanceof ICFSecClusterObj ) {
				container = null;
			}
			else if( container instanceof ICFSecTenantObj ) {
				container = null;
			}
			else if( container instanceof ICFBamSchemaDefObj ) {
				container = null;
			}
			else {
				containerName = container.getObjName();
				qualName = containerName + "." + qualName;
				container = container.getObjScope();
			}
		}
		return( qualName );
	}

	public ICFBamScopeObj realise() {
		// We realise this so that it's buffer will get copied to orig during realization
		ICFBamPopTopDepObj retobj = getSchema().getPopTopDepTableObj().realisePopTopDep( (ICFBamPopTopDepObj)this );
		return( retobj );
	}

	public void forget() {
		getOrigAsPopTopDep().forget();
	}

	public ICFBamScopeObj create() {
		copyBuffToOrig();
		ICFBamPopTopDepObj retobj = ((ICFBamSchemaObj)getOrigAsPopTopDep().getSchema()).getPopTopDepTableObj().createPopTopDep( getOrigAsPopTopDep() );
		if( retobj == getOrigAsPopTopDep() ) {
			copyOrigToBuff();
		}
		return( retobj );
	}

	public CFBamScopeEditObj update() {
		getSchema().getPopTopDepTableObj().updatePopTopDep( (ICFBamPopTopDepObj)this );
		return( null );
	}

	public CFBamScopeEditObj deleteInstance() {
		if( getIsNew() ) {
			throw new CFLibUsageException( getClass(), "delete", "Cannot delete a new instance" );
		}
		getSchema().getPopTopDepTableObj().deletePopTopDep( getOrigAsPopTopDep() );
		return( null );
	}

	public ICFBamPopTopDepTableObj getPopTopDepTable() {
		return( orig.getSchema().getPopTopDepTableObj() );
	}

	public ICFBamPopTopDepEditObj getEditAsPopTopDep() {
		return( (ICFBamPopTopDepEditObj)this );
	}

	public ICFBamPopTopDepObj getOrigAsPopTopDep() {
		return( (ICFBamPopTopDepObj)orig );
	}

	public CFBamScopeBuff getBuff() {
		if( buff == null ) {
			buff = ((ICFBamSchema)getOrigAsPopTopDep().getSchema().getBackingStore()).getFactoryPopTopDep().newBuff();
			buff.set( orig.getBuff() );
		}
		return( buff );
	}

	public void setBuff( CFBamScopeBuff value ) {
		if( buff != value ) {
			super.setBuff( value );
			requiredContainerContRelation = null;
		}
	}

	public CFBamPopTopDepBuff getPopTopDepBuff() {
		return( (CFBamPopTopDepBuff)getBuff() );
	}

	public long getRequiredContRelationTenantId() {
		return( getPopTopDepBuff().getRequiredContRelationTenantId() );
	}

	public long getRequiredContRelationId() {
		return( getPopTopDepBuff().getRequiredContRelationId() );
	}

	public String getRequiredName() {
		return( getPopTopDepBuff().getRequiredName() );
	}

	public void setRequiredName( String value ) {
		if( getPopTopDepBuff().getRequiredName() != value ) {
			getPopTopDepBuff().setRequiredName( value );
		}
	}

	public ICFBamRelationObj getRequiredContainerContRelation() {
		return( getRequiredContainerContRelation( false ) );
	}

	public ICFBamRelationObj getRequiredContainerContRelation( boolean forceRead ) {
		if( forceRead || ( requiredContainerContRelation == null ) ) {
			boolean anyMissing = false;
			if( ! anyMissing ) {
				ICFBamRelationObj obj = ((ICFBamSchemaObj)getOrigAsPopTopDep().getSchema()).getRelationTableObj().readRelationByIdIdx( getPopTopDepBuff().getRequiredContRelationTenantId(),
					getPopTopDepBuff().getRequiredContRelationId() );
				requiredContainerContRelation = obj;
				if( obj != null ) {
					getPopTopDepBuff().setRequiredContRelationTenantId( obj.getRequiredTenantId() );
					getPopTopDepBuff().setRequiredContRelationId( obj.getRequiredId() );
					requiredContainerContRelation = obj;
				}
			}
		}
		return( requiredContainerContRelation );
	}

	public void setRequiredContainerContRelation( ICFBamRelationObj value ) {
			if( buff == null ) {
				getPopTopDepBuff();
			}
			if( value != null ) {
				getPopTopDepBuff().setRequiredContRelationTenantId( value.getRequiredTenantId() );
				getPopTopDepBuff().setRequiredContRelationId( value.getRequiredId() );
			}
			requiredContainerContRelation = value;
	}

	public List<ICFBamPopSubDep1Obj> getOptionalComponentsPopDep() {
		List<ICFBamPopSubDep1Obj> retval;
		retval = ((ICFBamSchemaObj)getOrigAsPopTopDep().getSchema()).getPopSubDep1TableObj().readPopSubDep1ByPopTopDepIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			false );
		return( retval );
	}

	public List<ICFBamPopSubDep1Obj> getOptionalComponentsPopDep( boolean forceRead ) {
		List<ICFBamPopSubDep1Obj> retval;
		retval = ((ICFBamSchemaObj)getOrigAsPopTopDep().getSchema()).getPopSubDep1TableObj().readPopSubDep1ByPopTopDepIdx( getPKey().getRequiredTenantId(),
					getPKey().getRequiredId(),
			forceRead );
		return( retval );
	}

	public void copyBuffToOrig() {
		CFBamPopTopDepBuff origBuff = getOrigAsPopTopDep().getPopTopDepBuff();
		CFBamPopTopDepBuff myBuff = getPopTopDepBuff();
		origBuff.set( myBuff );
	}

	public void copyOrigToBuff() {
		CFBamPopTopDepBuff origBuff = getOrigAsPopTopDep().getPopTopDepBuff();
		CFBamPopTopDepBuff myBuff = getPopTopDepBuff();
		myBuff.set( origBuff );
	}
}
