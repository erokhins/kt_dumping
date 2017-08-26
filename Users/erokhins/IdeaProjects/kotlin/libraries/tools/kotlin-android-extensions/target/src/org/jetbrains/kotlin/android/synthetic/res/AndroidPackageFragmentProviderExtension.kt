'isExperimental' @ [43:30] ==> protected abstract fun isExperimental(moduleInfo: ModuleInfo?): Boolean defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension[SimpleFunctionDescriptorImpl]

'moduleInfo' @ [43:45] ==> value-parameter moduleInfo: ModuleInfo? defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider[ValueParameterDescriptorImpl]

'getLayoutXmlFileManager' @ [45:36] ==> protected abstract fun getLayoutXmlFileManager(project: Project, moduleInfo: ModuleInfo?): AndroidLayoutXmlFileManager? defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension[SimpleFunctionDescriptorImpl]

'project' @ [45:60] ==> value-parameter project: Project defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider[ValueParameterDescriptorImpl]

'moduleInfo' @ [45:69] ==> value-parameter moduleInfo: ModuleInfo? defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider[ValueParameterDescriptorImpl]

'layoutXmlFileManager' @ [47:26] ==> val layoutXmlFileManager: AndroidLayoutXmlFileManager defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider[LocalVariableDescriptor]

'getModuleData' @ [47:47] ==> public open fun getModuleData(): AndroidModuleData defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager[SimpleFunctionDescriptorImpl]

'LazySyntheticElementResolveContext' @ [49:27] ==> public constructor LazySyntheticElementResolveContext(module: ModuleDescriptor, storageManager: StorageManager) defined in org.jetbrains.kotlin.android.synthetic.descriptors.LazySyntheticElementResolveContext[ClassConstructorDescriptorImpl]

'module' @ [49:62] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider[ValueParameterDescriptorImpl]

'storageManager' @ [49:70] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider[ValueParameterDescriptorImpl]

'arrayListOf' @ [51:37] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<PackageFragmentDescriptor> /* = ArrayList<PackageFragmentDescriptor> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageFragmentDescriptor

'arrayListOf' @ [52:44] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<PackageFragmentDescriptor> /* = ArrayList<PackageFragmentDescriptor> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageFragmentDescriptor

'moduleData' @ [55:29] ==> val moduleData: AndroidModuleData defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider[LocalVariableDescriptor]

'variants' @ [55:40] ==> public final val variants: List<AndroidVariantData> defined in org.jetbrains.kotlin.android.synthetic.res.AndroidModuleData[PropertyDescriptorImpl]

'component1' @ [56:19] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, List<PsiFile>>.component1(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> List<PsiFile>

'component2' @ [56:31] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, List<PsiFile>>.component2(): List<PsiFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> List<PsiFile>

'variantData' @ [56:43] ==> val variantData: AndroidVariantData defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider[LocalVariableDescriptor]

'layouts' @ [56:55] ==> public final val layouts: Map<String, List<PsiFile>> defined in org.jetbrains.kotlin.android.synthetic.res.AndroidVariantData[PropertyDescriptorImpl]

'layoutXmlFileManager' @ [58:37] ==> val layoutXmlFileManager: AndroidLayoutXmlFileManager defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider[LocalVariableDescriptor]

'extractResources' @ [58:58] ==> public final fun extractResources(layoutGroupFiles: AndroidLayoutGroupData, module: ModuleDescriptor): List<AndroidResource> defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutXmlFileManager[SimpleFunctionDescriptorImpl]

'AndroidLayoutGroupData' @ [58:75] ==> public constructor AndroidLayoutGroupData(name: String, layouts: List<PsiFile>) defined in org.jetbrains.kotlin.android.synthetic.res.AndroidLayoutGroupData[ClassConstructorDescriptorImpl]

'layoutName' @ [58:98] ==> val layoutName: String defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider[LocalVariableDescriptor]

'layouts' @ [58:110] ==> val layouts: List<PsiFile> defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider[LocalVariableDescriptor]

'module' @ [58:120] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider[ValueParameterDescriptorImpl]

'AndroidSyntheticPackageData' @ [59:39] ==> public constructor AndroidSyntheticPackageData(moduleData: AndroidModuleData, forView: Boolean, isDeprecated: Boolean, resources: List<AndroidResource>) defined in org.jetbrains.kotlin.android.synthetic.descriptors.AndroidSyntheticPackageData[ClassConstructorDescriptorImpl]

'moduleData' @ [59:67] ==> val moduleData: AndroidModuleData defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider[LocalVariableDescriptor]

'forView' @ [59:79] ==> value-parameter forView: Boolean defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider.createPackageFragment[ValueParameterDescriptorImpl]

'isDeprecated' @ [59:88] ==> value-parameter isDeprecated: Boolean = ... defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider.createPackageFragment[ValueParameterDescriptorImpl]

'resources' @ [59:102] ==> val resources: List<AndroidResource> defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider.createPackageFragment[LocalVariableDescriptor]

'AndroidSyntheticPackageFragmentDescriptor' @ [60:45] ==> public constructor AndroidSyntheticPackageFragmentDescriptor(module: ModuleDescriptor, fqName: FqName, packageData: AndroidSyntheticPackageData, lazyContext: LazySyntheticElementResolveContext, storageManager: StorageManager, isExperimental: Boolean) defined in org.jetbrains.kotlin.android.synthetic.descriptors.AndroidSyntheticPackageFragmentDescriptor[ClassConstructorDescriptorImpl]

'module' @ [61:29] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider[ValueParameterDescriptorImpl]

'FqName' @ [61:37] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'fqName' @ [61:44] ==> value-parameter fqName: String defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider.createPackageFragment[ValueParameterDescriptorImpl]

'packageData' @ [61:53] ==> val packageData: AndroidSyntheticPackageData defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider.createPackageFragment[LocalVariableDescriptor]

'lazyContext' @ [61:66] ==> val lazyContext: LazySyntheticElementResolveContext defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider[LocalVariableDescriptor]

'storageManager' @ [61:79] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider[ValueParameterDescriptorImpl]

'isExperimental' @ [61:95] ==> val isExperimental: Boolean defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider[LocalVariableDescriptor]

'packagesToLookupInCompletion' @ [62:21] ==> val packagesToLookupInCompletion: ArrayList<PackageFragmentDescriptor> /* = ArrayList<PackageFragmentDescriptor> */ defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider[LocalVariableDescriptor]

'packageDescriptor' @ [62:53] ==> val packageDescriptor: AndroidSyntheticPackageFragmentDescriptor defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider.createPackageFragment[LocalVariableDescriptor]

'allPackageDescriptors' @ [63:21] ==> val allPackageDescriptors: ArrayList<PackageFragmentDescriptor> /* = ArrayList<PackageFragmentDescriptor> */ defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider[LocalVariableDescriptor]

'packageDescriptor' @ [63:46] ==> val packageDescriptor: AndroidSyntheticPackageFragmentDescriptor defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider.createPackageFragment[LocalVariableDescriptor]

'AndroidConst' @ [66:37] ==> public object AndroidConst defined in org.jetbrains.kotlin.android.synthetic in file AndroidConst.kt[FakeCallableDescriptorForObject]

'SYNTHETIC_PACKAGE' @ [66:50] ==> public final val SYNTHETIC_PACKAGE: String defined in org.jetbrains.kotlin.android.synthetic.AndroidConst[PropertyDescriptorImpl]

'variantData' @ [66:76] ==> val variantData: AndroidVariantData defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider[LocalVariableDescriptor]

'variant' @ [66:88] ==> public final val variant: AndroidVariant defined in org.jetbrains.kotlin.android.synthetic.res.AndroidVariantData[PropertyDescriptorImpl]

'name' @ [66:96] ==> public final val name: String defined in org.jetbrains.kotlin.android.synthetic.res.AndroidVariant[PropertyDescriptorImpl]

'layoutName' @ [66:109] ==> val layoutName: String defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider[LocalVariableDescriptor]

'createPackageFragment' @ [68:17] ==> local final fun createPackageFragment(fqName: String, forView: Boolean, isDeprecated: Boolean = ...): Unit defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider[SimpleFunctionDescriptorImpl]

'packageFqName' @ [68:39] ==> val packageFqName: String defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider[LocalVariableDescriptor]

'createPackageFragment' @ [69:17] ==> local final fun createPackageFragment(fqName: String, forView: Boolean, isDeprecated: Boolean = ...): Unit defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider[SimpleFunctionDescriptorImpl]

'packageFqName' @ [69:39] ==> val packageFqName: String defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider[LocalVariableDescriptor]

'AndroidConst' @ [74:9] ==> public object AndroidConst defined in org.jetbrains.kotlin.android.synthetic in file AndroidConst.kt[FakeCallableDescriptorForObject]

'SYNTHETIC_SUBPACKAGES' @ [74:22] ==> public final val SYNTHETIC_SUBPACKAGES: List<String> defined in org.jetbrains.kotlin.android.synthetic.AndroidConst[PropertyDescriptorImpl]

'forEachUntilLast' @ [74:44] ==> internal fun <T> List<String>.forEachUntilLast(operation: (String) -> Unit): Unit defined in org.jetbrains.kotlin.android.synthetic[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String

'allPackageDescriptors' @ [75:13] ==> val allPackageDescriptors: ArrayList<PackageFragmentDescriptor> /* = ArrayList<PackageFragmentDescriptor> */ defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider[LocalVariableDescriptor]

'PredefinedPackageFragmentDescriptor' @ [75:38] ==> public constructor PredefinedPackageFragmentDescriptor(fqName: String, module: ModuleDescriptor, storageManager: StorageManager, subpackages: List<PackageFragmentDescriptor> = ..., functions: (PredefinedPackageFragmentDescriptor) -> Collection<SimpleFunctionDescriptor> = ...) defined in org.jetbrains.kotlin.android.synthetic.descriptors.PredefinedPackageFragmentDescriptor[ClassConstructorDescriptorImpl]

's' @ [75:74] ==> value-parameter s: String defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider.<anonymous>[ValueParameterDescriptorImpl]

'module' @ [75:77] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider[ValueParameterDescriptorImpl]

'storageManager' @ [75:85] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider[ValueParameterDescriptorImpl]

'moduleData' @ [78:29] ==> val moduleData: AndroidModuleData defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider[LocalVariableDescriptor]

'variants' @ [78:40] ==> public final val variants: List<AndroidVariantData> defined in org.jetbrains.kotlin.android.synthetic.res.AndroidModuleData[PropertyDescriptorImpl]

'AndroidConst' @ [79:26] ==> public object AndroidConst defined in org.jetbrains.kotlin.android.synthetic in file AndroidConst.kt[FakeCallableDescriptorForObject]

'SYNTHETIC_PACKAGE' @ [79:39] ==> public final val SYNTHETIC_PACKAGE: String defined in org.jetbrains.kotlin.android.synthetic.AndroidConst[PropertyDescriptorImpl]

'variantData' @ [79:65] ==> val variantData: AndroidVariantData defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider[LocalVariableDescriptor]

'variant' @ [79:77] ==> public final val variant: AndroidVariant defined in org.jetbrains.kotlin.android.synthetic.res.AndroidVariantData[PropertyDescriptorImpl]

'name' @ [79:85] ==> public final val name: String defined in org.jetbrains.kotlin.android.synthetic.res.AndroidVariant[PropertyDescriptorImpl]

'allPackageDescriptors' @ [80:13] ==> val allPackageDescriptors: ArrayList<PackageFragmentDescriptor> /* = ArrayList<PackageFragmentDescriptor> */ defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider[LocalVariableDescriptor]

'PredefinedPackageFragmentDescriptor' @ [80:38] ==> public constructor PredefinedPackageFragmentDescriptor(fqName: String, module: ModuleDescriptor, storageManager: StorageManager, subpackages: List<PackageFragmentDescriptor> = ..., functions: (PredefinedPackageFragmentDescriptor) -> Collection<SimpleFunctionDescriptor> = ...) defined in org.jetbrains.kotlin.android.synthetic.descriptors.PredefinedPackageFragmentDescriptor[ClassConstructorDescriptorImpl]

'fqName' @ [80:74] ==> val fqName: String defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider[LocalVariableDescriptor]

'module' @ [80:82] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider[ValueParameterDescriptorImpl]

'storageManager' @ [80:90] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider[ValueParameterDescriptorImpl]

'AndroidConst' @ [84:9] ==> public object AndroidConst defined in org.jetbrains.kotlin.android.synthetic in file AndroidConst.kt[FakeCallableDescriptorForObject]

'SYNTHETIC_SUBPACKAGES' @ [84:22] ==> public final val SYNTHETIC_SUBPACKAGES: List<String> defined in org.jetbrains.kotlin.android.synthetic.AndroidConst[PropertyDescriptorImpl]

'last' @ [84:44] ==> public fun <T> List<String>.last(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'let' @ [84:51] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Unit

'PredefinedPackageFragmentDescriptor' @ [85:37] ==> public constructor PredefinedPackageFragmentDescriptor(fqName: String, module: ModuleDescriptor, storageManager: StorageManager, subpackages: List<PackageFragmentDescriptor> = ..., functions: (PredefinedPackageFragmentDescriptor) -> Collection<SimpleFunctionDescriptor> = ...) defined in org.jetbrains.kotlin.android.synthetic.descriptors.PredefinedPackageFragmentDescriptor[ClassConstructorDescriptorImpl]

's' @ [85:73] ==> value-parameter s: String defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider.<anonymous>[ValueParameterDescriptorImpl]

'module' @ [85:76] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider[ValueParameterDescriptorImpl]

'storageManager' @ [85:84] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider[ValueParameterDescriptorImpl]

'packagesToLookupInCompletion' @ [85:100] ==> val packagesToLookupInCompletion: ArrayList<PackageFragmentDescriptor> /* = ArrayList<PackageFragmentDescriptor> */ defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider[LocalVariableDescriptor]

'invoke' @ [86:39] ==> internal final operator fun invoke(): SyntheticElementResolveContext defined in org.jetbrains.kotlin.android.synthetic.descriptors.LazySyntheticElementResolveContext[SimpleFunctionDescriptorImpl]

'getWidgetReceivers' @ [86:53] ==> public final fun getWidgetReceivers(forView: Boolean, isExperimental: Boolean): List<WidgetReceiver> defined in org.jetbrains.kotlin.android.synthetic.descriptors.SyntheticElementResolveContext[SimpleFunctionDescriptorImpl]

'isExperimental' @ [86:106] ==> val isExperimental: Boolean defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider[LocalVariableDescriptor]

'invoke' @ [87:39] ==> internal final operator fun invoke(): SyntheticElementResolveContext defined in org.jetbrains.kotlin.android.synthetic.descriptors.LazySyntheticElementResolveContext[SimpleFunctionDescriptorImpl]

'getWidgetReceivers' @ [87:53] ==> public final fun getWidgetReceivers(forView: Boolean, isExperimental: Boolean): List<WidgetReceiver> defined in org.jetbrains.kotlin.android.synthetic.descriptors.SyntheticElementResolveContext[SimpleFunctionDescriptorImpl]

'isExperimental' @ [87:105] ==> val isExperimental: Boolean defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider[LocalVariableDescriptor]

'widgetReceivers' @ [89:17] ==> val widgetReceivers: List<WidgetReceiver> defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider.<anonymous>.<anonymous>[LocalVariableDescriptor]

'filter' @ [90:26] ==> public inline fun <T> Iterable<WidgetReceiver>.filter(predicate: (WidgetReceiver) -> Boolean): List<WidgetReceiver> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WidgetReceiver

'it' @ [90:35] ==> value-parameter it: WidgetReceiver defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'mayHaveCache' @ [90:38] ==> public final val mayHaveCache: Boolean defined in org.jetbrains.kotlin.android.synthetic.descriptors.WidgetReceiver[PropertyDescriptorImpl]

'map' @ [91:26] ==> public inline fun <T, R> Iterable<WidgetReceiver>.map(transform: (WidgetReceiver) -> SimpleFunctionDescriptor): List<SimpleFunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WidgetReceiver
    <R> -> SimpleFunctionDescriptor

'genClearCacheFunction' @ [91:32] ==> internal fun genClearCacheFunction(packageFragmentDescriptor: PackageFragmentDescriptor, receiverType: KotlinType): SimpleFunctionDescriptor defined in org.jetbrains.kotlin.android.synthetic.res in file syntheticDescriptorGeneration.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [91:54] ==> value-parameter descriptor: PredefinedPackageFragmentDescriptor defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [91:66] ==> value-parameter it: WidgetReceiver defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [91:69] ==> public final val type: SimpleType defined in org.jetbrains.kotlin.android.synthetic.descriptors.WidgetReceiver[PropertyDescriptorImpl]

'packagesToLookupInCompletion' @ [93:13] ==> val packagesToLookupInCompletion: ArrayList<PackageFragmentDescriptor> /* = ArrayList<PackageFragmentDescriptor> */ defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider[LocalVariableDescriptor]

'packageDescriptor' @ [93:45] ==> val packageDescriptor: PredefinedPackageFragmentDescriptor defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider.<anonymous>[LocalVariableDescriptor]

'allPackageDescriptors' @ [94:13] ==> val allPackageDescriptors: ArrayList<PackageFragmentDescriptor> /* = ArrayList<PackageFragmentDescriptor> */ defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider[LocalVariableDescriptor]

'packageDescriptor' @ [94:38] ==> val packageDescriptor: PredefinedPackageFragmentDescriptor defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider.<anonymous>[LocalVariableDescriptor]

'AndroidSyntheticPackageFragmentProvider' @ [97:16] ==> public constructor AndroidSyntheticPackageFragmentProvider(packageFragments: Collection<PackageFragmentDescriptor>) defined in org.jetbrains.kotlin.android.synthetic.res.AndroidSyntheticPackageFragmentProvider[ClassConstructorDescriptorImpl]

'allPackageDescriptors' @ [97:56] ==> val allPackageDescriptors: ArrayList<PackageFragmentDescriptor> /* = ArrayList<PackageFragmentDescriptor> */ defined in org.jetbrains.kotlin.android.synthetic.res.AndroidPackageFragmentProviderExtension.getPackageFragmentProvider[LocalVariableDescriptor]

'packageFragments' @ [102:56] ==> public final val packageFragments: Collection<PackageFragmentDescriptor> defined in org.jetbrains.kotlin.android.synthetic.res.AndroidSyntheticPackageFragmentProvider[PropertyDescriptorImpl]

'filter' @ [102:73] ==> public inline fun <T> Iterable<PackageFragmentDescriptor>.filter(predicate: (PackageFragmentDescriptor) -> Boolean): List<PackageFragmentDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageFragmentDescriptor

'it' @ [102:82] ==> value-parameter it: PackageFragmentDescriptor defined in org.jetbrains.kotlin.android.synthetic.res.AndroidSyntheticPackageFragmentProvider.getPackageFragments.<anonymous>[ValueParameterDescriptorImpl]

'fqName' @ [102:85] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[DeserializedPropertyDescriptor]

'fqName' @ [102:95] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.android.synthetic.res.AndroidSyntheticPackageFragmentProvider.getPackageFragments[ValueParameterDescriptorImpl]

'packageFragments' @ [105:16] ==> public final val packageFragments: Collection<PackageFragmentDescriptor> defined in org.jetbrains.kotlin.android.synthetic.res.AndroidSyntheticPackageFragmentProvider[PropertyDescriptorImpl]

'asSequence' @ [105:33] ==> public fun <T> Iterable<PackageFragmentDescriptor>.asSequence(): Sequence<PackageFragmentDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageFragmentDescriptor

'map' @ [106:18] ==> public fun <T, R> Sequence<PackageFragmentDescriptor>.map(transform: (PackageFragmentDescriptor) -> FqName): Sequence<FqName> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageFragmentDescriptor
    <R> -> FqName

'it' @ [106:24] ==> value-parameter it: PackageFragmentDescriptor defined in org.jetbrains.kotlin.android.synthetic.res.AndroidSyntheticPackageFragmentProvider.getSubPackagesOf.<anonymous>[ValueParameterDescriptorImpl]

'fqName' @ [106:27] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[DeserializedPropertyDescriptor]

'filter' @ [107:18] ==> public fun <T> Sequence<FqName>.filter(predicate: (FqName) -> Boolean): Sequence<FqName> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'!' @ [107:27] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [107:28] ==> value-parameter it: FqName defined in org.jetbrains.kotlin.android.synthetic.res.AndroidSyntheticPackageFragmentProvider.getSubPackagesOf.<anonymous>[ValueParameterDescriptorImpl]

'isRoot' @ [107:31] ==> public final val FqName.isRoot: Boolean[MyPropertyDescriptor]

'it' @ [107:41] ==> value-parameter it: FqName defined in org.jetbrains.kotlin.android.synthetic.res.AndroidSyntheticPackageFragmentProvider.getSubPackagesOf.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [107:44] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'fqName' @ [107:56] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.android.synthetic.res.AndroidSyntheticPackageFragmentProvider.getSubPackagesOf[ValueParameterDescriptorImpl]

'toList' @ [108:18] ==> public fun <T> Sequence<FqName>.toList(): List<FqName> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

