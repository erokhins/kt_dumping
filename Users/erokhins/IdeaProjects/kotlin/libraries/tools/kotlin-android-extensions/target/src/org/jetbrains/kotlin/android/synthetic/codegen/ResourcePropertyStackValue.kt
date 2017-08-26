'StackValue' @ [41:5] ==> protected/*protected and package*/ constructor StackValue(@NotNull p0: Type) defined in org.jetbrains.kotlin.codegen.StackValue[JavaClassConstructorDescriptor]

'typeMapper' @ [41:16] ==> value-parameter typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue.<init>[ValueParameterDescriptorImpl]

'mapType' @ [41:27] ==> @NotNull public open fun mapType(@NotNull p0: KotlinType): Type defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'resource' @ [41:35] ==> value-parameter resource: PropertyDescriptor defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue.<init>[ValueParameterDescriptorImpl]

'returnType' @ [41:44] ==> public final val PropertyDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'containerOptions' @ [42:39] ==> private final val containerOptions: ContainerOptionsProxy defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue[PropertyDescriptorImpl]

'containerType' @ [42:56] ==> public final val containerType: AndroidContainerType defined in org.jetbrains.kotlin.android.synthetic.descriptors.ContainerOptionsProxy[PropertyDescriptorImpl]

'assert' @ [45:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'containerOptions' @ [45:16] ==> private final val containerOptions: ContainerOptionsProxy defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue[PropertyDescriptorImpl]

'containerType' @ [45:33] ==> public final val containerType: AndroidContainerType defined in org.jetbrains.kotlin.android.synthetic.descriptors.ContainerOptionsProxy[PropertyDescriptorImpl]

'AndroidContainerType' @ [45:50] ==> public companion object defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[FakeCallableDescriptorForObject]

'UNKNOWN' @ [45:71] ==> enum entry UNKNOWN defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[FakeCallableDescriptorForObject]

'typeMapper' @ [49:32] ==> private final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue[PropertyDescriptorImpl]

'mapType' @ [49:43] ==> @NotNull public open fun mapType(@NotNull p0: KotlinType): Type defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'resource' @ [49:51] ==> public final val resource: PropertyDescriptor defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue[PropertyDescriptorImpl]

'type' @ [49:60] ==> public final val PropertyDescriptor.type: KotlinType[MyPropertyDescriptor]

'lowerIfFlexible' @ [49:65] ==> public fun KotlinType.lowerIfFlexible(): SimpleType defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'className' @ [49:84] ==> public final val Type.className: (String..String?)[MyPropertyDescriptor]

'AndroidConst' @ [50:13] ==> public object AndroidConst defined in org.jetbrains.kotlin.android.synthetic in file AndroidConst.kt[FakeCallableDescriptorForObject]

'FRAGMENT_FQNAME' @ [50:26] ==> public final val FRAGMENT_FQNAME: String defined in org.jetbrains.kotlin.android.synthetic.AndroidConst[PropertyDescriptorImpl]

'returnTypeString' @ [50:45] ==> val returnTypeString: (String..String?) defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue.putSelector[LocalVariableDescriptor]

'AndroidConst' @ [50:65] ==> public object AndroidConst defined in org.jetbrains.kotlin.android.synthetic in file AndroidConst.kt[FakeCallableDescriptorForObject]

'SUPPORT_FRAGMENT_FQNAME' @ [50:78] ==> public final val SUPPORT_FRAGMENT_FQNAME: String defined in org.jetbrains.kotlin.android.synthetic.AndroidConst[PropertyDescriptorImpl]

'returnTypeString' @ [50:105] ==> val returnTypeString: (String..String?) defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue.putSelector[LocalVariableDescriptor]

'putSelectorForFragment' @ [51:20] ==> private final fun putSelectorForFragment(v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue[SimpleFunctionDescriptorImpl]

'v' @ [51:43] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue.putSelector[ValueParameterDescriptorImpl]

'resource' @ [54:33] ==> public final val resource: PropertyDescriptor defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue[PropertyDescriptorImpl]

'if ((containerOptions.cache ?: globalCacheImpl).hasCache && shouldCacheResource(resource)) {
            val declarationDescriptorType = typeMapper.mapType(container)
            receiver.put(declarationDescriptorType, v)

            val resourceId = syntheticProperty.resource.id
            val packageName = resourceId.packageName ?: androidPackage
            v.getstatic(packageName.replace(".", "/") + "/R\$id", resourceId.name, "I")

            v.invokevirtual(declarationDescriptorType.internalName, CACHED_FIND_VIEW_BY_ID_METHOD_NAME, "(I)Landroid/view/View;", false)
        }
        else {
            when (containerType) {
                AndroidContainerType.ACTIVITY, AndroidContainerType.SUPPORT_FRAGMENT_ACTIVITY, AndroidContainerType.VIEW, AndroidContainerType.DIALOG -> {
                    receiver.put(Type.getType("L${containerType.internalClassName};"), v)
                    getResourceId(v)
                    v.invokevirtual(containerType.internalClassName, "findViewById", "(I)Landroid/view/View;", false)
                }
                AndroidContainerType.FRAGMENT, AndroidContainerType.SUPPORT_FRAGMENT -> {
                    receiver.put(Type.getType("L${containerType.internalClassName};"), v)
                    v.invokevirtual(containerType.internalClassName, "getView", "()Landroid/view/View;", false)
                    getResourceId(v)
                    v.invokevirtual("android/view/View", "findViewById", "(I)Landroid/view/View;", false)
                }
                AndroidContainerType.LAYOUT_CONTAINER -> {
                    receiver.put(Type.getType("L${containerType.internalClassName};"), v)
                    v.invokevirtual(containerType.internalClassName, "getEntityView", "()Landroid/view/View;", false)
                    getResourceId(v)
                    v.invokevirtual("android/view/View", "findViewById", "(I)Landroid/view/View;", false)
                }
                else -> throw IllegalStateException("Invalid Android class type: $containerType") // Should never occur
            }
        }' @ [56:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'containerOptions' @ [56:14] ==> private final val containerOptions: ContainerOptionsProxy defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue[PropertyDescriptorImpl]

'cache' @ [56:31] ==> public final val cache: CacheImplementation? defined in org.jetbrains.kotlin.android.synthetic.descriptors.ContainerOptionsProxy[PropertyDescriptorImpl]

'globalCacheImpl' @ [56:40] ==> private final val globalCacheImpl: CacheImplementation defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue[PropertyDescriptorImpl]

'hasCache' @ [56:57] ==> public final val hasCache: Boolean defined in kotlinx.android.extensions.CacheImplementation[PropertyDescriptorImpl]

'shouldCacheResource' @ [56:69] ==> public final fun shouldCacheResource(resource: PropertyDescriptor): Boolean defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.Companion[FunctionImportedFromObject]

'resource' @ [56:89] ==> public final val resource: PropertyDescriptor defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue[PropertyDescriptorImpl]

'typeMapper' @ [57:45] ==> private final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue[PropertyDescriptorImpl]

'mapType' @ [57:56] ==> @NotNull public open fun mapType(@NotNull p0: ClassifierDescriptor): Type defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'container' @ [57:64] ==> public final val container: ClassDescriptor defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue[PropertyDescriptorImpl]

'receiver' @ [58:13] ==> public final val receiver: StackValue defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue[PropertyDescriptorImpl]

'put' @ [58:22] ==> public open fun put(@NotNull p0: Type, @NotNull p1: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'declarationDescriptorType' @ [58:26] ==> val declarationDescriptorType: Type defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue.putSelector[LocalVariableDescriptor]

'v' @ [58:53] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue.putSelector[ValueParameterDescriptorImpl]

'syntheticProperty' @ [60:30] ==> val syntheticProperty: AndroidSyntheticProperty defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue.putSelector[LocalVariableDescriptor]

'resource' @ [60:48] ==> public abstract val resource: AndroidResource defined in org.jetbrains.kotlin.android.synthetic.res.AndroidSyntheticProperty[PropertyDescriptorImpl]

'id' @ [60:57] ==> public final val id: ResourceIdentifier defined in org.jetbrains.kotlin.android.synthetic.res.AndroidResource[PropertyDescriptorImpl]

'resourceId' @ [61:31] ==> val resourceId: ResourceIdentifier defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue.putSelector[LocalVariableDescriptor]

'packageName' @ [61:42] ==> public final val packageName: String? defined in org.jetbrains.kotlin.android.synthetic.res.ResourceIdentifier[PropertyDescriptorImpl]

'androidPackage' @ [61:57] ==> private final val androidPackage: String defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue[PropertyDescriptorImpl]

'v' @ [62:13] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue.putSelector[ValueParameterDescriptorImpl]

'getstatic' @ [62:15] ==> public open fun getstatic(p0: (String..String?), p1: (String..String?), p2: (String..String?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'packageName' @ [62:25] ==> val packageName: String defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue.putSelector[LocalVariableDescriptor]

'replace' @ [62:37] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'resourceId' @ [62:67] ==> val resourceId: ResourceIdentifier defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue.putSelector[LocalVariableDescriptor]

'name' @ [62:78] ==> public final val name: String defined in org.jetbrains.kotlin.android.synthetic.res.ResourceIdentifier[PropertyDescriptorImpl]

'v' @ [64:13] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue.putSelector[ValueParameterDescriptorImpl]

'invokevirtual' @ [64:15] ==> public open fun invokevirtual(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'declarationDescriptorType' @ [64:29] ==> val declarationDescriptorType: Type defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue.putSelector[LocalVariableDescriptor]

'internalName' @ [64:55] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'CACHED_FIND_VIEW_BY_ID_METHOD_NAME' @ [64:69] ==> public final val CACHED_FIND_VIEW_BY_ID_METHOD_NAME: String defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.Companion[PropertyImportedFromObject]

'when (containerType) {
                AndroidContainerType.ACTIVITY, AndroidContainerType.SUPPORT_FRAGMENT_ACTIVITY, AndroidContainerType.VIEW, AndroidContainerType.DIALOG -> {
                    receiver.put(Type.getType("L${containerType.internalClassName};"), v)
                    getResourceId(v)
                    v.invokevirtual(containerType.internalClassName, "findViewById", "(I)Landroid/view/View;", false)
                }
                AndroidContainerType.FRAGMENT, AndroidContainerType.SUPPORT_FRAGMENT -> {
                    receiver.put(Type.getType("L${containerType.internalClassName};"), v)
                    v.invokevirtual(containerType.internalClassName, "getView", "()Landroid/view/View;", false)
                    getResourceId(v)
                    v.invokevirtual("android/view/View", "findViewById", "(I)Landroid/view/View;", false)
                }
                AndroidContainerType.LAYOUT_CONTAINER -> {
                    receiver.put(Type.getType("L${containerType.internalClassName};"), v)
                    v.invokevirtual(containerType.internalClassName, "getEntityView", "()Landroid/view/View;", false)
                    getResourceId(v)
                    v.invokevirtual("android/view/View", "findViewById", "(I)Landroid/view/View;", false)
                }
                else -> throw IllegalStateException("Invalid Android class type: $containerType") // Should never occur
            }' @ [67:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'containerType' @ [67:19] ==> private final val containerType: AndroidContainerType defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue[PropertyDescriptorImpl]

'AndroidContainerType' @ [68:17] ==> public companion object defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[FakeCallableDescriptorForObject]

'ACTIVITY' @ [68:38] ==> enum entry ACTIVITY defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[FakeCallableDescriptorForObject]

'AndroidContainerType' @ [68:48] ==> public companion object defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[FakeCallableDescriptorForObject]

'SUPPORT_FRAGMENT_ACTIVITY' @ [68:69] ==> enum entry SUPPORT_FRAGMENT_ACTIVITY defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[FakeCallableDescriptorForObject]

'AndroidContainerType' @ [68:96] ==> public companion object defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[FakeCallableDescriptorForObject]

'VIEW' @ [68:117] ==> enum entry VIEW defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[FakeCallableDescriptorForObject]

'AndroidContainerType' @ [68:123] ==> public companion object defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[FakeCallableDescriptorForObject]

'DIALOG' @ [68:144] ==> enum entry DIALOG defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[FakeCallableDescriptorForObject]

'receiver' @ [69:21] ==> public final val receiver: StackValue defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue[PropertyDescriptorImpl]

'put' @ [69:30] ==> public open fun put(@NotNull p0: Type, @NotNull p1: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'getType' @ [69:39] ==> public open fun getType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'containerType' @ [69:51] ==> private final val containerType: AndroidContainerType defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue[PropertyDescriptorImpl]

'internalClassName' @ [69:65] ==> public final val internalClassName: String defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[PropertyDescriptorImpl]

'v' @ [69:88] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue.putSelector[ValueParameterDescriptorImpl]

'getResourceId' @ [70:21] ==> private final fun getResourceId(v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue[SimpleFunctionDescriptorImpl]

'v' @ [70:35] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue.putSelector[ValueParameterDescriptorImpl]

'v' @ [71:21] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue.putSelector[ValueParameterDescriptorImpl]

'invokevirtual' @ [71:23] ==> public open fun invokevirtual(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'containerType' @ [71:37] ==> private final val containerType: AndroidContainerType defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue[PropertyDescriptorImpl]

'internalClassName' @ [71:51] ==> public final val internalClassName: String defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[PropertyDescriptorImpl]

'AndroidContainerType' @ [73:17] ==> public companion object defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[FakeCallableDescriptorForObject]

'FRAGMENT' @ [73:38] ==> enum entry FRAGMENT defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[FakeCallableDescriptorForObject]

'AndroidContainerType' @ [73:48] ==> public companion object defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[FakeCallableDescriptorForObject]

'SUPPORT_FRAGMENT' @ [73:69] ==> enum entry SUPPORT_FRAGMENT defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[FakeCallableDescriptorForObject]

'receiver' @ [74:21] ==> public final val receiver: StackValue defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue[PropertyDescriptorImpl]

'put' @ [74:30] ==> public open fun put(@NotNull p0: Type, @NotNull p1: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'getType' @ [74:39] ==> public open fun getType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'containerType' @ [74:51] ==> private final val containerType: AndroidContainerType defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue[PropertyDescriptorImpl]

'internalClassName' @ [74:65] ==> public final val internalClassName: String defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[PropertyDescriptorImpl]

'v' @ [74:88] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue.putSelector[ValueParameterDescriptorImpl]

'v' @ [75:21] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue.putSelector[ValueParameterDescriptorImpl]

'invokevirtual' @ [75:23] ==> public open fun invokevirtual(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'containerType' @ [75:37] ==> private final val containerType: AndroidContainerType defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue[PropertyDescriptorImpl]

'internalClassName' @ [75:51] ==> public final val internalClassName: String defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[PropertyDescriptorImpl]

'getResourceId' @ [76:21] ==> private final fun getResourceId(v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue[SimpleFunctionDescriptorImpl]

'v' @ [76:35] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue.putSelector[ValueParameterDescriptorImpl]

'v' @ [77:21] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue.putSelector[ValueParameterDescriptorImpl]

'invokevirtual' @ [77:23] ==> public open fun invokevirtual(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'AndroidContainerType' @ [79:17] ==> public companion object defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[FakeCallableDescriptorForObject]

'LAYOUT_CONTAINER' @ [79:38] ==> enum entry LAYOUT_CONTAINER defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[FakeCallableDescriptorForObject]

'receiver' @ [80:21] ==> public final val receiver: StackValue defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue[PropertyDescriptorImpl]

'put' @ [80:30] ==> public open fun put(@NotNull p0: Type, @NotNull p1: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'getType' @ [80:39] ==> public open fun getType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'containerType' @ [80:51] ==> private final val containerType: AndroidContainerType defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue[PropertyDescriptorImpl]

'internalClassName' @ [80:65] ==> public final val internalClassName: String defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[PropertyDescriptorImpl]

'v' @ [80:88] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue.putSelector[ValueParameterDescriptorImpl]

'v' @ [81:21] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue.putSelector[ValueParameterDescriptorImpl]

'invokevirtual' @ [81:23] ==> public open fun invokevirtual(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'containerType' @ [81:37] ==> private final val containerType: AndroidContainerType defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue[PropertyDescriptorImpl]

'internalClassName' @ [81:51] ==> public final val internalClassName: String defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[PropertyDescriptorImpl]

'getResourceId' @ [82:21] ==> private final fun getResourceId(v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue[SimpleFunctionDescriptorImpl]

'v' @ [82:35] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue.putSelector[ValueParameterDescriptorImpl]

'v' @ [83:21] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue.putSelector[ValueParameterDescriptorImpl]

'invokevirtual' @ [83:23] ==> public open fun invokevirtual(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'IllegalStateException' @ [85:31] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'containerType' @ [85:83] ==> private final val containerType: AndroidContainerType defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue[PropertyDescriptorImpl]

'v' @ [89:9] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue.putSelector[ValueParameterDescriptorImpl]

'checkcast' @ [89:11] ==> public open fun checkcast(p0: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'this' @ [89:21] ==> <this> defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue[LazyClassReceiverParameterDescriptor]

'type' @ [89:26] ==> @NotNull public final val type: Type defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue[JavaPropertyDescriptor]

'receiver' @ [93:9] ==> public final val receiver: StackValue defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue[PropertyDescriptorImpl]

'put' @ [93:18] ==> public open fun put(@NotNull p0: Type, @NotNull p1: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'getType' @ [93:27] ==> public open fun getType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'containerType' @ [93:39] ==> private final val containerType: AndroidContainerType defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue[PropertyDescriptorImpl]

'internalClassName' @ [93:53] ==> public final val internalClassName: String defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[PropertyDescriptorImpl]

'v' @ [93:76] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue.putSelectorForFragment[ValueParameterDescriptorImpl]

'when (containerType) {
            AndroidContainerType.ACTIVITY, AndroidContainerType.FRAGMENT -> {
                v.invokevirtual(containerType.internalClassName, "getFragmentManager", "()Landroid/app/FragmentManager;", false)
                getResourceId(v)
                v.invokevirtual("android/app/FragmentManager", "findFragmentById", "(I)Landroid/app/Fragment;", false)
            }
            AndroidContainerType.SUPPORT_FRAGMENT -> {
                v.invokevirtual(containerType.internalClassName, "getFragmentManager", "()Landroid/support/v4/app/FragmentManager;", false)
                getResourceId(v)
                v.invokevirtual("android/support/v4/app/FragmentManager", "findFragmentById", "(I)Landroid/support/v4/app/Fragment;", false)
            }
            AndroidContainerType.SUPPORT_FRAGMENT_ACTIVITY -> {
                v.invokevirtual(containerType.internalClassName, "getSupportFragmentManager", "()Landroid/support/v4/app/FragmentManager;", false)
                getResourceId(v)
                v.invokevirtual("android/support/v4/app/FragmentManager", "findFragmentById", "(I)Landroid/support/v4/app/Fragment;", false)
            }
            else -> throw IllegalStateException("Invalid Android class type: $containerType") // Should never occur
        }' @ [95:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'containerType' @ [95:15] ==> private final val containerType: AndroidContainerType defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue[PropertyDescriptorImpl]

'AndroidContainerType' @ [96:13] ==> public companion object defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[FakeCallableDescriptorForObject]

'ACTIVITY' @ [96:34] ==> enum entry ACTIVITY defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[FakeCallableDescriptorForObject]

'AndroidContainerType' @ [96:44] ==> public companion object defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[FakeCallableDescriptorForObject]

'FRAGMENT' @ [96:65] ==> enum entry FRAGMENT defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[FakeCallableDescriptorForObject]

'v' @ [97:17] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue.putSelectorForFragment[ValueParameterDescriptorImpl]

'invokevirtual' @ [97:19] ==> public open fun invokevirtual(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'containerType' @ [97:33] ==> private final val containerType: AndroidContainerType defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue[PropertyDescriptorImpl]

'internalClassName' @ [97:47] ==> public final val internalClassName: String defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[PropertyDescriptorImpl]

'getResourceId' @ [98:17] ==> private final fun getResourceId(v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue[SimpleFunctionDescriptorImpl]

'v' @ [98:31] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue.putSelectorForFragment[ValueParameterDescriptorImpl]

'v' @ [99:17] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue.putSelectorForFragment[ValueParameterDescriptorImpl]

'invokevirtual' @ [99:19] ==> public open fun invokevirtual(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'AndroidContainerType' @ [101:13] ==> public companion object defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[FakeCallableDescriptorForObject]

'SUPPORT_FRAGMENT' @ [101:34] ==> enum entry SUPPORT_FRAGMENT defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[FakeCallableDescriptorForObject]

'v' @ [102:17] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue.putSelectorForFragment[ValueParameterDescriptorImpl]

'invokevirtual' @ [102:19] ==> public open fun invokevirtual(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'containerType' @ [102:33] ==> private final val containerType: AndroidContainerType defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue[PropertyDescriptorImpl]

'internalClassName' @ [102:47] ==> public final val internalClassName: String defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[PropertyDescriptorImpl]

'getResourceId' @ [103:17] ==> private final fun getResourceId(v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue[SimpleFunctionDescriptorImpl]

'v' @ [103:31] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue.putSelectorForFragment[ValueParameterDescriptorImpl]

'v' @ [104:17] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue.putSelectorForFragment[ValueParameterDescriptorImpl]

'invokevirtual' @ [104:19] ==> public open fun invokevirtual(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'AndroidContainerType' @ [106:13] ==> public companion object defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[FakeCallableDescriptorForObject]

'SUPPORT_FRAGMENT_ACTIVITY' @ [106:34] ==> enum entry SUPPORT_FRAGMENT_ACTIVITY defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[FakeCallableDescriptorForObject]

'v' @ [107:17] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue.putSelectorForFragment[ValueParameterDescriptorImpl]

'invokevirtual' @ [107:19] ==> public open fun invokevirtual(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'containerType' @ [107:33] ==> private final val containerType: AndroidContainerType defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue[PropertyDescriptorImpl]

'internalClassName' @ [107:47] ==> public final val internalClassName: String defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[PropertyDescriptorImpl]

'getResourceId' @ [108:17] ==> private final fun getResourceId(v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue[SimpleFunctionDescriptorImpl]

'v' @ [108:31] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue.putSelectorForFragment[ValueParameterDescriptorImpl]

'v' @ [109:17] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue.putSelectorForFragment[ValueParameterDescriptorImpl]

'invokevirtual' @ [109:19] ==> public open fun invokevirtual(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'IllegalStateException' @ [111:27] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'containerType' @ [111:79] ==> private final val containerType: AndroidContainerType defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue[PropertyDescriptorImpl]

'v' @ [114:9] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue.putSelectorForFragment[ValueParameterDescriptorImpl]

'checkcast' @ [114:11] ==> public open fun checkcast(p0: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'this' @ [114:21] ==> <this> defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue[LazyClassReceiverParameterDescriptor]

'type' @ [114:26] ==> @NotNull public final val type: Type defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue[JavaPropertyDescriptor]

'v' @ [118:9] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue.getResourceId[ValueParameterDescriptorImpl]

'getstatic' @ [118:11] ==> public open fun getstatic(p0: (String..String?), p1: (String..String?), p2: (String..String?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'androidPackage' @ [118:21] ==> private final val androidPackage: String defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue[PropertyDescriptorImpl]

'replace' @ [118:36] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'resource' @ [118:66] ==> public final val resource: PropertyDescriptor defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue[PropertyDescriptorImpl]

'name' @ [118:75] ==> public final val PropertyDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [118:80] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

