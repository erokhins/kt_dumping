'targetDeclaration' @ [64:27] ==> protected final val targetDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher[PropertyDescriptorImpl]

'project' @ [64:45] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'extractReference' @ [82:25] ==> protected abstract fun extractReference(element: KtElement): PsiReference? defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher[SimpleFunctionDescriptorImpl]

'element' @ [82:42] ==> value-parameter element: TReferenceElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.processReferenceElement[ValueParameterDescriptorImpl]

'testLog' @ [83:9] ==> public final inline fun testLog(s: () -> String): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion[FunctionImportedFromObject]

'logPresentation' @ [83:31] ==> public final fun logPresentation(element: PsiElement): String? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion[FunctionImportedFromObject]

'element' @ [83:47] ==> value-parameter element: TReferenceElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.processReferenceElement[ValueParameterDescriptorImpl]

'if (reference.isReferenceTo(targetDeclaration)) {
            consumer.process(reference)
        }
        else {
            true
        }' @ [84:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'reference' @ [84:20] ==> val reference: PsiReference defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.processReferenceElement[LocalVariableDescriptor]

'isReferenceTo' @ [84:30] ==> public abstract fun isReferenceTo(p0: (PsiElement..PsiElement?)): Boolean defined in com.intellij.psi.PsiReference[JavaMethodDescriptor]

'targetDeclaration' @ [84:44] ==> protected final val targetDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher[PropertyDescriptorImpl]

'consumer' @ [85:13] ==> private final val consumer: Processor<PsiReference> defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher[PropertyDescriptorImpl]

'process' @ [85:22] ==> public abstract fun process(p0: (PsiReference..PsiReference?)): Boolean defined in com.intellij.util.Processor[JavaMethodDescriptor]

'reference' @ [85:30] ==> val reference: PsiReference defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.processReferenceElement[LocalVariableDescriptor]

'runReadAction' @ [100:20] ==> public fun <T> runReadAction(action: () -> OperatorReferenceSearcher<out KtElement>?): OperatorReferenceSearcher<out KtElement>? defined in org.jetbrains.kotlin.idea.util.application[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> OperatorReferenceSearcher<out KtElement>?

'if (declaration.isValid)
                    createInReadAction(declaration, searchScope, consumer, optimizer, options)
                else
                    null' @ [101:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: OperatorReferenceSearcher<out KtElement>?, elseBranch: OperatorReferenceSearcher<out KtElement>?): OperatorReferenceSearcher<out KtElement>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> OperatorReferenceSearcher<out KtElement>?

'declaration' @ [101:21] ==> value-parameter declaration: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.create[ValueParameterDescriptorImpl]

'isValid' @ [101:33] ==> public final val PsiElement.isValid: Boolean[MyPropertyDescriptor]

'createInReadAction' @ [102:21] ==> private final fun createInReadAction(declaration: PsiElement, searchScope: SearchScope, consumer: Processor<PsiReference>, optimizer: SearchRequestCollector, options: KotlinReferencesSearchOptions): OperatorReferenceSearcher<*>? defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion[SimpleFunctionDescriptorImpl]

'declaration' @ [102:40] ==> value-parameter declaration: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.create[ValueParameterDescriptorImpl]

'searchScope' @ [102:53] ==> value-parameter searchScope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.create[ValueParameterDescriptorImpl]

'consumer' @ [102:66] ==> value-parameter consumer: Processor<PsiReference> defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.create[ValueParameterDescriptorImpl]

'optimizer' @ [102:76] ==> value-parameter optimizer: SearchRequestCollector defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.create[ValueParameterDescriptorImpl]

'options' @ [102:87] ==> value-parameter options: KotlinReferencesSearchOptions defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.create[ValueParameterDescriptorImpl]

'when (declaration) {
                is KtNamedFunction -> declaration.name
                is PsiMethod -> declaration.name
                else -> null
            }' @ [115:33] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String?, entry1: String?, entry2: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String?

'declaration' @ [115:39] ==> value-parameter declaration: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'declaration' @ [116:39] ==> value-parameter declaration: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'name' @ [116:51] ==> public final val KtNamedFunction.name: String?[MyPropertyDescriptor]

'declaration' @ [117:33] ==> value-parameter declaration: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'name' @ [117:45] ==> public final var PsiMethod.name: String[MyPropertyDescriptor]

'!' @ [121:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isValidIdentifier' @ [121:23] ==> public open fun isValidIdentifier(@NotNull p0: String): Boolean defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'functionName' @ [121:41] ==> val functionName: String defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[LocalVariableDescriptor]

'identifier' @ [122:29] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'functionName' @ [122:40] ==> val functionName: String defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[LocalVariableDescriptor]

'if (declaration is KtLightMethod) {
                declaration.kotlinOrigin ?: return null
            }
            else {
                declaration
            }' @ [124:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement, elseBranch: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement

'declaration' @ [124:40] ==> value-parameter declaration: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'declaration' @ [125:17] ==> value-parameter declaration: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'kotlinOrigin' @ [125:29] ==> public abstract val kotlinOrigin: KtDeclaration? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethod[DeserializedPropertyDescriptor]

'declaration' @ [128:17] ==> value-parameter declaration: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'createInReadAction' @ [131:20] ==> private final fun createInReadAction(declaration: PsiElement, name: Name, consumer: Processor<PsiReference>, optimizer: SearchRequestCollector, options: KotlinReferencesSearchOptions, searchScope: SearchScope): OperatorReferenceSearcher<*>? defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion[SimpleFunctionDescriptorImpl]

'declarationToUse' @ [131:39] ==> val declarationToUse: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[LocalVariableDescriptor]

'name' @ [131:57] ==> val name: Name defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[LocalVariableDescriptor]

'consumer' @ [131:63] ==> value-parameter consumer: Processor<PsiReference> defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'optimizer' @ [131:73] ==> value-parameter optimizer: SearchRequestCollector defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'options' @ [131:84] ==> value-parameter options: KotlinReferencesSearchOptions defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'searchScope' @ [131:93] ==> value-parameter searchScope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'DataClassDescriptorResolver' @ [142:17] ==> public object DataClassDescriptorResolver defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'isComponentLike' @ [142:45] ==> public final fun isComponentLike(name: Name): Boolean defined in org.jetbrains.kotlin.resolve.DataClassDescriptorResolver[DeserializedSimpleFunctionDescriptor]

'name' @ [142:61] ==> value-parameter name: Name defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'!' @ [143:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'options' @ [143:22] ==> value-parameter options: KotlinReferencesSearchOptions defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'searchForComponentConventions' @ [143:30] ==> public final val searchForComponentConventions: Boolean defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearchOptions[PropertyDescriptorImpl]

'DataClassDescriptorResolver' @ [144:38] ==> public object DataClassDescriptorResolver defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'getComponentIndex' @ [144:66] ==> public final fun getComponentIndex(componentName: String): Int defined in org.jetbrains.kotlin.resolve.DataClassDescriptorResolver[DeserializedSimpleFunctionDescriptor]

'name' @ [144:84] ==> value-parameter name: Name defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'asString' @ [144:89] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'DestructuringDeclarationReferenceSearcher' @ [145:24] ==> public constructor DestructuringDeclarationReferenceSearcher(targetDeclaration: PsiElement, componentIndex: Int, searchScope: SearchScope, consumer: Processor<PsiReference>, optimizer: SearchRequestCollector, options: KotlinReferencesSearchOptions) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.DestructuringDeclarationReferenceSearcher[ClassConstructorDescriptorImpl]

'declaration' @ [145:66] ==> value-parameter declaration: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'componentIndex' @ [145:79] ==> val componentIndex: Int defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[LocalVariableDescriptor]

'searchScope' @ [145:95] ==> value-parameter searchScope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'consumer' @ [145:108] ==> value-parameter consumer: Processor<PsiReference> defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'optimizer' @ [145:118] ==> value-parameter optimizer: SearchRequestCollector defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'options' @ [145:129] ==> value-parameter options: KotlinReferencesSearchOptions defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'!' @ [148:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'options' @ [148:18] ==> value-parameter options: KotlinReferencesSearchOptions defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'searchForOperatorConventions' @ [148:26] ==> public final val searchForOperatorConventions: Boolean defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearchOptions[PropertyDescriptorImpl]

'OperatorConventions.BINARY_OPERATION_NAMES.inverse()[name]' @ [150:28] ==> public abstract fun get(@Nullable key: Name?): KtSingleValueToken? defined in com.google.common.collect.ImmutableBiMap[JavaMethodDescriptor]

'BINARY_OPERATION_NAMES' @ [150:48] ==> public final val BINARY_OPERATION_NAMES: (ImmutableBiMap<(KtSingleValueToken..KtSingleValueToken?), (Name..Name?)>..ImmutableBiMap<(KtSingleValueToken..KtSingleValueToken?), (Name..Name?)>?) defined in org.jetbrains.kotlin.types.expressions.OperatorConventions[JavaPropertyDescriptor]

'inverse' @ [150:71] ==> public abstract fun inverse(): (ImmutableBiMap<(Name..Name?), (KtSingleValueToken..KtSingleValueToken?)>..ImmutableBiMap<(Name..Name?), (KtSingleValueToken..KtSingleValueToken?)>?) defined in com.google.common.collect.ImmutableBiMap[JavaMethodDescriptor]

'name' @ [150:81] ==> value-parameter name: Name defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'OperatorConventions.ASSIGNMENT_OPERATIONS.inverse()[name]' @ [151:32] ==> public abstract fun get(@Nullable key: Name?): KtSingleValueToken? defined in com.google.common.collect.ImmutableBiMap[JavaMethodDescriptor]

'ASSIGNMENT_OPERATIONS' @ [151:52] ==> public final val ASSIGNMENT_OPERATIONS: (ImmutableBiMap<(KtSingleValueToken..KtSingleValueToken?), (Name..Name?)>..ImmutableBiMap<(KtSingleValueToken..KtSingleValueToken?), (Name..Name?)>?) defined in org.jetbrains.kotlin.types.expressions.OperatorConventions[JavaPropertyDescriptor]

'inverse' @ [151:74] ==> public abstract fun inverse(): (ImmutableBiMap<(Name..Name?), (KtSingleValueToken..KtSingleValueToken?)>..ImmutableBiMap<(Name..Name?), (KtSingleValueToken..KtSingleValueToken?)>?) defined in com.google.common.collect.ImmutableBiMap[JavaMethodDescriptor]

'name' @ [151:84] ==> value-parameter name: Name defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'OperatorConventions.UNARY_OPERATION_NAMES.inverse()[name]' @ [152:27] ==> public abstract fun get(@Nullable key: Name?): KtSingleValueToken? defined in com.google.common.collect.ImmutableBiMap[JavaMethodDescriptor]

'UNARY_OPERATION_NAMES' @ [152:47] ==> public final val UNARY_OPERATION_NAMES: (ImmutableBiMap<(KtSingleValueToken..KtSingleValueToken?), (Name..Name?)>..ImmutableBiMap<(KtSingleValueToken..KtSingleValueToken?), (Name..Name?)>?) defined in org.jetbrains.kotlin.types.expressions.OperatorConventions[JavaPropertyDescriptor]

'inverse' @ [152:69] ==> public abstract fun inverse(): (ImmutableBiMap<(Name..Name?), (KtSingleValueToken..KtSingleValueToken?)>..ImmutableBiMap<(Name..Name?), (KtSingleValueToken..KtSingleValueToken?)>?) defined in com.google.common.collect.ImmutableBiMap[JavaMethodDescriptor]

'name' @ [152:79] ==> value-parameter name: Name defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'when {
                binaryOp != null -> {
                    val counterpartAssignmentOp = OperatorConventions.ASSIGNMENT_OPERATION_COUNTERPARTS.inverse()[binaryOp]
                    val operationTokens = listOf(binaryOp, counterpartAssignmentOp).filterNotNull()
                    return BinaryOperatorReferenceSearcher(declaration, operationTokens, searchScope, consumer, optimizer, options)
                }

                assignmentOp != null ->
                    return BinaryOperatorReferenceSearcher(declaration, listOf(assignmentOp), searchScope, consumer, optimizer, options)

                unaryOp != null ->
                    return UnaryOperatorReferenceSearcher(declaration, unaryOp, searchScope, consumer, optimizer, options)

                name == OperatorNameConventions.INVOKE ->
                    return InvokeOperatorReferenceSearcher(declaration, searchScope, consumer, optimizer, options)

                name == OperatorNameConventions.GET ->
                    return IndexingOperatorReferenceSearcher(declaration, searchScope, consumer, optimizer, options, isSet = false)

                name == OperatorNameConventions.SET ->
                    return IndexingOperatorReferenceSearcher(declaration, searchScope, consumer, optimizer, options, isSet = true)

                name == OperatorNameConventions.CONTAINS ->
                    return ContainsOperatorReferenceSearcher(declaration, searchScope, consumer, optimizer, options)

                name == OperatorNameConventions.EQUALS ->
                    return BinaryOperatorReferenceSearcher(declaration, listOf(KtTokens.EQEQ, KtTokens.EXCLEQ), searchScope, consumer, optimizer, options)

                name == OperatorNameConventions.COMPARE_TO ->
                    return BinaryOperatorReferenceSearcher(declaration, listOf(KtTokens.LT, KtTokens.GT, KtTokens.LTEQ, KtTokens.GTEQ), searchScope, consumer, optimizer, options)

                name == OperatorNameConventions.ITERATOR ->
                    return IteratorOperatorReferenceSearcher(declaration, searchScope, consumer, optimizer, options)

                name == OperatorNameConventions.GET_VALUE || name == OperatorNameConventions.SET_VALUE || name == OperatorNameConventions.PROVIDE_DELEGATE ->
                    return PropertyDelegationOperatorReferenceSearcher(declaration, searchScope, consumer, optimizer, options)

                else ->
                    return null
            }' @ [154:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing, entry3: Nothing, entry4: Nothing, entry5: Nothing, entry6: Nothing, entry7: Nothing, entry8: Nothing, entry9: Nothing, entry10: Nothing, entry11: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'binaryOp' @ [155:17] ==> val binaryOp: KtSingleValueToken? defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[LocalVariableDescriptor]

'OperatorConventions.ASSIGNMENT_OPERATION_COUNTERPARTS.inverse()[binaryOp]' @ [156:51] ==> public abstract fun get(@Nullable key: KtSingleValueToken?): KtSingleValueToken? defined in com.google.common.collect.ImmutableBiMap[JavaMethodDescriptor]

'ASSIGNMENT_OPERATION_COUNTERPARTS' @ [156:71] ==> public final val ASSIGNMENT_OPERATION_COUNTERPARTS: (ImmutableBiMap<(KtSingleValueToken..KtSingleValueToken?), (KtSingleValueToken..KtSingleValueToken?)>..ImmutableBiMap<(KtSingleValueToken..KtSingleValueToken?), (KtSingleValueToken..KtSingleValueToken?)>?) defined in org.jetbrains.kotlin.types.expressions.OperatorConventions[JavaPropertyDescriptor]

'inverse' @ [156:105] ==> public abstract fun inverse(): (ImmutableBiMap<(KtSingleValueToken..KtSingleValueToken?), (KtSingleValueToken..KtSingleValueToken?)>..ImmutableBiMap<(KtSingleValueToken..KtSingleValueToken?), (KtSingleValueToken..KtSingleValueToken?)>?) defined in com.google.common.collect.ImmutableBiMap[JavaMethodDescriptor]

'binaryOp' @ [156:115] ==> val binaryOp: KtSingleValueToken? defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[LocalVariableDescriptor]

'listOf' @ [157:43] ==> public fun <T> listOf(vararg elements: KtSingleValueToken?): List<KtSingleValueToken?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSingleValueToken?

'binaryOp' @ [157:50] ==> val binaryOp: KtSingleValueToken? defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[LocalVariableDescriptor]

'counterpartAssignmentOp' @ [157:60] ==> val counterpartAssignmentOp: KtSingleValueToken? defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[LocalVariableDescriptor]

'filterNotNull' @ [157:85] ==> public fun <T : Any> Iterable<KtSingleValueToken?>.filterNotNull(): List<KtSingleValueToken> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> KtSingleValueToken

'BinaryOperatorReferenceSearcher' @ [158:28] ==> public constructor BinaryOperatorReferenceSearcher(targetFunction: PsiElement, operationTokens: List<KtSingleValueToken>, searchScope: SearchScope, consumer: Processor<PsiReference>, optimizer: SearchRequestCollector, options: KotlinReferencesSearchOptions) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.BinaryOperatorReferenceSearcher[ClassConstructorDescriptorImpl]

'declaration' @ [158:60] ==> value-parameter declaration: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'operationTokens' @ [158:73] ==> val operationTokens: List<KtSingleValueToken> defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[LocalVariableDescriptor]

'searchScope' @ [158:90] ==> value-parameter searchScope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'consumer' @ [158:103] ==> value-parameter consumer: Processor<PsiReference> defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'optimizer' @ [158:113] ==> value-parameter optimizer: SearchRequestCollector defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'options' @ [158:124] ==> value-parameter options: KotlinReferencesSearchOptions defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'assignmentOp' @ [161:17] ==> val assignmentOp: KtSingleValueToken? defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[LocalVariableDescriptor]

'BinaryOperatorReferenceSearcher' @ [162:28] ==> public constructor BinaryOperatorReferenceSearcher(targetFunction: PsiElement, operationTokens: List<KtSingleValueToken>, searchScope: SearchScope, consumer: Processor<PsiReference>, optimizer: SearchRequestCollector, options: KotlinReferencesSearchOptions) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.BinaryOperatorReferenceSearcher[ClassConstructorDescriptorImpl]

'declaration' @ [162:60] ==> value-parameter declaration: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'listOf' @ [162:73] ==> public fun <T> listOf(element: KtSingleValueToken): List<KtSingleValueToken> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSingleValueToken

'assignmentOp' @ [162:80] ==> val assignmentOp: KtSingleValueToken? defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[LocalVariableDescriptor]

'searchScope' @ [162:95] ==> value-parameter searchScope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'consumer' @ [162:108] ==> value-parameter consumer: Processor<PsiReference> defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'optimizer' @ [162:118] ==> value-parameter optimizer: SearchRequestCollector defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'options' @ [162:129] ==> value-parameter options: KotlinReferencesSearchOptions defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'unaryOp' @ [164:17] ==> val unaryOp: KtSingleValueToken? defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[LocalVariableDescriptor]

'UnaryOperatorReferenceSearcher' @ [165:28] ==> public constructor UnaryOperatorReferenceSearcher(targetFunction: PsiElement, operationToken: KtSingleValueToken, searchScope: SearchScope, consumer: Processor<PsiReference>, optimizer: SearchRequestCollector, options: KotlinReferencesSearchOptions) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.UnaryOperatorReferenceSearcher[ClassConstructorDescriptorImpl]

'declaration' @ [165:59] ==> value-parameter declaration: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'unaryOp' @ [165:72] ==> val unaryOp: KtSingleValueToken? defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[LocalVariableDescriptor]

'searchScope' @ [165:81] ==> value-parameter searchScope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'consumer' @ [165:94] ==> value-parameter consumer: Processor<PsiReference> defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'optimizer' @ [165:104] ==> value-parameter optimizer: SearchRequestCollector defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'options' @ [165:115] ==> value-parameter options: KotlinReferencesSearchOptions defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'name' @ [167:17] ==> value-parameter name: Name defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'OperatorNameConventions' @ [167:25] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'INVOKE' @ [167:49] ==> @field:JvmField public final val INVOKE: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'InvokeOperatorReferenceSearcher' @ [168:28] ==> public constructor InvokeOperatorReferenceSearcher(targetFunction: PsiElement, searchScope: SearchScope, consumer: Processor<PsiReference>, optimizer: SearchRequestCollector, options: KotlinReferencesSearchOptions) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.InvokeOperatorReferenceSearcher[ClassConstructorDescriptorImpl]

'declaration' @ [168:60] ==> value-parameter declaration: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'searchScope' @ [168:73] ==> value-parameter searchScope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'consumer' @ [168:86] ==> value-parameter consumer: Processor<PsiReference> defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'optimizer' @ [168:96] ==> value-parameter optimizer: SearchRequestCollector defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'options' @ [168:107] ==> value-parameter options: KotlinReferencesSearchOptions defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'name' @ [170:17] ==> value-parameter name: Name defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'OperatorNameConventions' @ [170:25] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'GET' @ [170:49] ==> @field:JvmField public final val GET: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'IndexingOperatorReferenceSearcher' @ [171:28] ==> public constructor IndexingOperatorReferenceSearcher(targetFunction: PsiElement, searchScope: SearchScope, consumer: Processor<PsiReference>, optimizer: SearchRequestCollector, options: KotlinReferencesSearchOptions, isSet: Boolean) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.IndexingOperatorReferenceSearcher[ClassConstructorDescriptorImpl]

'declaration' @ [171:62] ==> value-parameter declaration: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'searchScope' @ [171:75] ==> value-parameter searchScope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'consumer' @ [171:88] ==> value-parameter consumer: Processor<PsiReference> defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'optimizer' @ [171:98] ==> value-parameter optimizer: SearchRequestCollector defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'options' @ [171:109] ==> value-parameter options: KotlinReferencesSearchOptions defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'name' @ [173:17] ==> value-parameter name: Name defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'OperatorNameConventions' @ [173:25] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'SET' @ [173:49] ==> @field:JvmField public final val SET: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'IndexingOperatorReferenceSearcher' @ [174:28] ==> public constructor IndexingOperatorReferenceSearcher(targetFunction: PsiElement, searchScope: SearchScope, consumer: Processor<PsiReference>, optimizer: SearchRequestCollector, options: KotlinReferencesSearchOptions, isSet: Boolean) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.IndexingOperatorReferenceSearcher[ClassConstructorDescriptorImpl]

'declaration' @ [174:62] ==> value-parameter declaration: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'searchScope' @ [174:75] ==> value-parameter searchScope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'consumer' @ [174:88] ==> value-parameter consumer: Processor<PsiReference> defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'optimizer' @ [174:98] ==> value-parameter optimizer: SearchRequestCollector defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'options' @ [174:109] ==> value-parameter options: KotlinReferencesSearchOptions defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'name' @ [176:17] ==> value-parameter name: Name defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'OperatorNameConventions' @ [176:25] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'CONTAINS' @ [176:49] ==> @field:JvmField public final val CONTAINS: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'ContainsOperatorReferenceSearcher' @ [177:28] ==> public constructor ContainsOperatorReferenceSearcher(targetFunction: PsiElement, searchScope: SearchScope, consumer: Processor<PsiReference>, optimizer: SearchRequestCollector, options: KotlinReferencesSearchOptions) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.ContainsOperatorReferenceSearcher[ClassConstructorDescriptorImpl]

'declaration' @ [177:62] ==> value-parameter declaration: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'searchScope' @ [177:75] ==> value-parameter searchScope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'consumer' @ [177:88] ==> value-parameter consumer: Processor<PsiReference> defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'optimizer' @ [177:98] ==> value-parameter optimizer: SearchRequestCollector defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'options' @ [177:109] ==> value-parameter options: KotlinReferencesSearchOptions defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'name' @ [179:17] ==> value-parameter name: Name defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'OperatorNameConventions' @ [179:25] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'EQUALS' @ [179:49] ==> @field:JvmField public final val EQUALS: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'BinaryOperatorReferenceSearcher' @ [180:28] ==> public constructor BinaryOperatorReferenceSearcher(targetFunction: PsiElement, operationTokens: List<KtSingleValueToken>, searchScope: SearchScope, consumer: Processor<PsiReference>, optimizer: SearchRequestCollector, options: KotlinReferencesSearchOptions) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.BinaryOperatorReferenceSearcher[ClassConstructorDescriptorImpl]

'declaration' @ [180:60] ==> value-parameter declaration: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'listOf' @ [180:73] ==> public fun <T> listOf(vararg elements: (KtSingleValueToken..KtSingleValueToken?)): List<(KtSingleValueToken..KtSingleValueToken?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.lexer.KtSingleValueToken..org.jetbrains.kotlin.lexer.KtSingleValueToken?)

'EQEQ' @ [180:89] ==> public final val EQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'EXCLEQ' @ [180:104] ==> public final val EXCLEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'searchScope' @ [180:113] ==> value-parameter searchScope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'consumer' @ [180:126] ==> value-parameter consumer: Processor<PsiReference> defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'optimizer' @ [180:136] ==> value-parameter optimizer: SearchRequestCollector defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'options' @ [180:147] ==> value-parameter options: KotlinReferencesSearchOptions defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'name' @ [182:17] ==> value-parameter name: Name defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'OperatorNameConventions' @ [182:25] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'COMPARE_TO' @ [182:49] ==> @field:JvmField public final val COMPARE_TO: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'BinaryOperatorReferenceSearcher' @ [183:28] ==> public constructor BinaryOperatorReferenceSearcher(targetFunction: PsiElement, operationTokens: List<KtSingleValueToken>, searchScope: SearchScope, consumer: Processor<PsiReference>, optimizer: SearchRequestCollector, options: KotlinReferencesSearchOptions) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.BinaryOperatorReferenceSearcher[ClassConstructorDescriptorImpl]

'declaration' @ [183:60] ==> value-parameter declaration: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'listOf' @ [183:73] ==> public fun <T> listOf(vararg elements: (KtSingleValueToken..KtSingleValueToken?)): List<(KtSingleValueToken..KtSingleValueToken?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.lexer.KtSingleValueToken..org.jetbrains.kotlin.lexer.KtSingleValueToken?)

'LT' @ [183:89] ==> public final val LT: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'GT' @ [183:102] ==> public final val GT: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'LTEQ' @ [183:115] ==> public final val LTEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'GTEQ' @ [183:130] ==> public final val GTEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'searchScope' @ [183:137] ==> value-parameter searchScope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'consumer' @ [183:150] ==> value-parameter consumer: Processor<PsiReference> defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'optimizer' @ [183:160] ==> value-parameter optimizer: SearchRequestCollector defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'options' @ [183:171] ==> value-parameter options: KotlinReferencesSearchOptions defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'name' @ [185:17] ==> value-parameter name: Name defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'OperatorNameConventions' @ [185:25] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'ITERATOR' @ [185:49] ==> @field:JvmField public final val ITERATOR: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'IteratorOperatorReferenceSearcher' @ [186:28] ==> public constructor IteratorOperatorReferenceSearcher(targetFunction: PsiElement, searchScope: SearchScope, consumer: Processor<PsiReference>, optimizer: SearchRequestCollector, options: KotlinReferencesSearchOptions) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.IteratorOperatorReferenceSearcher[ClassConstructorDescriptorImpl]

'declaration' @ [186:62] ==> value-parameter declaration: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'searchScope' @ [186:75] ==> value-parameter searchScope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'consumer' @ [186:88] ==> value-parameter consumer: Processor<PsiReference> defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'optimizer' @ [186:98] ==> value-parameter optimizer: SearchRequestCollector defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'options' @ [186:109] ==> value-parameter options: KotlinReferencesSearchOptions defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'name' @ [188:17] ==> value-parameter name: Name defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'OperatorNameConventions' @ [188:25] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'GET_VALUE' @ [188:49] ==> @field:JvmField public final val GET_VALUE: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'name' @ [188:62] ==> value-parameter name: Name defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'OperatorNameConventions' @ [188:70] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'SET_VALUE' @ [188:94] ==> @field:JvmField public final val SET_VALUE: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'name' @ [188:107] ==> value-parameter name: Name defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'OperatorNameConventions' @ [188:115] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'PROVIDE_DELEGATE' @ [188:139] ==> @field:JvmField public final val PROVIDE_DELEGATE: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'PropertyDelegationOperatorReferenceSearcher' @ [189:28] ==> public constructor PropertyDelegationOperatorReferenceSearcher(targetFunction: PsiElement, searchScope: SearchScope, consumer: Processor<PsiReference>, optimizer: SearchRequestCollector, options: KotlinReferencesSearchOptions) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.PropertyDelegationOperatorReferenceSearcher[ClassConstructorDescriptorImpl]

'declaration' @ [189:72] ==> value-parameter declaration: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'searchScope' @ [189:85] ==> value-parameter searchScope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'consumer' @ [189:98] ==> value-parameter consumer: Processor<PsiReference> defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'optimizer' @ [189:108] ==> value-parameter optimizer: SearchRequestCollector defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'options' @ [189:119] ==> value-parameter options: KotlinReferencesSearchOptions defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.createInReadAction[ValueParameterDescriptorImpl]

'ThreadLocal<HashSet<PsiElement>>' @ [197:45] ==> public constructor ThreadLocal<T : (Any..Any?)>() defined in java.lang.ThreadLocal[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> HashSet<PsiElement>

'HashSet' @ [198:43] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiElement

'when (targetDeclaration) {
            is KtDeclaration -> targetDeclaration.resolveToDescriptorIfAny(BodyResolveMode.FULL)
            is PsiMember -> targetDeclaration.getJavaOrKotlinMemberDescriptor()
            else -> null
        }' @ [203:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: DeclarationDescriptor?, entry1: DeclarationDescriptor?, entry2: DeclarationDescriptor?): DeclarationDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> DeclarationDescriptor?

'targetDeclaration' @ [203:22] ==> protected final val targetDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher[PropertyDescriptorImpl]

'targetDeclaration' @ [204:33] ==> protected final val targetDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher[PropertyDescriptorImpl]

'resolveToDescriptorIfAny' @ [204:51] ==> public fun KtDeclaration.resolveToDescriptorIfAny(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FULL' @ [204:92] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'targetDeclaration' @ [205:29] ==> protected final val targetDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher[PropertyDescriptorImpl]

'getJavaOrKotlinMemberDescriptor' @ [205:47] ==> @JvmOverloads public fun PsiMember.getJavaOrKotlinMemberDescriptor(resolutionFacade: ResolutionFacade? = ...): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve in file JavaResolveExtension.kt[SimpleFunctionDescriptorImpl]

'runReadAction' @ [211:28] ==> public fun <T> runReadAction(action: () -> FuzzyType?): FuzzyType? defined in org.jetbrains.kotlin.idea.util.application[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> FuzzyType?

'extractReceiverType' @ [211:44] ==> private final fun extractReceiverType(): FuzzyType? defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher[SimpleFunctionDescriptorImpl]

'runReadAction' @ [212:24] ==> public fun <T> runReadAction(action: () -> PsiClass?): PsiClass? defined in org.jetbrains.kotlin.idea.util.application[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> PsiClass?

'receiverType' @ [212:40] ==> val receiverType: FuzzyType defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.run[LocalVariableDescriptor]

'toPsiClass' @ [212:53] ==> private final fun FuzzyType.toPsiClass(): PsiClass? defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher[SimpleFunctionDescriptorImpl]

'SearchesInProgress' @ [214:26] ==> private object SearchesInProgress : ThreadLocal<HashSet<PsiElement>> defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion[FakeCallableDescriptorForObject]

'get' @ [214:45] ==> public open fun get(): (HashSet<PsiElement>..HashSet<PsiElement>?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion.SearchesInProgress[JavaMethodDescriptor]

'if (psiClass != null) {
            if (!inProgress.add(psiClass)) {
                testLog { "ExpressionOfTypeProcessor is already started for ${runReadAction { psiClass.qualifiedName }}. Exit for operator ${logPresentation(targetDeclaration)}." }
                return
            }
        }
        else {
            if (!inProgress.add(targetDeclaration)) {
                testLog { "ExpressionOfTypeProcessor is already started for operator ${logPresentation(targetDeclaration)}. Exit." }
                return //TODO: it's not quite correct
            }
        }' @ [215:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'psiClass' @ [215:13] ==> val psiClass: PsiClass? defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.run[LocalVariableDescriptor]

'!' @ [216:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'inProgress' @ [216:18] ==> val inProgress: (HashSet<PsiElement>..HashSet<PsiElement>?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.run[LocalVariableDescriptor]

'add' @ [216:29] ==> public open fun add(element: PsiElement): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'psiClass' @ [216:33] ==> val psiClass: PsiClass? defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.run[LocalVariableDescriptor]

'testLog' @ [217:17] ==> public final inline fun testLog(s: () -> String): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion[FunctionImportedFromObject]

'runReadAction' @ [217:79] ==> public fun <T> runReadAction(action: () -> String?): String? defined in org.jetbrains.kotlin.idea.util.application[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String?

'psiClass' @ [217:95] ==> val psiClass: PsiClass? defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.run[LocalVariableDescriptor]

'qualifiedName' @ [217:104] ==> public final val PsiClass.qualifiedName: String?[MyPropertyDescriptor]

'logPresentation' @ [217:142] ==> public final fun logPresentation(element: PsiElement): String? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion[FunctionImportedFromObject]

'targetDeclaration' @ [217:158] ==> protected final val targetDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher[PropertyDescriptorImpl]

'!' @ [222:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'inProgress' @ [222:18] ==> val inProgress: (HashSet<PsiElement>..HashSet<PsiElement>?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.run[LocalVariableDescriptor]

'add' @ [222:29] ==> public open fun add(element: PsiElement): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'targetDeclaration' @ [222:33] ==> protected final val targetDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher[PropertyDescriptorImpl]

'testLog' @ [223:17] ==> public final inline fun testLog(s: () -> String): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion[FunctionImportedFromObject]

'logPresentation' @ [223:88] ==> public final fun logPresentation(element: PsiElement): String? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion[FunctionImportedFromObject]

'targetDeclaration' @ [223:104] ==> protected final val targetDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher[PropertyDescriptorImpl]

'ExpressionsOfTypeProcessor' @ [229:13] ==> public constructor ExpressionsOfTypeProcessor(typeToSearch: FuzzyType, classToSearch: PsiClass?, searchScope: SearchScope, project: Project, possibleMatchHandler: (KtExpression) -> Unit, possibleMatchesInScopeHandler: (SearchScope) -> Unit) defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[ClassConstructorDescriptorImpl]

'receiverType' @ [230:21] ==> val receiverType: FuzzyType defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.run[LocalVariableDescriptor]

'psiClass' @ [231:21] ==> val psiClass: PsiClass? defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.run[LocalVariableDescriptor]

'searchScope' @ [232:21] ==> private final val searchScope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher[PropertyDescriptorImpl]

'project' @ [233:21] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher[PropertyDescriptorImpl]

'processPossibleReceiverExpression' @ [234:60] ==> protected abstract fun processPossibleReceiverExpression(expression: KtExpression): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher[SimpleFunctionDescriptorImpl]

'expression' @ [234:94] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.run.<anonymous>[ValueParameterDescriptorImpl]

'doPlainSearch' @ [235:70] ==> private final fun doPlainSearch(scope: SearchScope): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher[SimpleFunctionDescriptorImpl]

'searchScope' @ [235:84] ==> value-parameter searchScope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.run.<anonymous>[ValueParameterDescriptorImpl]

'run' @ [236:15] ==> public final fun run(): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor[SimpleFunctionDescriptorImpl]

'inProgress' @ [239:13] ==> val inProgress: (HashSet<PsiElement>..HashSet<PsiElement>?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.run[LocalVariableDescriptor]

'remove' @ [239:24] ==> public open fun remove(element: PsiElement): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'if (psiClass != null) psiClass else targetDeclaration' @ [239:31] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement, elseBranch: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement

'psiClass' @ [239:35] ==> val psiClass: PsiClass? defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.run[LocalVariableDescriptor]

'psiClass' @ [239:53] ==> val psiClass: PsiClass? defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.run[LocalVariableDescriptor]

'targetDeclaration' @ [239:67] ==> protected final val targetDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher[PropertyDescriptorImpl]

'type' @ [244:31] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.idea.util.FuzzyType[DeserializedPropertyDescriptor]

'constructor' @ [244:36] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [244:48] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'DescriptorToSourceUtilsIde' @ [245:32] ==> public object DescriptorToSourceUtilsIde defined in org.jetbrains.kotlin.idea.codeInsight in file DescriptorToSourceUtilsIde.kt[FakeCallableDescriptorForObject]

'getAnyDeclaration' @ [245:59] ==> public final fun getAnyDeclaration(project: Project, descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[SimpleFunctionDescriptorImpl]

'project' @ [245:77] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher[PropertyDescriptorImpl]

'classDescriptor' @ [245:86] ==> val classDescriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.toPsiClass[LocalVariableDescriptor]

'when (classDeclaration) {
            is PsiClass -> classDeclaration
            is KtClassOrObject -> classDeclaration.toLightClass()
            else -> null
        }' @ [246:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiClass?, entry1: PsiClass?, entry2: PsiClass?): PsiClass?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiClass?

'classDeclaration' @ [246:22] ==> val classDeclaration: PsiElement? defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.toPsiClass[LocalVariableDescriptor]

'classDeclaration' @ [247:28] ==> val classDeclaration: PsiElement? defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.toPsiClass[LocalVariableDescriptor]

'classDeclaration' @ [248:35] ==> val classDeclaration: PsiElement? defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.toPsiClass[LocalVariableDescriptor]

'toLightClass' @ [248:52] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'resolveTargetToDescriptor' @ [254:26] ==> protected open fun resolveTargetToDescriptor(): FunctionDescriptor? defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher[SimpleFunctionDescriptorImpl]

'takeIf' @ [254:55] ==> @InlineOnly @SinceKotlin public inline fun <T> FunctionDescriptor.takeIf(predicate: (FunctionDescriptor) -> Boolean): FunctionDescriptor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'it' @ [254:64] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.extractReceiverType.<anonymous>[ValueParameterDescriptorImpl]

'isValidOperator' @ [254:67] ==> public fun FunctionDescriptor.isValidOperator(): Boolean defined in org.jetbrains.kotlin.util[DeserializedSimpleFunctionDescriptor]

'if (descriptor.isExtension) {
            descriptor.fuzzyExtensionReceiverType()!!
        }
        else {
            val classDescriptor = descriptor.containingDeclaration as? ClassDescriptor ?: return null
            classDescriptor.defaultType.toFuzzyType(classDescriptor.typeConstructor.parameters)
        }' @ [256:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FuzzyType?, elseBranch: FuzzyType?): FuzzyType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FuzzyType?

'descriptor' @ [256:20] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.extractReceiverType[LocalVariableDescriptor]

'isExtension' @ [256:31] ==> public val DeclarationDescriptor.isExtension: Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'descriptor' @ [257:13] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.extractReceiverType[LocalVariableDescriptor]

'fuzzyExtensionReceiverType' @ [257:24] ==> public fun CallableDescriptor.fuzzyExtensionReceiverType(): FuzzyType? defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [260:35] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.extractReceiverType[LocalVariableDescriptor]

'containingDeclaration' @ [260:46] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'classDescriptor' @ [261:13] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.extractReceiverType[LocalVariableDescriptor]

'defaultType' @ [261:29] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'toFuzzyType' @ [261:41] ==> public fun KotlinType.toFuzzyType(freeParameters: Collection<TypeParameterDescriptor>): FuzzyType defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'classDescriptor' @ [261:53] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.extractReceiverType[LocalVariableDescriptor]

'typeConstructor' @ [261:69] ==> public final val ClassDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'parameters' @ [261:85] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'testLog' @ [266:9] ==> public final inline fun testLog(s: () -> String): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion[FunctionImportedFromObject]

'logPresentation' @ [266:43] ==> public final fun logPresentation(element: PsiElement): String? defined in org.jetbrains.kotlin.idea.search.usagesSearch.ExpressionsOfTypeProcessor.Companion[FunctionImportedFromObject]

'targetDeclaration' @ [266:59] ==> protected final val targetDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher[PropertyDescriptorImpl]

'scope' @ [266:84] ==> value-parameter scope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.doPlainSearch[ValueParameterDescriptorImpl]

'logPresentation' @ [266:90] ==> private final fun SearchScope.logPresentation(): String defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher[SimpleFunctionDescriptorImpl]

'if (scope is LocalSearchScope) {
            for (element in scope.scope) {
                if (element is KtElement) {
                    runReadAction {
                        if (element.isValid) {
                            val refs = ArrayList<PsiReference>()
                            val elements = element.collectDescendantsOfType<KtElement> {
                                val ref = extractReference(it) ?: return@collectDescendantsOfType false
                                refs.add(ref)
                                true
                            }

                            // resolve all references at once
                            (element.containingFile as KtFile).getResolutionFacade().analyze(elements, BodyResolveMode.PARTIAL)

                            refs
                                    .filter { it.isReferenceTo(targetDeclaration) }
                                    .forEach { consumer.process(it) }
                        }
                    }
                }
            }
        }
        else {
            scope as GlobalSearchScope
            if (wordsToSearch.isNotEmpty()) {
                val unwrappedElement = targetDeclaration.namedUnwrappedElement ?: return
                val resultProcessor = KotlinRequestResultProcessor(unwrappedElement,
                                                                   filter = { ref -> isReferenceToCheck(ref) },
                                                                   options = options)
                wordsToSearch.forEach {
                    optimizer.searchWord(it, scope.restrictToKotlinSources(), UsageSearchContext.IN_CODE, true, unwrappedElement, resultProcessor)
                }
            }
            else {
                val psiManager = PsiManager.getInstance(project)
                // we must unwrap progress indicator because ProgressWrapper does not do anything on changing text and fraction
                val progress = ProgressWrapper.unwrap(ProgressIndicatorProvider.getGlobalProgressIndicator())
                progress?.pushState()
                progress?.text = "Searching for implicit usages..."

                try {
                    val files = runReadAction { FileTypeIndex.getFiles(KotlinFileType.INSTANCE, scope) }
                    for ((index, file) in files.withIndex()) {
                        progress?.checkCanceled()
                        runReadAction {
                            if (file.isValid) {
                                progress?.fraction = index / files.size.toDouble()
                                progress?.text2 = file.path
                                val psiFile = psiManager.findFile(file) as? KtFile
                                if (psiFile != null) {
                                    doPlainSearch(LocalSearchScope(psiFile))
                                }
                            }
                        }
                    }
                }
                finally {
                    progress?.popState()
                }
            }
        }' @ [268:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'scope' @ [268:13] ==> value-parameter scope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.doPlainSearch[ValueParameterDescriptorImpl]

'scope' @ [269:29] ==> value-parameter scope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.doPlainSearch[ValueParameterDescriptorImpl]

'scope' @ [269:35] ==> public final val LocalSearchScope.scope: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'element' @ [270:21] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.doPlainSearch[LocalVariableDescriptor]

'runReadAction' @ [271:21] ==> public fun <T> runReadAction(action: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Unit

'element' @ [272:29] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.doPlainSearch[LocalVariableDescriptor]

'isValid' @ [272:37] ==> public final val KtElement.isValid: Boolean[MyPropertyDescriptor]

'ArrayList' @ [273:40] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiReference

'element' @ [274:44] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.doPlainSearch[LocalVariableDescriptor]

'collectDescendantsOfType' @ [274:52] ==> public inline fun <reified T : PsiElement> PsiElement.collectDescendantsOfType(noinline predicate: (KtElement) -> Boolean = ...): List<KtElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtElement

'extractReference' @ [275:43] ==> protected abstract fun extractReference(element: KtElement): PsiReference? defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher[SimpleFunctionDescriptorImpl]

'it' @ [275:60] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.doPlainSearch.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'refs' @ [276:33] ==> val refs: ArrayList<PsiReference> defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.doPlainSearch.<anonymous>[LocalVariableDescriptor]

'add' @ [276:38] ==> public open fun add(element: PsiReference): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'ref' @ [276:42] ==> val ref: PsiReference defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.doPlainSearch.<anonymous>.<anonymous>[LocalVariableDescriptor]

'element' @ [281:30] ==> val element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.doPlainSearch[LocalVariableDescriptor]

'containingFile' @ [281:38] ==> public final val KtElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'getResolutionFacade' @ [281:64] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'analyze' @ [281:86] ==> public abstract fun analyze(elements: Collection<KtElement>, bodyResolveMode: BodyResolveMode): BindingContext defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]

'elements' @ [281:94] ==> val elements: List<KtElement> defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.doPlainSearch.<anonymous>[LocalVariableDescriptor]

'PARTIAL' @ [281:120] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'refs' @ [283:29] ==> val refs: ArrayList<PsiReference> defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.doPlainSearch.<anonymous>[LocalVariableDescriptor]

'filter' @ [284:38] ==> public inline fun <T> Iterable<PsiReference>.filter(predicate: (PsiReference) -> Boolean): List<PsiReference> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiReference

'it' @ [284:47] ==> value-parameter it: PsiReference defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.doPlainSearch.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isReferenceTo' @ [284:50] ==> public abstract fun isReferenceTo(p0: (PsiElement..PsiElement?)): Boolean defined in com.intellij.psi.PsiReference[JavaMethodDescriptor]

'targetDeclaration' @ [284:64] ==> protected final val targetDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher[PropertyDescriptorImpl]

'forEach' @ [285:38] ==> @HidesMembers public inline fun <T> Iterable<PsiReference>.forEach(action: (PsiReference) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiReference

'consumer' @ [285:48] ==> private final val consumer: Processor<PsiReference> defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher[PropertyDescriptorImpl]

'process' @ [285:57] ==> public abstract fun process(p0: (PsiReference..PsiReference?)): Boolean defined in com.intellij.util.Processor[JavaMethodDescriptor]

'it' @ [285:65] ==> value-parameter it: PsiReference defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.doPlainSearch.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'scope' @ [292:13] ==> value-parameter scope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.doPlainSearch[ValueParameterDescriptorImpl]

'if (wordsToSearch.isNotEmpty()) {
                val unwrappedElement = targetDeclaration.namedUnwrappedElement ?: return
                val resultProcessor = KotlinRequestResultProcessor(unwrappedElement,
                                                                   filter = { ref -> isReferenceToCheck(ref) },
                                                                   options = options)
                wordsToSearch.forEach {
                    optimizer.searchWord(it, scope.restrictToKotlinSources(), UsageSearchContext.IN_CODE, true, unwrappedElement, resultProcessor)
                }
            }
            else {
                val psiManager = PsiManager.getInstance(project)
                // we must unwrap progress indicator because ProgressWrapper does not do anything on changing text and fraction
                val progress = ProgressWrapper.unwrap(ProgressIndicatorProvider.getGlobalProgressIndicator())
                progress?.pushState()
                progress?.text = "Searching for implicit usages..."

                try {
                    val files = runReadAction { FileTypeIndex.getFiles(KotlinFileType.INSTANCE, scope) }
                    for ((index, file) in files.withIndex()) {
                        progress?.checkCanceled()
                        runReadAction {
                            if (file.isValid) {
                                progress?.fraction = index / files.size.toDouble()
                                progress?.text2 = file.path
                                val psiFile = psiManager.findFile(file) as? KtFile
                                if (psiFile != null) {
                                    doPlainSearch(LocalSearchScope(psiFile))
                                }
                            }
                        }
                    }
                }
                finally {
                    progress?.popState()
                }
            }' @ [293:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'wordsToSearch' @ [293:17] ==> private final val wordsToSearch: List<String> defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher[PropertyDescriptorImpl]

'isNotEmpty' @ [293:31] ==> @InlineOnly public inline fun <T> Collection<String>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'targetDeclaration' @ [294:40] ==> protected final val targetDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher[PropertyDescriptorImpl]

'namedUnwrappedElement' @ [294:58] ==> public val PsiElement.namedUnwrappedElement: PsiNamedElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'KotlinRequestResultProcessor' @ [295:39] ==> public constructor KotlinRequestResultProcessor(unwrappedElement: PsiElement, originalElement: PsiElement = ..., filter: (PsiReference) -> Boolean = ..., options: KotlinReferencesSearchOptions = ...) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinRequestResultProcessor[ClassConstructorDescriptorImpl]

'unwrappedElement' @ [295:68] ==> val unwrappedElement: PsiNamedElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.doPlainSearch[LocalVariableDescriptor]

'isReferenceToCheck' @ [296:86] ==> protected abstract fun isReferenceToCheck(ref: PsiReference): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher[SimpleFunctionDescriptorImpl]

'ref' @ [296:105] ==> value-parameter ref: PsiReference defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.doPlainSearch.<anonymous>[ValueParameterDescriptorImpl]

'options' @ [297:78] ==> private final val options: KotlinReferencesSearchOptions defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher[PropertyDescriptorImpl]

'wordsToSearch' @ [298:17] ==> private final val wordsToSearch: List<String> defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher[PropertyDescriptorImpl]

'forEach' @ [298:31] ==> @HidesMembers public inline fun <T> Iterable<String>.forEach(action: (String) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'optimizer' @ [299:21] ==> private final val optimizer: SearchRequestCollector defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher[PropertyDescriptorImpl]

'searchWord' @ [299:31] ==> public open fun searchWord(@NotNull p0: String, @NotNull p1: SearchScope, p2: Short, p3: Boolean, @NotNull p4: PsiElement, @NotNull p5: RequestResultProcessor): Unit defined in com.intellij.psi.search.SearchRequestCollector[JavaMethodDescriptor]

'it' @ [299:42] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.doPlainSearch.<anonymous>[ValueParameterDescriptorImpl]

'scope' @ [299:46] ==> value-parameter scope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.doPlainSearch[ValueParameterDescriptorImpl]

'restrictToKotlinSources' @ [299:52] ==> public fun GlobalSearchScope.restrictToKotlinSources(): GlobalSearchScope defined in org.jetbrains.kotlin.idea.search[SimpleFunctionDescriptorImpl]

'IN_CODE' @ [299:98] ==> public const final val IN_CODE: Short defined in com.intellij.psi.search.UsageSearchContext[JavaPropertyDescriptor]

'unwrappedElement' @ [299:113] ==> val unwrappedElement: PsiNamedElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.doPlainSearch[LocalVariableDescriptor]

'resultProcessor' @ [299:131] ==> val resultProcessor: KotlinRequestResultProcessor defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.doPlainSearch[LocalVariableDescriptor]

'getInstance' @ [303:45] ==> @NotNull public open fun getInstance(@NotNull p0: Project): PsiManager defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'project' @ [303:57] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher[PropertyDescriptorImpl]

'unwrap' @ [305:48] ==> @Contract public open fun unwrap(p0: (ProgressIndicator..ProgressIndicator?)): (ProgressIndicator..ProgressIndicator?) defined in com.intellij.openapi.progress.util.ProgressWrapper[JavaMethodDescriptor]

'getGlobalProgressIndicator' @ [305:81] ==> @Nullable public open fun getGlobalProgressIndicator(): ProgressIndicator? defined in com.intellij.openapi.progress.ProgressIndicatorProvider[JavaMethodDescriptor]

'progress' @ [306:17] ==> val progress: (ProgressIndicator..ProgressIndicator?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.doPlainSearch[LocalVariableDescriptor]

'pushState' @ [306:27] ==> public abstract fun pushState(): Unit defined in com.intellij.openapi.progress.ProgressIndicator[JavaMethodDescriptor]

'progress' @ [307:17] ==> val progress: (ProgressIndicator..ProgressIndicator?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.doPlainSearch[LocalVariableDescriptor]

'text' @ [307:27] ==> public final var ProgressIndicator.text: (String..String?)[MyPropertyDescriptor]

'runReadAction' @ [310:33] ==> public fun <T> runReadAction(action: () -> (MutableCollection<(VirtualFile..VirtualFile?)>..Collection<(VirtualFile..VirtualFile?)>)): (MutableCollection<(VirtualFile..VirtualFile?)>..Collection<(VirtualFile..VirtualFile?)>) defined in org.jetbrains.kotlin.idea.util.application[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> (kotlin.collections.MutableCollection<(com.intellij.openapi.vfs.VirtualFile..com.intellij.openapi.vfs.VirtualFile?)>..kotlin.collections.Collection<(com.intellij.openapi.vfs.VirtualFile..com.intellij.openapi.vfs.VirtualFile?)>)

'getFiles' @ [310:63] ==> @NotNull public open fun getFiles(@NotNull p0: FileType, @NotNull p1: GlobalSearchScope): (MutableCollection<(VirtualFile..VirtualFile?)>..Collection<(VirtualFile..VirtualFile?)>) defined in com.intellij.psi.search.FileTypeIndex[JavaMethodDescriptor]

'INSTANCE' @ [310:87] ==> public final val INSTANCE: (KotlinFileType..KotlinFileType?) defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

'scope' @ [310:97] ==> value-parameter scope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.doPlainSearch[ValueParameterDescriptorImpl]

'component1' @ [311:27] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [311:34] ==> public final operator fun component2(): (VirtualFile..VirtualFile?) defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'files' @ [311:43] ==> val files: (MutableCollection<(VirtualFile..VirtualFile?)>..Collection<(VirtualFile..VirtualFile?)>) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.doPlainSearch[LocalVariableDescriptor]

'withIndex' @ [311:49] ==> public fun <T> Iterable<(VirtualFile..VirtualFile?)>.withIndex(): Iterable<IndexedValue<(VirtualFile..VirtualFile?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.vfs.VirtualFile..com.intellij.openapi.vfs.VirtualFile?)

'progress' @ [312:25] ==> val progress: (ProgressIndicator..ProgressIndicator?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.doPlainSearch[LocalVariableDescriptor]

'checkCanceled' @ [312:35] ==> public abstract fun checkCanceled(): Unit defined in com.intellij.openapi.progress.ProgressIndicator[JavaMethodDescriptor]

'runReadAction' @ [313:25] ==> public fun <T> runReadAction(action: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Unit

'file' @ [314:33] ==> val file: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.doPlainSearch[LocalVariableDescriptor]

'isValid' @ [314:38] ==> public final val VirtualFile.isValid: Boolean[MyPropertyDescriptor]

'progress' @ [315:33] ==> val progress: (ProgressIndicator..ProgressIndicator?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.doPlainSearch[LocalVariableDescriptor]

'fraction' @ [315:43] ==> public final var ProgressIndicator.fraction: Double[MyPropertyDescriptor]

'index' @ [315:54] ==> val index: Int defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.doPlainSearch[LocalVariableDescriptor]

'files' @ [315:62] ==> val files: (MutableCollection<(VirtualFile..VirtualFile?)>..Collection<(VirtualFile..VirtualFile?)>) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.doPlainSearch[LocalVariableDescriptor]

'size' @ [315:68] ==> public abstract val size: Int defined in kotlin.collections.MutableCollection[DeserializedPropertyDescriptor]

'toDouble' @ [315:73] ==> public open fun toDouble(): Double defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'progress' @ [316:33] ==> val progress: (ProgressIndicator..ProgressIndicator?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.doPlainSearch[LocalVariableDescriptor]

'text2' @ [316:43] ==> public final var ProgressIndicator.text2: (String..String?)[MyPropertyDescriptor]

'file' @ [316:51] ==> val file: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.doPlainSearch[LocalVariableDescriptor]

'path' @ [316:56] ==> public final val VirtualFile.path: String[MyPropertyDescriptor]

'psiManager' @ [317:47] ==> val psiManager: PsiManager defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.doPlainSearch[LocalVariableDescriptor]

'findFile' @ [317:58] ==> @Nullable public abstract fun findFile(@NotNull p0: VirtualFile): PsiFile? defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'file' @ [317:67] ==> val file: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.doPlainSearch[LocalVariableDescriptor]

'psiFile' @ [318:37] ==> val psiFile: KtFile? defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.doPlainSearch.<anonymous>[LocalVariableDescriptor]

'doPlainSearch' @ [319:37] ==> private final fun doPlainSearch(scope: SearchScope): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher[SimpleFunctionDescriptorImpl]

'LocalSearchScope' @ [319:51] ==> public constructor LocalSearchScope(@NotNull p0: PsiElement) defined in com.intellij.psi.search.LocalSearchScope[JavaClassConstructorDescriptor]

'psiFile' @ [319:68] ==> val psiFile: KtFile? defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.doPlainSearch.<anonymous>[LocalVariableDescriptor]

'progress' @ [326:21] ==> val progress: (ProgressIndicator..ProgressIndicator?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.doPlainSearch[LocalVariableDescriptor]

'popState' @ [326:31] ==> public abstract fun popState(): Unit defined in com.intellij.openapi.progress.ProgressIndicator[JavaMethodDescriptor]

'when (this) {
            searchScope -> "whole search scope"

            is LocalSearchScope -> {
                scope
                        .map { element ->
                            "    " + runReadAction {
                                when (element) {
                                    is KtFunctionLiteral -> element.text
                                    is KtWhenEntry -> {
                                        if (element.isElse)
                                            "KtWhenEntry \"else\""
                                        else
                                            "KtWhenEntry \"" + element.conditions.joinToString(", ") { it.text } + "\""
                                    }
                                    is KtNamedDeclaration -> element.node.elementType.toString() + ":" + element.name
                                    else -> element.toString()
                                }
                            }
                        }
                        .toList()
                        .sorted()
                        .joinToString("\n", "LocalSearchScope:\n")
            }

            else -> this.displayName
        }' @ [333:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'this' @ [333:22] ==> <this> defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.logPresentation[ReceiverParameterDescriptorImpl]

'searchScope' @ [334:13] ==> private final val searchScope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher[PropertyDescriptorImpl]

'scope' @ [337:17] ==> public final val LocalSearchScope.scope: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'map' @ [338:26] ==> public inline fun <T, R> Array<out (PsiElement..PsiElement?)>.map(transform: ((PsiElement..PsiElement?)) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <R> -> String

'+' @ [339:29] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'runReadAction' @ [339:38] ==> public fun <T> runReadAction(action: () -> (String..String?)): (String..String?) defined in org.jetbrains.kotlin.idea.util.application[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'when (element) {
                                    is KtFunctionLiteral -> element.text
                                    is KtWhenEntry -> {
                                        if (element.isElse)
                                            "KtWhenEntry \"else\""
                                        else
                                            "KtWhenEntry \"" + element.conditions.joinToString(", ") { it.text } + "\""
                                    }
                                    is KtNamedDeclaration -> element.node.elementType.toString() + ":" + element.name
                                    else -> element.toString()
                                }' @ [340:33] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (String..String?), entry1: (String..String?), entry2: (String..String?), entry3: (String..String?)): (String..String?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (kotlin.String..kotlin.String?)

'element' @ [340:39] ==> value-parameter element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.logPresentation.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [341:61] ==> value-parameter element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.logPresentation.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [341:69] ==> public final val KtFunctionLiteral.text: (String..String?)[MyPropertyDescriptor]

'if (element.isElse)
                                            "KtWhenEntry \"else\""
                                        else
                                            "KtWhenEntry \"" + element.conditions.joinToString(", ") { it.text } + "\""' @ [343:41] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'element' @ [343:45] ==> value-parameter element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.logPresentation.<anonymous>[ValueParameterDescriptorImpl]

'isElse' @ [343:53] ==> public final val KtWhenEntry.isElse: Boolean[MyPropertyDescriptor]

'+' @ [346:45] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'element' @ [346:64] ==> value-parameter element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.logPresentation.<anonymous>[ValueParameterDescriptorImpl]

'conditions' @ [346:72] ==> public final val KtWhenEntry.conditions: (Array<(KtWhenCondition..KtWhenCondition?)>..Array<out (KtWhenCondition..KtWhenCondition?)>)[MyPropertyDescriptor]

'joinToString' @ [346:83] ==> public fun <T> Array<out (KtWhenCondition..KtWhenCondition?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((KtWhenCondition..KtWhenCondition?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtWhenCondition..org.jetbrains.kotlin.psi.KtWhenCondition?)

'it' @ [346:104] ==> value-parameter it: (KtWhenCondition..KtWhenCondition?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.logPresentation.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [346:107] ==> public final val KtWhenCondition.text: (String..String?)[MyPropertyDescriptor]

'element' @ [348:62] ==> value-parameter element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.logPresentation.<anonymous>[ValueParameterDescriptorImpl]

'node' @ [348:70] ==> public final val KtNamedDeclaration.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [348:75] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'toString' @ [348:87] ==> public open fun toString(): String defined in com.intellij.psi.tree.IElementType[JavaMethodDescriptor]

'element' @ [348:106] ==> value-parameter element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.logPresentation.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [348:114] ==> public final val KtNamedDeclaration.name: String?[MyPropertyDescriptor]

'element' @ [349:45] ==> value-parameter element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.logPresentation.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [349:53] ==> public open fun toString(): String defined in com.intellij.psi.PsiElement[DeserializedSimpleFunctionDescriptor]

'toList' @ [353:26] ==> public fun <T> Iterable<String>.toList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'sorted' @ [354:26] ==> public fun <T : Comparable<String>> Iterable<String>.sorted(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> String

'joinToString' @ [355:26] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'this' @ [358:21] ==> <this> defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.logPresentation[ReceiverParameterDescriptorImpl]

'displayName' @ [358:26] ==> public final val SearchScope.displayName: String[MyPropertyDescriptor]

