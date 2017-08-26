'CreateFromUsageFixBase<E>' @ [39:5] ==> public constructor CreateFromUsageFixBase<T : KtElement>(element: E) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.CreateFromUsageFixBase[ClassConstructorDescriptorImpl]
Inferred types:
    <T : KtElement> -> E

'data' @ [39:31] ==> value-parameter data: CreateParameterData<E> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix.<init>[ValueParameterDescriptorImpl]

'originalExpression' @ [39:36] ==> public final val originalExpression: E defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterData[PropertyDescriptorImpl]

'with' @ [41:16] ==> @InlineOnly public inline fun <T, R> with(receiver: KotlinParameterInfo, block: KotlinParameterInfo.() -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinParameterInfo
    <R> -> String

'data' @ [41:21] ==> public final val data: CreateParameterData<E> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix[PropertyDescriptorImpl]

'parameterInfo' @ [41:26] ==> public final val parameterInfo: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterData[PropertyDescriptorImpl]

'if (valOrVar != KotlinValVar.None) "Create property '$name' as constructor parameter" else "Create parameter '$name'"' @ [42:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'valOrVar' @ [42:17] ==> public final var valOrVar: KotlinValVar defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'None' @ [42:42] ==> enum entry None defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinValVar[FakeCallableDescriptorForObject]

'name' @ [42:67] ==> public final var KotlinParameterInfo.name: String[MyPropertyDescriptor]

'name' @ [42:124] ==> public final var KotlinParameterInfo.name: String[MyPropertyDescriptor]

'originalDescriptor' @ [51:24] ==> value-parameter originalDescriptor: KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix.runChangeSignature.<no name provided>.configure[ValueParameterDescriptorImpl]

'modify' @ [51:43] ==> public fun KotlinMethodDescriptor.modify(action: (KotlinMutableMethodDescriptor) -> Unit): KotlinMethodDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file KotlinChangeSignature.kt[SimpleFunctionDescriptorImpl]

'it' @ [51:52] ==> value-parameter it: KotlinMutableMethodDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix.runChangeSignature.<no name provided>.configure.<anonymous>[ValueParameterDescriptorImpl]

'addParameter' @ [51:55] ==> public final fun addParameter(parameter: KotlinParameterInfo): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinMutableMethodDescriptor[SimpleFunctionDescriptorImpl]

'data' @ [51:68] ==> public final val data: CreateParameterData<E> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix[PropertyDescriptorImpl]

'parameterInfo' @ [51:73] ==> public final val parameterInfo: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterData[PropertyDescriptorImpl]

'data' @ [54:96] ==> public final val data: CreateParameterData<E> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix[PropertyDescriptorImpl]

'createSilently' @ [54:101] ==> public final val createSilently: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterData[PropertyDescriptorImpl]

'runChangeSignature' @ [57:9] ==> public fun runChangeSignature(project: Project, callableDescriptor: CallableDescriptor, configuration: KotlinChangeSignatureConfiguration, defaultValueContext: PsiElement, commandName: String? = ...): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file KotlinChangeSignature.kt[SimpleFunctionDescriptorImpl]

'project' @ [57:28] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix.runChangeSignature[ValueParameterDescriptorImpl]

'data' @ [57:37] ==> public final val data: CreateParameterData<E> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix[PropertyDescriptorImpl]

'parameterInfo' @ [57:42] ==> public final val parameterInfo: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterData[PropertyDescriptorImpl]

'callableDescriptor' @ [57:56] ==> public final val callableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'config' @ [57:76] ==> val config: <no name provided><E> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix.runChangeSignature[LocalVariableDescriptor]

'data' @ [57:84] ==> public final val data: CreateParameterData<E> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix[PropertyDescriptorImpl]

'originalExpression' @ [57:89] ==> public final val originalExpression: E defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterData[PropertyDescriptorImpl]

'text' @ [57:109] ==> public final val <E : KtElement> CreateParameterFromUsageFix<E>.text: String[MyPropertyDescriptor]
Inferred types:
    <E : KtElement> -> E

'data' @ [61:26] ==> public final val data: CreateParameterData<E> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix[PropertyDescriptorImpl]

'onComplete' @ [61:31] ==> public final val onComplete: ((Editor?) -> Unit)? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterData[PropertyDescriptorImpl]

'if (onComplete == null) {
            runChangeSignature(project)
        }
        else {
            { runChangeSignature(project) }.runRefactoringWithPostprocessing(project, "refactoring.changeSignature") {
                onComplete(editor)
            }
        }' @ [62:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'onComplete' @ [62:13] ==> val onComplete: ((Editor?) -> Unit)? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix.invoke[LocalVariableDescriptor]

'runChangeSignature' @ [63:13] ==> private final fun runChangeSignature(project: Project): Unit defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix[SimpleFunctionDescriptorImpl]

'project' @ [63:32] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix.invoke[ValueParameterDescriptorImpl]

'runChangeSignature' @ [66:15] ==> private final fun runChangeSignature(project: Project): Unit defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix[SimpleFunctionDescriptorImpl]

'project' @ [66:34] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix.invoke[ValueParameterDescriptorImpl]

'runRefactoringWithPostprocessing' @ [66:45] ==> public fun (() -> Any).runRefactoringWithPostprocessing(project: Project, targetRefactoringId: String, finishAction: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'project' @ [66:78] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix.invoke[ValueParameterDescriptorImpl]

'invoke' @ [67:17] ==> public abstract operator fun invoke(p1: Editor?): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'editor' @ [67:28] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix.invoke[ValueParameterDescriptorImpl]

'CallableBuilderConfiguration' @ [79:27] ==> public constructor CallableBuilderConfiguration(callableInfos: List<CallableInfo>, originalElement: KtElement, currentFile: KtFile = ..., currentEditor: Editor? = ..., isExtension: Boolean = ..., enableSubstitutions: Boolean = ...) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilderConfiguration[ClassConstructorDescriptorImpl]

'listOf' @ [79:56] ==> public fun <T> listOf(element: PropertyInfo): List<PropertyInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyInfo

'info' @ [79:63] ==> value-parameter info: PropertyInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix.Companion.createFixForPrimaryConstructorPropertyParameter[ValueParameterDescriptorImpl]

'element' @ [79:70] ==> value-parameter element: E defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix.Companion.createFixForPrimaryConstructorPropertyParameter[ValueParameterDescriptorImpl]

'createBuilder' @ [79:79] ==> public fun CallableBuilderConfiguration.createBuilder(): CallableBuilder defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder in file CallableBuilder.kt[SimpleFunctionDescriptorImpl]

'builder' @ [80:41] ==> val builder: CallableBuilder defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix.Companion.createFixForPrimaryConstructorPropertyParameter[LocalVariableDescriptor]

'computeTypeCandidates' @ [80:49] ==> public final fun computeTypeCandidates(typeInfo: TypeInfo): List<TypeCandidate> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[SimpleFunctionDescriptorImpl]

'info' @ [80:71] ==> value-parameter info: PropertyInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix.Companion.createFixForPrimaryConstructorPropertyParameter[ValueParameterDescriptorImpl]

'receiverTypeInfo' @ [80:76] ==> public final val receiverTypeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.PropertyInfo[PropertyDescriptorImpl]

'firstOrNull' @ [80:94] ==> public fun <T> List<TypeCandidate>.firstOrNull(): TypeCandidate? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeCandidate

'if (receiverTypeCandidate != null) {
                builder.placement = CallablePlacement.WithReceiver(receiverTypeCandidate)
                receiverClassDescriptor = receiverTypeCandidate.theType.constructor.declarationDescriptor as? ClassDescriptor ?: return null
            }
            else {
                if (element !is KtSimpleNameExpression) return null

                val classOrObject = element.getStrictParentOfType<KtClassOrObject>() ?: return null
                receiverClassDescriptor = classOrObject.resolveToDescriptorIfAny() as? ClassDescriptor ?: return null

                val paramInfo = CreateParameterByRefActionFactory.extractFixData(element)?.parameterInfo
                if (paramInfo?.callableDescriptor == receiverClassDescriptor.unsubstitutedPrimaryConstructor) return null
            }' @ [81:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'receiverTypeCandidate' @ [81:17] ==> val receiverTypeCandidate: TypeCandidate? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix.Companion.createFixForPrimaryConstructorPropertyParameter[LocalVariableDescriptor]

'builder' @ [82:17] ==> val builder: CallableBuilder defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix.Companion.createFixForPrimaryConstructorPropertyParameter[LocalVariableDescriptor]

'placement' @ [82:25] ==> public final var placement: CallablePlacement? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'WithReceiver' @ [82:55] ==> public constructor WithReceiver(receiverTypeCandidate: TypeCandidate) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallablePlacement.WithReceiver[ClassConstructorDescriptorImpl]

'receiverTypeCandidate' @ [82:68] ==> val receiverTypeCandidate: TypeCandidate? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix.Companion.createFixForPrimaryConstructorPropertyParameter[LocalVariableDescriptor]

'receiverClassDescriptor' @ [83:17] ==> val receiverClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix.Companion.createFixForPrimaryConstructorPropertyParameter[LocalVariableDescriptor]

'receiverTypeCandidate' @ [83:43] ==> val receiverTypeCandidate: TypeCandidate? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix.Companion.createFixForPrimaryConstructorPropertyParameter[LocalVariableDescriptor]

'theType' @ [83:65] ==> public final val theType: KotlinType defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeCandidate[PropertyDescriptorImpl]

'constructor' @ [83:73] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [83:85] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'element' @ [86:21] ==> value-parameter element: E defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix.Companion.createFixForPrimaryConstructorPropertyParameter[ValueParameterDescriptorImpl]

'element' @ [88:37] ==> value-parameter element: E defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix.Companion.createFixForPrimaryConstructorPropertyParameter[ValueParameterDescriptorImpl]

'getStrictParentOfType' @ [88:45] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtClassOrObject

'receiverClassDescriptor' @ [89:17] ==> val receiverClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix.Companion.createFixForPrimaryConstructorPropertyParameter[LocalVariableDescriptor]

'classOrObject' @ [89:43] ==> val classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix.Companion.createFixForPrimaryConstructorPropertyParameter[LocalVariableDescriptor]

'resolveToDescriptorIfAny' @ [89:57] ==> public fun KtDeclaration.resolveToDescriptorIfAny(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'CreateParameterByRefActionFactory' @ [91:33] ==> public object CreateParameterByRefActionFactory : CreateParameterFromUsageFactory<KtSimpleNameExpression> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable in file CreateParameterByRefActionFactory.kt[FakeCallableDescriptorForObject]

'extractFixData' @ [91:67] ==> public final fun extractFixData(element: KtSimpleNameExpression): CreateParameterData<KtSimpleNameExpression>? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterByRefActionFactory[SimpleFunctionDescriptorImpl]

'element' @ [91:82] ==> value-parameter element: E defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix.Companion.createFixForPrimaryConstructorPropertyParameter[ValueParameterDescriptorImpl]

'parameterInfo' @ [91:92] ==> public final val parameterInfo: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterData[PropertyDescriptorImpl]

'paramInfo' @ [92:21] ==> val paramInfo: KotlinParameterInfo? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix.Companion.createFixForPrimaryConstructorPropertyParameter[LocalVariableDescriptor]

'callableDescriptor' @ [92:32] ==> public final val callableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'receiverClassDescriptor' @ [92:54] ==> val receiverClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix.Companion.createFixForPrimaryConstructorPropertyParameter[LocalVariableDescriptor]

'unsubstitutedPrimaryConstructor' @ [92:78] ==> public final val ClassDescriptor.unsubstitutedPrimaryConstructor: ClassConstructorDescriptor?[MyPropertyDescriptor]

'receiverClassDescriptor' @ [95:17] ==> val receiverClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix.Companion.createFixForPrimaryConstructorPropertyParameter[LocalVariableDescriptor]

'kind' @ [95:41] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'CLASS' @ [95:59] ==> enum entry CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'receiverClassDescriptor' @ [96:33] ==> val receiverClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix.Companion.createFixForPrimaryConstructorPropertyParameter[LocalVariableDescriptor]

'source' @ [96:57] ==> public final val ClassDescriptor.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [96:64] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'!' @ [97:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'receiverClass' @ [97:18] ==> val receiverClass: KtClass defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix.Companion.createFixForPrimaryConstructorPropertyParameter[LocalVariableDescriptor]

'canRefactor' @ [97:32] ==> public fun PsiElement.canRefactor(): Boolean defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'receiverClassDescriptor' @ [98:41] ==> val receiverClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix.Companion.createFixForPrimaryConstructorPropertyParameter[LocalVariableDescriptor]

'unsubstitutedPrimaryConstructor' @ [98:65] ==> public final val ClassDescriptor.unsubstitutedPrimaryConstructor: ClassConstructorDescriptor?[MyPropertyDescriptor]

'info' @ [100:29] ==> value-parameter info: PropertyInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix.Companion.createFixForPrimaryConstructorPropertyParameter[ValueParameterDescriptorImpl]

'returnTypeInfo' @ [100:34] ==> public final val returnTypeInfo: TypeInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.PropertyInfo[PropertyDescriptorImpl]

'getPossibleTypes' @ [100:49] ==> public abstract fun getPossibleTypes(builder: CallableBuilder): List<KotlinType> defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.TypeInfo[SimpleFunctionDescriptorImpl]

'builder' @ [100:66] ==> val builder: CallableBuilder defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix.Companion.createFixForPrimaryConstructorPropertyParameter[LocalVariableDescriptor]

'firstOrNull' @ [100:75] ==> public fun <T> List<KotlinType>.firstOrNull(): KotlinType? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'paramType' @ [101:17] ==> val paramType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix.Companion.createFixForPrimaryConstructorPropertyParameter[LocalVariableDescriptor]

'paramType' @ [101:38] ==> val paramType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix.Companion.createFixForPrimaryConstructorPropertyParameter[LocalVariableDescriptor]

'hasTypeParametersToAdd' @ [101:48] ==> public fun KotlinType.hasTypeParametersToAdd(functionDescriptor: FunctionDescriptor, context: BindingContext): Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable in file CreateParameterByRefActionFactory.kt[SimpleFunctionDescriptorImpl]

'constructorDescriptor' @ [101:71] ==> val constructorDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix.Companion.createFixForPrimaryConstructorPropertyParameter[LocalVariableDescriptor]

'builder' @ [101:94] ==> val builder: CallableBuilder defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix.Companion.createFixForPrimaryConstructorPropertyParameter[LocalVariableDescriptor]

'currentFileContext' @ [101:102] ==> public final val currentFileContext: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.CallableBuilder[PropertyDescriptorImpl]

'KotlinParameterInfo' @ [103:29] ==> @JvmOverloads public constructor KotlinParameterInfo(callableDescriptor: CallableDescriptor, originalIndex: Int = ..., name: String, originalTypeInfo: KotlinTypeInfo = ..., defaultValueForParameter: KtExpression? = ..., defaultValueForCall: KtExpression? = ..., valOrVar: KotlinValVar = ..., modifierList: KtModifierList? = ...) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[ClassConstructorDescriptorImpl]

'constructorDescriptor' @ [104:42] ==> val constructorDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix.Companion.createFixForPrimaryConstructorPropertyParameter[LocalVariableDescriptor]

'info' @ [105:28] ==> value-parameter info: PropertyInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix.Companion.createFixForPrimaryConstructorPropertyParameter[ValueParameterDescriptorImpl]

'name' @ [105:33] ==> public final val name: String defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.PropertyInfo[PropertyDescriptorImpl]

'KotlinTypeInfo' @ [106:40] ==> public constructor KotlinTypeInfo(isCovariant: Boolean, type: KotlinType? = ..., text: String? = ...) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinTypeInfo[ClassConstructorDescriptorImpl]

'paramType' @ [106:62] ==> val paramType: KotlinType? defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix.Companion.createFixForPrimaryConstructorPropertyParameter[LocalVariableDescriptor]

'if (info.writable) KotlinValVar.Var else KotlinValVar.Val' @ [107:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinValVar, elseBranch: KotlinValVar): KotlinValVar[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinValVar

'info' @ [107:36] ==> value-parameter info: PropertyInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix.Companion.createFixForPrimaryConstructorPropertyParameter[ValueParameterDescriptorImpl]

'writable' @ [107:41] ==> public final val writable: Boolean defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.callableBuilder.PropertyInfo[PropertyDescriptorImpl]

'Var' @ [107:64] ==> enum entry Var defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinValVar[FakeCallableDescriptorForObject]

'Val' @ [107:86] ==> enum entry Val defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinValVar[FakeCallableDescriptorForObject]

'CreateParameterFromUsageFix' @ [110:20] ==> public constructor CreateParameterFromUsageFix<E : KtElement>(data: CreateParameterData<E>) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix[ClassConstructorDescriptorImpl]
Inferred types:
    <E : KtElement> -> E

'CreateParameterData' @ [110:48] ==> public constructor CreateParameterData<out E : KtElement>(parameterInfo: KotlinParameterInfo, originalExpression: E, createSilently: Boolean = ..., onComplete: ((Editor?) -> Unit)? = ...) defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterData[ClassConstructorDescriptorImpl]
Inferred types:
    <out E : KtElement> -> E

'paramInfo' @ [110:68] ==> val paramInfo: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix.Companion.createFixForPrimaryConstructorPropertyParameter[LocalVariableDescriptor]

'element' @ [110:79] ==> value-parameter element: E defined in org.jetbrains.kotlin.idea.quickfix.createFromUsage.createVariable.CreateParameterFromUsageFix.Companion.createFixForPrimaryConstructorPropertyParameter[ValueParameterDescriptorImpl]

