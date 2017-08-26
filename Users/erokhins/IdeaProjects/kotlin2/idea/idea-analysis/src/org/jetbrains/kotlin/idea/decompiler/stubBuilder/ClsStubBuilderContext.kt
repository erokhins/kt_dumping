'ClsStubBuilderContext' @ [39:16] ==> public constructor ClsStubBuilderContext(components: ClsStubBuilderComponents, nameResolver: NameResolver, containerFqName: FqName, typeParameters: TypeParameters, typeTable: TypeTable, protoContainer: ProtoContainer.Class?) defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderContext[ClassConstructorDescriptorImpl]

'this' @ [39:38] ==> <this> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderComponents[LazyClassReceiverParameterDescriptor]

'nameResolver' @ [39:44] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderComponents.createContext[ValueParameterDescriptorImpl]

'packageFqName' @ [39:58] ==> value-parameter packageFqName: FqName defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderComponents.createContext[ValueParameterDescriptorImpl]

'EmptyTypeParameters' @ [39:73] ==> public object EmptyTypeParameters : TypeParameters defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder in file ClsStubBuilderContext.kt[FakeCallableDescriptorForObject]

'typeTable' @ [39:94] ==> value-parameter typeTable: TypeTable defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderComponents.createContext[ValueParameterDescriptorImpl]

'TypeParametersImpl' @ [47:15] ==> public constructor TypeParametersImpl(nameResolver: NameResolver, typeParameterProtos: Collection<ProtoBuf.TypeParameter>, parent: TypeParameters) defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeParametersImpl[ClassConstructorDescriptorImpl]

'nameResolver' @ [47:34] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeParameters.child[ValueParameterDescriptorImpl]

'innerTypeParameters' @ [47:48] ==> value-parameter innerTypeParameters: List<ProtoBuf.TypeParameter> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeParameters.child[ValueParameterDescriptorImpl]

'this' @ [47:78] ==> <this> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeParameters[LazyClassReceiverParameterDescriptor]

'IllegalStateException' @ [51:45] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'id' @ [51:102] ==> value-parameter id: Int defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.EmptyTypeParameters.get[ValueParameterDescriptorImpl]

'typeParameterProtos' @ [59:38] ==> value-parameter typeParameterProtos: Collection<ProtoBuf.TypeParameter> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeParametersImpl.<init>[ValueParameterDescriptorImpl]

'map' @ [59:58] ==> public inline fun <T, R> Iterable<ProtoBuf.TypeParameter>.map(transform: (ProtoBuf.TypeParameter) -> Pair<Int, Name>): List<Pair<Int, Name>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameter
    <R> -> Pair<Int, Name>

'Pair' @ [59:64] ==> public constructor Pair<out A, out B>(first: Int, second: Name) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Int
    <out B> -> Name

'it' @ [59:69] ==> value-parameter it: ProtoBuf.TypeParameter defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeParametersImpl.typeParametersById.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [59:72] ==> public final val ProtoBuf.TypeParameter.id: Int[MyPropertyDescriptor]

'nameResolver' @ [59:76] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeParametersImpl.<init>[ValueParameterDescriptorImpl]

'getName' @ [59:89] ==> @NotNull public abstract fun getName(p0: Int): Name defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'it' @ [59:97] ==> value-parameter it: ProtoBuf.TypeParameter defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeParametersImpl.typeParametersById.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [59:100] ==> public final val ProtoBuf.TypeParameter.name: Int[MyPropertyDescriptor]

'toMap' @ [59:109] ==> public fun <K, V> Iterable<Pair<Int, Name>>.toMap(): Map<Int, Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V> -> Name

'typeParametersById' @ [61:39] ==> private final val typeParametersById: Map<Int, Name> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeParametersImpl[PropertyDescriptorImpl]

'id' @ [61:58] ==> value-parameter id: Int defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeParametersImpl.get[ValueParameterDescriptorImpl]

'parent' @ [61:65] ==> private final val parent: TypeParameters defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeParametersImpl[PropertyDescriptorImpl]

'id' @ [61:72] ==> value-parameter id: Int defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeParametersImpl.get[ValueParameterDescriptorImpl]

'this' @ [76:38] ==> <this> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.child[ReceiverParameterDescriptorImpl]

'nameResolver' @ [76:43] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderContext[PropertyDescriptorImpl]

'this' @ [77:32] ==> <this> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.child[ReceiverParameterDescriptorImpl]

'typeTable' @ [77:37] ==> public final val typeTable: TypeTable defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderContext[PropertyDescriptorImpl]

'this' @ [78:49] ==> <this> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.child[ReceiverParameterDescriptorImpl]

'protoContainer' @ [78:54] ==> public final val protoContainer: ProtoContainer.Class? defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderContext[PropertyDescriptorImpl]

'ClsStubBuilderContext' @ [80:12] ==> public constructor ClsStubBuilderContext(components: ClsStubBuilderComponents, nameResolver: NameResolver, containerFqName: FqName, typeParameters: TypeParameters, typeTable: TypeTable, protoContainer: ProtoContainer.Class?) defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderContext[ClassConstructorDescriptorImpl]

'this' @ [81:13] ==> <this> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.child[ReceiverParameterDescriptorImpl]

'components' @ [81:18] ==> public final val components: ClsStubBuilderComponents defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderContext[PropertyDescriptorImpl]

'nameResolver' @ [82:13] ==> value-parameter nameResolver: NameResolver = ... defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.child[ValueParameterDescriptorImpl]

'if (name != null) this.containerFqName.child(name) else this.containerFqName' @ [83:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FqName, elseBranch: FqName): FqName[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FqName

'name' @ [83:17] ==> value-parameter name: Name? = ... defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.child[ValueParameterDescriptorImpl]

'this' @ [83:31] ==> <this> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.child[ReceiverParameterDescriptorImpl]

'containerFqName' @ [83:36] ==> public final val containerFqName: FqName defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderContext[PropertyDescriptorImpl]

'child' @ [83:52] ==> @NotNull public open fun child(@NotNull p0: Name): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'name' @ [83:58] ==> value-parameter name: Name? = ... defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.child[ValueParameterDescriptorImpl]

'this' @ [83:69] ==> <this> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.child[ReceiverParameterDescriptorImpl]

'containerFqName' @ [83:74] ==> public final val containerFqName: FqName defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderContext[PropertyDescriptorImpl]

'this' @ [84:13] ==> <this> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.child[ReceiverParameterDescriptorImpl]

'typeParameters' @ [84:18] ==> public final val typeParameters: TypeParameters defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClsStubBuilderContext[PropertyDescriptorImpl]

'child' @ [84:33] ==> public open fun child(nameResolver: NameResolver, innerTypeParameters: List<ProtoBuf.TypeParameter>): TypeParametersImpl defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.TypeParameters[SimpleFunctionDescriptorImpl]

'nameResolver' @ [84:39] ==> value-parameter nameResolver: NameResolver = ... defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.child[ValueParameterDescriptorImpl]

'typeParameterList' @ [84:53] ==> value-parameter typeParameterList: List<ProtoBuf.TypeParameter> defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.child[ValueParameterDescriptorImpl]

'typeTable' @ [85:13] ==> value-parameter typeTable: TypeTable = ... defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.child[ValueParameterDescriptorImpl]

'protoContainer' @ [86:13] ==> value-parameter protoContainer: ProtoContainer.Class? = ... defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.child[ValueParameterDescriptorImpl]

