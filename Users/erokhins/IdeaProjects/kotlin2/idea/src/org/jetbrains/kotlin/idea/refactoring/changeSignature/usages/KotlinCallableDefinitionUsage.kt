'KotlinUsageInfo<T>' @ [56:5] ==> public constructor KotlinUsageInfo<T : PsiElement>(element: T) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinUsageInfo[ClassConstructorDescriptorImpl]
Inferred types:
    <T : PsiElement> -> T

'function' @ [56:24] ==> value-parameter function: T defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.<init>[ValueParameterDescriptorImpl]

'baseFunction' @ [57:58] ==> value-parameter baseFunction: KotlinCallableDefinitionUsage<PsiElement>? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.<init>[ValueParameterDescriptorImpl]

'this' @ [57:74] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[LazyClassReceiverParameterDescriptor]

'checkIfHasExpectedType' @ [59:36] ==> private final fun checkIfHasExpectedType(callableDescriptor: CallableDescriptor, isInherited: Boolean): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[SimpleFunctionDescriptorImpl]

'originalCallableDescriptor' @ [59:59] ==> public final val originalCallableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[PropertyDescriptorImpl]

'isInherited' @ [59:87] ==> public final val isInherited: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[PropertyDescriptorImpl]

'getValue' @ [61:59] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'declaration' @ [62:23] ==> public final val declaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[PropertyDescriptorImpl]

'when (element) {
            is KtFunction, is KtProperty, is KtParameter -> (element as KtDeclaration).resolveToDescriptor() as CallableDescriptor
            is KtClass -> (element.resolveToDescriptor() as ClassDescriptor).unsubstitutedPrimaryConstructor
            is PsiMethod -> element.getJavaMethodDescriptor()
            else -> null
        }' @ [63:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CallableDescriptor?, entry1: CallableDescriptor?, entry2: CallableDescriptor?, entry3: CallableDescriptor?): CallableDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> CallableDescriptor?

'element' @ [63:15] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.currentCallableDescriptor.<anonymous>[LocalVariableDescriptor]

'element' @ [64:62] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.currentCallableDescriptor.<anonymous>[LocalVariableDescriptor]

'resolveToDescriptor' @ [64:88] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'element' @ [65:28] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.currentCallableDescriptor.<anonymous>[LocalVariableDescriptor]

'resolveToDescriptor' @ [65:36] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'unsubstitutedPrimaryConstructor' @ [65:78] ==> public final val ClassDescriptor.unsubstitutedPrimaryConstructor: ClassConstructorDescriptor?[MyPropertyDescriptor]

'element' @ [66:29] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.currentCallableDescriptor.<anonymous>[LocalVariableDescriptor]

'getJavaMethodDescriptor' @ [66:37] ==> @JvmOverloads public fun PsiMethod.getJavaMethodDescriptor(resolutionFacade: ResolutionFacade? = ...): FunctionDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'getValue' @ [71:46] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'!' @ [72:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isInherited' @ [72:14] ==> public final val isInherited: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[PropertyDescriptorImpl]

'if (samCallType == null) {
            getCallableSubstitutor(this.baseFunction, this)
        }
        else {
            val currentBaseDescriptor = this.baseFunction.currentCallableDescriptor
            val classDescriptor = currentBaseDescriptor?.containingDeclaration as? ClassDescriptor ?: return@lazy null
            getTypeSubstitutor(classDescriptor.defaultType, samCallType)
        }' @ [74:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TypeSubstitutor?, elseBranch: TypeSubstitutor?): TypeSubstitutor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TypeSubstitutor?

'samCallType' @ [74:13] ==> private final val samCallType: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[PropertyDescriptorImpl]

'getCallableSubstitutor' @ [75:13] ==> public fun getCallableSubstitutor(baseFunction: KotlinCallableDefinitionUsage<*>, derivedCallable: KotlinCallableDefinitionUsage<*>): TypeSubstitutor? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file changeSignatureUtils.kt[SimpleFunctionDescriptorImpl]

'this' @ [75:36] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[LazyClassReceiverParameterDescriptor]

'baseFunction' @ [75:41] ==> public final val baseFunction: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[PropertyDescriptorImpl]

'this' @ [75:55] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[LazyClassReceiverParameterDescriptor]

'this' @ [78:41] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[LazyClassReceiverParameterDescriptor]

'baseFunction' @ [78:46] ==> public final val baseFunction: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[PropertyDescriptorImpl]

'currentCallableDescriptor' @ [78:59] ==> public final val currentCallableDescriptor: CallableDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[PropertyDescriptorImpl]

'currentBaseDescriptor' @ [79:35] ==> val currentBaseDescriptor: CallableDescriptor? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.typeSubstitutor.<anonymous>[LocalVariableDescriptor]

'containingDeclaration' @ [79:58] ==> public final val CallableDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'getTypeSubstitutor' @ [80:13] ==> public fun getTypeSubstitutor(baseType: KotlinType, derivedType: KotlinType): TypeSubstitutor? defined in org.jetbrains.kotlin.types.substitutions[DeserializedSimpleFunctionDescriptor]

'classDescriptor' @ [80:32] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.typeSubstitutor.<anonymous>[LocalVariableDescriptor]

'defaultType' @ [80:48] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'samCallType' @ [80:61] ==> private final val samCallType: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[PropertyDescriptorImpl]

'!' @ [85:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'callableDescriptor' @ [85:15] ==> value-parameter callableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.checkIfHasExpectedType[ValueParameterDescriptorImpl]

'isInherited' @ [85:68] ==> value-parameter isInherited: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.checkIfHasExpectedType[ValueParameterDescriptorImpl]

'DescriptorToSourceUtils' @ [87:31] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [87:55] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'callableDescriptor' @ [87:79] ==> value-parameter callableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.checkIfHasExpectedType[ValueParameterDescriptorImpl]

'assert' @ [88:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'functionLiteral' @ [88:16] ==> val functionLiteral: KtFunctionLiteral? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.checkIfHasExpectedType[LocalVariableDescriptor]

'+' @ [88:43] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'callableDescriptor' @ [88:73] ==> value-parameter callableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.checkIfHasExpectedType[ValueParameterDescriptorImpl]

'functionLiteral' @ [90:22] ==> val functionLiteral: KtFunctionLiteral? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.checkIfHasExpectedType[LocalVariableDescriptor]

'parent' @ [90:40] ==> public final val KtFunctionLiteral.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [92:16] ==> val parent: KtLambdaExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.checkIfHasExpectedType[LocalVariableDescriptor]

'analyze' @ [92:23] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [92:47] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'EXPECTED_EXPRESSION_TYPE' @ [92:71] ==> public final val EXPECTED_EXPRESSION_TYPE: (WritableSlice<(KtExpression..KtExpression?), (KotlinType..KotlinType?)>..WritableSlice<(KtExpression..KtExpression?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'parent' @ [92:97] ==> val parent: KtLambdaExpression defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.checkIfHasExpectedType[LocalVariableDescriptor]

'element' @ [96:17] ==> public final val <T : PsiElement> KotlinCallableDefinitionUsage<T>.element: T?[MyPropertyDescriptor]
Inferred types:
    <T : PsiElement> -> T

'baseFunction' @ [99:17] ==> public final val baseFunction: KotlinCallableDefinitionUsage<*> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[PropertyDescriptorImpl]

'this' @ [99:34] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[LazyClassReceiverParameterDescriptor]

'element' @ [102:13] ==> value-parameter element: T defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processUsage[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [104:26] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'element' @ [104:39] ==> value-parameter element: T defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processUsage[ValueParameterDescriptorImpl]

'project' @ [104:47] ==> public final val KtNamedDeclaration.project: Project[MyPropertyDescriptor]

'changeInfo' @ [106:13] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processUsage[ValueParameterDescriptorImpl]

'isNameChanged' @ [106:24] ==> public final val KotlinChangeInfo.isNameChanged: Boolean[MyPropertyDescriptor]

'element' @ [107:31] ==> value-parameter element: T defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processUsage[ValueParameterDescriptorImpl]

'nameIdentifier' @ [107:65] ==> public final val KtCallableDeclaration.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'identifier' @ [109:13] ==> val identifier: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processUsage[LocalVariableDescriptor]

'replace' @ [109:25] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'psiFactory' @ [109:33] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processUsage[LocalVariableDescriptor]

'createIdentifier' @ [109:44] ==> public final fun createIdentifier(name: String): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'changeInfo' @ [109:61] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processUsage[ValueParameterDescriptorImpl]

'newName' @ [109:72] ==> public final var KotlinChangeInfo.newName: String[MyPropertyDescriptor]

'changeReturnTypeIfNeeded' @ [112:9] ==> private final fun changeReturnTypeIfNeeded(changeInfo: KotlinChangeInfo, element: PsiElement): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[SimpleFunctionDescriptorImpl]

'changeInfo' @ [112:34] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processUsage[ValueParameterDescriptorImpl]

'element' @ [112:46] ==> value-parameter element: T defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processUsage[ValueParameterDescriptorImpl]

'element' @ [114:29] ==> value-parameter element: T defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processUsage[ValueParameterDescriptorImpl]

'getValueParameterList' @ [114:37] ==> public fun KtNamedDeclaration.getValueParameterList(): KtParameterList? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'if (changeInfo.isParameterSetOrOrderChanged) {
            processParameterListWithStructuralChanges(changeInfo, element, parameterList, psiFactory)
        }
        else if (parameterList != null) {
            val offset = if (originalCallableDescriptor.extensionReceiverParameter != null) 1 else 0
            for ((paramIndex, parameter) in parameterList.parameters.withIndex()) {
                val parameterInfo = changeInfo.newParameters[paramIndex + offset]
                changeParameter(paramIndex, parameter, parameterInfo)
            }

            parameterList.addToShorteningWaitSet(Options.DEFAULT)
        }' @ [116:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'changeInfo' @ [116:13] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processUsage[ValueParameterDescriptorImpl]

'isParameterSetOrOrderChanged' @ [116:24] ==> public final val KotlinChangeInfo.isParameterSetOrOrderChanged: Boolean[MyPropertyDescriptor]

'processParameterListWithStructuralChanges' @ [117:13] ==> private final fun processParameterListWithStructuralChanges(changeInfo: KotlinChangeInfo, element: PsiElement, originalParameterList: KtParameterList?, psiFactory: KtPsiFactory): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[SimpleFunctionDescriptorImpl]

'changeInfo' @ [117:55] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processUsage[ValueParameterDescriptorImpl]

'element' @ [117:67] ==> value-parameter element: T defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processUsage[ValueParameterDescriptorImpl]

'parameterList' @ [117:76] ==> val parameterList: KtParameterList? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processUsage[LocalVariableDescriptor]

'psiFactory' @ [117:91] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processUsage[LocalVariableDescriptor]

'parameterList' @ [119:18] ==> val parameterList: KtParameterList? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processUsage[LocalVariableDescriptor]

'if (originalCallableDescriptor.extensionReceiverParameter != null) 1 else 0' @ [120:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'originalCallableDescriptor' @ [120:30] ==> public final val originalCallableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[PropertyDescriptorImpl]

'extensionReceiverParameter' @ [120:57] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'component1' @ [121:19] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [121:31] ==> public final operator fun component2(): (KtParameter..KtParameter?) defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'parameterList' @ [121:45] ==> val parameterList: KtParameterList? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processUsage[LocalVariableDescriptor]

'parameters' @ [121:59] ==> public final val KtParameterList.parameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'withIndex' @ [121:70] ==> public fun <T> Iterable<(KtParameter..KtParameter?)>.withIndex(): Iterable<IndexedValue<(KtParameter..KtParameter?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'changeInfo' @ [122:37] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processUsage[ValueParameterDescriptorImpl]

'newParameters' @ [122:48] ==> public final val KotlinChangeInfo.newParameters: Array<KotlinParameterInfo>[MyPropertyDescriptor]

'paramIndex' @ [122:62] ==> val paramIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processUsage[LocalVariableDescriptor]

'offset' @ [122:75] ==> val offset: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processUsage[LocalVariableDescriptor]

'changeParameter' @ [123:17] ==> private final fun changeParameter(parameterIndex: Int, parameter: KtParameter, parameterInfo: KotlinParameterInfo): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[SimpleFunctionDescriptorImpl]

'paramIndex' @ [123:33] ==> val paramIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processUsage[LocalVariableDescriptor]

'parameter' @ [123:45] ==> val parameter: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processUsage[LocalVariableDescriptor]

'parameterInfo' @ [123:56] ==> val parameterInfo: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processUsage[LocalVariableDescriptor]

'parameterList' @ [126:13] ==> val parameterList: KtParameterList? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processUsage[LocalVariableDescriptor]

'addToShorteningWaitSet' @ [126:27] ==> public fun KtElement.addToShorteningWaitSet(options: ShortenReferences.Options = ...): Unit defined in org.jetbrains.kotlin.idea.codeInsight.shorten[DeserializedSimpleFunctionDescriptor]

'DEFAULT' @ [126:58] ==> public final val DEFAULT: ShortenReferences.Options defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Options.Companion[DeserializedPropertyDescriptor]

'element' @ [129:13] ==> value-parameter element: T defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processUsage[ValueParameterDescriptorImpl]

'changeInfo' @ [129:49] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processUsage[ValueParameterDescriptorImpl]

'isReceiverTypeChanged' @ [129:60] ==> public final fun isReceiverTypeChanged(): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[SimpleFunctionDescriptorImpl]

'changeInfo' @ [130:36] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processUsage[ValueParameterDescriptorImpl]

'renderReceiverType' @ [130:47] ==> public final fun renderReceiverType(inheritedCallable: KotlinCallableDefinitionUsage<*>): String? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[SimpleFunctionDescriptorImpl]

'this' @ [130:66] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[LazyClassReceiverParameterDescriptor]

'if (receiverTypeText != null) psiFactory.createType(receiverTypeText) else null' @ [131:35] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtTypeReference?, elseBranch: KtTypeReference?): KtTypeReference?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtTypeReference?

'receiverTypeText' @ [131:39] ==> val receiverTypeText: String? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processUsage[LocalVariableDescriptor]

'psiFactory' @ [131:65] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processUsage[LocalVariableDescriptor]

'createType' @ [131:76] ==> public final fun createType(type: String): KtTypeReference defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'receiverTypeText' @ [131:87] ==> val receiverTypeText: String? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processUsage[LocalVariableDescriptor]

'element' @ [132:38] ==> value-parameter element: T defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processUsage[ValueParameterDescriptorImpl]

'setReceiverTypeReference' @ [132:46] ==> public fun KtCallableDeclaration.setReceiverTypeReference(typeRef: KtTypeReference?): KtTypeReference? defined in org.jetbrains.kotlin.psi.typeRefHelpers[DeserializedSimpleFunctionDescriptor]

'receiverTypeRef' @ [132:71] ==> val receiverTypeRef: KtTypeReference? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processUsage[LocalVariableDescriptor]

'newReceiverTypeRef' @ [133:13] ==> val newReceiverTypeRef: KtTypeReference? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processUsage[LocalVariableDescriptor]

'addToShorteningWaitSet' @ [133:33] ==> public fun KtElement.addToShorteningWaitSet(options: ShortenReferences.Options = ...): Unit defined in org.jetbrains.kotlin.idea.codeInsight.shorten[DeserializedSimpleFunctionDescriptor]

'DEFAULT' @ [133:82] ==> public final val DEFAULT: ShortenReferences.Options defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Options.Companion[DeserializedPropertyDescriptor]

'changeInfo' @ [136:13] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processUsage[ValueParameterDescriptorImpl]

'isVisibilityChanged' @ [136:24] ==> public final fun isVisibilityChanged(): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[SimpleFunctionDescriptorImpl]

'!' @ [136:49] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isLocal' @ [136:60] ==> public open fun isLocal(@NotNull p0: KtDeclaration): Boolean defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'element' @ [136:68] ==> value-parameter element: T defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processUsage[ValueParameterDescriptorImpl]

'changeVisibility' @ [137:13] ==> private final fun changeVisibility(changeInfo: KotlinChangeInfo, element: PsiElement): Unit defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[SimpleFunctionDescriptorImpl]

'changeInfo' @ [137:30] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processUsage[ValueParameterDescriptorImpl]

'element' @ [137:42] ==> value-parameter element: T defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processUsage[ValueParameterDescriptorImpl]

'canDropOverride' @ [140:13] ==> private final val canDropOverride: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[PropertyDescriptorImpl]

'dropOverrideKeywordIfNecessary' @ [141:13] ==> public fun dropOverrideKeywordIfNecessary(element: KtNamedDeclaration): Unit defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'element' @ [141:44] ==> value-parameter element: T defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processUsage[ValueParameterDescriptorImpl]

'element' @ [148:13] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.changeReturnTypeIfNeeded[ValueParameterDescriptorImpl]

'element' @ [149:13] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.changeReturnTypeIfNeeded[ValueParameterDescriptorImpl]

'element' @ [151:35] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.changeReturnTypeIfNeeded[ValueParameterDescriptorImpl]

'element' @ [151:60] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.changeReturnTypeIfNeeded[ValueParameterDescriptorImpl]

'element' @ [151:94] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.changeReturnTypeIfNeeded[ValueParameterDescriptorImpl]

'element' @ [151:119] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.changeReturnTypeIfNeeded[ValueParameterDescriptorImpl]

'changeInfo' @ [153:13] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.changeReturnTypeIfNeeded[ValueParameterDescriptorImpl]

'isReturnTypeChanged' @ [153:24] ==> public final val KotlinChangeInfo.isReturnTypeChanged: Boolean[MyPropertyDescriptor]

'returnTypeIsNeeded' @ [153:47] ==> val returnTypeIsNeeded: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.changeReturnTypeIfNeeded[LocalVariableDescriptor]

'element' @ [154:13] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.changeReturnTypeIfNeeded[ValueParameterDescriptorImpl]

'typeReference' @ [154:21] ==> public final var KtCallableDeclaration.typeReference: KtTypeReference?[MyPropertyDescriptor]

'changeInfo' @ [155:34] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.changeReturnTypeIfNeeded[ValueParameterDescriptorImpl]

'renderReturnType' @ [155:45] ==> public final fun renderReturnType(inheritedCallable: KotlinCallableDefinitionUsage<*>): String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[SimpleFunctionDescriptorImpl]

'this' @ [155:62] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[LazyClassReceiverParameterDescriptor]

'changeInfo' @ [156:30] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.changeReturnTypeIfNeeded[ValueParameterDescriptorImpl]

'newReturnTypeInfo' @ [156:41] ==> public final var newReturnTypeInfo: KotlinTypeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[PropertyDescriptorImpl]

'type' @ [156:59] ==> public final val type: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinTypeInfo[PropertyDescriptorImpl]

'returnType' @ [157:17] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.changeReturnTypeIfNeeded[LocalVariableDescriptor]

'!' @ [157:39] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'returnType' @ [157:40] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.changeReturnTypeIfNeeded[LocalVariableDescriptor]

'isUnit' @ [157:51] ==> public fun KotlinType.isUnit(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'element' @ [158:17] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.changeReturnTypeIfNeeded[ValueParameterDescriptorImpl]

'setTypeReference' @ [158:25] ==> @Nullable public abstract fun setTypeReference(@Nullable p0: KtTypeReference?): KtTypeReference? defined in org.jetbrains.kotlin.psi.KtCallableDeclaration[JavaMethodDescriptor]

'KtPsiFactory' @ [158:42] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [158:55] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.changeReturnTypeIfNeeded[ValueParameterDescriptorImpl]

'createType' @ [158:64] ==> public final fun createType(type: String): KtTypeReference defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'returnTypeText' @ [158:75] ==> val returnTypeText: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.changeReturnTypeIfNeeded[LocalVariableDescriptor]

'addToShorteningWaitSet' @ [158:94] ==> public fun KtElement.addToShorteningWaitSet(options: ShortenReferences.Options = ...): Unit defined in org.jetbrains.kotlin.idea.codeInsight.shorten[DeserializedSimpleFunctionDescriptor]

'DEFAULT' @ [158:125] ==> public final val DEFAULT: ShortenReferences.Options defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Options.Companion[DeserializedPropertyDescriptor]

'originalParameterList' @ [168:29] ==> value-parameter originalParameterList: KtParameterList? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processParameterListWithStructuralChanges[ValueParameterDescriptorImpl]

'changeInfo' @ [169:31] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processParameterListWithStructuralChanges[ValueParameterDescriptorImpl]

'getNonReceiverParametersCount' @ [169:42] ==> public final fun getNonReceiverParametersCount(): Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[SimpleFunctionDescriptorImpl]

'element' @ [170:24] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processParameterListWithStructuralChanges[ValueParameterDescriptorImpl]

'if (isLambda) {
            if (parametersCount == 0) {
                if (parameterList != null) {
                    parameterList.delete()
                    val arrow = (element as KtFunctionLiteral).arrow
                    arrow?.delete()
                    parameterList = null
                }
            }
            else {
                newParameterList = psiFactory.createLambdaParameterList(changeInfo.getNewParametersSignatureWithoutParentheses(this))
                canReplaceEntireList = true
            }
        }
        else if (!(element is KtProperty || element is KtParameter)) {
            newParameterList = psiFactory.createParameterList(changeInfo.getNewParametersSignature(this))
        }' @ [174:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isLambda' @ [174:13] ==> val isLambda: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processParameterListWithStructuralChanges[LocalVariableDescriptor]

'if (parametersCount == 0) {
                if (parameterList != null) {
                    parameterList.delete()
                    val arrow = (element as KtFunctionLiteral).arrow
                    arrow?.delete()
                    parameterList = null
                }
            }
            else {
                newParameterList = psiFactory.createLambdaParameterList(changeInfo.getNewParametersSignatureWithoutParentheses(this))
                canReplaceEntireList = true
            }' @ [175:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'parametersCount' @ [175:17] ==> val parametersCount: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processParameterListWithStructuralChanges[LocalVariableDescriptor]

'parameterList' @ [176:21] ==> var parameterList: KtParameterList? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processParameterListWithStructuralChanges[LocalVariableDescriptor]

'parameterList' @ [177:21] ==> var parameterList: KtParameterList? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processParameterListWithStructuralChanges[LocalVariableDescriptor]

'delete' @ [177:35] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtParameterList[JavaMethodDescriptor]

'element' @ [178:34] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processParameterListWithStructuralChanges[ValueParameterDescriptorImpl]

'arrow' @ [178:64] ==> public final val KtFunctionLiteral.arrow: PsiElement?[MyPropertyDescriptor]

'arrow' @ [179:21] ==> val arrow: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processParameterListWithStructuralChanges[LocalVariableDescriptor]

'delete' @ [179:28] ==> public abstract fun delete(): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'parameterList' @ [180:21] ==> var parameterList: KtParameterList? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processParameterListWithStructuralChanges[LocalVariableDescriptor]

'newParameterList' @ [184:17] ==> var newParameterList: KtParameterList? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processParameterListWithStructuralChanges[LocalVariableDescriptor]

'psiFactory' @ [184:36] ==> value-parameter psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processParameterListWithStructuralChanges[ValueParameterDescriptorImpl]

'createLambdaParameterList' @ [184:47] ==> public final fun createLambdaParameterList(text: String): KtParameterList defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'changeInfo' @ [184:73] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processParameterListWithStructuralChanges[ValueParameterDescriptorImpl]

'getNewParametersSignatureWithoutParentheses' @ [184:84] ==> public final fun getNewParametersSignatureWithoutParentheses(inheritedCallable: KotlinCallableDefinitionUsage<*>): String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[SimpleFunctionDescriptorImpl]

'this' @ [184:128] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[LazyClassReceiverParameterDescriptor]

'canReplaceEntireList' @ [185:17] ==> var canReplaceEntireList: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processParameterListWithStructuralChanges[LocalVariableDescriptor]

'!' @ [188:18] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [188:20] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processParameterListWithStructuralChanges[ValueParameterDescriptorImpl]

'element' @ [188:45] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processParameterListWithStructuralChanges[ValueParameterDescriptorImpl]

'newParameterList' @ [189:13] ==> var newParameterList: KtParameterList? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processParameterListWithStructuralChanges[LocalVariableDescriptor]

'psiFactory' @ [189:32] ==> value-parameter psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processParameterListWithStructuralChanges[ValueParameterDescriptorImpl]

'createParameterList' @ [189:43] ==> public final fun createParameterList(text: String): KtParameterList defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'changeInfo' @ [189:63] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processParameterListWithStructuralChanges[ValueParameterDescriptorImpl]

'getNewParametersSignature' @ [189:74] ==> public final fun getNewParametersSignature(inheritedCallable: KotlinCallableDefinitionUsage<*>): String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[SimpleFunctionDescriptorImpl]

'this' @ [189:100] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[LazyClassReceiverParameterDescriptor]

'newParameterList' @ [192:13] ==> var newParameterList: KtParameterList? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processParameterListWithStructuralChanges[LocalVariableDescriptor]

'if (parameterList != null) {
            newParameterList = if (canReplaceEntireList) {
                parameterList.replace(newParameterList) as KtParameterList
            }
            else {
                replaceListPsiAndKeepDelimiters(parameterList, newParameterList) { parameters }
            }
        }
        else {
            if (element is KtClass) {
                val constructor = element.createPrimaryConstructorIfAbsent()
                val oldParameterList = constructor.valueParameterList.sure { "primary constructor from factory has parameter list" }
                newParameterList = oldParameterList.replace(newParameterList) as KtParameterList
            }
            else if (isLambda) {
                val functionLiteral = element as KtFunctionLiteral
                val anchor = functionLiteral.lBrace
                newParameterList = element.addAfter(newParameterList, anchor) as KtParameterList
                if (functionLiteral.arrow == null) {
                    val whitespaceAndArrow = psiFactory.createWhitespaceAndArrow()
                    element.addRangeAfter(whitespaceAndArrow.first, whitespaceAndArrow.second, newParameterList)
                }
            }
        }' @ [194:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'parameterList' @ [194:13] ==> var parameterList: KtParameterList? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processParameterListWithStructuralChanges[LocalVariableDescriptor]

'newParameterList' @ [195:13] ==> var newParameterList: KtParameterList? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processParameterListWithStructuralChanges[LocalVariableDescriptor]

'if (canReplaceEntireList) {
                parameterList.replace(newParameterList) as KtParameterList
            }
            else {
                replaceListPsiAndKeepDelimiters(parameterList, newParameterList) { parameters }
            }' @ [195:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtParameterList?, elseBranch: KtParameterList?): KtParameterList?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtParameterList?

'canReplaceEntireList' @ [195:36] ==> var canReplaceEntireList: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processParameterListWithStructuralChanges[LocalVariableDescriptor]

'parameterList' @ [196:17] ==> var parameterList: KtParameterList? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processParameterListWithStructuralChanges[LocalVariableDescriptor]

'replace' @ [196:31] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtParameterList[JavaMethodDescriptor]

'newParameterList' @ [196:39] ==> var newParameterList: KtParameterList? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processParameterListWithStructuralChanges[LocalVariableDescriptor]

'replaceListPsiAndKeepDelimiters' @ [199:17] ==> public fun <ListType : KtElement> replaceListPsiAndKeepDelimiters(originalList: KtParameterList, newList: KtParameterList, @Suppress listReplacer: KtParameterList.(KtParameterList) -> KtParameterList = ..., itemsFun: KtParameterList.() -> List<KtElement>): KtParameterList defined in org.jetbrains.kotlin.idea.refactoring[SimpleFunctionDescriptorImpl]
Inferred types:
    <ListType : KtElement> -> KtParameterList

'parameterList' @ [199:49] ==> var parameterList: KtParameterList? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processParameterListWithStructuralChanges[LocalVariableDescriptor]

'newParameterList' @ [199:64] ==> var newParameterList: KtParameterList? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processParameterListWithStructuralChanges[LocalVariableDescriptor]

'parameters' @ [199:84] ==> public final val KtParameterList.parameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'if (element is KtClass) {
                val constructor = element.createPrimaryConstructorIfAbsent()
                val oldParameterList = constructor.valueParameterList.sure { "primary constructor from factory has parameter list" }
                newParameterList = oldParameterList.replace(newParameterList) as KtParameterList
            }
            else if (isLambda) {
                val functionLiteral = element as KtFunctionLiteral
                val anchor = functionLiteral.lBrace
                newParameterList = element.addAfter(newParameterList, anchor) as KtParameterList
                if (functionLiteral.arrow == null) {
                    val whitespaceAndArrow = psiFactory.createWhitespaceAndArrow()
                    element.addRangeAfter(whitespaceAndArrow.first, whitespaceAndArrow.second, newParameterList)
                }
            }' @ [203:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'element' @ [203:17] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processParameterListWithStructuralChanges[ValueParameterDescriptorImpl]

'element' @ [204:35] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processParameterListWithStructuralChanges[ValueParameterDescriptorImpl]

'createPrimaryConstructorIfAbsent' @ [204:43] ==> public fun KtClass.createPrimaryConstructorIfAbsent(): KtPrimaryConstructor defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'constructor' @ [205:40] ==> val constructor: KtPrimaryConstructor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processParameterListWithStructuralChanges[LocalVariableDescriptor]

'valueParameterList' @ [205:52] ==> public final val KtPrimaryConstructor.valueParameterList: KtParameterList?[MyPropertyDescriptor]

'sure' @ [205:71] ==> public inline fun <T : Any> KtParameterList?.sure(message: () -> String): KtParameterList defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> KtParameterList

'newParameterList' @ [206:17] ==> var newParameterList: KtParameterList? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processParameterListWithStructuralChanges[LocalVariableDescriptor]

'oldParameterList' @ [206:36] ==> val oldParameterList: KtParameterList defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processParameterListWithStructuralChanges[LocalVariableDescriptor]

'replace' @ [206:53] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtParameterList[JavaMethodDescriptor]

'newParameterList' @ [206:61] ==> var newParameterList: KtParameterList? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processParameterListWithStructuralChanges[LocalVariableDescriptor]

'isLambda' @ [208:22] ==> val isLambda: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processParameterListWithStructuralChanges[LocalVariableDescriptor]

'element' @ [209:39] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processParameterListWithStructuralChanges[ValueParameterDescriptorImpl]

'functionLiteral' @ [210:30] ==> val functionLiteral: KtFunctionLiteral defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processParameterListWithStructuralChanges[LocalVariableDescriptor]

'lBrace' @ [210:46] ==> public final val KtFunctionLiteral.lBrace: PsiElement[MyPropertyDescriptor]

'newParameterList' @ [211:17] ==> var newParameterList: KtParameterList? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processParameterListWithStructuralChanges[LocalVariableDescriptor]

'element' @ [211:36] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processParameterListWithStructuralChanges[ValueParameterDescriptorImpl]

'addAfter' @ [211:44] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'newParameterList' @ [211:53] ==> var newParameterList: KtParameterList? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processParameterListWithStructuralChanges[LocalVariableDescriptor]

'anchor' @ [211:71] ==> val anchor: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processParameterListWithStructuralChanges[LocalVariableDescriptor]

'functionLiteral' @ [212:21] ==> val functionLiteral: KtFunctionLiteral defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processParameterListWithStructuralChanges[LocalVariableDescriptor]

'arrow' @ [212:37] ==> public final val KtFunctionLiteral.arrow: PsiElement?[MyPropertyDescriptor]

'psiFactory' @ [213:46] ==> value-parameter psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processParameterListWithStructuralChanges[ValueParameterDescriptorImpl]

'createWhitespaceAndArrow' @ [213:57] ==> public final fun createWhitespaceAndArrow(): Pair<PsiElement, PsiElement> defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'element' @ [214:21] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processParameterListWithStructuralChanges[ValueParameterDescriptorImpl]

'addRangeAfter' @ [214:29] ==> public abstract fun addRangeAfter(p0: (PsiElement..PsiElement?), p1: (PsiElement..PsiElement?), p2: (PsiElement..PsiElement?)): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'whitespaceAndArrow' @ [214:43] ==> val whitespaceAndArrow: Pair<PsiElement, PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processParameterListWithStructuralChanges[LocalVariableDescriptor]

'first' @ [214:62] ==> public final val first: PsiElement defined in kotlin.Pair[DeserializedPropertyDescriptor]

'whitespaceAndArrow' @ [214:69] ==> val whitespaceAndArrow: Pair<PsiElement, PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processParameterListWithStructuralChanges[LocalVariableDescriptor]

'second' @ [214:88] ==> public final val second: PsiElement defined in kotlin.Pair[DeserializedPropertyDescriptor]

'newParameterList' @ [214:96] ==> var newParameterList: KtParameterList? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processParameterListWithStructuralChanges[LocalVariableDescriptor]

'newParameterList' @ [219:9] ==> var newParameterList: KtParameterList? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.processParameterListWithStructuralChanges[LocalVariableDescriptor]

'addToShorteningWaitSet' @ [219:26] ==> public fun KtElement.addToShorteningWaitSet(options: ShortenReferences.Options = ...): Unit defined in org.jetbrains.kotlin.idea.codeInsight.shorten[DeserializedSimpleFunctionDescriptor]

'DEFAULT' @ [219:57] ==> public final val DEFAULT: ShortenReferences.Options defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Options.Companion[DeserializedPropertyDescriptor]

'changeInfo' @ [223:34] ==> value-parameter changeInfo: KotlinChangeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.changeVisibility[ValueParameterDescriptorImpl]

'newVisibility' @ [223:45] ==> public final var newVisibility: Visibility defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinChangeInfo[PropertyDescriptorImpl]

'toKeywordToken' @ [223:59] ==> public fun Visibility.toKeywordToken(): KtModifierKeywordToken defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'when (element) {
            is KtCallableDeclaration -> element.setVisibility(newVisibilityToken)
            is KtClass -> element.createPrimaryConstructorIfAbsent().setVisibility(newVisibilityToken)
            else -> throw AssertionError("Invalid element: " + element.getElementTextWithContext())
        }' @ [224:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'element' @ [224:15] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.changeVisibility[ValueParameterDescriptorImpl]

'element' @ [225:41] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.changeVisibility[ValueParameterDescriptorImpl]

'setVisibility' @ [225:49] ==> public fun KtModifierListOwner.setVisibility(visibilityModifier: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'newVisibilityToken' @ [225:63] ==> val newVisibilityToken: KtModifierKeywordToken defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.changeVisibility[LocalVariableDescriptor]

'element' @ [226:27] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.changeVisibility[ValueParameterDescriptorImpl]

'createPrimaryConstructorIfAbsent' @ [226:35] ==> public fun KtClass.createPrimaryConstructorIfAbsent(): KtPrimaryConstructor defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'setVisibility' @ [226:70] ==> public fun KtModifierListOwner.setVisibility(visibilityModifier: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'newVisibilityToken' @ [226:84] ==> val newVisibilityToken: KtModifierKeywordToken defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.changeVisibility[LocalVariableDescriptor]

'AssertionError' @ [227:27] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'+' @ [227:42] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'element' @ [227:64] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.changeVisibility[ValueParameterDescriptorImpl]

'getElementTextWithContext' @ [227:72] ==> public fun PsiElement.getElementTextWithContext(): String defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'parameter' @ [232:9] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.changeParameter[ValueParameterDescriptorImpl]

'setValOrVar' @ [232:19] ==> public fun KtParameter.setValOrVar(valOrVar: KotlinValVar): PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file KotlinValVar.kt[SimpleFunctionDescriptorImpl]

'parameterInfo' @ [232:31] ==> value-parameter parameterInfo: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.changeParameter[ValueParameterDescriptorImpl]

'valOrVar' @ [232:45] ==> public final var valOrVar: KotlinValVar defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'KtPsiFactory' @ [234:26] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [234:39] ==> public final val <T : PsiElement> KotlinCallableDefinitionUsage<T>.project: Project[MyPropertyDescriptor]
Inferred types:
    <T : PsiElement> -> T

'parameterInfo' @ [236:13] ==> value-parameter parameterInfo: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.changeParameter[ValueParameterDescriptorImpl]

'isTypeChanged' @ [236:27] ==> public final val isTypeChanged: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[PropertyDescriptorImpl]

'parameter' @ [236:44] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.changeParameter[ValueParameterDescriptorImpl]

'typeReference' @ [236:54] ==> public final var KtParameter.typeReference: KtTypeReference?[MyPropertyDescriptor]

'parameterInfo' @ [237:32] ==> value-parameter parameterInfo: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.changeParameter[ValueParameterDescriptorImpl]

'renderType' @ [237:46] ==> public final fun renderType(parameterIndex: Int, inheritedCallable: KotlinCallableDefinitionUsage<*>): String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[SimpleFunctionDescriptorImpl]

'parameterIndex' @ [237:57] ==> value-parameter parameterIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.changeParameter[ValueParameterDescriptorImpl]

'this' @ [237:73] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[LazyClassReceiverParameterDescriptor]

'parameter' @ [238:13] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.changeParameter[ValueParameterDescriptorImpl]

'typeReference' @ [238:23] ==> public final var KtParameter.typeReference: KtTypeReference?[MyPropertyDescriptor]

'psiFactory' @ [238:39] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.changeParameter[LocalVariableDescriptor]

'createType' @ [238:50] ==> public final fun createType(type: String): KtTypeReference defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'renderedType' @ [238:61] ==> val renderedType: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.changeParameter[LocalVariableDescriptor]

'parameterInfo' @ [241:29] ==> value-parameter parameterInfo: KotlinParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.changeParameter[ValueParameterDescriptorImpl]

'getInheritedName' @ [241:43] ==> public final fun getInheritedName(inheritedCallable: KotlinCallableDefinitionUsage<*>): String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinParameterInfo[SimpleFunctionDescriptorImpl]

'this' @ [241:60] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage[LazyClassReceiverParameterDescriptor]

'isValidIdentifier' @ [242:18] ==> public open fun isValidIdentifier(@NotNull p0: String): Boolean defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'inheritedName' @ [242:36] ==> val inheritedName: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.changeParameter[LocalVariableDescriptor]

'psiFactory' @ [243:33] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.changeParameter[LocalVariableDescriptor]

'createIdentifier' @ [243:44] ==> public final fun createIdentifier(name: String): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'inheritedName' @ [243:61] ==> val inheritedName: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.changeParameter[LocalVariableDescriptor]

'parameter' @ [244:13] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.changeParameter[ValueParameterDescriptorImpl]

'nameIdentifier' @ [244:23] ==> public final val KtParameter.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'replace' @ [244:39] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'newIdentifier' @ [244:47] ==> val newIdentifier: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.usages.KotlinCallableDefinitionUsage.changeParameter[LocalVariableDescriptor]

