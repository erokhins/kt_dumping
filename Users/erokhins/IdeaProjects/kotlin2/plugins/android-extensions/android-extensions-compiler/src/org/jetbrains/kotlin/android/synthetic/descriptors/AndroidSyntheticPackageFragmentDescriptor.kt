'PackageFragmentDescriptorImpl' @ [47:5] ==> public constructor PackageFragmentDescriptorImpl(module: ModuleDescriptor, fqName: FqName) defined in org.jetbrains.kotlin.descriptors.impl.PackageFragmentDescriptorImpl[DeserializedClassConstructorDescriptor]

'module' @ [47:35] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.android.synthetic.descriptors.AndroidSyntheticPackageFragmentDescriptor.<init>[ValueParameterDescriptorImpl]

'fqName' @ [47:43] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.android.synthetic.descriptors.AndroidSyntheticPackageFragmentDescriptor.<init>[ValueParameterDescriptorImpl]

'AndroidExtensionPropertiesScope' @ [48:25] ==> public constructor AndroidExtensionPropertiesScope() defined in org.jetbrains.kotlin.android.synthetic.descriptors.AndroidSyntheticPackageFragmentDescriptor.AndroidExtensionPropertiesScope[ClassConstructorDescriptorImpl]

'scope' @ [49:50] ==> private final val scope: AndroidSyntheticPackageFragmentDescriptor.AndroidExtensionPropertiesScope defined in org.jetbrains.kotlin.android.synthetic.descriptors.AndroidSyntheticPackageFragmentDescriptor[PropertyDescriptorImpl]

'MemberScopeImpl' @ [51:59] ==> public constructor MemberScopeImpl() defined in org.jetbrains.kotlin.resolve.scopes.MemberScopeImpl[DeserializedClassConstructorDescriptor]

'storageManager' @ [52:34] ==> private final val storageManager: StorageManager defined in org.jetbrains.kotlin.android.synthetic.descriptors.AndroidSyntheticPackageFragmentDescriptor[PropertyDescriptorImpl]

'createLazyValue' @ [52:49] ==> public abstract fun <T : Any> createLazyValue(computable: () -> ArrayList<PropertyDescriptor>): NotNullLazyValue<ArrayList<PropertyDescriptor>> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ArrayList<PropertyDescriptor>

'this@AndroidSyntheticPackageFragmentDescriptor' @ [53:45] ==> <this> defined in org.jetbrains.kotlin.android.synthetic.descriptors.AndroidSyntheticPackageFragmentDescriptor[LazyClassReceiverParameterDescriptor]

'invoke' @ [55:27] ==> internal final operator fun invoke(): SyntheticElementResolveContext defined in org.jetbrains.kotlin.android.synthetic.descriptors.LazySyntheticElementResolveContext[SimpleFunctionDescriptorImpl]

'context' @ [56:35] ==> val context: SyntheticElementResolveContext defined in org.jetbrains.kotlin.android.synthetic.descriptors.AndroidSyntheticPackageFragmentDescriptor.AndroidExtensionPropertiesScope.properties.<anonymous>[LocalVariableDescriptor]

'getWidgetReceivers' @ [56:43] ==> public final fun getWidgetReceivers(forView: Boolean, isExperimental: Boolean): List<WidgetReceiver> defined in org.jetbrains.kotlin.android.synthetic.descriptors.SyntheticElementResolveContext[SimpleFunctionDescriptorImpl]

'packageData' @ [56:62] ==> public final val packageData: AndroidSyntheticPackageData defined in org.jetbrains.kotlin.android.synthetic.descriptors.AndroidSyntheticPackageFragmentDescriptor[PropertyDescriptorImpl]

'forView' @ [56:74] ==> public final val forView: Boolean defined in org.jetbrains.kotlin.android.synthetic.descriptors.AndroidSyntheticPackageData[PropertyDescriptorImpl]

'isExperimental' @ [56:83] ==> private final val isExperimental: Boolean defined in org.jetbrains.kotlin.android.synthetic.descriptors.AndroidSyntheticPackageFragmentDescriptor[PropertyDescriptorImpl]

'context' @ [57:33] ==> val context: SyntheticElementResolveContext defined in org.jetbrains.kotlin.android.synthetic.descriptors.AndroidSyntheticPackageFragmentDescriptor.AndroidExtensionPropertiesScope.properties.<anonymous>[LocalVariableDescriptor]

'fragmentTypes' @ [57:41] ==> public final val fragmentTypes: List<Pair<SimpleType, SimpleType>> defined in org.jetbrains.kotlin.android.synthetic.descriptors.SyntheticElementResolveContext[PropertyDescriptorImpl]

'ArrayList' @ [59:30] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PropertyDescriptor

'packageData' @ [60:30] ==> public final val packageData: AndroidSyntheticPackageData defined in org.jetbrains.kotlin.android.synthetic.descriptors.AndroidSyntheticPackageFragmentDescriptor[PropertyDescriptorImpl]

'resources' @ [60:42] ==> public final val resources: List<AndroidResource> defined in org.jetbrains.kotlin.android.synthetic.descriptors.AndroidSyntheticPackageData[PropertyDescriptorImpl]

'when (resource) {
                    is AndroidResource.Widget -> {
                        val resolvedWidget = resource.resolve(module)
                        if (resolvedWidget != null) {
                            for (receiver in widgetReceivers) {
                                properties += genPropertyForWidget(packageFragmentDescriptor, receiver.type, resolvedWidget, context)
                            }
                        }
                    }
                    is AndroidResource.Fragment -> if (!packageData.forView) {
                        for ((receiverType, type) in fragmentTypes) {
                            properties += genPropertyForFragment(packageFragmentDescriptor, receiverType, type, resource)
                        }
                    }
                }' @ [61:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'resource' @ [61:23] ==> val resource: AndroidResource defined in org.jetbrains.kotlin.android.synthetic.descriptors.AndroidSyntheticPackageFragmentDescriptor.AndroidExtensionPropertiesScope.properties.<anonymous>[LocalVariableDescriptor]

'resource' @ [63:46] ==> val resource: AndroidResource defined in org.jetbrains.kotlin.android.synthetic.descriptors.AndroidSyntheticPackageFragmentDescriptor.AndroidExtensionPropertiesScope.properties.<anonymous>[LocalVariableDescriptor]

'resolve' @ [63:55] ==> public fun AndroidResource.Widget.resolve(module: ModuleDescriptor): ResolvedWidget? defined in org.jetbrains.kotlin.android.synthetic.res in file androidResources.kt[SimpleFunctionDescriptorImpl]

'module' @ [63:63] ==> public val DeclarationDescriptor.module: ModuleDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'resolvedWidget' @ [64:29] ==> val resolvedWidget: ResolvedWidget? defined in org.jetbrains.kotlin.android.synthetic.descriptors.AndroidSyntheticPackageFragmentDescriptor.AndroidExtensionPropertiesScope.properties.<anonymous>[LocalVariableDescriptor]

'widgetReceivers' @ [65:46] ==> val widgetReceivers: List<WidgetReceiver> defined in org.jetbrains.kotlin.android.synthetic.descriptors.AndroidSyntheticPackageFragmentDescriptor.AndroidExtensionPropertiesScope.properties.<anonymous>[LocalVariableDescriptor]

'properties' @ [66:33] ==> val properties: ArrayList<PropertyDescriptor> defined in org.jetbrains.kotlin.android.synthetic.descriptors.AndroidSyntheticPackageFragmentDescriptor.AndroidExtensionPropertiesScope.properties.<anonymous>[LocalVariableDescriptor]

'genPropertyForWidget' @ [66:47] ==> internal fun genPropertyForWidget(packageFragmentDescriptor: AndroidSyntheticPackageFragmentDescriptor, receiverType: KotlinType, resolvedWidget: ResolvedWidget, context: SyntheticElementResolveContext): PropertyDescriptor defined in org.jetbrains.kotlin.android.synthetic.res in file syntheticDescriptorGeneration.kt[SimpleFunctionDescriptorImpl]

'packageFragmentDescriptor' @ [66:68] ==> val packageFragmentDescriptor: AndroidSyntheticPackageFragmentDescriptor defined in org.jetbrains.kotlin.android.synthetic.descriptors.AndroidSyntheticPackageFragmentDescriptor.AndroidExtensionPropertiesScope.properties.<anonymous>[LocalVariableDescriptor]

'receiver' @ [66:95] ==> val receiver: WidgetReceiver defined in org.jetbrains.kotlin.android.synthetic.descriptors.AndroidSyntheticPackageFragmentDescriptor.AndroidExtensionPropertiesScope.properties.<anonymous>[LocalVariableDescriptor]

'type' @ [66:104] ==> public final val type: SimpleType defined in org.jetbrains.kotlin.android.synthetic.descriptors.WidgetReceiver[PropertyDescriptorImpl]

'resolvedWidget' @ [66:110] ==> val resolvedWidget: ResolvedWidget? defined in org.jetbrains.kotlin.android.synthetic.descriptors.AndroidSyntheticPackageFragmentDescriptor.AndroidExtensionPropertiesScope.properties.<anonymous>[LocalVariableDescriptor]

'context' @ [66:126] ==> val context: SyntheticElementResolveContext defined in org.jetbrains.kotlin.android.synthetic.descriptors.AndroidSyntheticPackageFragmentDescriptor.AndroidExtensionPropertiesScope.properties.<anonymous>[LocalVariableDescriptor]

'!' @ [70:56] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'packageData' @ [70:57] ==> public final val packageData: AndroidSyntheticPackageData defined in org.jetbrains.kotlin.android.synthetic.descriptors.AndroidSyntheticPackageFragmentDescriptor[PropertyDescriptorImpl]

'forView' @ [70:69] ==> public final val forView: Boolean defined in org.jetbrains.kotlin.android.synthetic.descriptors.AndroidSyntheticPackageData[PropertyDescriptorImpl]

'component1' @ [71:31] ==> public final operator fun component1(): SimpleType defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [71:45] ==> public final operator fun component2(): SimpleType defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'fragmentTypes' @ [71:54] ==> val fragmentTypes: List<Pair<SimpleType, SimpleType>> defined in org.jetbrains.kotlin.android.synthetic.descriptors.AndroidSyntheticPackageFragmentDescriptor.AndroidExtensionPropertiesScope.properties.<anonymous>[LocalVariableDescriptor]

'properties' @ [72:29] ==> val properties: ArrayList<PropertyDescriptor> defined in org.jetbrains.kotlin.android.synthetic.descriptors.AndroidSyntheticPackageFragmentDescriptor.AndroidExtensionPropertiesScope.properties.<anonymous>[LocalVariableDescriptor]

'genPropertyForFragment' @ [72:43] ==> internal fun genPropertyForFragment(packageFragmentDescriptor: AndroidSyntheticPackageFragmentDescriptor, receiverType: KotlinType, type: SimpleType, fragment: AndroidResource.Fragment): PropertyDescriptor defined in org.jetbrains.kotlin.android.synthetic.res in file syntheticDescriptorGeneration.kt[SimpleFunctionDescriptorImpl]

'packageFragmentDescriptor' @ [72:66] ==> val packageFragmentDescriptor: AndroidSyntheticPackageFragmentDescriptor defined in org.jetbrains.kotlin.android.synthetic.descriptors.AndroidSyntheticPackageFragmentDescriptor.AndroidExtensionPropertiesScope.properties.<anonymous>[LocalVariableDescriptor]

'receiverType' @ [72:93] ==> val receiverType: SimpleType defined in org.jetbrains.kotlin.android.synthetic.descriptors.AndroidSyntheticPackageFragmentDescriptor.AndroidExtensionPropertiesScope.properties.<anonymous>[LocalVariableDescriptor]

'type' @ [72:107] ==> val type: SimpleType defined in org.jetbrains.kotlin.android.synthetic.descriptors.AndroidSyntheticPackageFragmentDescriptor.AndroidExtensionPropertiesScope.properties.<anonymous>[LocalVariableDescriptor]

'resource' @ [72:113] ==> val resource: AndroidResource defined in org.jetbrains.kotlin.android.synthetic.descriptors.AndroidSyntheticPackageFragmentDescriptor.AndroidExtensionPropertiesScope.properties.<anonymous>[LocalVariableDescriptor]

'properties' @ [78:13] ==> val properties: ArrayList<PropertyDescriptor> defined in org.jetbrains.kotlin.android.synthetic.descriptors.AndroidSyntheticPackageFragmentDescriptor.AndroidExtensionPropertiesScope.properties.<anonymous>[LocalVariableDescriptor]

'invoke' @ [82:17] ==> public abstract fun invoke(): ArrayList<PropertyDescriptor> defined in org.jetbrains.kotlin.storage.NotNullLazyValue[FunctionInvokeDescriptor]

'filter' @ [82:30] ==> public inline fun <T> Iterable<PropertyDescriptor>.filter(predicate: (PropertyDescriptor) -> Boolean): List<PropertyDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyDescriptor

'kindFilter' @ [82:39] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.android.synthetic.descriptors.AndroidSyntheticPackageFragmentDescriptor.AndroidExtensionPropertiesScope.getContributedDescriptors[ValueParameterDescriptorImpl]

'acceptsKinds' @ [82:50] ==> public final fun acceptsKinds(kinds: Int): Boolean defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedSimpleFunctionDescriptor]

'VARIABLES_MASK' @ [82:84] ==> public final val VARIABLES_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'invoke' @ [82:103] ==> public abstract operator fun invoke(p1: Name): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [82:114] ==> value-parameter it: PropertyDescriptor defined in org.jetbrains.kotlin.android.synthetic.descriptors.AndroidSyntheticPackageFragmentDescriptor.AndroidExtensionPropertiesScope.getContributedDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [82:117] ==> public final val PropertyDescriptor.name: Name[MyPropertyDescriptor]

'invoke' @ [84:86] ==> public abstract fun invoke(): ArrayList<PropertyDescriptor> defined in org.jetbrains.kotlin.storage.NotNullLazyValue[FunctionInvokeDescriptor]

'filter' @ [84:99] ==> public inline fun <T> Iterable<PropertyDescriptor>.filter(predicate: (PropertyDescriptor) -> Boolean): List<PropertyDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyDescriptor

'it' @ [84:108] ==> value-parameter it: PropertyDescriptor defined in org.jetbrains.kotlin.android.synthetic.descriptors.AndroidSyntheticPackageFragmentDescriptor.AndroidExtensionPropertiesScope.getContributedVariables.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [84:111] ==> public final val PropertyDescriptor.name: Name[MyPropertyDescriptor]

'name' @ [84:119] ==> value-parameter name: Name defined in org.jetbrains.kotlin.android.synthetic.descriptors.AndroidSyntheticPackageFragmentDescriptor.AndroidExtensionPropertiesScope.getContributedVariables[ValueParameterDescriptorImpl]

'p' @ [87:13] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.android.synthetic.descriptors.AndroidSyntheticPackageFragmentDescriptor.AndroidExtensionPropertiesScope.printScopeStructure[ValueParameterDescriptorImpl]

'println' @ [87:15] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'this' @ [87:23] ==> <this> defined in org.jetbrains.kotlin.android.synthetic.descriptors.AndroidSyntheticPackageFragmentDescriptor.AndroidExtensionPropertiesScope[LazyClassReceiverParameterDescriptor]

'java' @ [87:35] ==> public val <T> KClass<out AndroidSyntheticPackageFragmentDescriptor.AndroidExtensionPropertiesScope>.java: Class<out AndroidSyntheticPackageFragmentDescriptor.AndroidExtensionPropertiesScope> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out AndroidExtensionPropertiesScope)

'simpleName' @ [87:40] ==> public final val <T : (Any..Any?)> Class<out AndroidSyntheticPackageFragmentDescriptor.AndroidExtensionPropertiesScope>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out AndroidExtensionPropertiesScope)

