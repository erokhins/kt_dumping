'==' @ [57:65] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'resource' @ [57:66] ==> value-parameter resource: PropertyDescriptor defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.Companion.shouldCacheResource[ValueParameterDescriptorImpl]

'shouldBeCached' @ [57:106] ==> public abstract val shouldBeCached: Boolean defined in org.jetbrains.kotlin.android.synthetic.res.AndroidSyntheticProperty[PropertyDescriptorImpl]

'this' @ [70:80] ==> <this> defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.getCacheOrDefault[ReceiverParameterDescriptorImpl]

'cache' @ [70:85] ==> public final val cache: CacheImplementation? defined in org.jetbrains.kotlin.android.synthetic.descriptors.ContainerOptionsProxy[PropertyDescriptorImpl]

'getGlobalCacheImpl' @ [70:94] ==> protected abstract fun getGlobalCacheImpl(element: KtElement?): CacheImplementation defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension[SimpleFunctionDescriptorImpl]

'element' @ [70:113] ==> value-parameter element: KtElement? defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.getCacheOrDefault[ValueParameterDescriptorImpl]

'resolvedCall' @ [73:35] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.applyProperty[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [73:48] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'if (resultingDescriptor is PropertyDescriptor) {
            return generateResourcePropertyCall(receiver, resolvedCall, c, resultingDescriptor)
        }
        else null' @ [74:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: StackValue?, elseBranch: StackValue?): StackValue?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> StackValue?

'resultingDescriptor' @ [74:20] ==> val resultingDescriptor: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.applyProperty[LocalVariableDescriptor]

'generateResourcePropertyCall' @ [75:20] ==> private final fun generateResourcePropertyCall(receiver: StackValue, resolvedCall: ResolvedCall<*>, c: ExpressionCodegenExtension.Context, resource: PropertyDescriptor): StackValue? defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension[SimpleFunctionDescriptorImpl]

'receiver' @ [75:49] ==> value-parameter receiver: StackValue defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.applyProperty[ValueParameterDescriptorImpl]

'resolvedCall' @ [75:59] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.applyProperty[ValueParameterDescriptorImpl]

'c' @ [75:73] ==> value-parameter c: ExpressionCodegenExtension.Context defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.applyProperty[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [75:76] ==> val resultingDescriptor: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.applyProperty[LocalVariableDescriptor]

'resolvedCall' @ [81:30] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.applyFunction[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [81:43] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'resolvedCall' @ [82:9] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.applyFunction[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [82:22] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'if (targetCallable.name.asString() == AndroidConst.CLEAR_FUNCTION_NAME) {
            val container = resolvedCall.getReceiverDeclarationDescriptor() as? ClassDescriptor ?: return null
            generateClearFindViewByIdCacheFunctionCall(receiver, resolvedCall, container, c)
        }
        else {
            null
        }' @ [84:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: StackValue?, elseBranch: StackValue?): StackValue?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> StackValue?

'targetCallable' @ [84:20] ==> val targetCallable: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.applyFunction[LocalVariableDescriptor]

'name' @ [84:35] ==> public final val CallableDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [84:40] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'CLEAR_FUNCTION_NAME' @ [84:67] ==> public final val CLEAR_FUNCTION_NAME: String defined in org.jetbrains.kotlin.android.synthetic.AndroidConst[PropertyDescriptorImpl]

'resolvedCall' @ [85:29] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.applyFunction[ValueParameterDescriptorImpl]

'getReceiverDeclarationDescriptor' @ [85:42] ==> private final fun ResolvedCall<*>.getReceiverDeclarationDescriptor(): ClassifierDescriptor? defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension[SimpleFunctionDescriptorImpl]

'generateClearFindViewByIdCacheFunctionCall' @ [86:13] ==> private final fun generateClearFindViewByIdCacheFunctionCall(receiver: StackValue, resolvedCall: ResolvedCall<*>, container: ClassDescriptor, c: ExpressionCodegenExtension.Context): StackValue? defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension[SimpleFunctionDescriptorImpl]

'receiver' @ [86:56] ==> value-parameter receiver: StackValue defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.applyFunction[ValueParameterDescriptorImpl]

'resolvedCall' @ [86:66] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.applyFunction[ValueParameterDescriptorImpl]

'container' @ [86:80] ==> val container: ClassDescriptor defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.applyFunction[LocalVariableDescriptor]

'c' @ [86:91] ==> value-parameter c: ExpressionCodegenExtension.Context defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.applyFunction[ValueParameterDescriptorImpl]

'ContainerOptionsProxy' @ [99:32] ==> public companion object defined in org.jetbrains.kotlin.android.synthetic.descriptors.ContainerOptionsProxy[FakeCallableDescriptorForObject]

'create' @ [99:54] ==> public final fun create(container: ClassDescriptor): ContainerOptionsProxy defined in org.jetbrains.kotlin.android.synthetic.descriptors.ContainerOptionsProxy.Companion[SimpleFunctionDescriptorImpl]

'container' @ [99:61] ==> value-parameter container: ClassDescriptor defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClearFindViewByIdCacheFunctionCall[ValueParameterDescriptorImpl]

'!' @ [101:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'containerOptions' @ [101:14] ==> val containerOptions: ContainerOptionsProxy defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClearFindViewByIdCacheFunctionCall[LocalVariableDescriptor]

'getCacheOrDefault' @ [101:31] ==> private final fun ContainerOptionsProxy.getCacheOrDefault(element: KtElement?): CacheImplementation defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [101:49] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClearFindViewByIdCacheFunctionCall[ValueParameterDescriptorImpl]

'call' @ [101:62] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'calleeExpression' @ [101:67] ==> public final val Call.calleeExpression: KtExpression?[MyPropertyDescriptor]

'hasCache' @ [101:85] ==> public final val hasCache: Boolean defined in kotlinx.android.extensions.CacheImplementation[DeserializedPropertyDescriptor]

'functionCall' @ [102:31] ==> public open fun functionCall(p0: (Type..Type?), p1: (((InstructionAdapter..InstructionAdapter?)) -> (Unit..Unit?)..(((InstructionAdapter..InstructionAdapter?)) -> (Unit..Unit?))?)): (StackValue..StackValue?) defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'VOID_TYPE' @ [102:49] ==> public final val VOID_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'containerOptions' @ [105:13] ==> val containerOptions: ContainerOptionsProxy defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClearFindViewByIdCacheFunctionCall[LocalVariableDescriptor]

'containerType' @ [105:30] ==> public final val containerType: AndroidContainerType defined in org.jetbrains.kotlin.android.synthetic.descriptors.ContainerOptionsProxy[PropertyDescriptorImpl]

'UNKNOWN' @ [105:68] ==> enum entry UNKNOWN defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[FakeCallableDescriptorForObject]

'functionCall' @ [107:27] ==> public open fun functionCall(p0: (Type..Type?), p1: (((InstructionAdapter..InstructionAdapter?)) -> (Unit..Unit?)..(((InstructionAdapter..InstructionAdapter?)) -> (Unit..Unit?))?)): (StackValue..StackValue?) defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'VOID_TYPE' @ [107:45] ==> public final val VOID_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'c' @ [108:37] ==> value-parameter c: ExpressionCodegenExtension.Context defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClearFindViewByIdCacheFunctionCall[ValueParameterDescriptorImpl]

'typeMapper' @ [108:39] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.codegen.extensions.ExpressionCodegenExtension.Context[DeserializedPropertyDescriptor]

'mapType' @ [108:50] ==> @NotNull public open fun mapType(@NotNull p0: ClassifierDescriptor): Type defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'container' @ [108:58] ==> value-parameter container: ClassDescriptor defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClearFindViewByIdCacheFunctionCall[ValueParameterDescriptorImpl]

'internalName' @ [108:69] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'receiver' @ [110:13] ==> value-parameter receiver: StackValue defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClearFindViewByIdCacheFunctionCall[ValueParameterDescriptorImpl]

'put' @ [110:22] ==> public open fun put(@NotNull p0: Type, @NotNull p1: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'c' @ [110:26] ==> value-parameter c: ExpressionCodegenExtension.Context defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClearFindViewByIdCacheFunctionCall[ValueParameterDescriptorImpl]

'typeMapper' @ [110:28] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.codegen.extensions.ExpressionCodegenExtension.Context[DeserializedPropertyDescriptor]

'mapType' @ [110:39] ==> @NotNull public open fun mapType(@NotNull p0: ClassifierDescriptor): Type defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'container' @ [110:47] ==> value-parameter container: ClassDescriptor defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClearFindViewByIdCacheFunctionCall[ValueParameterDescriptorImpl]

'it' @ [110:59] ==> value-parameter it: (InstructionAdapter..InstructionAdapter?) defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClearFindViewByIdCacheFunctionCall.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [111:13] ==> value-parameter it: (InstructionAdapter..InstructionAdapter?) defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClearFindViewByIdCacheFunctionCall.<anonymous>[ValueParameterDescriptorImpl]

'invokevirtual' @ [111:16] ==> public open fun invokevirtual(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'bytecodeClassName' @ [111:30] ==> val bytecodeClassName: (String..String?) defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClearFindViewByIdCacheFunctionCall.<anonymous>[LocalVariableDescriptor]

'CLEAR_CACHE_METHOD_NAME' @ [111:49] ==> public final val CLEAR_CACHE_METHOD_NAME: String defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.Companion[PropertyDescriptorImpl]

'resource' @ [121:13] ==> value-parameter resource: PropertyDescriptor defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateResourcePropertyCall[ValueParameterDescriptorImpl]

'resource' @ [122:31] ==> value-parameter resource: PropertyDescriptor defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateResourcePropertyCall[ValueParameterDescriptorImpl]

'containingDeclaration' @ [122:40] ==> public final val PropertyDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'packageFragment' @ [123:30] ==> val packageFragment: AndroidSyntheticPackageFragmentDescriptor defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateResourcePropertyCall[LocalVariableDescriptor]

'packageData' @ [123:46] ==> public final val packageData: AndroidSyntheticPackageData defined in org.jetbrains.kotlin.android.synthetic.descriptors.AndroidSyntheticPackageFragmentDescriptor[PropertyDescriptorImpl]

'moduleData' @ [123:58] ==> public final val moduleData: AndroidModuleData defined in org.jetbrains.kotlin.android.synthetic.descriptors.AndroidSyntheticPackageData[PropertyDescriptorImpl]

'module' @ [123:69] ==> public final val module: AndroidModule defined in org.jetbrains.kotlin.android.synthetic.res.AndroidModuleData[PropertyDescriptorImpl]

'applicationPackage' @ [123:76] ==> public final val applicationPackage: String defined in org.jetbrains.kotlin.android.synthetic.res.AndroidModule[PropertyDescriptorImpl]

'resolvedCall' @ [124:25] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateResourcePropertyCall[ValueParameterDescriptorImpl]

'getReceiverDeclarationDescriptor' @ [124:38] ==> private final fun ResolvedCall<*>.getReceiverDeclarationDescriptor(): ClassifierDescriptor? defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension[SimpleFunctionDescriptorImpl]

'ContainerOptionsProxy' @ [126:32] ==> public companion object defined in org.jetbrains.kotlin.android.synthetic.descriptors.ContainerOptionsProxy[FakeCallableDescriptorForObject]

'create' @ [126:54] ==> public final fun create(container: ClassDescriptor): ContainerOptionsProxy defined in org.jetbrains.kotlin.android.synthetic.descriptors.ContainerOptionsProxy.Companion[SimpleFunctionDescriptorImpl]

'container' @ [126:61] ==> val container: ClassDescriptor defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateResourcePropertyCall[LocalVariableDescriptor]

'ResourcePropertyStackValue' @ [127:16] ==> public constructor ResourcePropertyStackValue(receiver: StackValue, typeMapper: KotlinTypeMapper, resource: PropertyDescriptor, container: ClassDescriptor, containerOptions: ContainerOptionsProxy, androidPackage: String, globalCacheImpl: CacheImplementation) defined in org.jetbrains.kotlin.android.synthetic.codegen.ResourcePropertyStackValue[ClassConstructorDescriptorImpl]

'receiver' @ [127:43] ==> value-parameter receiver: StackValue defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateResourcePropertyCall[ValueParameterDescriptorImpl]

'c' @ [127:53] ==> value-parameter c: ExpressionCodegenExtension.Context defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateResourcePropertyCall[ValueParameterDescriptorImpl]

'typeMapper' @ [127:55] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.codegen.extensions.ExpressionCodegenExtension.Context[DeserializedPropertyDescriptor]

'resource' @ [127:67] ==> value-parameter resource: PropertyDescriptor defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateResourcePropertyCall[ValueParameterDescriptorImpl]

'container' @ [127:77] ==> val container: ClassDescriptor defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateResourcePropertyCall[LocalVariableDescriptor]

'containerOptions' @ [128:43] ==> val containerOptions: ContainerOptionsProxy defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateResourcePropertyCall[LocalVariableDescriptor]

'androidPackage' @ [128:61] ==> val androidPackage: String defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateResourcePropertyCall[LocalVariableDescriptor]

'getGlobalCacheImpl' @ [128:77] ==> protected abstract fun getGlobalCacheImpl(element: KtElement?): CacheImplementation defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [128:96] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateResourcePropertyCall[ValueParameterDescriptorImpl]

'call' @ [128:109] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'calleeExpression' @ [128:114] ==> public final val Call.calleeExpression: KtExpression?[MyPropertyDescriptor]

'resultingDescriptor' @ [132:35] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'extensionReceiverParameter' @ [132:55] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'type' @ [132:83] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'constructor' @ [132:89] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [132:102] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'extensionReceiver' @ [133:29] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'type' @ [133:65] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'constructor' @ [133:70] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [133:82] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'if (fromDeclarationSite == null && fromCallSite == null)
            return null
        else if (fromDeclarationSite != null && fromCallSite == null)
            return fromDeclarationSite
        else if (fromDeclarationSite == null && fromCallSite != null)
            return fromCallSite' @ [135:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'fromDeclarationSite' @ [135:13] ==> val fromDeclarationSite: ClassifierDescriptor? defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.getReceiverDeclarationDescriptor[LocalVariableDescriptor]

'fromCallSite' @ [135:44] ==> val fromCallSite: ClassifierDescriptor? defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.getReceiverDeclarationDescriptor[LocalVariableDescriptor]

'if (fromDeclarationSite != null && fromCallSite == null)
            return fromDeclarationSite
        else if (fromDeclarationSite == null && fromCallSite != null)
            return fromCallSite' @ [137:14] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'fromDeclarationSite' @ [137:18] ==> val fromDeclarationSite: ClassifierDescriptor? defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.getReceiverDeclarationDescriptor[LocalVariableDescriptor]

'fromCallSite' @ [137:49] ==> val fromCallSite: ClassifierDescriptor? defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.getReceiverDeclarationDescriptor[LocalVariableDescriptor]

'fromDeclarationSite' @ [138:20] ==> val fromDeclarationSite: ClassifierDescriptor? defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.getReceiverDeclarationDescriptor[LocalVariableDescriptor]

'fromDeclarationSite' @ [139:18] ==> val fromDeclarationSite: ClassifierDescriptor? defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.getReceiverDeclarationDescriptor[LocalVariableDescriptor]

'fromCallSite' @ [139:49] ==> val fromCallSite: ClassifierDescriptor? defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.getReceiverDeclarationDescriptor[LocalVariableDescriptor]

'fromCallSite' @ [140:20] ==> val fromCallSite: ClassifierDescriptor? defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.getReceiverDeclarationDescriptor[LocalVariableDescriptor]

'fromDeclarationSite' @ [142:9] ==> val fromDeclarationSite: ClassifierDescriptor? defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.getReceiverDeclarationDescriptor[LocalVariableDescriptor]

'fromCallSite' @ [143:9] ==> val fromCallSite: ClassifierDescriptor? defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.getReceiverDeclarationDescriptor[LocalVariableDescriptor]

'if (fromCallSite.defaultType.isSubtypeOf(fromDeclarationSite.defaultType))
            fromCallSite
        else
            fromDeclarationSite' @ [145:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ClassifierDescriptor?, elseBranch: ClassifierDescriptor?): ClassifierDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ClassifierDescriptor?

'fromCallSite' @ [145:20] ==> val fromCallSite: ClassifierDescriptor? defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.getReceiverDeclarationDescriptor[LocalVariableDescriptor]

'defaultType' @ [145:33] ==> public final val ClassifierDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'isSubtypeOf' @ [145:45] ==> public fun KotlinType.isSubtypeOf(superType: KotlinType): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'fromDeclarationSite' @ [145:57] ==> val fromDeclarationSite: ClassifierDescriptor? defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.getReceiverDeclarationDescriptor[LocalVariableDescriptor]

'defaultType' @ [145:77] ==> public final val ClassifierDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'fromCallSite' @ [146:13] ==> val fromCallSite: ClassifierDescriptor? defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.getReceiverDeclarationDescriptor[LocalVariableDescriptor]

'fromDeclarationSite' @ [148:13] ==> val fromDeclarationSite: ClassifierDescriptor? defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.getReceiverDeclarationDescriptor[LocalVariableDescriptor]

'codegen' @ [152:28] ==> value-parameter codegen: ImplementationBodyCodegen defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClassSyntheticParts[ValueParameterDescriptorImpl]

'v' @ [152:36] ==> public final val v: (ClassBuilder..ClassBuilder?) defined in org.jetbrains.kotlin.codegen.ImplementationBodyCodegen[JavaPropertyDescriptor]

'codegen' @ [153:27] ==> value-parameter codegen: ImplementationBodyCodegen defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClassSyntheticParts[ValueParameterDescriptorImpl]

'myClass' @ [153:35] ==> @NotNull public final val myClass: KtPureClassOrObject defined in org.jetbrains.kotlin.codegen.ImplementationBodyCodegen[JavaPropertyDescriptor]

'codegen' @ [155:25] ==> value-parameter codegen: ImplementationBodyCodegen defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClassSyntheticParts[ValueParameterDescriptorImpl]

'descriptor' @ [155:33] ==> @NotNull public final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.codegen.ImplementationBodyCodegen[JavaPropertyDescriptor]

'container' @ [156:13] ==> val container: ClassDescriptor defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClassSyntheticParts[LocalVariableDescriptor]

'kind' @ [156:23] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'CLASS' @ [156:41] ==> enum entry CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'container' @ [156:50] ==> val container: ClassDescriptor defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClassSyntheticParts[LocalVariableDescriptor]

'isInner' @ [156:60] ==> public final val ClassDescriptor.isInner: Boolean[MyPropertyDescriptor]

'isLocal' @ [156:87] ==> public open fun isLocal(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'container' @ [156:95] ==> val container: ClassDescriptor defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClassSyntheticParts[LocalVariableDescriptor]

'ContainerOptionsProxy' @ [158:32] ==> public companion object defined in org.jetbrains.kotlin.android.synthetic.descriptors.ContainerOptionsProxy[FakeCallableDescriptorForObject]

'create' @ [158:54] ==> public final fun create(container: ClassDescriptor): ContainerOptionsProxy defined in org.jetbrains.kotlin.android.synthetic.descriptors.ContainerOptionsProxy.Companion[SimpleFunctionDescriptorImpl]

'container' @ [158:61] ==> val container: ClassDescriptor defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClassSyntheticParts[LocalVariableDescriptor]

'containerOptions' @ [159:13] ==> val containerOptions: ContainerOptionsProxy defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClassSyntheticParts[LocalVariableDescriptor]

'getCacheOrDefault' @ [159:30] ==> private final fun ContainerOptionsProxy.getCacheOrDefault(element: KtElement?): CacheImplementation defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension[SimpleFunctionDescriptorImpl]

'targetClass' @ [159:48] ==> val targetClass: KtClass defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClassSyntheticParts[LocalVariableDescriptor]

'NO_CACHE' @ [159:64] ==> enum entry NO_CACHE defined in kotlinx.android.extensions.CacheImplementation[FakeCallableDescriptorForObject]

'containerOptions' @ [161:13] ==> val containerOptions: ContainerOptionsProxy defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClassSyntheticParts[LocalVariableDescriptor]

'containerType' @ [161:30] ==> public final val containerType: AndroidContainerType defined in org.jetbrains.kotlin.android.synthetic.descriptors.ContainerOptionsProxy[PropertyDescriptorImpl]

'LAYOUT_CONTAINER' @ [161:47] ==> enum entry LAYOUT_CONTAINER defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[FakeCallableDescriptorForObject]

'!' @ [161:67] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isExperimental' @ [161:68] ==> protected abstract fun isExperimental(element: KtElement?): Boolean defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension[SimpleFunctionDescriptorImpl]

'targetClass' @ [161:83] ==> val targetClass: KtClass defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClassSyntheticParts[LocalVariableDescriptor]

'SyntheticPartsGenerateContext' @ [165:23] ==> public constructor SyntheticPartsGenerateContext(classBuilder: ClassBuilder, state: GenerationState, container: ClassDescriptor, classOrObject: KtClassOrObject, containerOptions: ContainerOptionsProxy) defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.SyntheticPartsGenerateContext[ClassConstructorDescriptorImpl]

'classBuilder' @ [165:53] ==> val classBuilder: (ClassBuilder..ClassBuilder?) defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClassSyntheticParts[LocalVariableDescriptor]

'codegen' @ [165:67] ==> value-parameter codegen: ImplementationBodyCodegen defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClassSyntheticParts[ValueParameterDescriptorImpl]

'state' @ [165:75] ==> public final val state: (GenerationState..GenerationState?) defined in org.jetbrains.kotlin.codegen.ImplementationBodyCodegen[JavaPropertyDescriptor]

'container' @ [165:82] ==> val container: ClassDescriptor defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClassSyntheticParts[LocalVariableDescriptor]

'targetClass' @ [165:93] ==> val targetClass: KtClass defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClassSyntheticParts[LocalVariableDescriptor]

'containerOptions' @ [165:106] ==> val containerOptions: ContainerOptionsProxy defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClassSyntheticParts[LocalVariableDescriptor]

'context' @ [166:9] ==> val context: AbstractAndroidExtensionsExpressionCodegenExtension.SyntheticPartsGenerateContext defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClassSyntheticParts[LocalVariableDescriptor]

'generateCachedFindViewByIdFunction' @ [166:17] ==> private final fun AbstractAndroidExtensionsExpressionCodegenExtension.SyntheticPartsGenerateContext.generateCachedFindViewByIdFunction(): Unit defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension[SimpleFunctionDescriptorImpl]

'context' @ [167:9] ==> val context: AbstractAndroidExtensionsExpressionCodegenExtension.SyntheticPartsGenerateContext defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClassSyntheticParts[LocalVariableDescriptor]

'generateClearCacheFunction' @ [167:17] ==> private final fun AbstractAndroidExtensionsExpressionCodegenExtension.SyntheticPartsGenerateContext.generateClearCacheFunction(): Unit defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension[SimpleFunctionDescriptorImpl]

'context' @ [168:9] ==> val context: AbstractAndroidExtensionsExpressionCodegenExtension.SyntheticPartsGenerateContext defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClassSyntheticParts[LocalVariableDescriptor]

'generateCacheField' @ [168:17] ==> private final fun AbstractAndroidExtensionsExpressionCodegenExtension.SyntheticPartsGenerateContext.generateCacheField(): Unit defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension[SimpleFunctionDescriptorImpl]

'containerOptions' @ [170:13] ==> val containerOptions: ContainerOptionsProxy defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClassSyntheticParts[LocalVariableDescriptor]

'containerType' @ [170:30] ==> public final val containerType: AndroidContainerType defined in org.jetbrains.kotlin.android.synthetic.descriptors.ContainerOptionsProxy[PropertyDescriptorImpl]

'isFragment' @ [170:44] ==> public final val isFragment: Boolean defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[PropertyDescriptorImpl]

'container' @ [171:32] ==> val container: ClassDescriptor defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClassSyntheticParts[LocalVariableDescriptor]

'unsubstitutedMemberScope' @ [171:42] ==> public final val ClassDescriptor.unsubstitutedMemberScope: MemberScope[MyPropertyDescriptor]

'getContributedDescriptors' @ [171:67] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'classMembers' @ [172:29] ==> val classMembers: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClassSyntheticParts[LocalVariableDescriptor]

'firstOrNull' @ [172:42] ==> public inline fun <T> Iterable<DeclarationDescriptor>.firstOrNull(predicate: (DeclarationDescriptor) -> Boolean): DeclarationDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'it' @ [172:56] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClassSyntheticParts.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [172:84] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClassSyntheticParts.<anonymous>[ValueParameterDescriptorImpl]

'isOnDestroyFunction' @ [172:87] ==> private final fun FunctionDescriptor.isOnDestroyFunction(): Boolean defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension[SimpleFunctionDescriptorImpl]

'onDestroy' @ [173:17] ==> val onDestroy: DeclarationDescriptor? defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClassSyntheticParts[LocalVariableDescriptor]

'context' @ [174:17] ==> val context: AbstractAndroidExtensionsExpressionCodegenExtension.SyntheticPartsGenerateContext defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClassSyntheticParts[LocalVariableDescriptor]

'generateOnDestroyFunctionForFragment' @ [174:25] ==> private final fun AbstractAndroidExtensionsExpressionCodegenExtension.SyntheticPartsGenerateContext.generateOnDestroyFunctionForFragment(): Unit defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension[SimpleFunctionDescriptorImpl]

'kind' @ [180:16] ==> public final val FunctionDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'DECLARATION' @ [180:54] ==> enum entry DECLARATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'name' @ [181:19] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [181:24] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'ON_DESTROY_METHOD_NAME' @ [181:38] ==> public final val ON_DESTROY_METHOD_NAME: String defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.Companion[PropertyDescriptorImpl]

'visibility' @ [182:20] ==> public final val FunctionDescriptor.visibility: Visibility[MyPropertyDescriptor]

'INHERITED' @ [182:47] ==> @NotNull public final val INHERITED: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'visibility' @ [182:60] ==> public final val FunctionDescriptor.visibility: Visibility[MyPropertyDescriptor]

'PUBLIC' @ [182:87] ==> @NotNull public final val PUBLIC: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'valueParameters' @ [183:20] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'isEmpty' @ [183:36] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'typeParameters' @ [184:20] ==> public final val FunctionDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'isEmpty' @ [184:35] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'classBuilder' @ [190:29] ==> public final val classBuilder: ClassBuilder defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.SyntheticPartsGenerateContext[PropertyDescriptorImpl]

'newMethod' @ [190:42] ==> @NotNull public abstract fun newMethod(@NotNull p0: JvmDeclarationOrigin, p1: Int, @NotNull p2: String, @NotNull p3: String, @Nullable p4: String?, @Nullable p5: (Array<(String..String?)>?..Array<out (String..String?)>?)): MethodVisitor defined in org.jetbrains.kotlin.codegen.ClassBuilder[JavaMethodDescriptor]

'NO_ORIGIN' @ [190:73] ==> @field:JvmField public final val NO_ORIGIN: JvmDeclarationOrigin defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin.Companion[DeserializedPropertyDescriptor]

'ACC_PUBLIC' @ [190:84] ==> public const final val ACC_PUBLIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'ACC_SYNTHETIC' @ [190:98] ==> public const final val ACC_SYNTHETIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'ON_DESTROY_METHOD_NAME' @ [190:113] ==> public final val ON_DESTROY_METHOD_NAME: String defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.Companion[PropertyDescriptorImpl]

'methodVisitor' @ [191:9] ==> val methodVisitor: MethodVisitor defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateOnDestroyFunctionForFragment[LocalVariableDescriptor]

'visitCode' @ [191:23] ==> public open fun visitCode(): Unit defined in org.jetbrains.org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'InstructionAdapter' @ [192:18] ==> public constructor InstructionAdapter(p0: (MethodVisitor..MethodVisitor?)) defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaClassConstructorDescriptor]

'methodVisitor' @ [192:37] ==> val methodVisitor: MethodVisitor defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateOnDestroyFunctionForFragment[LocalVariableDescriptor]

'state' @ [194:29] ==> public final val state: GenerationState defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.SyntheticPartsGenerateContext[PropertyDescriptorImpl]

'typeMapper' @ [194:35] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'mapClass' @ [194:46] ==> @NotNull public open fun mapClass(@NotNull p0: ClassifierDescriptor): Type defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'container' @ [194:55] ==> public final val container: ClassDescriptor defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.SyntheticPartsGenerateContext[PropertyDescriptorImpl]

'iv' @ [196:9] ==> val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateOnDestroyFunctionForFragment[LocalVariableDescriptor]

'load' @ [196:12] ==> public open fun load(p0: Int, p1: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'containerType' @ [196:20] ==> val containerType: Type defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateOnDestroyFunctionForFragment[LocalVariableDescriptor]

'iv' @ [197:9] ==> val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateOnDestroyFunctionForFragment[LocalVariableDescriptor]

'invokespecial' @ [197:12] ==> public open fun invokespecial(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'state' @ [197:26] ==> public final val state: GenerationState defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.SyntheticPartsGenerateContext[PropertyDescriptorImpl]

'typeMapper' @ [197:32] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'mapClass' @ [197:43] ==> @NotNull public open fun mapClass(@NotNull p0: ClassifierDescriptor): Type defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'container' @ [197:52] ==> public final val container: ClassDescriptor defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.SyntheticPartsGenerateContext[PropertyDescriptorImpl]

'getSuperClassOrAny' @ [197:62] ==> public fun ClassDescriptor.getSuperClassOrAny(): ClassDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'internalName' @ [197:84] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'ON_DESTROY_METHOD_NAME' @ [197:98] ==> public final val ON_DESTROY_METHOD_NAME: String defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.Companion[PropertyDescriptorImpl]

'iv' @ [198:9] ==> val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateOnDestroyFunctionForFragment[LocalVariableDescriptor]

'areturn' @ [198:12] ==> public open fun areturn(p0: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'VOID_TYPE' @ [198:25] ==> public final val VOID_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'endVisit' @ [200:25] ==> public open fun endVisit(p0: (MethodVisitor..MethodVisitor?), @Nullable p1: String?, @NotNull p2: KtElement): Unit defined in org.jetbrains.kotlin.codegen.FunctionCodegen[JavaMethodDescriptor]

'methodVisitor' @ [200:34] ==> val methodVisitor: MethodVisitor defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateOnDestroyFunctionForFragment[LocalVariableDescriptor]

'ON_DESTROY_METHOD_NAME' @ [200:49] ==> public final val ON_DESTROY_METHOD_NAME: String defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.Companion[PropertyDescriptorImpl]

'classOrObject' @ [200:73] ==> public final val classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.SyntheticPartsGenerateContext[PropertyDescriptorImpl]

'classBuilder' @ [204:29] ==> public final val classBuilder: ClassBuilder defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.SyntheticPartsGenerateContext[PropertyDescriptorImpl]

'newMethod' @ [204:42] ==> @NotNull public abstract fun newMethod(@NotNull p0: JvmDeclarationOrigin, p1: Int, @NotNull p2: String, @NotNull p3: String, @Nullable p4: String?, @Nullable p5: (Array<(String..String?)>?..Array<out (String..String?)>?)): MethodVisitor defined in org.jetbrains.kotlin.codegen.ClassBuilder[JavaMethodDescriptor]

'NO_ORIGIN' @ [204:73] ==> @field:JvmField public final val NO_ORIGIN: JvmDeclarationOrigin defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin.Companion[DeserializedPropertyDescriptor]

'ACC_PUBLIC' @ [204:84] ==> public const final val ACC_PUBLIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'CLEAR_CACHE_METHOD_NAME' @ [204:96] ==> public final val CLEAR_CACHE_METHOD_NAME: String defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.Companion[PropertyDescriptorImpl]

'methodVisitor' @ [205:9] ==> val methodVisitor: MethodVisitor defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClearCacheFunction[LocalVariableDescriptor]

'visitCode' @ [205:23] ==> public open fun visitCode(): Unit defined in org.jetbrains.org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'InstructionAdapter' @ [206:18] ==> public constructor InstructionAdapter(p0: (MethodVisitor..MethodVisitor?)) defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaClassConstructorDescriptor]

'methodVisitor' @ [206:37] ==> val methodVisitor: MethodVisitor defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClearCacheFunction[LocalVariableDescriptor]

'state' @ [208:29] ==> public final val state: GenerationState defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.SyntheticPartsGenerateContext[PropertyDescriptorImpl]

'typeMapper' @ [208:35] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'mapClass' @ [208:46] ==> @NotNull public open fun mapClass(@NotNull p0: ClassifierDescriptor): Type defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'container' @ [208:55] ==> public final val container: ClassDescriptor defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.SyntheticPartsGenerateContext[PropertyDescriptorImpl]

'CacheMechanism' @ [209:25] ==> public companion object defined in org.jetbrains.kotlin.android.synthetic.codegen.CacheMechanism[FakeCallableDescriptorForObject]

'get' @ [209:40] ==> public final fun get(cacheImpl: CacheImplementation, iv: InstructionAdapter, containerType: Type): CacheMechanism defined in org.jetbrains.kotlin.android.synthetic.codegen.CacheMechanism.Companion[SimpleFunctionDescriptorImpl]

'containerOptions' @ [209:44] ==> public final val containerOptions: ContainerOptionsProxy defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.SyntheticPartsGenerateContext[PropertyDescriptorImpl]

'getCacheOrDefault' @ [209:61] ==> private final fun ContainerOptionsProxy.getCacheOrDefault(element: KtElement?): CacheImplementation defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension[SimpleFunctionDescriptorImpl]

'classOrObject' @ [209:79] ==> public final val classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.SyntheticPartsGenerateContext[PropertyDescriptorImpl]

'iv' @ [209:95] ==> val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClearCacheFunction[LocalVariableDescriptor]

'containerType' @ [209:99] ==> val containerType: Type defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClearCacheFunction[LocalVariableDescriptor]

'cacheImpl' @ [211:9] ==> val cacheImpl: CacheMechanism defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClearCacheFunction[LocalVariableDescriptor]

'loadCache' @ [211:19] ==> public abstract fun loadCache(): Unit defined in org.jetbrains.kotlin.android.synthetic.codegen.CacheMechanism[SimpleFunctionDescriptorImpl]

'Label' @ [212:28] ==> public constructor Label() defined in org.jetbrains.org.objectweb.asm.Label[JavaClassConstructorDescriptor]

'iv' @ [213:9] ==> val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClearCacheFunction[LocalVariableDescriptor]

'ifnull' @ [213:12] ==> public open fun ifnull(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'lCacheIsNull' @ [213:19] ==> val lCacheIsNull: Label defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClearCacheFunction[LocalVariableDescriptor]

'cacheImpl' @ [215:9] ==> val cacheImpl: CacheMechanism defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClearCacheFunction[LocalVariableDescriptor]

'loadCache' @ [215:19] ==> public abstract fun loadCache(): Unit defined in org.jetbrains.kotlin.android.synthetic.codegen.CacheMechanism[SimpleFunctionDescriptorImpl]

'cacheImpl' @ [216:9] ==> val cacheImpl: CacheMechanism defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClearCacheFunction[LocalVariableDescriptor]

'clearCache' @ [216:19] ==> public abstract fun clearCache(): Unit defined in org.jetbrains.kotlin.android.synthetic.codegen.CacheMechanism[SimpleFunctionDescriptorImpl]

'iv' @ [218:9] ==> val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClearCacheFunction[LocalVariableDescriptor]

'visitLabel' @ [218:12] ==> public open fun visitLabel(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'lCacheIsNull' @ [218:23] ==> val lCacheIsNull: Label defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClearCacheFunction[LocalVariableDescriptor]

'iv' @ [219:9] ==> val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClearCacheFunction[LocalVariableDescriptor]

'areturn' @ [219:12] ==> public open fun areturn(p0: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'VOID_TYPE' @ [219:25] ==> public final val VOID_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'endVisit' @ [220:25] ==> public open fun endVisit(p0: (MethodVisitor..MethodVisitor?), @Nullable p1: String?, @NotNull p2: KtElement): Unit defined in org.jetbrains.kotlin.codegen.FunctionCodegen[JavaMethodDescriptor]

'methodVisitor' @ [220:34] ==> val methodVisitor: MethodVisitor defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateClearCacheFunction[LocalVariableDescriptor]

'CLEAR_CACHE_METHOD_NAME' @ [220:49] ==> public final val CLEAR_CACHE_METHOD_NAME: String defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.Companion[PropertyDescriptorImpl]

'classOrObject' @ [220:74] ==> public final val classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.SyntheticPartsGenerateContext[PropertyDescriptorImpl]

'CacheMechanism' @ [224:25] ==> public companion object defined in org.jetbrains.kotlin.android.synthetic.codegen.CacheMechanism[FakeCallableDescriptorForObject]

'getType' @ [224:40] ==> public final fun getType(cacheImpl: CacheImplementation): Type defined in org.jetbrains.kotlin.android.synthetic.codegen.CacheMechanism.Companion[SimpleFunctionDescriptorImpl]

'containerOptions' @ [224:48] ==> public final val containerOptions: ContainerOptionsProxy defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.SyntheticPartsGenerateContext[PropertyDescriptorImpl]

'getCacheOrDefault' @ [224:65] ==> private final fun ContainerOptionsProxy.getCacheOrDefault(element: KtElement?): CacheImplementation defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension[SimpleFunctionDescriptorImpl]

'classOrObject' @ [224:83] ==> public final val classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.SyntheticPartsGenerateContext[PropertyDescriptorImpl]

'classBuilder' @ [225:9] ==> public final val classBuilder: ClassBuilder defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.SyntheticPartsGenerateContext[PropertyDescriptorImpl]

'newField' @ [225:22] ==> @NotNull public abstract fun newField(@NotNull p0: JvmDeclarationOrigin, p1: Int, @NotNull p2: String, @NotNull p3: String, @Nullable p4: String?, @Nullable p5: Any?): FieldVisitor defined in org.jetbrains.kotlin.codegen.ClassBuilder[JavaMethodDescriptor]

'NO_ORIGIN' @ [225:52] ==> @field:JvmField public final val NO_ORIGIN: JvmDeclarationOrigin defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin.Companion[DeserializedPropertyDescriptor]

'ACC_PRIVATE' @ [225:63] ==> public const final val ACC_PRIVATE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'PROPERTY_NAME' @ [225:76] ==> public final val PROPERTY_NAME: String defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.Companion[PropertyDescriptorImpl]

'cacheImpl' @ [225:91] ==> val cacheImpl: Type defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCacheField[LocalVariableDescriptor]

'descriptor' @ [225:101] ==> public final val Type.descriptor: (String..String?)[MyPropertyDescriptor]

'state' @ [229:32] ==> public final val state: GenerationState defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.SyntheticPartsGenerateContext[PropertyDescriptorImpl]

'typeMapper' @ [229:38] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'mapClass' @ [229:49] ==> @NotNull public open fun mapClass(@NotNull p0: ClassifierDescriptor): Type defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'container' @ [229:58] ==> public final val container: ClassDescriptor defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.SyntheticPartsGenerateContext[PropertyDescriptorImpl]

'getObjectType' @ [231:29] ==> public open fun getObjectType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'classBuilder' @ [233:29] ==> public final val classBuilder: ClassBuilder defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.SyntheticPartsGenerateContext[PropertyDescriptorImpl]

'newMethod' @ [233:42] ==> @NotNull public abstract fun newMethod(@NotNull p0: JvmDeclarationOrigin, p1: Int, @NotNull p2: String, @NotNull p3: String, @Nullable p4: String?, @Nullable p5: (Array<(String..String?)>?..Array<out (String..String?)>?)): MethodVisitor defined in org.jetbrains.kotlin.codegen.ClassBuilder[JavaMethodDescriptor]

'NO_ORIGIN' @ [234:38] ==> @field:JvmField public final val NO_ORIGIN: JvmDeclarationOrigin defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin.Companion[DeserializedPropertyDescriptor]

'ACC_PUBLIC' @ [234:49] ==> public const final val ACC_PUBLIC: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'CACHED_FIND_VIEW_BY_ID_METHOD_NAME' @ [234:61] ==> public final val CACHED_FIND_VIEW_BY_ID_METHOD_NAME: String defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.Companion[PropertyDescriptorImpl]

'methodVisitor' @ [235:9] ==> val methodVisitor: MethodVisitor defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'visitCode' @ [235:23] ==> public open fun visitCode(): Unit defined in org.jetbrains.org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'InstructionAdapter' @ [236:18] ==> public constructor InstructionAdapter(p0: (MethodVisitor..MethodVisitor?)) defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaClassConstructorDescriptor]

'methodVisitor' @ [236:37] ==> val methodVisitor: MethodVisitor defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'CacheMechanism' @ [238:25] ==> public companion object defined in org.jetbrains.kotlin.android.synthetic.codegen.CacheMechanism[FakeCallableDescriptorForObject]

'get' @ [238:40] ==> public final fun get(cacheImpl: CacheImplementation, iv: InstructionAdapter, containerType: Type): CacheMechanism defined in org.jetbrains.kotlin.android.synthetic.codegen.CacheMechanism.Companion[SimpleFunctionDescriptorImpl]

'containerOptions' @ [238:44] ==> public final val containerOptions: ContainerOptionsProxy defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.SyntheticPartsGenerateContext[PropertyDescriptorImpl]

'getCacheOrDefault' @ [238:61] ==> private final fun ContainerOptionsProxy.getCacheOrDefault(element: KtElement?): CacheImplementation defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension[SimpleFunctionDescriptorImpl]

'classOrObject' @ [238:79] ==> public final val classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.SyntheticPartsGenerateContext[PropertyDescriptorImpl]

'iv' @ [238:95] ==> val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'containerAsmType' @ [238:99] ==> val containerAsmType: Type defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'iv' @ [240:24] ==> val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'load' @ [240:27] ==> public open fun load(p0: Int, p1: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'INT_TYPE' @ [240:40] ==> public final val INT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'cacheImpl' @ [243:9] ==> val cacheImpl: CacheMechanism defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'loadCache' @ [243:19] ==> public abstract fun loadCache(): Unit defined in org.jetbrains.kotlin.android.synthetic.codegen.CacheMechanism[SimpleFunctionDescriptorImpl]

'Label' @ [245:29] ==> public constructor Label() defined in org.jetbrains.org.objectweb.asm.Label[JavaClassConstructorDescriptor]

'iv' @ [246:9] ==> val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'ifnonnull' @ [246:12] ==> public open fun ifnonnull(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'lCacheNonNull' @ [246:22] ==> val lCacheNonNull: Label defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'cacheImpl' @ [249:9] ==> val cacheImpl: CacheMechanism defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'initCache' @ [249:19] ==> public abstract fun initCache(): Unit defined in org.jetbrains.kotlin.android.synthetic.codegen.CacheMechanism[SimpleFunctionDescriptorImpl]

'iv' @ [252:9] ==> val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'visitLabel' @ [252:12] ==> public open fun visitLabel(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'lCacheNonNull' @ [252:23] ==> val lCacheNonNull: Label defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'cacheImpl' @ [253:9] ==> val cacheImpl: CacheMechanism defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'loadCache' @ [253:19] ==> public abstract fun loadCache(): Unit defined in org.jetbrains.kotlin.android.synthetic.codegen.CacheMechanism[SimpleFunctionDescriptorImpl]

'loadId' @ [254:9] ==> local final fun loadId(): Unit defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[SimpleFunctionDescriptorImpl]

'cacheImpl' @ [255:9] ==> val cacheImpl: CacheMechanism defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'getViewFromCache' @ [255:19] ==> public abstract fun getViewFromCache(): Unit defined in org.jetbrains.kotlin.android.synthetic.codegen.CacheMechanism[SimpleFunctionDescriptorImpl]

'iv' @ [256:9] ==> val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'checkcast' @ [256:12] ==> public open fun checkcast(p0: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'viewType' @ [256:22] ==> val viewType: (Type..Type?) defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'iv' @ [257:9] ==> val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'store' @ [257:12] ==> public open fun store(p0: Int, p1: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'viewType' @ [257:21] ==> val viewType: (Type..Type?) defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'Label' @ [259:28] ==> public constructor Label() defined in org.jetbrains.org.objectweb.asm.Label[JavaClassConstructorDescriptor]

'iv' @ [260:9] ==> val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'load' @ [260:12] ==> public open fun load(p0: Int, p1: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'viewType' @ [260:20] ==> val viewType: (Type..Type?) defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'iv' @ [261:9] ==> val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'ifnonnull' @ [261:12] ==> public open fun ifnonnull(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'lViewNonNull' @ [261:22] ==> val lViewNonNull: Label defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'iv' @ [264:9] ==> val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'load' @ [264:12] ==> public open fun load(p0: Int, p1: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'containerAsmType' @ [264:20] ==> val containerAsmType: Type defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'containerOptions' @ [266:29] ==> public final val containerOptions: ContainerOptionsProxy defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.SyntheticPartsGenerateContext[PropertyDescriptorImpl]

'containerType' @ [266:46] ==> public final val containerType: AndroidContainerType defined in org.jetbrains.kotlin.android.synthetic.descriptors.ContainerOptionsProxy[PropertyDescriptorImpl]

'when (containerType) {
            AndroidContainerType.ACTIVITY, AndroidContainerType.SUPPORT_FRAGMENT_ACTIVITY, AndroidContainerType.VIEW, AndroidContainerType.DIALOG -> {
                loadId()
                iv.invokevirtual(containerType.internalClassName, "findViewById", "(I)Landroid/view/View;", false)
            }
            AndroidContainerType.FRAGMENT, AndroidContainerType.SUPPORT_FRAGMENT, LAYOUT_CONTAINER -> {
                if (containerType == LAYOUT_CONTAINER) {
                    iv.invokeinterface(containerType.internalClassName, "getContainerView", "()Landroid/view/View;")
                } else {
                    iv.invokevirtual(containerType.internalClassName, "getView", "()Landroid/view/View;", false)
                }

                iv.dup()
                val lgetViewNotNull = Label()
                iv.ifnonnull(lgetViewNotNull)

                // Return if getView() is null
                iv.pop()
                iv.aconst(null)
                iv.areturn(viewType)

                // Else return getView().findViewById(id)
                iv.visitLabel(lgetViewNotNull)
                loadId()
                iv.invokevirtual("android/view/View", "findViewById", "(I)Landroid/view/View;", false)
            }
            else -> throw IllegalStateException("Can't generate code for $containerType")
        }' @ [267:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'containerType' @ [267:15] ==> val containerType: AndroidContainerType defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'AndroidContainerType' @ [268:13] ==> public companion object defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[FakeCallableDescriptorForObject]

'ACTIVITY' @ [268:34] ==> enum entry ACTIVITY defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[FakeCallableDescriptorForObject]

'AndroidContainerType' @ [268:44] ==> public companion object defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[FakeCallableDescriptorForObject]

'SUPPORT_FRAGMENT_ACTIVITY' @ [268:65] ==> enum entry SUPPORT_FRAGMENT_ACTIVITY defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[FakeCallableDescriptorForObject]

'AndroidContainerType' @ [268:92] ==> public companion object defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[FakeCallableDescriptorForObject]

'VIEW' @ [268:113] ==> enum entry VIEW defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[FakeCallableDescriptorForObject]

'AndroidContainerType' @ [268:119] ==> public companion object defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[FakeCallableDescriptorForObject]

'DIALOG' @ [268:140] ==> enum entry DIALOG defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[FakeCallableDescriptorForObject]

'loadId' @ [269:17] ==> local final fun loadId(): Unit defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[SimpleFunctionDescriptorImpl]

'iv' @ [270:17] ==> val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'invokevirtual' @ [270:20] ==> public open fun invokevirtual(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'containerType' @ [270:34] ==> val containerType: AndroidContainerType defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'internalClassName' @ [270:48] ==> public final val internalClassName: String defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[PropertyDescriptorImpl]

'AndroidContainerType' @ [272:13] ==> public companion object defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[FakeCallableDescriptorForObject]

'FRAGMENT' @ [272:34] ==> enum entry FRAGMENT defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[FakeCallableDescriptorForObject]

'AndroidContainerType' @ [272:44] ==> public companion object defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[FakeCallableDescriptorForObject]

'SUPPORT_FRAGMENT' @ [272:65] ==> enum entry SUPPORT_FRAGMENT defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[FakeCallableDescriptorForObject]

'LAYOUT_CONTAINER' @ [272:83] ==> enum entry LAYOUT_CONTAINER defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[FakeCallableDescriptorForObject]

'if (containerType == LAYOUT_CONTAINER) {
                    iv.invokeinterface(containerType.internalClassName, "getContainerView", "()Landroid/view/View;")
                } else {
                    iv.invokevirtual(containerType.internalClassName, "getView", "()Landroid/view/View;", false)
                }' @ [273:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'containerType' @ [273:21] ==> val containerType: AndroidContainerType defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'LAYOUT_CONTAINER' @ [273:38] ==> enum entry LAYOUT_CONTAINER defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[FakeCallableDescriptorForObject]

'iv' @ [274:21] ==> val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'invokeinterface' @ [274:24] ==> public open fun invokeinterface(p0: (String..String?), p1: (String..String?), p2: (String..String?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'containerType' @ [274:40] ==> val containerType: AndroidContainerType defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'internalClassName' @ [274:54] ==> public final val internalClassName: String defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[PropertyDescriptorImpl]

'iv' @ [276:21] ==> val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'invokevirtual' @ [276:24] ==> public open fun invokevirtual(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'containerType' @ [276:38] ==> val containerType: AndroidContainerType defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'internalClassName' @ [276:52] ==> public final val internalClassName: String defined in org.jetbrains.kotlin.android.synthetic.codegen.AndroidContainerType[PropertyDescriptorImpl]

'iv' @ [279:17] ==> val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'dup' @ [279:20] ==> public open fun dup(): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'Label' @ [280:39] ==> public constructor Label() defined in org.jetbrains.org.objectweb.asm.Label[JavaClassConstructorDescriptor]

'iv' @ [281:17] ==> val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'ifnonnull' @ [281:20] ==> public open fun ifnonnull(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'lgetViewNotNull' @ [281:30] ==> val lgetViewNotNull: Label defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'iv' @ [284:17] ==> val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'pop' @ [284:20] ==> public open fun pop(): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'iv' @ [285:17] ==> val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'aconst' @ [285:20] ==> public open fun aconst(p0: (Any..Any?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'iv' @ [286:17] ==> val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'areturn' @ [286:20] ==> public open fun areturn(p0: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'viewType' @ [286:28] ==> val viewType: (Type..Type?) defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'iv' @ [289:17] ==> val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'visitLabel' @ [289:20] ==> public open fun visitLabel(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'lgetViewNotNull' @ [289:31] ==> val lgetViewNotNull: Label defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'loadId' @ [290:17] ==> local final fun loadId(): Unit defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[SimpleFunctionDescriptorImpl]

'iv' @ [291:17] ==> val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'invokevirtual' @ [291:20] ==> public open fun invokevirtual(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'IllegalStateException' @ [293:27] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'containerType' @ [293:75] ==> val containerType: AndroidContainerType defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'iv' @ [295:9] ==> val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'store' @ [295:12] ==> public open fun store(p0: Int, p1: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'viewType' @ [295:21] ==> val viewType: (Type..Type?) defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'cacheImpl' @ [298:9] ==> val cacheImpl: CacheMechanism defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'loadCache' @ [298:19] ==> public abstract fun loadCache(): Unit defined in org.jetbrains.kotlin.android.synthetic.codegen.CacheMechanism[SimpleFunctionDescriptorImpl]

'loadId' @ [299:9] ==> local final fun loadId(): Unit defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[SimpleFunctionDescriptorImpl]

'cacheImpl' @ [300:9] ==> val cacheImpl: CacheMechanism defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'putViewToCache' @ [300:19] ==> public abstract fun putViewToCache(getView: () -> Unit): Unit defined in org.jetbrains.kotlin.android.synthetic.codegen.CacheMechanism[SimpleFunctionDescriptorImpl]

'iv' @ [300:36] ==> val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'load' @ [300:39] ==> public open fun load(p0: Int, p1: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'viewType' @ [300:47] ==> val viewType: (Type..Type?) defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'iv' @ [302:9] ==> val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'visitLabel' @ [302:12] ==> public open fun visitLabel(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'lViewNonNull' @ [302:23] ==> val lViewNonNull: Label defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'iv' @ [303:9] ==> val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'load' @ [303:12] ==> public open fun load(p0: Int, p1: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'viewType' @ [303:20] ==> val viewType: (Type..Type?) defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'iv' @ [304:9] ==> val iv: InstructionAdapter defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'areturn' @ [304:12] ==> public open fun areturn(p0: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'viewType' @ [304:20] ==> val viewType: (Type..Type?) defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'endVisit' @ [306:25] ==> public open fun endVisit(p0: (MethodVisitor..MethodVisitor?), @Nullable p1: String?, @NotNull p2: KtElement): Unit defined in org.jetbrains.kotlin.codegen.FunctionCodegen[JavaMethodDescriptor]

'methodVisitor' @ [306:34] ==> val methodVisitor: MethodVisitor defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.generateCachedFindViewByIdFunction[LocalVariableDescriptor]

'CACHED_FIND_VIEW_BY_ID_METHOD_NAME' @ [306:49] ==> public final val CACHED_FIND_VIEW_BY_ID_METHOD_NAME: String defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.Companion[PropertyDescriptorImpl]

'classOrObject' @ [306:85] ==> public final val classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.android.synthetic.codegen.AbstractAndroidExtensionsExpressionCodegenExtension.SyntheticPartsGenerateContext[PropertyDescriptorImpl]

