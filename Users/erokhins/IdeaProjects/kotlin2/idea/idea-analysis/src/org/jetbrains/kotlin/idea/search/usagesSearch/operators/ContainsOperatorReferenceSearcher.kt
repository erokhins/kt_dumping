'OperatorReferenceSearcher<KtOperationReferenceExpression>' @ [36:5] ==> public constructor OperatorReferenceSearcher<TReferenceElement : KtElement>(targetDeclaration: PsiElement, searchScope: SearchScope, consumer: Processor<PsiReference>, optimizer: SearchRequestCollector, options: KotlinReferencesSearchOptions, wordsToSearch: List<String>) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher[ClassConstructorDescriptorImpl]
Inferred types:
    <TReferenceElement : KtElement> -> KtOperationReferenceExpression

'targetFunction' @ [36:63] ==> value-parameter targetFunction: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.ContainsOperatorReferenceSearcher.<init>[ValueParameterDescriptorImpl]

'searchScope' @ [36:79] ==> value-parameter searchScope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.ContainsOperatorReferenceSearcher.<init>[ValueParameterDescriptorImpl]

'consumer' @ [36:92] ==> value-parameter consumer: Processor<PsiReference> defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.ContainsOperatorReferenceSearcher.<init>[ValueParameterDescriptorImpl]

'optimizer' @ [36:102] ==> value-parameter optimizer: SearchRequestCollector defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.ContainsOperatorReferenceSearcher.<init>[ValueParameterDescriptorImpl]

'options' @ [36:113] ==> value-parameter options: KotlinReferencesSearchOptions defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.ContainsOperatorReferenceSearcher.<init>[ValueParameterDescriptorImpl]

'listOf' @ [36:138] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'setOf' @ [38:36] ==> public fun <T> setOf(vararg elements: (KtKeywordToken..KtKeywordToken?)): Set<(KtKeywordToken..KtKeywordToken?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.lexer.KtKeywordToken..org.jetbrains.kotlin.lexer.KtKeywordToken?)

'IN_KEYWORD' @ [38:51] ==> public final val IN_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'NOT_IN' @ [38:72] ==> public final val NOT_IN: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'expression' @ [41:22] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.ContainsOperatorReferenceSearcher.processPossibleReceiverExpression[ValueParameterDescriptorImpl]

'parent' @ [41:33] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (parent) {
            is KtBinaryExpression -> {
                if (parent.operationToken in OPERATION_TOKENS && expression == parent.right) {
                    processReferenceElement(parent.operationReference)
                }
            }

            is KtWhenConditionInRange -> {
                processReferenceElement(parent.operationReference)
            }
        }' @ [42:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'parent' @ [42:15] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.ContainsOperatorReferenceSearcher.processPossibleReceiverExpression[LocalVariableDescriptor]

'parent' @ [44:21] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.ContainsOperatorReferenceSearcher.processPossibleReceiverExpression[LocalVariableDescriptor]

'operationToken' @ [44:28] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'OPERATION_TOKENS' @ [44:46] ==> private final val OPERATION_TOKENS: Set<(KtKeywordToken..KtKeywordToken?)> defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.ContainsOperatorReferenceSearcher[PropertyDescriptorImpl]

'expression' @ [44:66] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.ContainsOperatorReferenceSearcher.processPossibleReceiverExpression[ValueParameterDescriptorImpl]

'parent' @ [44:80] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.ContainsOperatorReferenceSearcher.processPossibleReceiverExpression[LocalVariableDescriptor]

'right' @ [44:87] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'processReferenceElement' @ [45:21] ==> protected final fun processReferenceElement(element: KtOperationReferenceExpression): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.ContainsOperatorReferenceSearcher[SimpleFunctionDescriptorImpl]

'parent' @ [45:45] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.ContainsOperatorReferenceSearcher.processPossibleReceiverExpression[LocalVariableDescriptor]

'operationReference' @ [45:52] ==> public final val KtBinaryExpression.operationReference: KtOperationReferenceExpression[MyPropertyDescriptor]

'processReferenceElement' @ [50:17] ==> protected final fun processReferenceElement(element: KtOperationReferenceExpression): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.ContainsOperatorReferenceSearcher[SimpleFunctionDescriptorImpl]

'parent' @ [50:41] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.ContainsOperatorReferenceSearcher.processPossibleReceiverExpression[LocalVariableDescriptor]

'operationReference' @ [50:48] ==> public final val KtWhenConditionInRange.operationReference: KtOperationReferenceExpression[MyPropertyDescriptor]

'ref' @ [56:13] ==> value-parameter ref: PsiReference defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.ContainsOperatorReferenceSearcher.isReferenceToCheck[ValueParameterDescriptorImpl]

'ref' @ [57:23] ==> value-parameter ref: PsiReference defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.ContainsOperatorReferenceSearcher.isReferenceToCheck[ValueParameterDescriptorImpl]

'element' @ [57:27] ==> public final val KtSimpleNameReference.element: (KtSimpleNameExpression..KtSimpleNameExpression?)[MyPropertyDescriptor]

'element' @ [58:16] ==> val element: KtOperationReferenceExpression defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.ContainsOperatorReferenceSearcher.isReferenceToCheck[LocalVariableDescriptor]

'getReferencedNameElementType' @ [58:24] ==> public open fun getReferencedNameElementType(): IElementType defined in org.jetbrains.kotlin.psi.KtOperationReferenceExpression[DeserializedSimpleFunctionDescriptor]

'OPERATION_TOKENS' @ [58:58] ==> private final val OPERATION_TOKENS: Set<(KtKeywordToken..KtKeywordToken?)> defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.ContainsOperatorReferenceSearcher[PropertyDescriptorImpl]

'element' @ [62:35] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.ContainsOperatorReferenceSearcher.extractReference[ValueParameterDescriptorImpl]

'referenceExpression' @ [63:13] ==> val referenceExpression: KtOperationReferenceExpression defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.ContainsOperatorReferenceSearcher.extractReference[LocalVariableDescriptor]

'getReferencedNameElementType' @ [63:33] ==> public open fun getReferencedNameElementType(): IElementType defined in org.jetbrains.kotlin.psi.KtOperationReferenceExpression[DeserializedSimpleFunctionDescriptor]

'OPERATION_TOKENS' @ [63:68] ==> private final val OPERATION_TOKENS: Set<(KtKeywordToken..KtKeywordToken?)> defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.ContainsOperatorReferenceSearcher[PropertyDescriptorImpl]

'referenceExpression' @ [64:16] ==> val referenceExpression: KtOperationReferenceExpression defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.ContainsOperatorReferenceSearcher.extractReference[LocalVariableDescriptor]

'references' @ [64:36] ==> public final val KtOperationReferenceExpression.references: (Array<(PsiReference..PsiReference?)>..Array<out (PsiReference..PsiReference?)>)[MyPropertyDescriptor]

'firstIsInstance' @ [64:47] ==> public inline fun <reified T> Array<*>.firstIsInstance(): KtSimpleNameReference defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> KtSimpleNameReference

