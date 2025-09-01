// Description: Java 11 Table Object implementation for CFBam.

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

public class CFBamPopSubDep3TableObj
	implements ICFBamPopSubDep3TableObj
{
	protected ICFBamSchemaObj schema;
	private Map<CFBamScopePKey, ICFBamPopSubDep3Obj> members;
	private Map<CFBamScopePKey, ICFBamPopSubDep3Obj> allPopSubDep3;
	private Map< CFBamScopeByTenantIdxKey,
		Map<CFBamScopePKey, ICFBamPopSubDep3Obj > > indexByTenantIdx;
	private Map< CFBamPopDepByRelationIdxKey,
		Map<CFBamScopePKey, ICFBamPopSubDep3Obj > > indexByRelationIdx;
	private Map< CFBamPopDepByDefSchemaIdxKey,
		Map<CFBamScopePKey, ICFBamPopSubDep3Obj > > indexByDefSchemaIdx;
	private Map< CFBamPopSubDep3ByPopSubDep2IdxKey,
		Map<CFBamScopePKey, ICFBamPopSubDep3Obj > > indexByPopSubDep2Idx;
	private Map< CFBamPopSubDep3ByUNameIdxKey,
		ICFBamPopSubDep3Obj > indexByUNameIdx;
	public static String TABLE_NAME = "PopSubDep3";
	public static String TABLE_DBNAME = "popsubdep3";

	public CFBamPopSubDep3TableObj() {
		schema = null;
		members = new HashMap<CFBamScopePKey, ICFBamPopSubDep3Obj>();
		allPopSubDep3 = null;
		indexByTenantIdx = null;
		indexByRelationIdx = null;
		indexByDefSchemaIdx = null;
		indexByPopSubDep2Idx = null;
		indexByUNameIdx = null;
	}

	public CFBamPopSubDep3TableObj( ICFBamSchemaObj argSchema ) {
		schema = (ICFBamSchemaObj)argSchema;
		members = new HashMap<CFBamScopePKey, ICFBamPopSubDep3Obj>();
		allPopSubDep3 = null;
		indexByTenantIdx = null;
		indexByRelationIdx = null;
		indexByDefSchemaIdx = null;
		indexByPopSubDep2Idx = null;
		indexByUNameIdx = null;
	}

	public ICFBamSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( ICFBamSchemaObj value ) {
		schema = (ICFBamSchemaObj)value;
	}

	public String getTableName() {
		return( TABLE_NAME );
	}

	public String getTableDbName() {
		return( TABLE_DBNAME );
	}

	public Class getObjQualifyingClass() {
		return( ICFBamSchemaDefObj.class );
	}


	public void minimizeMemory() {
		allPopSubDep3 = null;
		indexByTenantIdx = null;
		indexByRelationIdx = null;
		indexByDefSchemaIdx = null;
		indexByPopSubDep2Idx = null;
		indexByUNameIdx = null;
		List<ICFBamPopSubDep3Obj> toForget = new LinkedList<ICFBamPopSubDep3Obj>();
		ICFBamPopSubDep3Obj cur = null;
		Iterator<ICFBamPopSubDep3Obj> iter = members.values().iterator();
		while( iter.hasNext() ) {
			cur = iter.next();
			toForget.add( cur );
		}
		iter = toForget.iterator();
		while( iter.hasNext() ) {
			cur = iter.next();
			cur.forget();
		}
	}
	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFBamPopSubDep3Obj.
	 */
	public ICFBamPopSubDep3Obj newInstance() {
		ICFBamPopSubDep3Obj inst = new CFBamPopSubDep3Obj( schema );
		return( inst );
	}

	/**
	 *	If your implementation subclasses the objects,
	 *	you'll want to overload the constructByClassCode()
	 *	implementation to return your implementation's
	 *	instances instead of the base implementation.
	 *
	 *	This is the sole factory for instances derived from
	 *	CFBamPopSubDep3Obj.
	 */
	public ICFBamPopSubDep3EditObj newEditInstance( ICFBamPopSubDep3Obj orig ) {
		ICFBamPopSubDep3EditObj edit = new CFBamPopSubDep3EditObj( orig );
		return( edit );
	}

	public ICFBamPopSubDep3Obj realisePopSubDep3( ICFBamPopSubDep3Obj Obj ) {
		ICFBamPopSubDep3Obj obj = Obj;
		CFBamScopePKey pkey = obj.getPKey();
		ICFBamPopSubDep3Obj keepObj = null;
		if( members.containsKey( pkey ) && ( null != members.get( pkey ) ) ) {
			ICFBamPopSubDep3Obj existingObj = members.get( pkey );
			keepObj = existingObj;

			/*
			 *	We always rebind the data because if we're being called, some index has
			 *	been updated and is refreshing it's data, which may or may not have changed
			 */

			// Detach object from alternate and duplicate indexes, leave PKey alone

			if( indexByTenantIdx != null ) {
				CFBamScopeByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamPopSubDep3Obj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					indexByTenantIdx.remove( keyTenantIdx );
				}
			}

			if( indexByRelationIdx != null ) {
				CFBamPopDepByRelationIdxKey keyRelationIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryPopDep().newRelationIdxKey();
				keyRelationIdx.setRequiredRelationTenantId( keepObj.getRequiredRelationTenantId() );
				keyRelationIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<CFBamScopePKey, ICFBamPopSubDep3Obj > mapRelationIdx = indexByRelationIdx.get( keyRelationIdx );
				if( mapRelationIdx != null ) {
					indexByRelationIdx.remove( keyRelationIdx );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamPopDepByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryPopDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamScopePKey, ICFBamPopSubDep3Obj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					indexByDefSchemaIdx.remove( keyDefSchemaIdx );
				}
			}

			if( indexByPopSubDep2Idx != null ) {
				CFBamPopSubDep3ByPopSubDep2IdxKey keyPopSubDep2Idx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryPopSubDep3().newPopSubDep2IdxKey();
				keyPopSubDep2Idx.setRequiredPopSubDep2TenantId( keepObj.getRequiredPopSubDep2TenantId() );
				keyPopSubDep2Idx.setRequiredPopSubDep2Id( keepObj.getRequiredPopSubDep2Id() );
				Map<CFBamScopePKey, ICFBamPopSubDep3Obj > mapPopSubDep2Idx = indexByPopSubDep2Idx.get( keyPopSubDep2Idx );
				if( mapPopSubDep2Idx != null ) {
					mapPopSubDep2Idx.remove( keepObj.getPKey() );
					if( mapPopSubDep2Idx.size() <= 0 ) {
						indexByPopSubDep2Idx.remove( keyPopSubDep2Idx );
					}
				}
			}

			if( indexByUNameIdx != null ) {
				CFBamPopSubDep3ByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryPopSubDep3().newUNameIdxKey();
				keyUNameIdx.setRequiredPopSubDep2TenantId( keepObj.getRequiredPopSubDep2TenantId() );
				keyUNameIdx.setRequiredPopSubDep2Id( keepObj.getRequiredPopSubDep2Id() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.remove( keyUNameIdx );
			}
			// Keep passing the new object because it's the one with the buffer
			// that the base table needs to copy to the existing object from
			// the cache.
			keepObj = (ICFBamPopSubDep3Obj)schema.getPopDepTableObj().realisePopDep( Obj );

			// Attach new object to alternate and duplicate indexes -- PKey stay stable

			if( indexByTenantIdx != null ) {
				CFBamScopeByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamPopSubDep3Obj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRelationIdx != null ) {
				CFBamPopDepByRelationIdxKey keyRelationIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryPopDep().newRelationIdxKey();
				keyRelationIdx.setRequiredRelationTenantId( keepObj.getRequiredRelationTenantId() );
				keyRelationIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<CFBamScopePKey, ICFBamPopSubDep3Obj > mapRelationIdx = indexByRelationIdx.get( keyRelationIdx );
				if( mapRelationIdx != null ) {
					mapRelationIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamPopDepByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryPopDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamScopePKey, ICFBamPopSubDep3Obj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByPopSubDep2Idx != null ) {
				CFBamPopSubDep3ByPopSubDep2IdxKey keyPopSubDep2Idx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryPopSubDep3().newPopSubDep2IdxKey();
				keyPopSubDep2Idx.setRequiredPopSubDep2TenantId( keepObj.getRequiredPopSubDep2TenantId() );
				keyPopSubDep2Idx.setRequiredPopSubDep2Id( keepObj.getRequiredPopSubDep2Id() );
				Map<CFBamScopePKey, ICFBamPopSubDep3Obj > mapPopSubDep2Idx = indexByPopSubDep2Idx.get( keyPopSubDep2Idx );
				if( mapPopSubDep2Idx != null ) {
					mapPopSubDep2Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				CFBamPopSubDep3ByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryPopSubDep3().newUNameIdxKey();
				keyUNameIdx.setRequiredPopSubDep2TenantId( keepObj.getRequiredPopSubDep2TenantId() );
				keyUNameIdx.setRequiredPopSubDep2Id( keepObj.getRequiredPopSubDep2Id() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

			if( allPopSubDep3 != null ) {
				allPopSubDep3.put( keepObj.getPKey(), keepObj );
			}
		}
		else {
			keepObj = obj;
			keepObj = (ICFBamPopSubDep3Obj)schema.getPopDepTableObj().realisePopDep( keepObj );

			// Attach new object to PKey, all, alternate, and duplicate indexes
			members.put( keepObj.getPKey(), keepObj );
			if( allPopSubDep3 != null ) {
				allPopSubDep3.put( keepObj.getPKey(), keepObj );
			}

			if( indexByTenantIdx != null ) {
				CFBamScopeByTenantIdxKey keyTenantIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
				keyTenantIdx.setRequiredTenantId( keepObj.getRequiredTenantId() );
				Map<CFBamScopePKey, ICFBamPopSubDep3Obj > mapTenantIdx = indexByTenantIdx.get( keyTenantIdx );
				if( mapTenantIdx != null ) {
					mapTenantIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByRelationIdx != null ) {
				CFBamPopDepByRelationIdxKey keyRelationIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryPopDep().newRelationIdxKey();
				keyRelationIdx.setRequiredRelationTenantId( keepObj.getRequiredRelationTenantId() );
				keyRelationIdx.setRequiredRelationId( keepObj.getRequiredRelationId() );
				Map<CFBamScopePKey, ICFBamPopSubDep3Obj > mapRelationIdx = indexByRelationIdx.get( keyRelationIdx );
				if( mapRelationIdx != null ) {
					mapRelationIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByDefSchemaIdx != null ) {
				CFBamPopDepByDefSchemaIdxKey keyDefSchemaIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryPopDep().newDefSchemaIdxKey();
				keyDefSchemaIdx.setOptionalDefSchemaTenantId( keepObj.getOptionalDefSchemaTenantId() );
				keyDefSchemaIdx.setOptionalDefSchemaId( keepObj.getOptionalDefSchemaId() );
				Map<CFBamScopePKey, ICFBamPopSubDep3Obj > mapDefSchemaIdx = indexByDefSchemaIdx.get( keyDefSchemaIdx );
				if( mapDefSchemaIdx != null ) {
					mapDefSchemaIdx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByPopSubDep2Idx != null ) {
				CFBamPopSubDep3ByPopSubDep2IdxKey keyPopSubDep2Idx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryPopSubDep3().newPopSubDep2IdxKey();
				keyPopSubDep2Idx.setRequiredPopSubDep2TenantId( keepObj.getRequiredPopSubDep2TenantId() );
				keyPopSubDep2Idx.setRequiredPopSubDep2Id( keepObj.getRequiredPopSubDep2Id() );
				Map<CFBamScopePKey, ICFBamPopSubDep3Obj > mapPopSubDep2Idx = indexByPopSubDep2Idx.get( keyPopSubDep2Idx );
				if( mapPopSubDep2Idx != null ) {
					mapPopSubDep2Idx.put( keepObj.getPKey(), keepObj );
				}
			}

			if( indexByUNameIdx != null ) {
				CFBamPopSubDep3ByUNameIdxKey keyUNameIdx =
					((ICFBamSchema)schema.getBackingStore()).getFactoryPopSubDep3().newUNameIdxKey();
				keyUNameIdx.setRequiredPopSubDep2TenantId( keepObj.getRequiredPopSubDep2TenantId() );
				keyUNameIdx.setRequiredPopSubDep2Id( keepObj.getRequiredPopSubDep2Id() );
				keyUNameIdx.setRequiredName( keepObj.getRequiredName() );
				indexByUNameIdx.put( keyUNameIdx, keepObj );
			}

		}
		return( keepObj );
	}

	public ICFBamPopSubDep3Obj createPopSubDep3( ICFBamPopSubDep3Obj Obj ) {
		ICFBamPopSubDep3Obj obj = Obj;
		CFBamPopSubDep3Buff buff = obj.getPopSubDep3Buff();
		((ICFBamSchema)schema.getBackingStore()).getTablePopSubDep3().createPopSubDep3(
			schema.getAuthorization(),
			buff );
		obj.copyBuffToPKey();
		if( obj.getPKey().getClassCode().equals( "a833" ) ) {
			obj = (ICFBamPopSubDep3Obj)(obj.realise());
		}
		obj.endEdit();
		return( obj );
	}

	public ICFBamPopSubDep3Obj readPopSubDep3( CFBamScopePKey pkey ) {
		return( readPopSubDep3( pkey, false ) );
	}

	public ICFBamPopSubDep3Obj readPopSubDep3( CFBamScopePKey pkey, boolean forceRead ) {
		ICFBamPopSubDep3Obj obj = null;
		if( ( ! forceRead ) && members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		else {
			CFBamPopSubDep3Buff readBuff = ((ICFBamSchema)schema.getBackingStore()).getTablePopSubDep3().readDerivedByIdIdx( schema.getAuthorization(),
				pkey.getRequiredTenantId(),
				pkey.getRequiredId() );
			if( readBuff != null ) {
				obj = (ICFBamPopSubDep3Obj)schema.getScopeTableObj().constructByClassCode( readBuff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( readBuff );
				obj = (ICFBamPopSubDep3Obj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFBamPopSubDep3Obj readCachedPopSubDep3( CFBamScopePKey pkey ) {
		ICFBamPopSubDep3Obj obj = null;
		if( members.containsKey( pkey ) ) {
			obj = members.get( pkey );
		}
		return( obj );
	}

	public void reallyDeepDisposePopSubDep3( ICFBamPopSubDep3Obj obj )
	{
		final String S_ProcName = "CFBamPopSubDep3TableObj.reallyDeepDisposePopSubDep3() ";
		String classCode;
		if( obj == null ) {
			return;
		}
		CFBamScopePKey pkey = obj.getPKey();
		ICFBamPopSubDep3Obj existing = readCachedPopSubDep3( pkey );
		if( existing == null ) {
			return;
		}
		members.remove( pkey );
		CFBamPopSubDep3ByPopSubDep2IdxKey keyPopSubDep2Idx = ((ICFBamSchema)schema.getBackingStore()).getFactoryPopSubDep3().newPopSubDep2IdxKey();
		keyPopSubDep2Idx.setRequiredPopSubDep2TenantId( existing.getRequiredPopSubDep2TenantId() );
		keyPopSubDep2Idx.setRequiredPopSubDep2Id( existing.getRequiredPopSubDep2Id() );

		CFBamPopSubDep3ByUNameIdxKey keyUNameIdx = ((ICFBamSchema)schema.getBackingStore()).getFactoryPopSubDep3().newUNameIdxKey();
		keyUNameIdx.setRequiredPopSubDep2TenantId( existing.getRequiredPopSubDep2TenantId() );
		keyUNameIdx.setRequiredPopSubDep2Id( existing.getRequiredPopSubDep2Id() );
		keyUNameIdx.setRequiredName( existing.getRequiredName() );



		if( indexByPopSubDep2Idx != null ) {
			if( indexByPopSubDep2Idx.containsKey( keyPopSubDep2Idx ) ) {
				indexByPopSubDep2Idx.get( keyPopSubDep2Idx ).remove( pkey );
				if( indexByPopSubDep2Idx.get( keyPopSubDep2Idx ).size() <= 0 ) {
					indexByPopSubDep2Idx.remove( keyPopSubDep2Idx );
				}
			}
		}

		if( indexByUNameIdx != null ) {
			indexByUNameIdx.remove( keyUNameIdx );
		}


		schema.getPopDepTableObj().reallyDeepDisposePopDep( obj );
	}
	public void deepDisposePopSubDep3( CFBamScopePKey pkey ) {
		ICFBamPopSubDep3Obj obj = readCachedPopSubDep3( pkey );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFBamPopSubDep3Obj lockPopSubDep3( CFBamScopePKey pkey ) {
		ICFBamPopSubDep3Obj locked = null;
		CFBamPopSubDep3Buff lockBuff = ((ICFBamSchema)schema.getBackingStore()).getTablePopSubDep3().lockDerived( schema.getAuthorization(), pkey );
		if( lockBuff != null ) {
				locked = (ICFBamPopSubDep3Obj)schema.getScopeTableObj().constructByClassCode( lockBuff.getClassCode() );
			locked.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
			locked.setBuff( lockBuff );
			locked = (ICFBamPopSubDep3Obj)locked.realise();
		}
		else {
			throw new CFLibCollisionDetectedException( getClass(), "lockPopSubDep3", pkey );
		}
		return( locked );
	}

	public List<ICFBamPopSubDep3Obj> readAllPopSubDep3() {
		return( readAllPopSubDep3( false ) );
	}

	public List<ICFBamPopSubDep3Obj> readAllPopSubDep3( boolean forceRead ) {
		final String S_ProcName = "readAllPopSubDep3";
		if( ( allPopSubDep3 == null ) || forceRead ) {
			Map<CFBamScopePKey, ICFBamPopSubDep3Obj> map = new HashMap<CFBamScopePKey,ICFBamPopSubDep3Obj>();
			allPopSubDep3 = map;
			CFBamPopSubDep3Buff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTablePopSubDep3().readAllDerived( schema.getAuthorization() );
			CFBamPopSubDep3Buff buff;
			ICFBamPopSubDep3Obj obj;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamPopSubDep3Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamPopSubDep3Obj realised = (ICFBamPopSubDep3Obj)obj.realise();
			}
		}
		int len = allPopSubDep3.size();
		ICFBamPopSubDep3Obj arr[] = new ICFBamPopSubDep3Obj[len];
		Iterator<ICFBamPopSubDep3Obj> valIter = allPopSubDep3.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFBamPopSubDep3Obj> arrayList = new ArrayList<ICFBamPopSubDep3Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamPopSubDep3Obj> cmp = new Comparator<ICFBamPopSubDep3Obj>() {
			public int compare( ICFBamPopSubDep3Obj lhs, ICFBamPopSubDep3Obj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamPopSubDep3Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamPopSubDep3Obj> readCachedAllPopSubDep3() {
		final String S_ProcName = "readCachedAllPopSubDep3";
		ArrayList<ICFBamPopSubDep3Obj> arrayList = new ArrayList<ICFBamPopSubDep3Obj>();
		if( allPopSubDep3 != null ) {
			int len = allPopSubDep3.size();
			ICFBamPopSubDep3Obj arr[] = new ICFBamPopSubDep3Obj[len];
			Iterator<ICFBamPopSubDep3Obj> valIter = allPopSubDep3.values().iterator();
			int idx = 0;
			while( ( idx < len ) && valIter.hasNext() ) {
				arr[idx++] = valIter.next();
			}
			if( idx < len ) {
				throw new CFLibArgumentUnderflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
			}
			else if( valIter.hasNext() ) {
				throw new CFLibArgumentOverflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
			}
			for( idx = 0; idx < len; idx ++ ) {
				arrayList.add( arr[idx] );
			}
		}
		Comparator<ICFBamPopSubDep3Obj> cmp = new Comparator<ICFBamPopSubDep3Obj>() {
			public int compare( ICFBamPopSubDep3Obj lhs, ICFBamPopSubDep3Obj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFBamPopSubDep3Obj readPopSubDep3ByIdIdx( long TenantId,
		long Id )
	{
		return( readPopSubDep3ByIdIdx( TenantId,
			Id,
			false ) );
	}

	public ICFBamPopSubDep3Obj readPopSubDep3ByIdIdx( long TenantId,
		long Id, boolean forceRead )
	{
		CFBamScopePKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFBamPopSubDep3Obj obj = readPopSubDep3( pkey, forceRead );
		return( obj );
	}

	public List<ICFBamPopSubDep3Obj> readPopSubDep3ByTenantIdx( long TenantId )
	{
		return( readPopSubDep3ByTenantIdx( TenantId,
			false ) );
	}

	public List<ICFBamPopSubDep3Obj> readPopSubDep3ByTenantIdx( long TenantId,
		boolean forceRead )
	{
		final String S_ProcName = "readPopSubDep3ByTenantIdx";
		CFBamScopeByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		Map<CFBamScopePKey, ICFBamPopSubDep3Obj> dict;
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFBamScopeByTenantIdxKey,
				Map< CFBamScopePKey, ICFBamPopSubDep3Obj > >();
		}
		if( ( ! forceRead ) && indexByTenantIdx.containsKey( key ) ) {
			dict = indexByTenantIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamPopSubDep3Obj>();
			ICFBamScopeObj obj;
			CFBamScopeBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTableScope().readDerivedByTenantIdx( schema.getAuthorization(),
				TenantId );
			CFBamScopeBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamPopSubDep3Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamPopSubDep3Obj realised = (ICFBamPopSubDep3Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByTenantIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamPopSubDep3Obj arr[] = new ICFBamPopSubDep3Obj[len];
		Iterator<ICFBamPopSubDep3Obj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFBamPopSubDep3Obj> arrayList = new ArrayList<ICFBamPopSubDep3Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamPopSubDep3Obj> cmp = new Comparator<ICFBamPopSubDep3Obj>() {
			public int compare( ICFBamPopSubDep3Obj lhs, ICFBamPopSubDep3Obj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamPopSubDep3Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamPopSubDep3Obj> readPopSubDep3ByRelationIdx( long RelationTenantId,
		long RelationId )
	{
		return( readPopSubDep3ByRelationIdx( RelationTenantId,
			RelationId,
			false ) );
	}

	public List<ICFBamPopSubDep3Obj> readPopSubDep3ByRelationIdx( long RelationTenantId,
		long RelationId,
		boolean forceRead )
	{
		final String S_ProcName = "readPopSubDep3ByRelationIdx";
		CFBamPopDepByRelationIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryPopDep().newRelationIdxKey();
		key.setRequiredRelationTenantId( RelationTenantId );
		key.setRequiredRelationId( RelationId );
		Map<CFBamScopePKey, ICFBamPopSubDep3Obj> dict;
		if( indexByRelationIdx == null ) {
			indexByRelationIdx = new HashMap< CFBamPopDepByRelationIdxKey,
				Map< CFBamScopePKey, ICFBamPopSubDep3Obj > >();
		}
		if( ( ! forceRead ) && indexByRelationIdx.containsKey( key ) ) {
			dict = indexByRelationIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamPopSubDep3Obj>();
			ICFBamPopDepObj obj;
			CFBamPopDepBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTablePopDep().readDerivedByRelationIdx( schema.getAuthorization(),
				RelationTenantId,
				RelationId );
			CFBamPopDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamPopSubDep3Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamPopSubDep3Obj realised = (ICFBamPopSubDep3Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByRelationIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamPopSubDep3Obj arr[] = new ICFBamPopSubDep3Obj[len];
		Iterator<ICFBamPopSubDep3Obj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFBamPopSubDep3Obj> arrayList = new ArrayList<ICFBamPopSubDep3Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamPopSubDep3Obj> cmp = new Comparator<ICFBamPopSubDep3Obj>() {
			public int compare( ICFBamPopSubDep3Obj lhs, ICFBamPopSubDep3Obj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamPopSubDep3Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamPopSubDep3Obj> readPopSubDep3ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		return( readPopSubDep3ByDefSchemaIdx( DefSchemaTenantId,
			DefSchemaId,
			false ) );
	}

	public List<ICFBamPopSubDep3Obj> readPopSubDep3ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId,
		boolean forceRead )
	{
		final String S_ProcName = "readPopSubDep3ByDefSchemaIdx";
		CFBamPopDepByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryPopDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		Map<CFBamScopePKey, ICFBamPopSubDep3Obj> dict;
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< CFBamPopDepByDefSchemaIdxKey,
				Map< CFBamScopePKey, ICFBamPopSubDep3Obj > >();
		}
		if( ( ! forceRead ) && indexByDefSchemaIdx.containsKey( key ) ) {
			dict = indexByDefSchemaIdx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamPopSubDep3Obj>();
			ICFBamPopDepObj obj;
			CFBamPopDepBuff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTablePopDep().readDerivedByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			CFBamPopDepBuff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamPopSubDep3Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamPopSubDep3Obj realised = (ICFBamPopSubDep3Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByDefSchemaIdx.put( key, dict );
		}
		int len = dict.size();
		ICFBamPopSubDep3Obj arr[] = new ICFBamPopSubDep3Obj[len];
		Iterator<ICFBamPopSubDep3Obj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFBamPopSubDep3Obj> arrayList = new ArrayList<ICFBamPopSubDep3Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamPopSubDep3Obj> cmp = new Comparator<ICFBamPopSubDep3Obj>() {
			public int compare( ICFBamPopSubDep3Obj lhs, ICFBamPopSubDep3Obj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamPopSubDep3Obj> sortedList = arrayList;
		return( sortedList );
	}

	public List<ICFBamPopSubDep3Obj> readPopSubDep3ByPopSubDep2Idx( long PopSubDep2TenantId,
		long PopSubDep2Id )
	{
		return( readPopSubDep3ByPopSubDep2Idx( PopSubDep2TenantId,
			PopSubDep2Id,
			false ) );
	}

	public List<ICFBamPopSubDep3Obj> readPopSubDep3ByPopSubDep2Idx( long PopSubDep2TenantId,
		long PopSubDep2Id,
		boolean forceRead )
	{
		final String S_ProcName = "readPopSubDep3ByPopSubDep2Idx";
		CFBamPopSubDep3ByPopSubDep2IdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryPopSubDep3().newPopSubDep2IdxKey();
		key.setRequiredPopSubDep2TenantId( PopSubDep2TenantId );
		key.setRequiredPopSubDep2Id( PopSubDep2Id );
		Map<CFBamScopePKey, ICFBamPopSubDep3Obj> dict;
		if( indexByPopSubDep2Idx == null ) {
			indexByPopSubDep2Idx = new HashMap< CFBamPopSubDep3ByPopSubDep2IdxKey,
				Map< CFBamScopePKey, ICFBamPopSubDep3Obj > >();
		}
		if( ( ! forceRead ) && indexByPopSubDep2Idx.containsKey( key ) ) {
			dict = indexByPopSubDep2Idx.get( key );
		}
		else {
			dict = new HashMap<CFBamScopePKey, ICFBamPopSubDep3Obj>();
			ICFBamPopSubDep3Obj obj;
			CFBamPopSubDep3Buff[] buffList = ((ICFBamSchema)schema.getBackingStore()).getTablePopSubDep3().readDerivedByPopSubDep2Idx( schema.getAuthorization(),
				PopSubDep2TenantId,
				PopSubDep2Id );
			CFBamPopSubDep3Buff buff;
			for( int idx = 0; idx < buffList.length; idx ++ ) {
				buff = buffList[ idx ];
				obj = (ICFBamPopSubDep3Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				ICFBamPopSubDep3Obj realised = (ICFBamPopSubDep3Obj)obj.realise();
				dict.put( realised.getPKey(), realised );
			}
			indexByPopSubDep2Idx.put( key, dict );
		}
		int len = dict.size();
		ICFBamPopSubDep3Obj arr[] = new ICFBamPopSubDep3Obj[len];
		Iterator<ICFBamPopSubDep3Obj> valIter = dict.values().iterator();
		int idx = 0;
		while( ( idx < len ) && valIter.hasNext() ) {
			arr[idx++] = valIter.next();
		}
		if( idx < len ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				S_ProcName,
				0,
				"idx",
				idx,
				len );
		}
		else if( valIter.hasNext() ) {
			throw new CFLibArgumentOverflowException( getClass(),
					S_ProcName,
					0,
					"idx",
					idx,
					len );
		}
		ArrayList<ICFBamPopSubDep3Obj> arrayList = new ArrayList<ICFBamPopSubDep3Obj>(len);
		for( idx = 0; idx < len; idx ++ ) {
			arrayList.add( arr[idx] );
		}

		Comparator<ICFBamPopSubDep3Obj> cmp = new Comparator<ICFBamPopSubDep3Obj>() {
			public int compare( ICFBamPopSubDep3Obj lhs, ICFBamPopSubDep3Obj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		List<ICFBamPopSubDep3Obj> sortedList = arrayList;
		return( sortedList );
	}

	public ICFBamPopSubDep3Obj readPopSubDep3ByUNameIdx( long PopSubDep2TenantId,
		long PopSubDep2Id,
		String Name )
	{
		return( readPopSubDep3ByUNameIdx( PopSubDep2TenantId,
			PopSubDep2Id,
			Name,
			false ) );
	}

	public ICFBamPopSubDep3Obj readPopSubDep3ByUNameIdx( long PopSubDep2TenantId,
		long PopSubDep2Id,
		String Name, boolean forceRead )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< CFBamPopSubDep3ByUNameIdxKey,
				ICFBamPopSubDep3Obj >();
		}
		CFBamPopSubDep3ByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryPopSubDep3().newUNameIdxKey();
		key.setRequiredPopSubDep2TenantId( PopSubDep2TenantId );
		key.setRequiredPopSubDep2Id( PopSubDep2Id );
		key.setRequiredName( Name );
		ICFBamPopSubDep3Obj obj = null;
		if( ( ! forceRead ) && indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
		}
		else {
			CFBamPopSubDep3Buff buff = ((ICFBamSchema)schema.getBackingStore()).getTablePopSubDep3().readDerivedByUNameIdx( schema.getAuthorization(),
				PopSubDep2TenantId,
				PopSubDep2Id,
				Name );
			if( buff != null ) {
				obj = (ICFBamPopSubDep3Obj)schema.getScopeTableObj().constructByClassCode( buff.getClassCode() );
				obj.setPKey( ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey() );
				obj.setBuff( buff );
				obj = (ICFBamPopSubDep3Obj)obj.realise();
			}
		}
		return( obj );
	}

	public ICFBamPopSubDep3Obj readCachedPopSubDep3ByIdIdx( long TenantId,
		long Id )
	{
		ICFBamPopSubDep3Obj obj = null;
		CFBamScopePKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		obj = readCachedPopSubDep3( pkey );
		return( obj );
	}

	public List<ICFBamPopSubDep3Obj> readCachedPopSubDep3ByTenantIdx( long TenantId )
	{
		final String S_ProcName = "readCachedPopSubDep3ByTenantIdx";
		CFBamScopeByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		ArrayList<ICFBamPopSubDep3Obj> arrayList = new ArrayList<ICFBamPopSubDep3Obj>();
		if( indexByTenantIdx != null ) {
			Map<CFBamScopePKey, ICFBamPopSubDep3Obj> dict;
			if( indexByTenantIdx.containsKey( key ) ) {
				dict = indexByTenantIdx.get( key );
				int len = dict.size();
				ICFBamPopSubDep3Obj arr[] = new ICFBamPopSubDep3Obj[len];
				Iterator<ICFBamPopSubDep3Obj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
							S_ProcName,
							0,
							"idx",
							idx,
							len );
				}
				for( idx = 0; idx < len; idx ++ ) {
					arrayList.add( arr[idx] );
				}
			}
		}
		else {
			ICFBamPopSubDep3Obj obj;
			Iterator<ICFBamPopSubDep3Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamPopSubDep3Obj> cmp = new Comparator<ICFBamPopSubDep3Obj>() {
			public int compare( ICFBamPopSubDep3Obj lhs, ICFBamPopSubDep3Obj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamPopSubDep3Obj> readCachedPopSubDep3ByRelationIdx( long RelationTenantId,
		long RelationId )
	{
		final String S_ProcName = "readCachedPopSubDep3ByRelationIdx";
		CFBamPopDepByRelationIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryPopDep().newRelationIdxKey();
		key.setRequiredRelationTenantId( RelationTenantId );
		key.setRequiredRelationId( RelationId );
		ArrayList<ICFBamPopSubDep3Obj> arrayList = new ArrayList<ICFBamPopSubDep3Obj>();
		if( indexByRelationIdx != null ) {
			Map<CFBamScopePKey, ICFBamPopSubDep3Obj> dict;
			if( indexByRelationIdx.containsKey( key ) ) {
				dict = indexByRelationIdx.get( key );
				int len = dict.size();
				ICFBamPopSubDep3Obj arr[] = new ICFBamPopSubDep3Obj[len];
				Iterator<ICFBamPopSubDep3Obj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
							S_ProcName,
							0,
							"idx",
							idx,
							len );
				}
				for( idx = 0; idx < len; idx ++ ) {
					arrayList.add( arr[idx] );
				}
			}
		}
		else {
			ICFBamPopSubDep3Obj obj;
			Iterator<ICFBamPopSubDep3Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamPopSubDep3Obj> cmp = new Comparator<ICFBamPopSubDep3Obj>() {
			public int compare( ICFBamPopSubDep3Obj lhs, ICFBamPopSubDep3Obj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamPopSubDep3Obj> readCachedPopSubDep3ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "readCachedPopSubDep3ByDefSchemaIdx";
		CFBamPopDepByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryPopDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		ArrayList<ICFBamPopSubDep3Obj> arrayList = new ArrayList<ICFBamPopSubDep3Obj>();
		if( indexByDefSchemaIdx != null ) {
			Map<CFBamScopePKey, ICFBamPopSubDep3Obj> dict;
			if( indexByDefSchemaIdx.containsKey( key ) ) {
				dict = indexByDefSchemaIdx.get( key );
				int len = dict.size();
				ICFBamPopSubDep3Obj arr[] = new ICFBamPopSubDep3Obj[len];
				Iterator<ICFBamPopSubDep3Obj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
							S_ProcName,
							0,
							"idx",
							idx,
							len );
				}
				for( idx = 0; idx < len; idx ++ ) {
					arrayList.add( arr[idx] );
				}
			}
		}
		else {
			ICFBamPopSubDep3Obj obj;
			Iterator<ICFBamPopSubDep3Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamPopSubDep3Obj> cmp = new Comparator<ICFBamPopSubDep3Obj>() {
			public int compare( ICFBamPopSubDep3Obj lhs, ICFBamPopSubDep3Obj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public List<ICFBamPopSubDep3Obj> readCachedPopSubDep3ByPopSubDep2Idx( long PopSubDep2TenantId,
		long PopSubDep2Id )
	{
		final String S_ProcName = "readCachedPopSubDep3ByPopSubDep2Idx";
		CFBamPopSubDep3ByPopSubDep2IdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryPopSubDep3().newPopSubDep2IdxKey();
		key.setRequiredPopSubDep2TenantId( PopSubDep2TenantId );
		key.setRequiredPopSubDep2Id( PopSubDep2Id );
		ArrayList<ICFBamPopSubDep3Obj> arrayList = new ArrayList<ICFBamPopSubDep3Obj>();
		if( indexByPopSubDep2Idx != null ) {
			Map<CFBamScopePKey, ICFBamPopSubDep3Obj> dict;
			if( indexByPopSubDep2Idx.containsKey( key ) ) {
				dict = indexByPopSubDep2Idx.get( key );
				int len = dict.size();
				ICFBamPopSubDep3Obj arr[] = new ICFBamPopSubDep3Obj[len];
				Iterator<ICFBamPopSubDep3Obj> valIter = dict.values().iterator();
				int idx = 0;
				while( ( idx < len ) && valIter.hasNext() ) {
					arr[idx++] = valIter.next();
				}
				if( idx < len ) {
					throw new CFLibArgumentUnderflowException( getClass(),
						S_ProcName,
						0,
						"idx",
						idx,
						len );
				}
				else if( valIter.hasNext() ) {
					throw new CFLibArgumentOverflowException( getClass(),
							S_ProcName,
							0,
							"idx",
							idx,
							len );
				}
				for( idx = 0; idx < len; idx ++ ) {
					arrayList.add( arr[idx] );
				}
			}
		}
		else {
			ICFBamPopSubDep3Obj obj;
			Iterator<ICFBamPopSubDep3Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) == 0 ) {
						arrayList.add( obj );
					}
				}
			}
		}
		Comparator<ICFBamPopSubDep3Obj> cmp = new Comparator<ICFBamPopSubDep3Obj>() {
			public int compare( ICFBamPopSubDep3Obj lhs, ICFBamPopSubDep3Obj rhs ) {
				if( lhs == null ) {
					if( rhs == null ) {
						return( 0 );
					}
					else {
						return( -1 );
					}
				}
				else if( rhs == null ) {
					return( 1 );
				}
				else {
					CFBamScopePKey lhsPKey = lhs.getPKey();
					CFBamScopePKey rhsPKey = rhs.getPKey();
					int ret = lhsPKey.compareTo( rhsPKey );
					return( ret );
				}
			}
		};
		Collections.sort( arrayList, cmp );
		return( arrayList );
	}

	public ICFBamPopSubDep3Obj readCachedPopSubDep3ByUNameIdx( long PopSubDep2TenantId,
		long PopSubDep2Id,
		String Name )
	{
		ICFBamPopSubDep3Obj obj = null;
		CFBamPopSubDep3ByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryPopSubDep3().newUNameIdxKey();
		key.setRequiredPopSubDep2TenantId( PopSubDep2TenantId );
		key.setRequiredPopSubDep2Id( PopSubDep2Id );
		key.setRequiredName( Name );
		if( indexByUNameIdx != null ) {
			if( indexByUNameIdx.containsKey( key ) ) {
				obj = indexByUNameIdx.get( key );
			}
			else {
				Iterator<ICFBamPopSubDep3Obj> valIter = members.values().iterator();
				while( ( obj == null ) && valIter.hasNext() ) {
					obj = valIter.next();
					if( obj != null ) {
						if( obj.getBuff().compareTo( key ) != 0 ) {
							obj = null;
						}
					}
				}
			}
		}
		else {
			Iterator<ICFBamPopSubDep3Obj> valIter = members.values().iterator();
			while( valIter.hasNext() ) {
				obj = valIter.next();
				if( obj != null ) {
					if( obj.getBuff().compareTo( key ) != 0 ) {
						obj = null;
					}
				}
			}
		}
		return( obj );
	}

	public void deepDisposePopSubDep3ByIdIdx( long TenantId,
		long Id )
	{
		ICFBamPopSubDep3Obj obj = readCachedPopSubDep3ByIdIdx( TenantId,
				Id );
		if( obj != null ) {
			obj.forget();
		}
	}

	public void deepDisposePopSubDep3ByTenantIdx( long TenantId )
	{
		final String S_ProcName = "deepDisposePopSubDep3ByTenantIdx";
		ICFBamPopSubDep3Obj obj;
		List<ICFBamPopSubDep3Obj> arrayList = readCachedPopSubDep3ByTenantIdx( TenantId );
		if( arrayList != null )  {
			Iterator<ICFBamPopSubDep3Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposePopSubDep3ByRelationIdx( long RelationTenantId,
		long RelationId )
	{
		final String S_ProcName = "deepDisposePopSubDep3ByRelationIdx";
		ICFBamPopSubDep3Obj obj;
		List<ICFBamPopSubDep3Obj> arrayList = readCachedPopSubDep3ByRelationIdx( RelationTenantId,
				RelationId );
		if( arrayList != null )  {
			Iterator<ICFBamPopSubDep3Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposePopSubDep3ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		final String S_ProcName = "deepDisposePopSubDep3ByDefSchemaIdx";
		ICFBamPopSubDep3Obj obj;
		List<ICFBamPopSubDep3Obj> arrayList = readCachedPopSubDep3ByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
		if( arrayList != null )  {
			Iterator<ICFBamPopSubDep3Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposePopSubDep3ByPopSubDep2Idx( long PopSubDep2TenantId,
		long PopSubDep2Id )
	{
		final String S_ProcName = "deepDisposePopSubDep3ByPopSubDep2Idx";
		ICFBamPopSubDep3Obj obj;
		List<ICFBamPopSubDep3Obj> arrayList = readCachedPopSubDep3ByPopSubDep2Idx( PopSubDep2TenantId,
				PopSubDep2Id );
		if( arrayList != null )  {
			Iterator<ICFBamPopSubDep3Obj> arrayIter = arrayList.iterator();
			while( arrayIter.hasNext() ) {
				obj = arrayIter.next();
				if( obj != null ) {
					obj.forget();
				}
			}
		}
	}

	public void deepDisposePopSubDep3ByUNameIdx( long PopSubDep2TenantId,
		long PopSubDep2Id,
		String Name )
	{
		ICFBamPopSubDep3Obj obj = readCachedPopSubDep3ByUNameIdx( PopSubDep2TenantId,
				PopSubDep2Id,
				Name );
		if( obj != null ) {
			obj.forget();
		}
	}

	public ICFBamPopSubDep3Obj updatePopSubDep3( ICFBamPopSubDep3Obj Obj ) {
		ICFBamPopSubDep3Obj obj = Obj;
		((ICFBamSchema)schema.getBackingStore()).getTablePopSubDep3().updatePopSubDep3( schema.getAuthorization(),
			Obj.getPopSubDep3Buff() );
		if( Obj.getClassCode().equals( "a833" ) ) {
			obj = (ICFBamPopSubDep3Obj)Obj.realise();
		}
		obj.endEdit();
		return( obj );
	}

	public void deletePopSubDep3( ICFBamPopSubDep3Obj Obj ) {
		ICFBamPopSubDep3Obj obj = Obj;
		((ICFBamSchema)schema.getBackingStore()).getTablePopSubDep3().deletePopSubDep3( schema.getAuthorization(),
			obj.getPopSubDep3Buff() );
		Obj.forget();
	}

	public void deletePopSubDep3ByIdIdx( long TenantId,
		long Id )
	{
		CFBamScopePKey pkey = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newPKey();
		pkey.setRequiredTenantId( TenantId );
		pkey.setRequiredId( Id );
		ICFBamPopSubDep3Obj obj = readPopSubDep3( pkey );
		if( obj != null ) {
			ICFBamPopSubDep3EditObj editObj = (ICFBamPopSubDep3EditObj)obj.getEdit();
			boolean editStarted;
			if( editObj == null ) {
				editObj = (ICFBamPopSubDep3EditObj)obj.beginEdit();
				if( editObj != null ) {
					editStarted = true;
				}
				else {
					editStarted = false;
				}
			}
			else {
				editStarted = false;
			}
			if( editObj != null ) {
				editObj.deleteInstance();
				if( editStarted ) {
					editObj.endEdit();
				}
			}
			obj.forget();
		}
		deepDisposePopSubDep3ByIdIdx( TenantId,
				Id );
	}

	public void deletePopSubDep3ByTenantIdx( long TenantId )
	{
		CFBamScopeByTenantIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryScope().newTenantIdxKey();
		key.setRequiredTenantId( TenantId );
		if( indexByTenantIdx == null ) {
			indexByTenantIdx = new HashMap< CFBamScopeByTenantIdxKey,
				Map< CFBamScopePKey, ICFBamPopSubDep3Obj > >();
		}
		if( indexByTenantIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamPopSubDep3Obj> dict = indexByTenantIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTablePopSubDep3().deletePopSubDep3ByTenantIdx( schema.getAuthorization(),
				TenantId );
			Iterator<ICFBamPopSubDep3Obj> iter = dict.values().iterator();
			ICFBamPopSubDep3Obj obj;
			List<ICFBamPopSubDep3Obj> toForget = new LinkedList<ICFBamPopSubDep3Obj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByTenantIdx.remove( key );
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTablePopSubDep3().deletePopSubDep3ByTenantIdx( schema.getAuthorization(),
				TenantId );
		}
		deepDisposePopSubDep3ByTenantIdx( TenantId );
	}

	public void deletePopSubDep3ByRelationIdx( long RelationTenantId,
		long RelationId )
	{
		CFBamPopDepByRelationIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryPopDep().newRelationIdxKey();
		key.setRequiredRelationTenantId( RelationTenantId );
		key.setRequiredRelationId( RelationId );
		if( indexByRelationIdx == null ) {
			indexByRelationIdx = new HashMap< CFBamPopDepByRelationIdxKey,
				Map< CFBamScopePKey, ICFBamPopSubDep3Obj > >();
		}
		if( indexByRelationIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamPopSubDep3Obj> dict = indexByRelationIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTablePopSubDep3().deletePopSubDep3ByRelationIdx( schema.getAuthorization(),
				RelationTenantId,
				RelationId );
			Iterator<ICFBamPopSubDep3Obj> iter = dict.values().iterator();
			ICFBamPopSubDep3Obj obj;
			List<ICFBamPopSubDep3Obj> toForget = new LinkedList<ICFBamPopSubDep3Obj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByRelationIdx.remove( key );
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTablePopSubDep3().deletePopSubDep3ByRelationIdx( schema.getAuthorization(),
				RelationTenantId,
				RelationId );
		}
		deepDisposePopSubDep3ByRelationIdx( RelationTenantId,
				RelationId );
	}

	public void deletePopSubDep3ByDefSchemaIdx( Long DefSchemaTenantId,
		Long DefSchemaId )
	{
		CFBamPopDepByDefSchemaIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryPopDep().newDefSchemaIdxKey();
		key.setOptionalDefSchemaTenantId( DefSchemaTenantId );
		key.setOptionalDefSchemaId( DefSchemaId );
		if( indexByDefSchemaIdx == null ) {
			indexByDefSchemaIdx = new HashMap< CFBamPopDepByDefSchemaIdxKey,
				Map< CFBamScopePKey, ICFBamPopSubDep3Obj > >();
		}
		if( indexByDefSchemaIdx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamPopSubDep3Obj> dict = indexByDefSchemaIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTablePopSubDep3().deletePopSubDep3ByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
			Iterator<ICFBamPopSubDep3Obj> iter = dict.values().iterator();
			ICFBamPopSubDep3Obj obj;
			List<ICFBamPopSubDep3Obj> toForget = new LinkedList<ICFBamPopSubDep3Obj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByDefSchemaIdx.remove( key );
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTablePopSubDep3().deletePopSubDep3ByDefSchemaIdx( schema.getAuthorization(),
				DefSchemaTenantId,
				DefSchemaId );
		}
		deepDisposePopSubDep3ByDefSchemaIdx( DefSchemaTenantId,
				DefSchemaId );
	}

	public void deletePopSubDep3ByPopSubDep2Idx( long PopSubDep2TenantId,
		long PopSubDep2Id )
	{
		CFBamPopSubDep3ByPopSubDep2IdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryPopSubDep3().newPopSubDep2IdxKey();
		key.setRequiredPopSubDep2TenantId( PopSubDep2TenantId );
		key.setRequiredPopSubDep2Id( PopSubDep2Id );
		if( indexByPopSubDep2Idx == null ) {
			indexByPopSubDep2Idx = new HashMap< CFBamPopSubDep3ByPopSubDep2IdxKey,
				Map< CFBamScopePKey, ICFBamPopSubDep3Obj > >();
		}
		if( indexByPopSubDep2Idx.containsKey( key ) ) {
			Map<CFBamScopePKey, ICFBamPopSubDep3Obj> dict = indexByPopSubDep2Idx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTablePopSubDep3().deletePopSubDep3ByPopSubDep2Idx( schema.getAuthorization(),
				PopSubDep2TenantId,
				PopSubDep2Id );
			Iterator<ICFBamPopSubDep3Obj> iter = dict.values().iterator();
			ICFBamPopSubDep3Obj obj;
			List<ICFBamPopSubDep3Obj> toForget = new LinkedList<ICFBamPopSubDep3Obj>();
			while( iter.hasNext() ) {
				obj = iter.next();
				toForget.add( obj );
			}
			iter = toForget.iterator();
			while( iter.hasNext() ) {
				obj = iter.next();
				obj.forget();
			}
			indexByPopSubDep2Idx.remove( key );
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTablePopSubDep3().deletePopSubDep3ByPopSubDep2Idx( schema.getAuthorization(),
				PopSubDep2TenantId,
				PopSubDep2Id );
		}
		deepDisposePopSubDep3ByPopSubDep2Idx( PopSubDep2TenantId,
				PopSubDep2Id );
	}

	public void deletePopSubDep3ByUNameIdx( long PopSubDep2TenantId,
		long PopSubDep2Id,
		String Name )
	{
		if( indexByUNameIdx == null ) {
			indexByUNameIdx = new HashMap< CFBamPopSubDep3ByUNameIdxKey,
				ICFBamPopSubDep3Obj >();
		}
		CFBamPopSubDep3ByUNameIdxKey key = ((ICFBamSchema)schema.getBackingStore()).getFactoryPopSubDep3().newUNameIdxKey();
		key.setRequiredPopSubDep2TenantId( PopSubDep2TenantId );
		key.setRequiredPopSubDep2Id( PopSubDep2Id );
		key.setRequiredName( Name );
		ICFBamPopSubDep3Obj obj = null;
		if( indexByUNameIdx.containsKey( key ) ) {
			obj = indexByUNameIdx.get( key );
			((ICFBamSchema)schema.getBackingStore()).getTablePopSubDep3().deletePopSubDep3ByUNameIdx( schema.getAuthorization(),
				PopSubDep2TenantId,
				PopSubDep2Id,
				Name );
			obj.forget();
		}
		else {
			((ICFBamSchema)schema.getBackingStore()).getTablePopSubDep3().deletePopSubDep3ByUNameIdx( schema.getAuthorization(),
				PopSubDep2TenantId,
				PopSubDep2Id,
				Name );
		}
		deepDisposePopSubDep3ByUNameIdx( PopSubDep2TenantId,
				PopSubDep2Id,
				Name );
	}
}