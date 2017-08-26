'JvmStatic' @ [45:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'readModuleFromProto' @ [53:9] ==> @JvmStatic public final fun readModuleFromProto(jsModule: JsModuleDescriptor<KotlinJavaScriptLibraryParts>, storageManager: StorageManager, module: ModuleDescriptor, configuration: DeserializationConfiguration, lookupTracker: LookupTracker): JsModuleDescriptor<PackageFragmentProvider?> defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil[SimpleFunctionDescriptorImpl]

'readModuleAsProto' @ [53:29] ==> @JvmStatic public final fun readModuleAsProto(metadata: ByteArray, name: String): JsModuleDescriptor<KotlinJavaScriptLibraryParts> defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil[SimpleFunctionDescriptorImpl]

'metadata' @ [53:47] ==> value-parameter metadata: ByteArray defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.readModule[ValueParameterDescriptorImpl]

'module' @ [53:57] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.readModule[ValueParameterDescriptorImpl]

'name' @ [53:64] ==> public final val ModuleDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [53:69] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'storageManager' @ [53:82] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.readModule[ValueParameterDescriptorImpl]

'module' @ [53:98] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.readModule[ValueParameterDescriptorImpl]

'configuration' @ [53:106] ==> value-parameter configuration: DeserializationConfiguration defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.readModule[ValueParameterDescriptorImpl]

'lookupTracker' @ [53:121] ==> value-parameter lookupTracker: LookupTracker defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.readModule[ValueParameterDescriptorImpl]

'JvmStatic' @ [55:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'metadata' @ [57:9] ==> value-parameter metadata: ByteArray defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.readModuleAsProto[ValueParameterDescriptorImpl]

'deserializeToLibraryParts' @ [57:18] ==> private final fun ByteArray.deserializeToLibraryParts(name: String): JsModuleDescriptor<KotlinJavaScriptLibraryParts> defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil[SimpleFunctionDescriptorImpl]

'name' @ [57:44] ==> value-parameter name: String defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.readModuleAsProto[ValueParameterDescriptorImpl]

'JvmStatic' @ [59:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'component1' @ [66:14] ==> public final operator fun component1(): JsProtoBuf.Header defined in org.jetbrains.kotlin.serialization.js.KotlinJavaScriptLibraryParts[SimpleFunctionDescriptorImpl]

'component2' @ [66:22] ==> public final operator fun component2(): List<ProtoBuf.PackageFragment> defined in org.jetbrains.kotlin.serialization.js.KotlinJavaScriptLibraryParts[SimpleFunctionDescriptorImpl]

'jsModule' @ [66:47] ==> value-parameter jsModule: JsModuleDescriptor<KotlinJavaScriptLibraryParts> defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.readModuleFromProto[ValueParameterDescriptorImpl]

'data' @ [66:56] ==> public final val data: KotlinJavaScriptLibraryParts defined in org.jetbrains.kotlin.serialization.js.JsModuleDescriptor[PropertyDescriptorImpl]

'jsModule' @ [67:16] ==> value-parameter jsModule: JsModuleDescriptor<KotlinJavaScriptLibraryParts> defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.readModuleFromProto[ValueParameterDescriptorImpl]

'copy' @ [67:25] ==> public final fun <S> copy(newData: PackageFragmentProvider): JsModuleDescriptor<PackageFragmentProvider> defined in org.jetbrains.kotlin.serialization.js.JsModuleDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <S> -> PackageFragmentProvider

'createKotlinJavascriptPackageFragmentProvider' @ [67:30] ==> public fun createKotlinJavascriptPackageFragmentProvider(storageManager: StorageManager, module: ModuleDescriptor, header: JsProtoBuf.Header, packageFragmentProtos: List<ProtoBuf.PackageFragment>, configuration: DeserializationConfiguration, lookupTracker: LookupTracker): PackageFragmentProvider defined in org.jetbrains.kotlin.serialization.js in file kotlinJavascriptPackageFragmentProvider.kt[SimpleFunctionDescriptorImpl]

'storageManager' @ [68:17] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.readModuleFromProto[ValueParameterDescriptorImpl]

'module' @ [68:33] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.readModuleFromProto[ValueParameterDescriptorImpl]

'header' @ [68:41] ==> val header: JsProtoBuf.Header defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.readModuleFromProto[LocalVariableDescriptor]

'packageFragmentProtos' @ [68:49] ==> val packageFragmentProtos: List<ProtoBuf.PackageFragment> defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.readModuleFromProto[LocalVariableDescriptor]

'configuration' @ [68:72] ==> value-parameter configuration: DeserializationConfiguration defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.readModuleFromProto[ValueParameterDescriptorImpl]

'lookupTracker' @ [68:87] ==> value-parameter lookupTracker: LookupTracker defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.readModuleFromProto[ValueParameterDescriptorImpl]

'metadata' @ [79:26] ==> value-parameter metadata: PackagesWithHeaderMetadata defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.readDescriptors[ValueParameterDescriptorImpl]

'packages' @ [79:35] ==> public final val packages: List<ByteArray> defined in org.jetbrains.kotlin.serialization.js.PackagesWithHeaderMetadata[PropertyDescriptorImpl]

'map' @ [79:44] ==> public inline fun <T, R> Iterable<ByteArray>.map(transform: (ByteArray) -> (ProtoBuf.PackageFragment..ProtoBuf.PackageFragment?)): List<(ProtoBuf.PackageFragment..ProtoBuf.PackageFragment?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ByteArray
    <R> -> (org.jetbrains.kotlin.serialization.ProtoBuf.PackageFragment..org.jetbrains.kotlin.serialization.ProtoBuf.PackageFragment?)

'parseFrom' @ [80:38] ==> public open fun parseFrom(p0: (ByteArray..ByteArray?), p1: (ExtensionRegistryLite..ExtensionRegistryLite?)): (ProtoBuf.PackageFragment..ProtoBuf.PackageFragment?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.PackageFragment[JavaMethodDescriptor]

'it' @ [80:48] ==> value-parameter it: ByteArray defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.readDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'extensionRegistry' @ [80:73] ==> public final val extensionRegistry: ExtensionRegistryLite defined in org.jetbrains.kotlin.serialization.js.JsSerializerProtocol[DeserializedPropertyDescriptor]

'parseFrom' @ [82:45] ==> public open fun parseFrom(input: (CodedInputStream..CodedInputStream?), extensionRegistry: (ExtensionRegistryLite..ExtensionRegistryLite?)): (JsProtoBuf.Header..JsProtoBuf.Header?) defined in org.jetbrains.kotlin.serialization.js.JsProtoBuf.Header[JavaMethodDescriptor]

'newInstance' @ [82:72] ==> public open fun newInstance(p0: (ByteArray..ByteArray?)): (CodedInputStream..CodedInputStream?) defined in org.jetbrains.kotlin.protobuf.CodedInputStream[JavaMethodDescriptor]

'metadata' @ [82:84] ==> value-parameter metadata: PackagesWithHeaderMetadata defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.readDescriptors[ValueParameterDescriptorImpl]

'header' @ [82:93] ==> public final val header: ByteArray defined in org.jetbrains.kotlin.serialization.js.PackagesWithHeaderMetadata[PropertyDescriptorImpl]

'extensionRegistry' @ [82:123] ==> public final val extensionRegistry: ExtensionRegistryLite defined in org.jetbrains.kotlin.serialization.js.JsSerializerProtocol[DeserializedPropertyDescriptor]

'createKotlinJavascriptPackageFragmentProvider' @ [83:16] ==> public fun createKotlinJavascriptPackageFragmentProvider(storageManager: StorageManager, module: ModuleDescriptor, header: JsProtoBuf.Header, packageFragmentProtos: List<ProtoBuf.PackageFragment>, configuration: DeserializationConfiguration, lookupTracker: LookupTracker): PackageFragmentProvider defined in org.jetbrains.kotlin.serialization.js in file kotlinJavascriptPackageFragmentProvider.kt[SimpleFunctionDescriptorImpl]

'storageManager' @ [83:62] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.readDescriptors[ValueParameterDescriptorImpl]

'module' @ [83:78] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.readDescriptors[ValueParameterDescriptorImpl]

'headerProto' @ [83:86] ==> val headerProto: (JsProtoBuf.Header..JsProtoBuf.Header?) defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.readDescriptors[LocalVariableDescriptor]

'scopeProto' @ [83:99] ==> val scopeProto: List<(ProtoBuf.PackageFragment..ProtoBuf.PackageFragment?)> defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.readDescriptors[LocalVariableDescriptor]

'configuration' @ [83:111] ==> value-parameter configuration: DeserializationConfiguration defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.readDescriptors[ValueParameterDescriptorImpl]

'lookupTracker' @ [83:126] ==> value-parameter lookupTracker: LookupTracker defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.readDescriptors[ValueParameterDescriptorImpl]

'newBuilder' @ [92:42] ==> public open fun newBuilder(): (JsProtoBuf.Library.Builder..JsProtoBuf.Library.Builder?) defined in org.jetbrains.kotlin.serialization.js.JsProtoBuf.Library[JavaMethodDescriptor]

'when (moduleKind) {
            ModuleKind.PLAIN -> JsProtoBuf.Library.Kind.PLAIN
            ModuleKind.AMD -> JsProtoBuf.Library.Kind.AMD
            ModuleKind.COMMON_JS -> JsProtoBuf.Library.Kind.COMMON_JS
            ModuleKind.UMD -> JsProtoBuf.Library.Kind.UMD
        }' @ [94:31] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: JsProtoBuf.Library.Kind, entry1: JsProtoBuf.Library.Kind, entry2: JsProtoBuf.Library.Kind, entry3: JsProtoBuf.Library.Kind): JsProtoBuf.Library.Kind[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Kind

'moduleKind' @ [94:37] ==> value-parameter moduleKind: ModuleKind defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeMetadata[ValueParameterDescriptorImpl]

'PLAIN' @ [95:24] ==> enum entry PLAIN defined in org.jetbrains.kotlin.serialization.js.ModuleKind[FakeCallableDescriptorForObject]

'PLAIN' @ [95:57] ==> enum entry PLAIN defined in org.jetbrains.kotlin.serialization.js.JsProtoBuf.Library.Kind[FakeCallableDescriptorForObject]

'AMD' @ [96:24] ==> enum entry AMD defined in org.jetbrains.kotlin.serialization.js.ModuleKind[FakeCallableDescriptorForObject]

'AMD' @ [96:55] ==> enum entry AMD defined in org.jetbrains.kotlin.serialization.js.JsProtoBuf.Library.Kind[FakeCallableDescriptorForObject]

'COMMON_JS' @ [97:24] ==> enum entry COMMON_JS defined in org.jetbrains.kotlin.serialization.js.ModuleKind[FakeCallableDescriptorForObject]

'COMMON_JS' @ [97:61] ==> enum entry COMMON_JS defined in org.jetbrains.kotlin.serialization.js.JsProtoBuf.Library.Kind[FakeCallableDescriptorForObject]

'UMD' @ [98:24] ==> enum entry UMD defined in org.jetbrains.kotlin.serialization.js.ModuleKind[FakeCallableDescriptorForObject]

'UMD' @ [98:55] ==> enum entry UMD defined in org.jetbrains.kotlin.serialization.js.JsProtoBuf.Library.Kind[FakeCallableDescriptorForObject]

'builder' @ [100:13] ==> val builder: (JsProtoBuf.Library.Builder..JsProtoBuf.Library.Builder?) defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeMetadata[LocalVariableDescriptor]

'kind' @ [100:21] ==> public final var JsProtoBuf.Library.Builder.kind: (JsProtoBuf.Library.Kind..JsProtoBuf.Library.Kind?)[MyPropertyDescriptor]

'moduleProtoKind' @ [100:29] ==> val moduleProtoKind: JsProtoBuf.Library.Kind defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeMetadata[LocalVariableDescriptor]

'builder' @ [101:13] ==> val builder: (JsProtoBuf.Library.Builder..JsProtoBuf.Library.Builder?) defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeMetadata[LocalVariableDescriptor]

'kind' @ [101:21] ==> public final var JsProtoBuf.Library.Builder.kind: (JsProtoBuf.Library.Kind..JsProtoBuf.Library.Kind?)[MyPropertyDescriptor]

'moduleProtoKind' @ [101:28] ==> val moduleProtoKind: JsProtoBuf.Library.Kind defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeMetadata[LocalVariableDescriptor]

'importedModules' @ [104:9] ==> value-parameter importedModules: List<String> defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeMetadata[ValueParameterDescriptorImpl]

'forEach' @ [104:25] ==> @HidesMembers public inline fun <T> Iterable<String>.forEach(action: (String) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'builder' @ [104:35] ==> val builder: (JsProtoBuf.Library.Builder..JsProtoBuf.Library.Builder?) defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeMetadata[LocalVariableDescriptor]

'addImportedModule' @ [104:43] ==> public open fun addImportedModule(value: (String..String?)): (JsProtoBuf.Library.Builder..JsProtoBuf.Library.Builder?) defined in org.jetbrains.kotlin.serialization.js.JsProtoBuf.Library.Builder[JavaMethodDescriptor]

'it' @ [104:61] ==> value-parameter it: String defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeMetadata.<anonymous>[ValueParameterDescriptorImpl]

'getPackagesFqNames' @ [106:24] ==> private final fun getPackagesFqNames(module: ModuleDescriptor): Set<FqName> defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil[SimpleFunctionDescriptorImpl]

'module' @ [106:43] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeMetadata[ValueParameterDescriptorImpl]

'serializePackageFragment' @ [107:28] ==> public final fun serializePackageFragment(bindingContext: BindingContext, module: ModuleDescriptor, fqName: FqName): ProtoBuf.PackageFragment defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil[SimpleFunctionDescriptorImpl]

'bindingContext' @ [107:53] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeMetadata[ValueParameterDescriptorImpl]

'module' @ [107:69] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeMetadata[ValueParameterDescriptorImpl]

'fqName' @ [107:77] ==> val fqName: FqName defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeMetadata[LocalVariableDescriptor]

'fragment' @ [108:17] ==> val fragment: ProtoBuf.PackageFragment defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeMetadata[LocalVariableDescriptor]

'hasPackage' @ [108:26] ==> public open fun hasPackage(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.PackageFragment[JavaMethodDescriptor]

'fragment' @ [108:42] ==> val fragment: ProtoBuf.PackageFragment defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeMetadata[LocalVariableDescriptor]

'class_Count' @ [108:51] ==> public final val ProtoBuf.PackageFragment.class_Count: Int[MyPropertyDescriptor]

'builder' @ [109:17] ==> val builder: (JsProtoBuf.Library.Builder..JsProtoBuf.Library.Builder?) defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeMetadata[LocalVariableDescriptor]

'addPackageFragment' @ [109:25] ==> public open fun addPackageFragment(value: (ProtoBuf.PackageFragment..ProtoBuf.PackageFragment?)): (JsProtoBuf.Library.Builder..JsProtoBuf.Library.Builder?) defined in org.jetbrains.kotlin.serialization.js.JsProtoBuf.Library.Builder[JavaMethodDescriptor]

'fragment' @ [109:44] ==> val fragment: ProtoBuf.PackageFragment defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeMetadata[LocalVariableDescriptor]

'builder' @ [113:16] ==> val builder: (JsProtoBuf.Library.Builder..JsProtoBuf.Library.Builder?) defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeMetadata[LocalVariableDescriptor]

'build' @ [113:24] ==> public open fun build(): (JsProtoBuf.Library..JsProtoBuf.Library?) defined in org.jetbrains.kotlin.serialization.js.JsProtoBuf.Library.Builder[JavaMethodDescriptor]

'KotlinJavascriptMetadataUtils' @ [117:13] ==> public object KotlinJavascriptMetadataUtils defined in org.jetbrains.kotlin.utils[FakeCallableDescriptorForObject]

'formatMetadataAsString' @ [117:43] ==> public final fun formatMetadataAsString(moduleName: String, content: ByteArray): String defined in org.jetbrains.kotlin.utils.KotlinJavascriptMetadataUtils[DeserializedSimpleFunctionDescriptor]

'jsDescriptor' @ [117:66] ==> value-parameter jsDescriptor: JsModuleDescriptor<ModuleDescriptor> defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.metadataAsString[ValueParameterDescriptorImpl]

'name' @ [117:79] ==> public final val name: String defined in org.jetbrains.kotlin.serialization.js.JsModuleDescriptor[PropertyDescriptorImpl]

'jsDescriptor' @ [117:85] ==> value-parameter jsDescriptor: JsModuleDescriptor<ModuleDescriptor> defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.metadataAsString[ValueParameterDescriptorImpl]

'serializeToBinaryMetadata' @ [117:98] ==> private final fun JsModuleDescriptor<ModuleDescriptor>.serializeToBinaryMetadata(bindingContext: BindingContext): ByteArray defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil[SimpleFunctionDescriptorImpl]

'bindingContext' @ [117:124] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.metadataAsString[ValueParameterDescriptorImpl]

'module' @ [120:27] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializePackageFragment[ValueParameterDescriptorImpl]

'getPackage' @ [120:34] ==> public abstract fun getPackage(fqName: FqName): PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedSimpleFunctionDescriptor]

'fqName' @ [120:45] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializePackageFragment[ValueParameterDescriptorImpl]

'serializeDescriptors' @ [121:16] ==> public final fun serializeDescriptors(bindingContext: BindingContext, module: ModuleDescriptor, scope: Collection<DeclarationDescriptor>, fqName: FqName): ProtoBuf.PackageFragment defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil[SimpleFunctionDescriptorImpl]

'bindingContext' @ [121:37] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializePackageFragment[ValueParameterDescriptorImpl]

'module' @ [121:53] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializePackageFragment[ValueParameterDescriptorImpl]

'packageView' @ [121:61] ==> val packageView: PackageViewDescriptor defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializePackageFragment[LocalVariableDescriptor]

'memberScope' @ [121:73] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedPropertyDescriptor]

'getContributedDescriptors' @ [121:85] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'fqName' @ [121:114] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializePackageFragment[ValueParameterDescriptorImpl]

'newBuilder' @ [130:48] ==> public open fun newBuilder(): (ProtoBuf.PackageFragment.Builder..ProtoBuf.PackageFragment.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.PackageFragment[JavaMethodDescriptor]

'!=' @ [133:58] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedSimpleFunctionDescriptor]

'getContainingModule' @ [133:74] ==> @NotNull public open fun getContainingModule(@NotNull p0: DeclarationDescriptor): ModuleDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'it' @ [133:94] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'module' @ [133:101] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeDescriptors[ValueParameterDescriptorImpl]

'it' @ [133:112] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [133:138] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'isHeader' @ [133:141] ==> public final val MemberDescriptor.isHeader: Boolean[MyPropertyDescriptor]

'KotlinFileRegistry' @ [135:28] ==> public constructor KotlinFileRegistry() defined in org.jetbrains.kotlin.serialization.js.KotlinFileRegistry[ClassConstructorDescriptorImpl]

'KotlinJavascriptSerializerExtension' @ [136:35] ==> public constructor KotlinJavascriptSerializerExtension(fileRegistry: KotlinFileRegistry) defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerExtension[ClassConstructorDescriptorImpl]

'fileRegistry' @ [136:71] ==> val fileRegistry: KotlinFileRegistry defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeDescriptors[LocalVariableDescriptor]

'DescriptorSerializer' @ [137:26] ==> public companion object defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[FakeCallableDescriptorForObject]

'createTopLevel' @ [137:47] ==> @JvmStatic public final fun createTopLevel(extension: SerializerExtension): DescriptorSerializer defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.Companion[DeserializedSimpleFunctionDescriptor]

'serializerExtension' @ [137:62] ==> val serializerExtension: KotlinJavascriptSerializerExtension defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeDescriptors[LocalVariableDescriptor]

'DescriptorSerializer' @ [139:32] ==> public companion object defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[FakeCallableDescriptorForObject]

'sort' @ [139:53] ==> public final fun <T : DeclarationDescriptor> sort(descriptors: Collection<DeclarationDescriptor>): List<DeclarationDescriptor> defined in org.jetbrains.kotlin.serialization.DescriptorSerializer.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : DeclarationDescriptor> -> DeclarationDescriptor

'scope' @ [139:58] ==> value-parameter scope: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeDescriptors[ValueParameterDescriptorImpl]

'filterIsInstance' @ [139:65] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<ClassDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> ClassDescriptor

'invoke' @ [143:21] ==> public abstract operator fun invoke(p1: DeclarationDescriptor): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'classDescriptor' @ [143:26] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeDescriptors.serializeClasses.serializeClass[ValueParameterDescriptorImpl]

'serializer' @ [144:34] ==> val serializer: DescriptorSerializer defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeDescriptors[LocalVariableDescriptor]

'classProto' @ [144:45] ==> public final fun classProto(classDescriptor: ClassDescriptor): ProtoBuf.Class.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[DeserializedSimpleFunctionDescriptor]

'classDescriptor' @ [144:56] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeDescriptors.serializeClasses.serializeClass[ValueParameterDescriptorImpl]

'build' @ [144:73] ==> public open fun build(): (ProtoBuf.Class..ProtoBuf.Class?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class.Builder[JavaMethodDescriptor]

'error' @ [144:84] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'classDescriptor' @ [144:114] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeDescriptors.serializeClasses.serializeClass[ValueParameterDescriptorImpl]

'builder' @ [145:17] ==> val builder: (ProtoBuf.PackageFragment.Builder..ProtoBuf.PackageFragment.Builder?) defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeDescriptors[LocalVariableDescriptor]

'addClass_' @ [145:25] ==> public open fun addClass_(p0: (ProtoBuf.Class..ProtoBuf.Class?)): (ProtoBuf.PackageFragment.Builder..ProtoBuf.PackageFragment.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.PackageFragment.Builder[JavaMethodDescriptor]

'classProto' @ [145:35] ==> val classProto: ProtoBuf.Class defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeDescriptors.serializeClasses.serializeClass[LocalVariableDescriptor]

'serializeClasses' @ [146:17] ==> local final fun serializeClasses(descriptors: Collection<DeclarationDescriptor>): Unit defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeDescriptors[SimpleFunctionDescriptorImpl]

'classDescriptor' @ [146:34] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeDescriptors.serializeClasses.serializeClass[ValueParameterDescriptorImpl]

'unsubstitutedInnerClassesScope' @ [146:50] ==> public final val ClassDescriptor.unsubstitutedInnerClassesScope: MemberScope[MyPropertyDescriptor]

'getContributedDescriptors' @ [146:81] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'descriptors' @ [149:32] ==> value-parameter descriptors: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeDescriptors.serializeClasses[ValueParameterDescriptorImpl]

'descriptor' @ [150:21] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeDescriptors.serializeClasses[LocalVariableDescriptor]

'serializeClass' @ [151:21] ==> local final fun serializeClass(classDescriptor: ClassDescriptor): Unit defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeDescriptors.serializeClasses[SimpleFunctionDescriptorImpl]

'descriptor' @ [151:36] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeDescriptors.serializeClasses[LocalVariableDescriptor]

'serializeClasses' @ [156:9] ==> local final fun serializeClasses(descriptors: Collection<DeclarationDescriptor>): Unit defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeDescriptors[SimpleFunctionDescriptorImpl]

'classDescriptors' @ [156:26] ==> val classDescriptors: List<ClassDescriptor> defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeDescriptors[LocalVariableDescriptor]

'serializerExtension' @ [158:27] ==> val serializerExtension: KotlinJavascriptSerializerExtension defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeDescriptors[LocalVariableDescriptor]

'stringTable' @ [158:47] ==> public open val stringTable: JavaScriptStringTable defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializerExtension[PropertyDescriptorImpl]

'scope' @ [160:23] ==> value-parameter scope: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeDescriptors[ValueParameterDescriptorImpl]

'filterNot' @ [160:29] ==> public inline fun <T> Iterable<DeclarationDescriptor>.filterNot(predicate: (DeclarationDescriptor) -> Boolean): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'skip' @ [160:39] ==> val skip: (DeclarationDescriptor) -> Boolean defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeDescriptors[LocalVariableDescriptor]

'builder' @ [161:9] ==> val builder: (ProtoBuf.PackageFragment.Builder..ProtoBuf.PackageFragment.Builder?) defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeDescriptors[LocalVariableDescriptor]

'`package`' @ [161:17] ==> public final var ProtoBuf.PackageFragment.Builder.`package`: (ProtoBuf.Package..ProtoBuf.Package?)[MyPropertyDescriptor]

'serializer' @ [161:29] ==> val serializer: DescriptorSerializer defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeDescriptors[LocalVariableDescriptor]

'packagePartProto' @ [161:40] ==> public final fun packagePartProto(packageFqName: FqName, members: Collection<DeclarationDescriptor>): ProtoBuf.Package.Builder defined in org.jetbrains.kotlin.serialization.DescriptorSerializer[DeserializedSimpleFunctionDescriptor]

'fqName' @ [161:57] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeDescriptors[ValueParameterDescriptorImpl]

'members' @ [161:65] ==> val members: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeDescriptors[LocalVariableDescriptor]

'build' @ [161:74] ==> public open fun build(): (ProtoBuf.Package..ProtoBuf.Package?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Package.Builder[JavaMethodDescriptor]

'builder' @ [163:9] ==> val builder: (ProtoBuf.PackageFragment.Builder..ProtoBuf.PackageFragment.Builder?) defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeDescriptors[LocalVariableDescriptor]

'setExtension' @ [163:17] ==> public final fun <Type : (Any..Any?)> setExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.PackageFragment..ProtoBuf.PackageFragment?), (JsProtoBuf.Files..JsProtoBuf.Files?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.PackageFragment..ProtoBuf.PackageFragment?), (JsProtoBuf.Files..JsProtoBuf.Files?)>?), p1: (JsProtoBuf.Files..JsProtoBuf.Files?)): (ProtoBuf.PackageFragment.Builder..ProtoBuf.PackageFragment.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.PackageFragment.Builder[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> (org.jetbrains.kotlin.serialization.js.JsProtoBuf.Files..org.jetbrains.kotlin.serialization.js.JsProtoBuf.Files?)

'packageFragmentFiles' @ [164:28] ==> public final val packageFragmentFiles: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.PackageFragment..ProtoBuf.PackageFragment?), (JsProtoBuf.Files..JsProtoBuf.Files?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.PackageFragment..ProtoBuf.PackageFragment?), (JsProtoBuf.Files..JsProtoBuf.Files?)>?) defined in org.jetbrains.kotlin.serialization.js.JsProtoBuf[JavaPropertyDescriptor]

'serializeFiles' @ [165:17] ==> private final fun serializeFiles(fileRegistry: KotlinFileRegistry, bindingContext: BindingContext, serializer: AnnotationSerializer): JsProtoBuf.Files defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil[SimpleFunctionDescriptorImpl]

'fileRegistry' @ [165:32] ==> val fileRegistry: KotlinFileRegistry defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeDescriptors[LocalVariableDescriptor]

'bindingContext' @ [165:46] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeDescriptors[ValueParameterDescriptorImpl]

'AnnotationSerializer' @ [165:62] ==> public constructor AnnotationSerializer(stringTable: StringTable) defined in org.jetbrains.kotlin.serialization.AnnotationSerializer[DeserializedClassConstructorDescriptor]

'stringTable' @ [165:83] ==> val stringTable: JavaScriptStringTable defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeDescriptors[LocalVariableDescriptor]

'component1' @ [168:14] ==> public final operator fun component1(): ProtoBuf.StringTable defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [168:23] ==> public final operator fun component2(): ProtoBuf.QualifiedNameTable defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'stringTable' @ [168:41] ==> val stringTable: JavaScriptStringTable defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeDescriptors[LocalVariableDescriptor]

'buildProto' @ [168:53] ==> public final fun buildProto(): Pair<ProtoBuf.StringTable, ProtoBuf.QualifiedNameTable> defined in org.jetbrains.kotlin.serialization.js.JavaScriptStringTable[DeserializedSimpleFunctionDescriptor]

'builder' @ [169:9] ==> val builder: (ProtoBuf.PackageFragment.Builder..ProtoBuf.PackageFragment.Builder?) defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeDescriptors[LocalVariableDescriptor]

'strings' @ [169:17] ==> public final var ProtoBuf.PackageFragment.Builder.strings: (ProtoBuf.StringTable..ProtoBuf.StringTable?)[MyPropertyDescriptor]

'strings' @ [169:27] ==> val strings: ProtoBuf.StringTable defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeDescriptors[LocalVariableDescriptor]

'builder' @ [170:9] ==> val builder: (ProtoBuf.PackageFragment.Builder..ProtoBuf.PackageFragment.Builder?) defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeDescriptors[LocalVariableDescriptor]

'qualifiedNames' @ [170:17] ==> public final var ProtoBuf.PackageFragment.Builder.qualifiedNames: (ProtoBuf.QualifiedNameTable..ProtoBuf.QualifiedNameTable?)[MyPropertyDescriptor]

'qualifiedNames' @ [170:34] ==> val qualifiedNames: ProtoBuf.QualifiedNameTable defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeDescriptors[LocalVariableDescriptor]

'builder' @ [172:16] ==> val builder: (ProtoBuf.PackageFragment.Builder..ProtoBuf.PackageFragment.Builder?) defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeDescriptors[LocalVariableDescriptor]

'build' @ [172:24] ==> public open fun build(): (ProtoBuf.PackageFragment..ProtoBuf.PackageFragment?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.PackageFragment.Builder[JavaMethodDescriptor]

'newBuilder' @ [180:43] ==> public open fun newBuilder(): (JsProtoBuf.Files.Builder..JsProtoBuf.Files.Builder?) defined in org.jetbrains.kotlin.serialization.js.JsProtoBuf.Files[JavaMethodDescriptor]

'component1' @ [181:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<KtFile, Int>.component1(): KtFile defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtFile
    <V> -> Int

'component2' @ [181:21] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<KtFile, Int>.component2(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtFile
    <V> -> Int

'fileRegistry' @ [181:28] ==> value-parameter fileRegistry: KotlinFileRegistry defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeFiles[ValueParameterDescriptorImpl]

'fileIds' @ [181:41] ==> public final val fileIds: Map<KtFile, Int> defined in org.jetbrains.kotlin.serialization.js.KotlinFileRegistry[PropertyDescriptorImpl]

'entries' @ [181:49] ==> public abstract val entries: Set<Map.Entry<KtFile, Int>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'sortedBy' @ [181:57] ==> public inline fun <T, R : Comparable<Int>> Iterable<Map.Entry<KtFile, Int>>.sortedBy(crossinline selector: (Map.Entry<KtFile, Int>) -> Int?): List<Map.Entry<KtFile, Int>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Entry<KtFile, Int>
    <R : Comparable<R>> -> Int

'it' @ [181:68] ==> value-parameter it: Map.Entry<KtFile, Int> defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeFiles.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [181:71] ==> public abstract val value: Int defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'newBuilder' @ [182:45] ==> public open fun newBuilder(): (JsProtoBuf.File.Builder..JsProtoBuf.File.Builder?) defined in org.jetbrains.kotlin.serialization.js.JsProtoBuf.File[JavaMethodDescriptor]

'id' @ [183:17] ==> val id: Int defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeFiles[LocalVariableDescriptor]

'filesProto' @ [183:23] ==> val filesProto: (JsProtoBuf.Files.Builder..JsProtoBuf.Files.Builder?) defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeFiles[LocalVariableDescriptor]

'fileCount' @ [183:34] ==> public final val JsProtoBuf.Files.Builder.fileCount: Int[MyPropertyDescriptor]

'fileProto' @ [184:17] ==> val fileProto: (JsProtoBuf.File.Builder..JsProtoBuf.File.Builder?) defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeFiles[LocalVariableDescriptor]

'id' @ [184:27] ==> public final var JsProtoBuf.File.Builder.id: Int[MyPropertyDescriptor]

'id' @ [184:32] ==> val id: Int defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeFiles[LocalVariableDescriptor]

'file' @ [186:35] ==> val file: KtFile defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeFiles[LocalVariableDescriptor]

'annotationEntries' @ [186:40] ==> public final val KtFile.annotationEntries: (MutableList<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>)[MyPropertyDescriptor]

'bindingContext' @ [187:34] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeFiles[ValueParameterDescriptorImpl]

'ANNOTATION' @ [187:64] ==> public final val ANNOTATION: (WritableSlice<(KtAnnotationEntry..KtAnnotationEntry?), (AnnotationDescriptor..AnnotationDescriptor?)>..WritableSlice<(KtAnnotationEntry..KtAnnotationEntry?), (AnnotationDescriptor..AnnotationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'annotationPsi' @ [187:76] ==> val annotationPsi: (KtAnnotationEntry..KtAnnotationEntry?) defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeFiles[LocalVariableDescriptor]

'fileProto' @ [188:17] ==> val fileProto: (JsProtoBuf.File.Builder..JsProtoBuf.File.Builder?) defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeFiles[LocalVariableDescriptor]

'addAnnotation' @ [188:27] ==> public open fun addAnnotation(value: (ProtoBuf.Annotation..ProtoBuf.Annotation?)): (JsProtoBuf.File.Builder..JsProtoBuf.File.Builder?) defined in org.jetbrains.kotlin.serialization.js.JsProtoBuf.File.Builder[JavaMethodDescriptor]

'serializer' @ [188:41] ==> value-parameter serializer: AnnotationSerializer defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeFiles[ValueParameterDescriptorImpl]

'serializeAnnotation' @ [188:52] ==> public final fun serializeAnnotation(annotation: AnnotationDescriptor): ProtoBuf.Annotation defined in org.jetbrains.kotlin.serialization.AnnotationSerializer[DeserializedSimpleFunctionDescriptor]

'annotation' @ [188:72] ==> val annotation: AnnotationDescriptor defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeFiles[LocalVariableDescriptor]

'filesProto' @ [190:13] ==> val filesProto: (JsProtoBuf.Files.Builder..JsProtoBuf.Files.Builder?) defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeFiles[LocalVariableDescriptor]

'addFile' @ [190:24] ==> public open fun addFile(builderForValue: (JsProtoBuf.File.Builder..JsProtoBuf.File.Builder?)): (JsProtoBuf.Files.Builder..JsProtoBuf.Files.Builder?) defined in org.jetbrains.kotlin.serialization.js.JsProtoBuf.Files.Builder[JavaMethodDescriptor]

'fileProto' @ [190:32] ==> val fileProto: (JsProtoBuf.File.Builder..JsProtoBuf.File.Builder?) defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeFiles[LocalVariableDescriptor]

'filesProto' @ [192:16] ==> val filesProto: (JsProtoBuf.Files.Builder..JsProtoBuf.Files.Builder?) defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeFiles[LocalVariableDescriptor]

'build' @ [192:27] ==> public open fun build(): (JsProtoBuf.Files..JsProtoBuf.Files?) defined in org.jetbrains.kotlin.serialization.js.JsProtoBuf.Files.Builder[JavaMethodDescriptor]

'hashMapOf' @ [196:26] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<String, ByteArray> /* = HashMap<String, ByteArray> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> ByteArray

'getPackagesFqNames' @ [198:24] ==> private final fun getPackagesFqNames(module: ModuleDescriptor): Set<FqName> defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil[SimpleFunctionDescriptorImpl]

'module' @ [198:43] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.toContentMap[ValueParameterDescriptorImpl]

'serializePackageFragment' @ [199:24] ==> public final fun serializePackageFragment(bindingContext: BindingContext, module: ModuleDescriptor, fqName: FqName): ProtoBuf.PackageFragment defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil[SimpleFunctionDescriptorImpl]

'bindingContext' @ [199:49] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.toContentMap[ValueParameterDescriptorImpl]

'module' @ [199:65] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.toContentMap[ValueParameterDescriptorImpl]

'fqName' @ [199:73] ==> val fqName: FqName defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.toContentMap[LocalVariableDescriptor]

'part' @ [200:17] ==> val part: ProtoBuf.PackageFragment defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.toContentMap[LocalVariableDescriptor]

'class_Count' @ [200:22] ==> public final val ProtoBuf.PackageFragment.class_Count: Int[MyPropertyDescriptor]

'part' @ [200:42] ==> val part: ProtoBuf.PackageFragment defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.toContentMap[LocalVariableDescriptor]

'`package`' @ [200:47] ==> public final val ProtoBuf.PackageFragment.`package`: (ProtoBuf.Package..ProtoBuf.Package?)[MyPropertyDescriptor]

'let' @ [200:57] ==> @InlineOnly public inline fun <T, R> (ProtoBuf.Package..ProtoBuf.Package?).let(block: ((ProtoBuf.Package..ProtoBuf.Package?)) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.ProtoBuf.Package..org.jetbrains.kotlin.serialization.ProtoBuf.Package?)
    <R> -> Boolean

'packageProto' @ [201:17] ==> value-parameter packageProto: (ProtoBuf.Package..ProtoBuf.Package?) defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.toContentMap.<anonymous>[ValueParameterDescriptorImpl]

'functionCount' @ [201:30] ==> public final val ProtoBuf.Package.functionCount: Int[MyPropertyDescriptor]

'packageProto' @ [201:52] ==> value-parameter packageProto: (ProtoBuf.Package..ProtoBuf.Package?) defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.toContentMap.<anonymous>[ValueParameterDescriptorImpl]

'propertyCount' @ [201:65] ==> public final val ProtoBuf.Package.propertyCount: Int[MyPropertyDescriptor]

'packageProto' @ [201:87] ==> value-parameter packageProto: (ProtoBuf.Package..ProtoBuf.Package?) defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.toContentMap.<anonymous>[ValueParameterDescriptorImpl]

'typeAliasCount' @ [201:100] ==> public final val ProtoBuf.Package.typeAliasCount: Int[MyPropertyDescriptor]

'ByteArrayOutputStream' @ [204:26] ==> public constructor ByteArrayOutputStream() defined in java.io.ByteArrayOutputStream[JavaClassConstructorDescriptor]

'with' @ [205:13] ==> @InlineOnly public inline fun <T, R> with(receiver: DataOutputStream, block: DataOutputStream.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DataOutputStream
    <R> -> Unit

'DataOutputStream' @ [205:18] ==> public constructor DataOutputStream(p0: (OutputStream..OutputStream?)) defined in java.io.DataOutputStream[JavaClassConstructorDescriptor]

'stream' @ [205:35] ==> val stream: ByteArrayOutputStream defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.toContentMap[LocalVariableDescriptor]

'JsMetadataVersion' @ [206:31] ==> public companion object defined in org.jetbrains.kotlin.utils.JsMetadataVersion[FakeCallableDescriptorForObject]

'INSTANCE' @ [206:49] ==> @field:JvmField public final val INSTANCE: JsMetadataVersion defined in org.jetbrains.kotlin.utils.JsMetadataVersion.Companion[DeserializedPropertyDescriptor]

'toArray' @ [206:58] ==> public final fun toArray(): IntArray defined in org.jetbrains.kotlin.utils.JsMetadataVersion[DeserializedSimpleFunctionDescriptor]

'writeInt' @ [207:17] ==> public final fun writeInt(p0: Int): Unit defined in java.io.DataOutputStream[JavaMethodDescriptor]

'version' @ [207:26] ==> val version: IntArray defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.toContentMap.<anonymous>[LocalVariableDescriptor]

'size' @ [207:34] ==> public final val size: Int defined in kotlin.IntArray[DeserializedPropertyDescriptor]

'version' @ [208:17] ==> val version: IntArray defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.toContentMap.<anonymous>[LocalVariableDescriptor]

'forEach' @ [208:25] ==> public inline fun IntArray.forEach(action: (Int) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'this' @ [208:33] ==> <this> defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.toContentMap.<anonymous>[ReceiverParameterDescriptorImpl]

'writeInt' @ [208:39] ==> public final fun writeInt(p0: Int): Unit defined in java.io.DataOutputStream[JavaMethodDescriptor]

'serializeHeader' @ [211:13] ==> public final fun serializeHeader(packageFqName: FqName?): JsProtoBuf.Header defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil[SimpleFunctionDescriptorImpl]

'fqName' @ [211:29] ==> val fqName: FqName defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.toContentMap[LocalVariableDescriptor]

'writeDelimitedTo' @ [211:37] ==> public open fun writeDelimitedTo(p0: (OutputStream..OutputStream?)): Unit defined in org.jetbrains.kotlin.serialization.js.JsProtoBuf.Header[JavaMethodDescriptor]

'stream' @ [211:54] ==> val stream: ByteArrayOutputStream defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.toContentMap[LocalVariableDescriptor]

'part' @ [212:13] ==> val part: ProtoBuf.PackageFragment defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.toContentMap[LocalVariableDescriptor]

'writeTo' @ [212:18] ==> public open fun writeTo(p0: (OutputStream..OutputStream?)): Unit defined in org.jetbrains.kotlin.serialization.ProtoBuf.PackageFragment[JavaMethodDescriptor]

'stream' @ [212:26] ==> val stream: ByteArrayOutputStream defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.toContentMap[LocalVariableDescriptor]

'contentMap' @ [214:13] ==> val contentMap: HashMap<String, ByteArray> /* = HashMap<String, ByteArray> */ defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.toContentMap[LocalVariableDescriptor]

'getKjsmFilePath' @ [214:45] ==> public final fun getKjsmFilePath(packageFqName: FqName): String defined in org.jetbrains.kotlin.serialization.js.JsSerializerProtocol[SimpleFunctionDescriptorImpl]

'fqName' @ [214:61] ==> val fqName: FqName defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.toContentMap[LocalVariableDescriptor]

'stream' @ [214:72] ==> val stream: ByteArrayOutputStream defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.toContentMap[LocalVariableDescriptor]

'toByteArray' @ [214:79] ==> public open fun toByteArray(): (ByteArray..ByteArray?) defined in java.io.ByteArrayOutputStream[JavaMethodDescriptor]

'contentMap' @ [217:16] ==> val contentMap: HashMap<String, ByteArray> /* = HashMap<String, ByteArray> */ defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.toContentMap[LocalVariableDescriptor]

'newBuilder' @ [221:40] ==> public open fun newBuilder(): (JsProtoBuf.Header.Builder..JsProtoBuf.Header.Builder?) defined in org.jetbrains.kotlin.serialization.js.JsProtoBuf.Header[JavaMethodDescriptor]

'packageFqName' @ [223:13] ==> value-parameter packageFqName: FqName? defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeHeader[ValueParameterDescriptorImpl]

'header' @ [224:13] ==> val header: (JsProtoBuf.Header.Builder..JsProtoBuf.Header.Builder?) defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeHeader[LocalVariableDescriptor]

'packageFqName' @ [224:20] ==> public final var JsProtoBuf.Header.Builder.packageFqName: (String..String?)[MyPropertyDescriptor]

'packageFqName' @ [224:36] ==> value-parameter packageFqName: FqName? defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeHeader[ValueParameterDescriptorImpl]

'asString' @ [224:50] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'isPreRelease' @ [227:35] ==> public open fun isPreRelease(): Boolean defined in org.jetbrains.kotlin.config.KotlinCompilerVersion[JavaMethodDescriptor]

'header' @ [228:13] ==> val header: (JsProtoBuf.Header.Builder..JsProtoBuf.Header.Builder?) defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeHeader[LocalVariableDescriptor]

'flags' @ [228:20] ==> public final var JsProtoBuf.Header.Builder.flags: Int[MyPropertyDescriptor]

'header' @ [233:16] ==> val header: (JsProtoBuf.Header.Builder..JsProtoBuf.Header.Builder?) defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeHeader[LocalVariableDescriptor]

'build' @ [233:23] ==> public open fun build(): (JsProtoBuf.Header..JsProtoBuf.Header?) defined in org.jetbrains.kotlin.serialization.js.JsProtoBuf.Header.Builder[JavaMethodDescriptor]

'HashSet' @ [237:16] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> FqName

'apply' @ [237:34] ==> @InlineOnly public inline fun <T> HashSet<FqName>.apply(block: HashSet<FqName>.() -> Unit): HashSet<FqName> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> HashSet<FqName>

'getSubPackagesFqNames' @ [238:13] ==> private final fun getSubPackagesFqNames(packageView: PackageViewDescriptor, result: MutableSet<FqName>): Unit defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil[SimpleFunctionDescriptorImpl]

'module' @ [238:35] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.getPackagesFqNames[ValueParameterDescriptorImpl]

'getPackage' @ [238:42] ==> public abstract fun getPackage(fqName: FqName): PackageViewDescriptor defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedSimpleFunctionDescriptor]

'ROOT' @ [238:60] ==> public final val ROOT: (FqName..FqName?) defined in org.jetbrains.kotlin.name.FqName[JavaPropertyDescriptor]

'this' @ [238:67] ==> <this> defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.getPackagesFqNames.<anonymous>[ReceiverParameterDescriptorImpl]

'add' @ [239:13] ==> public open fun add(element: FqName): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'ROOT' @ [239:24] ==> public final val ROOT: (FqName..FqName?) defined in org.jetbrains.kotlin.name.FqName[JavaPropertyDescriptor]

'packageView' @ [244:22] ==> value-parameter packageView: PackageViewDescriptor defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.getSubPackagesFqNames[ValueParameterDescriptorImpl]

'fqName' @ [244:34] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedPropertyDescriptor]

'!' @ [245:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'fqName' @ [245:14] ==> val fqName: FqName defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.getSubPackagesFqNames[LocalVariableDescriptor]

'isRoot' @ [245:21] ==> public final val FqName.isRoot: Boolean[MyPropertyDescriptor]

'result' @ [246:13] ==> value-parameter result: MutableSet<FqName> defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.getSubPackagesFqNames[ValueParameterDescriptorImpl]

'add' @ [246:20] ==> public abstract fun add(element: FqName): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'fqName' @ [246:24] ==> val fqName: FqName defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.getSubPackagesFqNames[LocalVariableDescriptor]

'packageView' @ [249:28] ==> value-parameter packageView: PackageViewDescriptor defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.getSubPackagesFqNames[ValueParameterDescriptorImpl]

'memberScope' @ [249:40] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.descriptors.PackageViewDescriptor[DeserializedPropertyDescriptor]

'getContributedDescriptors' @ [249:52] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'PACKAGES' @ [249:99] ==> @field:JvmField public final val PACKAGES: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'ALL_NAME_FILTER' @ [249:121] ==> public final val ALL_NAME_FILTER: (Name) -> Boolean defined in org.jetbrains.kotlin.resolve.scopes.MemberScope.Companion[DeserializedPropertyDescriptor]

'descriptor' @ [250:17] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.getSubPackagesFqNames[LocalVariableDescriptor]

'getSubPackagesFqNames' @ [251:17] ==> private final fun getSubPackagesFqNames(packageView: PackageViewDescriptor, result: MutableSet<FqName>): Unit defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil[SimpleFunctionDescriptorImpl]

'descriptor' @ [251:39] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.getSubPackagesFqNames[LocalVariableDescriptor]

'result' @ [251:51] ==> value-parameter result: MutableSet<FqName> defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.getSubPackagesFqNames[ValueParameterDescriptorImpl]

'ByteArrayOutputStream' @ [257:16] ==> public constructor ByteArrayOutputStream() defined in java.io.ByteArrayOutputStream[JavaClassConstructorDescriptor]

'apply' @ [257:40] ==> @InlineOnly public inline fun <T> ByteArrayOutputStream.apply(block: ByteArrayOutputStream.() -> Unit): ByteArrayOutputStream defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ByteArrayOutputStream

'GZIPOutputStream' @ [258:13] ==> public constructor GZIPOutputStream(p0: (OutputStream..OutputStream?)) defined in java.util.zip.GZIPOutputStream[JavaClassConstructorDescriptor]

'this' @ [258:30] ==> <this> defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeToBinaryMetadata.<anonymous>[ReceiverParameterDescriptorImpl]

'use' @ [258:36] ==> @InlineOnly public inline fun <T : Closeable?, R> GZIPOutputStream.use(block: (GZIPOutputStream) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> GZIPOutputStream
    <R> -> Unit

'serializeHeader' @ [259:17] ==> public final fun serializeHeader(packageFqName: FqName?): JsProtoBuf.Header defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil[SimpleFunctionDescriptorImpl]

'writeDelimitedTo' @ [259:39] ==> public open fun writeDelimitedTo(p0: (OutputStream..OutputStream?)): Unit defined in org.jetbrains.kotlin.serialization.js.JsProtoBuf.Header[JavaMethodDescriptor]

'stream' @ [259:56] ==> value-parameter stream: GZIPOutputStream defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeToBinaryMetadata.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'serializeMetadata' @ [260:17] ==> public final fun serializeMetadata(bindingContext: BindingContext, module: ModuleDescriptor, moduleKind: ModuleKind, importedModules: List<String>): JsProtoBuf.Library defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil[SimpleFunctionDescriptorImpl]

'bindingContext' @ [260:35] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeToBinaryMetadata[ValueParameterDescriptorImpl]

'data' @ [260:51] ==> public final val data: ModuleDescriptor defined in org.jetbrains.kotlin.serialization.js.JsModuleDescriptor[PropertyDescriptorImpl]

'kind' @ [260:57] ==> public final val kind: ModuleKind defined in org.jetbrains.kotlin.serialization.js.JsModuleDescriptor[PropertyDescriptorImpl]

'imported' @ [260:63] ==> public final val imported: List<String> defined in org.jetbrains.kotlin.serialization.js.JsModuleDescriptor[PropertyDescriptorImpl]

'writeTo' @ [260:73] ==> public open fun writeTo(p0: (OutputStream..OutputStream?)): Unit defined in org.jetbrains.kotlin.serialization.js.JsProtoBuf.Library[JavaMethodDescriptor]

'stream' @ [260:81] ==> value-parameter stream: GZIPOutputStream defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.serializeToBinaryMetadata.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toByteArray' @ [262:11] ==> public open fun toByteArray(): (ByteArray..ByteArray?) defined in java.io.ByteArrayOutputStream[JavaMethodDescriptor]

'component1' @ [266:14] ==> public final operator fun component1(): (JsProtoBuf.Header..JsProtoBuf.Header?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [266:22] ==> public final operator fun component2(): (JsProtoBuf.Library..JsProtoBuf.Library?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'GZIPInputStream' @ [266:33] ==> public constructor GZIPInputStream(p0: (InputStream..InputStream?)) defined in java.util.zip.GZIPInputStream[JavaClassConstructorDescriptor]

'ByteArrayInputStream' @ [266:49] ==> public constructor ByteArrayInputStream(p0: (ByteArray..ByteArray?)) defined in java.io.ByteArrayInputStream[JavaClassConstructorDescriptor]

'this' @ [266:70] ==> <this> defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.deserializeToLibraryParts[ReceiverParameterDescriptorImpl]

'use' @ [266:77] ==> @InlineOnly public inline fun <T : Closeable?, R> GZIPInputStream.use(block: (GZIPInputStream) -> Pair<(JsProtoBuf.Header..JsProtoBuf.Header?), (JsProtoBuf.Library..JsProtoBuf.Library?)>): Pair<(JsProtoBuf.Header..JsProtoBuf.Header?), (JsProtoBuf.Library..JsProtoBuf.Library?)> defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> GZIPInputStream
    <R> -> Pair<(org.jetbrains.kotlin.serialization.js.JsProtoBuf.Header..org.jetbrains.kotlin.serialization.js.JsProtoBuf.Header?), (org.jetbrains.kotlin.serialization.js.JsProtoBuf.Library..org.jetbrains.kotlin.serialization.js.JsProtoBuf.Library?)>

'to' @ [267:13] ==> public infix fun <A, B> (JsProtoBuf.Header..JsProtoBuf.Header?).to(that: (JsProtoBuf.Library..JsProtoBuf.Library?)): Pair<(JsProtoBuf.Header..JsProtoBuf.Header?), (JsProtoBuf.Library..JsProtoBuf.Library?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> (org.jetbrains.kotlin.serialization.js.JsProtoBuf.Header..org.jetbrains.kotlin.serialization.js.JsProtoBuf.Header?)
    <B> -> (org.jetbrains.kotlin.serialization.js.JsProtoBuf.Library..org.jetbrains.kotlin.serialization.js.JsProtoBuf.Library?)

'parseDelimitedFrom' @ [267:31] ==> public open fun parseDelimitedFrom(input: (InputStream..InputStream?), extensionRegistry: (ExtensionRegistryLite..ExtensionRegistryLite?)): (JsProtoBuf.Header..JsProtoBuf.Header?) defined in org.jetbrains.kotlin.serialization.js.JsProtoBuf.Header[JavaMethodDescriptor]

'stream' @ [267:50] ==> value-parameter stream: GZIPInputStream defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.deserializeToLibraryParts.<anonymous>[ValueParameterDescriptorImpl]

'extensionRegistry' @ [267:79] ==> public final val extensionRegistry: ExtensionRegistryLite defined in org.jetbrains.kotlin.serialization.js.JsSerializerProtocol[DeserializedPropertyDescriptor]

'parseFrom' @ [268:32] ==> public open fun parseFrom(input: (InputStream..InputStream?), extensionRegistry: (ExtensionRegistryLite..ExtensionRegistryLite?)): (JsProtoBuf.Library..JsProtoBuf.Library?) defined in org.jetbrains.kotlin.serialization.js.JsProtoBuf.Library[JavaMethodDescriptor]

'stream' @ [268:42] ==> value-parameter stream: GZIPInputStream defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.deserializeToLibraryParts.<anonymous>[ValueParameterDescriptorImpl]

'extensionRegistry' @ [268:71] ==> public final val extensionRegistry: ExtensionRegistryLite defined in org.jetbrains.kotlin.serialization.js.JsSerializerProtocol[DeserializedPropertyDescriptor]

'JsModuleDescriptor' @ [271:16] ==> public constructor JsModuleDescriptor<out T>(name: String, kind: ModuleKind, imported: List<String>, data: KotlinJavaScriptLibraryParts) defined in org.jetbrains.kotlin.serialization.js.JsModuleDescriptor[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> KotlinJavaScriptLibraryParts

'name' @ [272:24] ==> value-parameter name: String defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.deserializeToLibraryParts[ValueParameterDescriptorImpl]

'KotlinJavaScriptLibraryParts' @ [273:24] ==> public constructor KotlinJavaScriptLibraryParts(header: JsProtoBuf.Header, body: List<ProtoBuf.PackageFragment>) defined in org.jetbrains.kotlin.serialization.js.KotlinJavaScriptLibraryParts[ClassConstructorDescriptorImpl]

'header' @ [273:53] ==> val header: (JsProtoBuf.Header..JsProtoBuf.Header?) defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.deserializeToLibraryParts[LocalVariableDescriptor]

'content' @ [273:61] ==> val content: (JsProtoBuf.Library..JsProtoBuf.Library?) defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.deserializeToLibraryParts[LocalVariableDescriptor]

'packageFragmentList' @ [273:69] ==> public final val JsProtoBuf.Library.packageFragmentList: (MutableList<(ProtoBuf.PackageFragment..ProtoBuf.PackageFragment?)>..List<(ProtoBuf.PackageFragment..ProtoBuf.PackageFragment?)>?)[MyPropertyDescriptor]

'when (content.kind) {
                    null, JsProtoBuf.Library.Kind.PLAIN -> ModuleKind.PLAIN
                    JsProtoBuf.Library.Kind.AMD -> ModuleKind.AMD
                    JsProtoBuf.Library.Kind.COMMON_JS -> ModuleKind.COMMON_JS
                    JsProtoBuf.Library.Kind.UMD -> ModuleKind.UMD
                }' @ [274:24] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ModuleKind, entry1: ModuleKind, entry2: ModuleKind, entry3: ModuleKind): ModuleKind[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ModuleKind

'content' @ [274:30] ==> val content: (JsProtoBuf.Library..JsProtoBuf.Library?) defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.deserializeToLibraryParts[LocalVariableDescriptor]

'kind' @ [274:38] ==> public final val JsProtoBuf.Library.kind: (JsProtoBuf.Library.Kind..JsProtoBuf.Library.Kind?)[MyPropertyDescriptor]

'PLAIN' @ [275:51] ==> enum entry PLAIN defined in org.jetbrains.kotlin.serialization.js.JsProtoBuf.Library.Kind[FakeCallableDescriptorForObject]

'PLAIN' @ [275:71] ==> enum entry PLAIN defined in org.jetbrains.kotlin.serialization.js.ModuleKind[FakeCallableDescriptorForObject]

'AMD' @ [276:45] ==> enum entry AMD defined in org.jetbrains.kotlin.serialization.js.JsProtoBuf.Library.Kind[FakeCallableDescriptorForObject]

'AMD' @ [276:63] ==> enum entry AMD defined in org.jetbrains.kotlin.serialization.js.ModuleKind[FakeCallableDescriptorForObject]

'COMMON_JS' @ [277:45] ==> enum entry COMMON_JS defined in org.jetbrains.kotlin.serialization.js.JsProtoBuf.Library.Kind[FakeCallableDescriptorForObject]

'COMMON_JS' @ [277:69] ==> enum entry COMMON_JS defined in org.jetbrains.kotlin.serialization.js.ModuleKind[FakeCallableDescriptorForObject]

'UMD' @ [278:45] ==> enum entry UMD defined in org.jetbrains.kotlin.serialization.js.JsProtoBuf.Library.Kind[FakeCallableDescriptorForObject]

'UMD' @ [278:63] ==> enum entry UMD defined in org.jetbrains.kotlin.serialization.js.ModuleKind[FakeCallableDescriptorForObject]

'content' @ [280:28] ==> val content: (JsProtoBuf.Library..JsProtoBuf.Library?) defined in org.jetbrains.kotlin.serialization.js.KotlinJavascriptSerializationUtil.deserializeToLibraryParts[LocalVariableDescriptor]

'importedModuleList' @ [280:36] ==> public final val JsProtoBuf.Library.importedModuleList: (ProtocolStringList..ProtocolStringList?)[MyPropertyDescriptor]

