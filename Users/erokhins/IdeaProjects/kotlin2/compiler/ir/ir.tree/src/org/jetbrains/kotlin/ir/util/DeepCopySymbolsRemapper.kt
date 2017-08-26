'DEFAULT' @ [28:84] ==> public object DEFAULT : DescriptorsRemapper defined in org.jetbrains.kotlin.ir.util.DescriptorsRemapper[FakeCallableDescriptorForObject]

'hashMapOf' @ [30:27] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<IrClassSymbol, IrClassSymbol> /* = HashMap<IrClassSymbol, IrClassSymbol> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> IrClassSymbol
    <V> -> IrClassSymbol

'hashMapOf' @ [31:32] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<IrConstructorSymbol, IrConstructorSymbol> /* = HashMap<IrConstructorSymbol, IrConstructorSymbol> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> IrConstructorSymbol
    <V> -> IrConstructorSymbol

'hashMapOf' @ [32:31] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<IrEnumEntrySymbol, IrEnumEntrySymbol> /* = HashMap<IrEnumEntrySymbol, IrEnumEntrySymbol> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> IrEnumEntrySymbol
    <V> -> IrEnumEntrySymbol

'hashMapOf' @ [33:44] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<IrExternalPackageFragmentSymbol, IrExternalPackageFragmentSymbol> /* = HashMap<IrExternalPackageFragmentSymbol, IrExternalPackageFragmentSymbol> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> IrExternalPackageFragmentSymbol
    <V> -> IrExternalPackageFragmentSymbol

'hashMapOf' @ [34:26] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<IrFieldSymbol, IrFieldSymbol> /* = HashMap<IrFieldSymbol, IrFieldSymbol> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> IrFieldSymbol
    <V> -> IrFieldSymbol

'hashMapOf' @ [35:25] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<IrFileSymbol, IrFileSymbol> /* = HashMap<IrFileSymbol, IrFileSymbol> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> IrFileSymbol
    <V> -> IrFileSymbol

'hashMapOf' @ [36:29] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<IrSimpleFunctionSymbol, IrSimpleFunctionSymbol> /* = HashMap<IrSimpleFunctionSymbol, IrSimpleFunctionSymbol> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> IrSimpleFunctionSymbol
    <V> -> IrSimpleFunctionSymbol

'hashMapOf' @ [37:34] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<IrTypeParameterSymbol, IrTypeParameterSymbol> /* = HashMap<IrTypeParameterSymbol, IrTypeParameterSymbol> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> IrTypeParameterSymbol
    <V> -> IrTypeParameterSymbol

'hashMapOf' @ [38:35] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<IrValueParameterSymbol, IrValueParameterSymbol> /* = HashMap<IrValueParameterSymbol, IrValueParameterSymbol> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> IrValueParameterSymbol
    <V> -> IrValueParameterSymbol

'hashMapOf' @ [39:29] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<IrVariableSymbol, IrVariableSymbol> /* = HashMap<IrVariableSymbol, IrVariableSymbol> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> IrVariableSymbol
    <V> -> IrVariableSymbol

'element' @ [42:9] ==> value-parameter element: IrElement defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.visitElement[ValueParameterDescriptorImpl]

'acceptChildrenVoid' @ [42:17] ==> public fun IrElement.acceptChildrenVoid(visitor: IrElementVisitorVoid): Unit defined in org.jetbrains.kotlin.ir.visitors in file IrElementVisitorVoid.kt[SimpleFunctionDescriptorImpl]

'this' @ [42:36] ==> <this> defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[LazyClassReceiverParameterDescriptor]

'owner' @ [47:22] ==> value-parameter owner: B defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.remapSymbol[ValueParameterDescriptorImpl]

'symbol' @ [47:28] ==> public abstract val symbol: IrSymbol defined in org.jetbrains.kotlin.ir.declarations.IrSymbolOwner[PropertyDescriptorImpl]

'map' @ [48:9] ==> value-parameter map: MutableMap<S, S> defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.remapSymbol[ValueParameterDescriptorImpl]

'symbol' @ [48:13] ==> val symbol: S defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.remapSymbol[LocalVariableDescriptor]

'invoke' @ [48:23] ==> public abstract operator fun invoke(p1: S): S defined in kotlin.Function1[FunctionInvokeDescriptor]

'symbol' @ [48:39] ==> val symbol: S defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.remapSymbol[LocalVariableDescriptor]

'remapSymbol' @ [52:9] ==> protected final inline fun <D : DeclarationDescriptor, B : IrSymbolOwner, reified S : IrBindableSymbol<ClassDescriptor, IrClass>> remapSymbol(map: MutableMap<IrClassSymbol, IrClassSymbol>, owner: IrClass, createNewSymbol: (IrClassSymbol) -> IrClassSymbol): Unit defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : DeclarationDescriptor> -> ClassDescriptor
    <B : IrSymbolOwner> -> IrClass
    <reified S : IrBindableSymbol<D, B>> -> IrClassSymbol

'classes' @ [52:21] ==> private final val classes: HashMap<IrClassSymbol, IrClassSymbol> /* = HashMap<IrClassSymbol, IrClassSymbol> */ defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[PropertyDescriptorImpl]

'declaration' @ [52:30] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.visitClass[ValueParameterDescriptorImpl]

'IrClassSymbolImpl' @ [53:13] ==> public constructor IrClassSymbolImpl(descriptor: ClassDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrClassSymbolImpl[ClassConstructorDescriptorImpl]

'descriptorsRemapper' @ [53:31] ==> private final val descriptorsRemapper: DescriptorsRemapper defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[PropertyDescriptorImpl]

'remapDeclaredClass' @ [53:51] ==> public open fun remapDeclaredClass(descriptor: ClassDescriptor): ClassDescriptor defined in org.jetbrains.kotlin.ir.util.DescriptorsRemapper[SimpleFunctionDescriptorImpl]

'it' @ [53:70] ==> value-parameter it: IrClassSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.visitClass.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [53:73] ==> public abstract val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrClassSymbol[PropertyDescriptorImpl]

'declaration' @ [55:9] ==> value-parameter declaration: IrClass defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.visitClass[ValueParameterDescriptorImpl]

'acceptChildrenVoid' @ [55:21] ==> public fun IrElement.acceptChildrenVoid(visitor: IrElementVisitorVoid): Unit defined in org.jetbrains.kotlin.ir.visitors in file IrElementVisitorVoid.kt[SimpleFunctionDescriptorImpl]

'this' @ [55:40] ==> <this> defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[LazyClassReceiverParameterDescriptor]

'remapSymbol' @ [59:9] ==> protected final inline fun <D : DeclarationDescriptor, B : IrSymbolOwner, reified S : IrBindableSymbol<ClassConstructorDescriptor, IrConstructor>> remapSymbol(map: MutableMap<IrConstructorSymbol, IrConstructorSymbol>, owner: IrConstructor, createNewSymbol: (IrConstructorSymbol) -> IrConstructorSymbol): Unit defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : DeclarationDescriptor> -> ClassConstructorDescriptor
    <B : IrSymbolOwner> -> IrConstructor
    <reified S : IrBindableSymbol<D, B>> -> IrConstructorSymbol

'constructors' @ [59:21] ==> private final val constructors: HashMap<IrConstructorSymbol, IrConstructorSymbol> /* = HashMap<IrConstructorSymbol, IrConstructorSymbol> */ defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[PropertyDescriptorImpl]

'declaration' @ [59:35] ==> value-parameter declaration: IrConstructor defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.visitConstructor[ValueParameterDescriptorImpl]

'IrConstructorSymbolImpl' @ [60:13] ==> public constructor IrConstructorSymbolImpl(descriptor: ClassConstructorDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrConstructorSymbolImpl[ClassConstructorDescriptorImpl]

'descriptorsRemapper' @ [60:37] ==> private final val descriptorsRemapper: DescriptorsRemapper defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[PropertyDescriptorImpl]

'remapDeclaredConstructor' @ [60:57] ==> public open fun remapDeclaredConstructor(descriptor: ClassConstructorDescriptor): ClassConstructorDescriptor defined in org.jetbrains.kotlin.ir.util.DescriptorsRemapper[SimpleFunctionDescriptorImpl]

'it' @ [60:82] ==> value-parameter it: IrConstructorSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.visitConstructor.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [60:85] ==> public abstract val descriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrConstructorSymbol[PropertyDescriptorImpl]

'declaration' @ [62:9] ==> value-parameter declaration: IrConstructor defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.visitConstructor[ValueParameterDescriptorImpl]

'acceptChildrenVoid' @ [62:21] ==> public fun IrElement.acceptChildrenVoid(visitor: IrElementVisitorVoid): Unit defined in org.jetbrains.kotlin.ir.visitors in file IrElementVisitorVoid.kt[SimpleFunctionDescriptorImpl]

'this' @ [62:40] ==> <this> defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[LazyClassReceiverParameterDescriptor]

'remapSymbol' @ [66:9] ==> protected final inline fun <D : DeclarationDescriptor, B : IrSymbolOwner, reified S : IrBindableSymbol<ClassDescriptor, IrEnumEntry>> remapSymbol(map: MutableMap<IrEnumEntrySymbol, IrEnumEntrySymbol>, owner: IrEnumEntry, createNewSymbol: (IrEnumEntrySymbol) -> IrEnumEntrySymbol): Unit defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : DeclarationDescriptor> -> ClassDescriptor
    <B : IrSymbolOwner> -> IrEnumEntry
    <reified S : IrBindableSymbol<D, B>> -> IrEnumEntrySymbol

'enumEntries' @ [66:21] ==> private final val enumEntries: HashMap<IrEnumEntrySymbol, IrEnumEntrySymbol> /* = HashMap<IrEnumEntrySymbol, IrEnumEntrySymbol> */ defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[PropertyDescriptorImpl]

'declaration' @ [66:34] ==> value-parameter declaration: IrEnumEntry defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.visitEnumEntry[ValueParameterDescriptorImpl]

'IrEnumEntrySymbolImpl' @ [67:13] ==> public constructor IrEnumEntrySymbolImpl(descriptor: ClassDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrEnumEntrySymbolImpl[ClassConstructorDescriptorImpl]

'descriptorsRemapper' @ [67:35] ==> private final val descriptorsRemapper: DescriptorsRemapper defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[PropertyDescriptorImpl]

'remapDeclaredEnumEntry' @ [67:55] ==> public open fun remapDeclaredEnumEntry(descriptor: ClassDescriptor): ClassDescriptor defined in org.jetbrains.kotlin.ir.util.DescriptorsRemapper[SimpleFunctionDescriptorImpl]

'it' @ [67:78] ==> value-parameter it: IrEnumEntrySymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.visitEnumEntry.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [67:81] ==> public abstract val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrEnumEntrySymbol[PropertyDescriptorImpl]

'declaration' @ [69:9] ==> value-parameter declaration: IrEnumEntry defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.visitEnumEntry[ValueParameterDescriptorImpl]

'acceptChildrenVoid' @ [69:21] ==> public fun IrElement.acceptChildrenVoid(visitor: IrElementVisitorVoid): Unit defined in org.jetbrains.kotlin.ir.visitors in file IrElementVisitorVoid.kt[SimpleFunctionDescriptorImpl]

'this' @ [69:40] ==> <this> defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[LazyClassReceiverParameterDescriptor]

'remapSymbol' @ [73:9] ==> protected final inline fun <D : DeclarationDescriptor, B : IrSymbolOwner, reified S : IrBindableSymbol<PackageFragmentDescriptor, IrExternalPackageFragment>> remapSymbol(map: MutableMap<IrExternalPackageFragmentSymbol, IrExternalPackageFragmentSymbol>, owner: IrExternalPackageFragment, createNewSymbol: (IrExternalPackageFragmentSymbol) -> IrExternalPackageFragmentSymbol): Unit defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : DeclarationDescriptor> -> PackageFragmentDescriptor
    <B : IrSymbolOwner> -> IrExternalPackageFragment
    <reified S : IrBindableSymbol<D, B>> -> IrExternalPackageFragmentSymbol

'externalPackageFragments' @ [73:21] ==> private final val externalPackageFragments: HashMap<IrExternalPackageFragmentSymbol, IrExternalPackageFragmentSymbol> /* = HashMap<IrExternalPackageFragmentSymbol, IrExternalPackageFragmentSymbol> */ defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[PropertyDescriptorImpl]

'declaration' @ [73:47] ==> value-parameter declaration: IrExternalPackageFragment defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.visitExternalPackageFragment[ValueParameterDescriptorImpl]

'IrExternalPackageFragmentSymbolImpl' @ [74:13] ==> public constructor IrExternalPackageFragmentSymbolImpl(descriptor: PackageFragmentDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrExternalPackageFragmentSymbolImpl[ClassConstructorDescriptorImpl]

'descriptorsRemapper' @ [74:49] ==> private final val descriptorsRemapper: DescriptorsRemapper defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[PropertyDescriptorImpl]

'remapDeclaredExternalPackageFragment' @ [74:69] ==> public open fun remapDeclaredExternalPackageFragment(descriptor: PackageFragmentDescriptor): PackageFragmentDescriptor defined in org.jetbrains.kotlin.ir.util.DescriptorsRemapper[SimpleFunctionDescriptorImpl]

'it' @ [74:106] ==> value-parameter it: IrExternalPackageFragmentSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.visitExternalPackageFragment.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [74:109] ==> public abstract val descriptor: PackageFragmentDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrExternalPackageFragmentSymbol[PropertyDescriptorImpl]

'declaration' @ [76:9] ==> value-parameter declaration: IrExternalPackageFragment defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.visitExternalPackageFragment[ValueParameterDescriptorImpl]

'acceptChildrenVoid' @ [76:21] ==> public fun IrElement.acceptChildrenVoid(visitor: IrElementVisitorVoid): Unit defined in org.jetbrains.kotlin.ir.visitors in file IrElementVisitorVoid.kt[SimpleFunctionDescriptorImpl]

'this' @ [76:40] ==> <this> defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[LazyClassReceiverParameterDescriptor]

'remapSymbol' @ [80:9] ==> protected final inline fun <D : DeclarationDescriptor, B : IrSymbolOwner, reified S : IrBindableSymbol<PropertyDescriptor, IrField>> remapSymbol(map: MutableMap<IrFieldSymbol, IrFieldSymbol>, owner: IrField, createNewSymbol: (IrFieldSymbol) -> IrFieldSymbol): Unit defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : DeclarationDescriptor> -> PropertyDescriptor
    <B : IrSymbolOwner> -> IrField
    <reified S : IrBindableSymbol<D, B>> -> IrFieldSymbol

'fields' @ [80:21] ==> private final val fields: HashMap<IrFieldSymbol, IrFieldSymbol> /* = HashMap<IrFieldSymbol, IrFieldSymbol> */ defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[PropertyDescriptorImpl]

'declaration' @ [80:29] ==> value-parameter declaration: IrField defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.visitField[ValueParameterDescriptorImpl]

'IrFieldSymbolImpl' @ [81:13] ==> public constructor IrFieldSymbolImpl(descriptor: PropertyDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrFieldSymbolImpl[ClassConstructorDescriptorImpl]

'descriptorsRemapper' @ [81:31] ==> private final val descriptorsRemapper: DescriptorsRemapper defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[PropertyDescriptorImpl]

'remapDeclaredField' @ [81:51] ==> public open fun remapDeclaredField(descriptor: PropertyDescriptor): PropertyDescriptor defined in org.jetbrains.kotlin.ir.util.DescriptorsRemapper[SimpleFunctionDescriptorImpl]

'it' @ [81:70] ==> value-parameter it: IrFieldSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.visitField.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [81:73] ==> public abstract val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrFieldSymbol[PropertyDescriptorImpl]

'declaration' @ [83:9] ==> value-parameter declaration: IrField defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.visitField[ValueParameterDescriptorImpl]

'acceptChildrenVoid' @ [83:21] ==> public fun IrElement.acceptChildrenVoid(visitor: IrElementVisitorVoid): Unit defined in org.jetbrains.kotlin.ir.visitors in file IrElementVisitorVoid.kt[SimpleFunctionDescriptorImpl]

'this' @ [83:40] ==> <this> defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[LazyClassReceiverParameterDescriptor]

'remapSymbol' @ [87:9] ==> protected final inline fun <D : DeclarationDescriptor, B : IrSymbolOwner, reified S : IrBindableSymbol<PackageFragmentDescriptor, IrFile>> remapSymbol(map: MutableMap<IrFileSymbol, IrFileSymbol>, owner: IrFile, createNewSymbol: (IrFileSymbol) -> IrFileSymbol): Unit defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : DeclarationDescriptor> -> PackageFragmentDescriptor
    <B : IrSymbolOwner> -> IrFile
    <reified S : IrBindableSymbol<D, B>> -> IrFileSymbol

'files' @ [87:21] ==> private final val files: HashMap<IrFileSymbol, IrFileSymbol> /* = HashMap<IrFileSymbol, IrFileSymbol> */ defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[PropertyDescriptorImpl]

'declaration' @ [87:28] ==> value-parameter declaration: IrFile defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.visitFile[ValueParameterDescriptorImpl]

'IrFileSymbolImpl' @ [88:13] ==> public constructor IrFileSymbolImpl(descriptor: PackageFragmentDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrFileSymbolImpl[ClassConstructorDescriptorImpl]

'descriptorsRemapper' @ [88:30] ==> private final val descriptorsRemapper: DescriptorsRemapper defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[PropertyDescriptorImpl]

'remapDeclaredFilePackageFragment' @ [88:50] ==> public open fun remapDeclaredFilePackageFragment(descriptor: PackageFragmentDescriptor): PackageFragmentDescriptor defined in org.jetbrains.kotlin.ir.util.DescriptorsRemapper[SimpleFunctionDescriptorImpl]

'it' @ [88:83] ==> value-parameter it: IrFileSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.visitFile.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [88:86] ==> public abstract val descriptor: PackageFragmentDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrFileSymbol[PropertyDescriptorImpl]

'declaration' @ [90:9] ==> value-parameter declaration: IrFile defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.visitFile[ValueParameterDescriptorImpl]

'acceptChildrenVoid' @ [90:21] ==> public fun IrElement.acceptChildrenVoid(visitor: IrElementVisitorVoid): Unit defined in org.jetbrains.kotlin.ir.visitors in file IrElementVisitorVoid.kt[SimpleFunctionDescriptorImpl]

'this' @ [90:40] ==> <this> defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[LazyClassReceiverParameterDescriptor]

'remapSymbol' @ [94:9] ==> protected final inline fun <D : DeclarationDescriptor, B : IrSymbolOwner, reified S : IrBindableSymbol<FunctionDescriptor, IrSimpleFunction>> remapSymbol(map: MutableMap<IrSimpleFunctionSymbol, IrSimpleFunctionSymbol>, owner: IrSimpleFunction, createNewSymbol: (IrSimpleFunctionSymbol) -> IrSimpleFunctionSymbol): Unit defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : DeclarationDescriptor> -> FunctionDescriptor
    <B : IrSymbolOwner> -> IrSimpleFunction
    <reified S : IrBindableSymbol<D, B>> -> IrSimpleFunctionSymbol

'functions' @ [94:21] ==> private final val functions: HashMap<IrSimpleFunctionSymbol, IrSimpleFunctionSymbol> /* = HashMap<IrSimpleFunctionSymbol, IrSimpleFunctionSymbol> */ defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[PropertyDescriptorImpl]

'declaration' @ [94:32] ==> value-parameter declaration: IrSimpleFunction defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.visitSimpleFunction[ValueParameterDescriptorImpl]

'IrSimpleFunctionSymbolImpl' @ [95:13] ==> public constructor IrSimpleFunctionSymbolImpl(descriptor: FunctionDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrSimpleFunctionSymbolImpl[ClassConstructorDescriptorImpl]

'descriptorsRemapper' @ [95:40] ==> private final val descriptorsRemapper: DescriptorsRemapper defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[PropertyDescriptorImpl]

'remapDeclaredSimpleFunction' @ [95:60] ==> public open fun remapDeclaredSimpleFunction(descriptor: FunctionDescriptor): FunctionDescriptor defined in org.jetbrains.kotlin.ir.util.DescriptorsRemapper[SimpleFunctionDescriptorImpl]

'it' @ [95:88] ==> value-parameter it: IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.visitSimpleFunction.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [95:91] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrSimpleFunctionSymbol[PropertyDescriptorImpl]

'declaration' @ [97:9] ==> value-parameter declaration: IrSimpleFunction defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.visitSimpleFunction[ValueParameterDescriptorImpl]

'acceptChildrenVoid' @ [97:21] ==> public fun IrElement.acceptChildrenVoid(visitor: IrElementVisitorVoid): Unit defined in org.jetbrains.kotlin.ir.visitors in file IrElementVisitorVoid.kt[SimpleFunctionDescriptorImpl]

'this' @ [97:40] ==> <this> defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[LazyClassReceiverParameterDescriptor]

'remapSymbol' @ [101:9] ==> protected final inline fun <D : DeclarationDescriptor, B : IrSymbolOwner, reified S : IrBindableSymbol<TypeParameterDescriptor, IrTypeParameter>> remapSymbol(map: MutableMap<IrTypeParameterSymbol, IrTypeParameterSymbol>, owner: IrTypeParameter, createNewSymbol: (IrTypeParameterSymbol) -> IrTypeParameterSymbol): Unit defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : DeclarationDescriptor> -> TypeParameterDescriptor
    <B : IrSymbolOwner> -> IrTypeParameter
    <reified S : IrBindableSymbol<D, B>> -> IrTypeParameterSymbol

'typeParameters' @ [101:21] ==> private final val typeParameters: HashMap<IrTypeParameterSymbol, IrTypeParameterSymbol> /* = HashMap<IrTypeParameterSymbol, IrTypeParameterSymbol> */ defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[PropertyDescriptorImpl]

'declaration' @ [101:37] ==> value-parameter declaration: IrTypeParameter defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.visitTypeParameter[ValueParameterDescriptorImpl]

'IrTypeParameterSymbolImpl' @ [102:13] ==> public constructor IrTypeParameterSymbolImpl(descriptor: TypeParameterDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrTypeParameterSymbolImpl[ClassConstructorDescriptorImpl]

'descriptorsRemapper' @ [102:39] ==> private final val descriptorsRemapper: DescriptorsRemapper defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[PropertyDescriptorImpl]

'remapDeclaredTypeParameter' @ [102:59] ==> public open fun remapDeclaredTypeParameter(descriptor: TypeParameterDescriptor): TypeParameterDescriptor defined in org.jetbrains.kotlin.ir.util.DescriptorsRemapper[SimpleFunctionDescriptorImpl]

'it' @ [102:86] ==> value-parameter it: IrTypeParameterSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.visitTypeParameter.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [102:89] ==> public abstract val descriptor: TypeParameterDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrTypeParameterSymbol[PropertyDescriptorImpl]

'declaration' @ [104:9] ==> value-parameter declaration: IrTypeParameter defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.visitTypeParameter[ValueParameterDescriptorImpl]

'acceptChildrenVoid' @ [104:21] ==> public fun IrElement.acceptChildrenVoid(visitor: IrElementVisitorVoid): Unit defined in org.jetbrains.kotlin.ir.visitors in file IrElementVisitorVoid.kt[SimpleFunctionDescriptorImpl]

'this' @ [104:40] ==> <this> defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[LazyClassReceiverParameterDescriptor]

'remapSymbol' @ [108:9] ==> protected final inline fun <D : DeclarationDescriptor, B : IrSymbolOwner, reified S : IrBindableSymbol<ParameterDescriptor, IrValueParameter>> remapSymbol(map: MutableMap<IrValueParameterSymbol, IrValueParameterSymbol>, owner: IrValueParameter, createNewSymbol: (IrValueParameterSymbol) -> IrValueParameterSymbol): Unit defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : DeclarationDescriptor> -> ParameterDescriptor
    <B : IrSymbolOwner> -> IrValueParameter
    <reified S : IrBindableSymbol<D, B>> -> IrValueParameterSymbol

'valueParameters' @ [108:21] ==> private final val valueParameters: HashMap<IrValueParameterSymbol, IrValueParameterSymbol> /* = HashMap<IrValueParameterSymbol, IrValueParameterSymbol> */ defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[PropertyDescriptorImpl]

'declaration' @ [108:38] ==> value-parameter declaration: IrValueParameter defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.visitValueParameter[ValueParameterDescriptorImpl]

'IrValueParameterSymbolImpl' @ [109:13] ==> public constructor IrValueParameterSymbolImpl(descriptor: ParameterDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrValueParameterSymbolImpl[ClassConstructorDescriptorImpl]

'descriptorsRemapper' @ [109:40] ==> private final val descriptorsRemapper: DescriptorsRemapper defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[PropertyDescriptorImpl]

'remapDeclaredValueParameter' @ [109:60] ==> public open fun remapDeclaredValueParameter(descriptor: ParameterDescriptor): ParameterDescriptor defined in org.jetbrains.kotlin.ir.util.DescriptorsRemapper[SimpleFunctionDescriptorImpl]

'it' @ [109:88] ==> value-parameter it: IrValueParameterSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.visitValueParameter.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [109:91] ==> public abstract val descriptor: ParameterDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrValueParameterSymbol[PropertyDescriptorImpl]

'declaration' @ [111:9] ==> value-parameter declaration: IrValueParameter defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.visitValueParameter[ValueParameterDescriptorImpl]

'acceptChildrenVoid' @ [111:21] ==> public fun IrElement.acceptChildrenVoid(visitor: IrElementVisitorVoid): Unit defined in org.jetbrains.kotlin.ir.visitors in file IrElementVisitorVoid.kt[SimpleFunctionDescriptorImpl]

'this' @ [111:40] ==> <this> defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[LazyClassReceiverParameterDescriptor]

'remapSymbol' @ [115:9] ==> protected final inline fun <D : DeclarationDescriptor, B : IrSymbolOwner, reified S : IrBindableSymbol<VariableDescriptor, IrVariable>> remapSymbol(map: MutableMap<IrVariableSymbol, IrVariableSymbol>, owner: IrVariable, createNewSymbol: (IrVariableSymbol) -> IrVariableSymbol): Unit defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : DeclarationDescriptor> -> VariableDescriptor
    <B : IrSymbolOwner> -> IrVariable
    <reified S : IrBindableSymbol<D, B>> -> IrVariableSymbol

'variables' @ [115:21] ==> private final val variables: HashMap<IrVariableSymbol, IrVariableSymbol> /* = HashMap<IrVariableSymbol, IrVariableSymbol> */ defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[PropertyDescriptorImpl]

'declaration' @ [115:32] ==> value-parameter declaration: IrVariable defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.visitVariable[ValueParameterDescriptorImpl]

'IrVariableSymbolImpl' @ [116:13] ==> public constructor IrVariableSymbolImpl(descriptor: VariableDescriptor) defined in org.jetbrains.kotlin.ir.symbols.impl.IrVariableSymbolImpl[ClassConstructorDescriptorImpl]

'descriptorsRemapper' @ [116:34] ==> private final val descriptorsRemapper: DescriptorsRemapper defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[PropertyDescriptorImpl]

'remapDeclaredVariable' @ [116:54] ==> public open fun remapDeclaredVariable(descriptor: VariableDescriptor): VariableDescriptor defined in org.jetbrains.kotlin.ir.util.DescriptorsRemapper[SimpleFunctionDescriptorImpl]

'it' @ [116:76] ==> value-parameter it: IrVariableSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.visitVariable.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [116:79] ==> public abstract val descriptor: VariableDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrVariableSymbol[PropertyDescriptorImpl]

'declaration' @ [118:9] ==> value-parameter declaration: IrVariable defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.visitVariable[ValueParameterDescriptorImpl]

'acceptChildrenVoid' @ [118:21] ==> public fun IrElement.acceptChildrenVoid(visitor: IrElementVisitorVoid): Unit defined in org.jetbrains.kotlin.ir.visitors in file IrElementVisitorVoid.kt[SimpleFunctionDescriptorImpl]

'this' @ [118:40] ==> <this> defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[LazyClassReceiverParameterDescriptor]

'getOrElse' @ [122:13] ==> @InlineOnly public inline fun <K, V> Map<T, T>.getOrElse(key: T, defaultValue: () -> T): T defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> T
    <V> -> T

'symbol' @ [122:23] ==> value-parameter symbol: T defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.getDeclared[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [123:23] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'symbol' @ [123:70] ==> value-parameter symbol: T defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.getDeclared[ValueParameterDescriptorImpl]

'symbol' @ [123:79] ==> value-parameter symbol: T defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.getDeclared[ValueParameterDescriptorImpl]

'descriptor' @ [123:86] ==> public abstract val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrSymbol[PropertyDescriptorImpl]

'getOrElse' @ [127:13] ==> @InlineOnly public inline fun <K, V> Map<T, T>.getOrElse(key: T, defaultValue: () -> T): T defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> T
    <V> -> T

'symbol' @ [127:23] ==> value-parameter symbol: T defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.getReferenced[ValueParameterDescriptorImpl]

'symbol' @ [127:33] ==> value-parameter symbol: T defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.getReferenced[ValueParameterDescriptorImpl]

'classes' @ [129:75] ==> private final val classes: HashMap<IrClassSymbol, IrClassSymbol> /* = HashMap<IrClassSymbol, IrClassSymbol> */ defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[PropertyDescriptorImpl]

'getDeclared' @ [129:83] ==> private final fun <T : IrSymbol> Map<IrClassSymbol, IrClassSymbol>.getDeclared(symbol: IrClassSymbol): IrClassSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrSymbol> -> IrClassSymbol

'symbol' @ [129:95] ==> value-parameter symbol: IrClassSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.getDeclaredClass[ValueParameterDescriptorImpl]

'functions' @ [130:96] ==> private final val functions: HashMap<IrSimpleFunctionSymbol, IrSimpleFunctionSymbol> /* = HashMap<IrSimpleFunctionSymbol, IrSimpleFunctionSymbol> */ defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[PropertyDescriptorImpl]

'getDeclared' @ [130:106] ==> private final fun <T : IrSymbol> Map<IrSimpleFunctionSymbol, IrSimpleFunctionSymbol>.getDeclared(symbol: IrSimpleFunctionSymbol): IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrSymbol> -> IrSimpleFunctionSymbol

'symbol' @ [130:118] ==> value-parameter symbol: IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.getDeclaredFunction[ValueParameterDescriptorImpl]

'fields' @ [131:75] ==> private final val fields: HashMap<IrFieldSymbol, IrFieldSymbol> /* = HashMap<IrFieldSymbol, IrFieldSymbol> */ defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[PropertyDescriptorImpl]

'getDeclared' @ [131:82] ==> private final fun <T : IrSymbol> Map<IrFieldSymbol, IrFieldSymbol>.getDeclared(symbol: IrFieldSymbol): IrFieldSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrSymbol> -> IrFieldSymbol

'symbol' @ [131:94] ==> value-parameter symbol: IrFieldSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.getDeclaredField[ValueParameterDescriptorImpl]

'files' @ [132:72] ==> private final val files: HashMap<IrFileSymbol, IrFileSymbol> /* = HashMap<IrFileSymbol, IrFileSymbol> */ defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[PropertyDescriptorImpl]

'getDeclared' @ [132:78] ==> private final fun <T : IrSymbol> Map<IrFileSymbol, IrFileSymbol>.getDeclared(symbol: IrFileSymbol): IrFileSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrSymbol> -> IrFileSymbol

'symbol' @ [132:90] ==> value-parameter symbol: IrFileSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.getDeclaredFile[ValueParameterDescriptorImpl]

'constructors' @ [133:93] ==> private final val constructors: HashMap<IrConstructorSymbol, IrConstructorSymbol> /* = HashMap<IrConstructorSymbol, IrConstructorSymbol> */ defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[PropertyDescriptorImpl]

'getDeclared' @ [133:106] ==> private final fun <T : IrSymbol> Map<IrConstructorSymbol, IrConstructorSymbol>.getDeclared(symbol: IrConstructorSymbol): IrConstructorSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrSymbol> -> IrConstructorSymbol

'symbol' @ [133:118] ==> value-parameter symbol: IrConstructorSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.getDeclaredConstructor[ValueParameterDescriptorImpl]

'enumEntries' @ [134:87] ==> private final val enumEntries: HashMap<IrEnumEntrySymbol, IrEnumEntrySymbol> /* = HashMap<IrEnumEntrySymbol, IrEnumEntrySymbol> */ defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[PropertyDescriptorImpl]

'getDeclared' @ [134:99] ==> private final fun <T : IrSymbol> Map<IrEnumEntrySymbol, IrEnumEntrySymbol>.getDeclared(symbol: IrEnumEntrySymbol): IrEnumEntrySymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrSymbol> -> IrEnumEntrySymbol

'symbol' @ [134:111] ==> value-parameter symbol: IrEnumEntrySymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.getDeclaredEnumEntry[ValueParameterDescriptorImpl]

'externalPackageFragments' @ [135:129] ==> private final val externalPackageFragments: HashMap<IrExternalPackageFragmentSymbol, IrExternalPackageFragmentSymbol> /* = HashMap<IrExternalPackageFragmentSymbol, IrExternalPackageFragmentSymbol> */ defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[PropertyDescriptorImpl]

'getDeclared' @ [135:154] ==> private final fun <T : IrSymbol> Map<IrExternalPackageFragmentSymbol, IrExternalPackageFragmentSymbol>.getDeclared(symbol: IrExternalPackageFragmentSymbol): IrExternalPackageFragmentSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrSymbol> -> IrExternalPackageFragmentSymbol

'symbol' @ [135:166] ==> value-parameter symbol: IrExternalPackageFragmentSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.getDeclaredExternalPackageFragment[ValueParameterDescriptorImpl]

'variables' @ [136:84] ==> private final val variables: HashMap<IrVariableSymbol, IrVariableSymbol> /* = HashMap<IrVariableSymbol, IrVariableSymbol> */ defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[PropertyDescriptorImpl]

'getDeclared' @ [136:94] ==> private final fun <T : IrSymbol> Map<IrVariableSymbol, IrVariableSymbol>.getDeclared(symbol: IrVariableSymbol): IrVariableSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrSymbol> -> IrVariableSymbol

'symbol' @ [136:106] ==> value-parameter symbol: IrVariableSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.getDeclaredVariable[ValueParameterDescriptorImpl]

'typeParameters' @ [137:99] ==> private final val typeParameters: HashMap<IrTypeParameterSymbol, IrTypeParameterSymbol> /* = HashMap<IrTypeParameterSymbol, IrTypeParameterSymbol> */ defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[PropertyDescriptorImpl]

'getDeclared' @ [137:114] ==> private final fun <T : IrSymbol> Map<IrTypeParameterSymbol, IrTypeParameterSymbol>.getDeclared(symbol: IrTypeParameterSymbol): IrTypeParameterSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrSymbol> -> IrTypeParameterSymbol

'symbol' @ [137:126] ==> value-parameter symbol: IrTypeParameterSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.getDeclaredTypeParameter[ValueParameterDescriptorImpl]

'valueParameters' @ [138:102] ==> private final val valueParameters: HashMap<IrValueParameterSymbol, IrValueParameterSymbol> /* = HashMap<IrValueParameterSymbol, IrValueParameterSymbol> */ defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[PropertyDescriptorImpl]

'getDeclared' @ [138:118] ==> private final fun <T : IrSymbol> Map<IrValueParameterSymbol, IrValueParameterSymbol>.getDeclared(symbol: IrValueParameterSymbol): IrValueParameterSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrSymbol> -> IrValueParameterSymbol

'symbol' @ [138:130] ==> value-parameter symbol: IrValueParameterSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.getDeclaredValueParameter[ValueParameterDescriptorImpl]

'classes' @ [140:77] ==> private final val classes: HashMap<IrClassSymbol, IrClassSymbol> /* = HashMap<IrClassSymbol, IrClassSymbol> */ defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[PropertyDescriptorImpl]

'getReferenced' @ [140:85] ==> private final fun <T : IrSymbol> Map<IrClassSymbol, IrClassSymbol>.getReferenced(symbol: IrClassSymbol): IrClassSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrSymbol> -> IrClassSymbol

'symbol' @ [140:99] ==> value-parameter symbol: IrClassSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.getReferencedClass[ValueParameterDescriptorImpl]

'symbol' @ [141:85] ==> value-parameter symbol: IrClassSymbol? defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.getReferencedClassOrNull[ValueParameterDescriptorImpl]

'let' @ [141:93] ==> @InlineOnly public inline fun <T, R> IrClassSymbol.let(block: (IrClassSymbol) -> IrClassSymbol): IrClassSymbol defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrClassSymbol
    <R> -> IrClassSymbol

'classes' @ [141:99] ==> private final val classes: HashMap<IrClassSymbol, IrClassSymbol> /* = HashMap<IrClassSymbol, IrClassSymbol> */ defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[PropertyDescriptorImpl]

'getReferenced' @ [141:107] ==> private final fun <T : IrSymbol> Map<IrClassSymbol, IrClassSymbol>.getReferenced(symbol: IrClassSymbol): IrClassSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrSymbol> -> IrClassSymbol

'it' @ [141:121] ==> value-parameter it: IrClassSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.getReferencedClassOrNull.<anonymous>[ValueParameterDescriptorImpl]

'enumEntries' @ [142:89] ==> private final val enumEntries: HashMap<IrEnumEntrySymbol, IrEnumEntrySymbol> /* = HashMap<IrEnumEntrySymbol, IrEnumEntrySymbol> */ defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[PropertyDescriptorImpl]

'getReferenced' @ [142:101] ==> private final fun <T : IrSymbol> Map<IrEnumEntrySymbol, IrEnumEntrySymbol>.getReferenced(symbol: IrEnumEntrySymbol): IrEnumEntrySymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrSymbol> -> IrEnumEntrySymbol

'symbol' @ [142:115] ==> value-parameter symbol: IrEnumEntrySymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.getReferencedEnumEntry[ValueParameterDescriptorImpl]

'variables' @ [143:86] ==> private final val variables: HashMap<IrVariableSymbol, IrVariableSymbol> /* = HashMap<IrVariableSymbol, IrVariableSymbol> */ defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[PropertyDescriptorImpl]

'getReferenced' @ [143:96] ==> private final fun <T : IrSymbol> Map<IrVariableSymbol, IrVariableSymbol>.getReferenced(symbol: IrVariableSymbol): IrVariableSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrSymbol> -> IrVariableSymbol

'symbol' @ [143:110] ==> value-parameter symbol: IrVariableSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.getReferencedVariable[ValueParameterDescriptorImpl]

'fields' @ [144:77] ==> private final val fields: HashMap<IrFieldSymbol, IrFieldSymbol> /* = HashMap<IrFieldSymbol, IrFieldSymbol> */ defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[PropertyDescriptorImpl]

'getReferenced' @ [144:84] ==> private final fun <T : IrSymbol> Map<IrFieldSymbol, IrFieldSymbol>.getReferenced(symbol: IrFieldSymbol): IrFieldSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrSymbol> -> IrFieldSymbol

'symbol' @ [144:98] ==> value-parameter symbol: IrFieldSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.getReferencedField[ValueParameterDescriptorImpl]

'constructors' @ [145:95] ==> private final val constructors: HashMap<IrConstructorSymbol, IrConstructorSymbol> /* = HashMap<IrConstructorSymbol, IrConstructorSymbol> */ defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[PropertyDescriptorImpl]

'getReferenced' @ [145:108] ==> private final fun <T : IrSymbol> Map<IrConstructorSymbol, IrConstructorSymbol>.getReferenced(symbol: IrConstructorSymbol): IrConstructorSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrSymbol> -> IrConstructorSymbol

'symbol' @ [145:122] ==> value-parameter symbol: IrConstructorSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.getReferencedConstructor[ValueParameterDescriptorImpl]

'when (symbol) {
                is IrValueParameterSymbol -> valueParameters.getReferenced(symbol)
                is IrVariableSymbol -> variables.getReferenced(symbol)
                else -> throw IllegalArgumentException("Unexpected symbol $symbol ${symbol.descriptor}")
            }' @ [148:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IrValueSymbol, entry1: IrValueSymbol, entry2: IrValueSymbol): IrValueSymbol[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IrValueSymbol

'symbol' @ [148:19] ==> value-parameter symbol: IrValueSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.getReferencedValue[ValueParameterDescriptorImpl]

'valueParameters' @ [149:46] ==> private final val valueParameters: HashMap<IrValueParameterSymbol, IrValueParameterSymbol> /* = HashMap<IrValueParameterSymbol, IrValueParameterSymbol> */ defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[PropertyDescriptorImpl]

'getReferenced' @ [149:62] ==> private final fun <T : IrSymbol> Map<IrValueParameterSymbol, IrValueParameterSymbol>.getReferenced(symbol: IrValueParameterSymbol): IrValueParameterSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrSymbol> -> IrValueParameterSymbol

'symbol' @ [149:76] ==> value-parameter symbol: IrValueSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.getReferencedValue[ValueParameterDescriptorImpl]

'variables' @ [150:40] ==> private final val variables: HashMap<IrVariableSymbol, IrVariableSymbol> /* = HashMap<IrVariableSymbol, IrVariableSymbol> */ defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[PropertyDescriptorImpl]

'getReferenced' @ [150:50] ==> private final fun <T : IrSymbol> Map<IrVariableSymbol, IrVariableSymbol>.getReferenced(symbol: IrVariableSymbol): IrVariableSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrSymbol> -> IrVariableSymbol

'symbol' @ [150:64] ==> value-parameter symbol: IrValueSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.getReferencedValue[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [151:31] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'symbol' @ [151:76] ==> value-parameter symbol: IrValueSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.getReferencedValue[ValueParameterDescriptorImpl]

'symbol' @ [151:85] ==> value-parameter symbol: IrValueSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.getReferencedValue[ValueParameterDescriptorImpl]

'descriptor' @ [151:92] ==> public abstract val descriptor: ValueDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrValueSymbol[PropertyDescriptorImpl]

'when (symbol) {
                is IrSimpleFunctionSymbol -> functions.getReferenced(symbol)
                is IrConstructorSymbol -> constructors.getReferenced(symbol)
                else -> throw IllegalArgumentException("Unexpected symbol $symbol ${symbol.descriptor}")
            }' @ [155:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IrFunctionSymbol, entry1: IrFunctionSymbol, entry2: IrFunctionSymbol): IrFunctionSymbol[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IrFunctionSymbol

'symbol' @ [155:19] ==> value-parameter symbol: IrFunctionSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.getReferencedFunction[ValueParameterDescriptorImpl]

'functions' @ [156:46] ==> private final val functions: HashMap<IrSimpleFunctionSymbol, IrSimpleFunctionSymbol> /* = HashMap<IrSimpleFunctionSymbol, IrSimpleFunctionSymbol> */ defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[PropertyDescriptorImpl]

'getReferenced' @ [156:56] ==> private final fun <T : IrSymbol> Map<IrSimpleFunctionSymbol, IrSimpleFunctionSymbol>.getReferenced(symbol: IrSimpleFunctionSymbol): IrSimpleFunctionSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrSymbol> -> IrSimpleFunctionSymbol

'symbol' @ [156:70] ==> value-parameter symbol: IrFunctionSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.getReferencedFunction[ValueParameterDescriptorImpl]

'constructors' @ [157:43] ==> private final val constructors: HashMap<IrConstructorSymbol, IrConstructorSymbol> /* = HashMap<IrConstructorSymbol, IrConstructorSymbol> */ defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[PropertyDescriptorImpl]

'getReferenced' @ [157:56] ==> private final fun <T : IrSymbol> Map<IrConstructorSymbol, IrConstructorSymbol>.getReferenced(symbol: IrConstructorSymbol): IrConstructorSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrSymbol> -> IrConstructorSymbol

'symbol' @ [157:70] ==> value-parameter symbol: IrFunctionSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.getReferencedFunction[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [158:31] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'symbol' @ [158:76] ==> value-parameter symbol: IrFunctionSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.getReferencedFunction[ValueParameterDescriptorImpl]

'symbol' @ [158:85] ==> value-parameter symbol: IrFunctionSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.getReferencedFunction[ValueParameterDescriptorImpl]

'descriptor' @ [158:92] ==> public abstract val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrFunctionSymbol[PropertyDescriptorImpl]

'when (symbol) {
                is IrClassSymbol -> classes.getReferenced(symbol)
                is IrTypeParameterSymbol -> typeParameters.getReferenced(symbol)
                else -> throw IllegalArgumentException("Unexpected symbol $symbol ${symbol.descriptor}")
            }' @ [162:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IrClassifierSymbol, entry1: IrClassifierSymbol, entry2: IrClassifierSymbol): IrClassifierSymbol[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IrClassifierSymbol

'symbol' @ [162:19] ==> value-parameter symbol: IrClassifierSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.getReferencedClassifier[ValueParameterDescriptorImpl]

'classes' @ [163:37] ==> private final val classes: HashMap<IrClassSymbol, IrClassSymbol> /* = HashMap<IrClassSymbol, IrClassSymbol> */ defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[PropertyDescriptorImpl]

'getReferenced' @ [163:45] ==> private final fun <T : IrSymbol> Map<IrClassSymbol, IrClassSymbol>.getReferenced(symbol: IrClassSymbol): IrClassSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrSymbol> -> IrClassSymbol

'symbol' @ [163:59] ==> value-parameter symbol: IrClassifierSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.getReferencedClassifier[ValueParameterDescriptorImpl]

'typeParameters' @ [164:45] ==> private final val typeParameters: HashMap<IrTypeParameterSymbol, IrTypeParameterSymbol> /* = HashMap<IrTypeParameterSymbol, IrTypeParameterSymbol> */ defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[PropertyDescriptorImpl]

'getReferenced' @ [164:60] ==> private final fun <T : IrSymbol> Map<IrTypeParameterSymbol, IrTypeParameterSymbol>.getReferenced(symbol: IrTypeParameterSymbol): IrTypeParameterSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : IrSymbol> -> IrTypeParameterSymbol

'symbol' @ [164:74] ==> value-parameter symbol: IrClassifierSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.getReferencedClassifier[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [165:31] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'symbol' @ [165:76] ==> value-parameter symbol: IrClassifierSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.getReferencedClassifier[ValueParameterDescriptorImpl]

'symbol' @ [165:85] ==> value-parameter symbol: IrClassifierSymbol defined in org.jetbrains.kotlin.ir.util.DeepCopySymbolsRemapper.getReferencedClassifier[ValueParameterDescriptorImpl]

'descriptor' @ [165:92] ==> public abstract val descriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.ir.symbols.IrClassifierSymbol[PropertyDescriptorImpl]

