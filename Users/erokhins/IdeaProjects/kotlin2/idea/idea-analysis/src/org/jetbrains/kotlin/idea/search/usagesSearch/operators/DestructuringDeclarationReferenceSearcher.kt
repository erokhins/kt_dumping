'OperatorReferenceSearcher<KtDestructuringDeclaration>' @ [39:5] ==> public constructor OperatorReferenceSearcher<TReferenceElement : KtElement>(targetDeclaration: PsiElement, searchScope: SearchScope, consumer: Processor<PsiReference>, optimizer: SearchRequestCollector, options: KotlinReferencesSearchOptions, wordsToSearch: List<String>) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher[ClassConstructorDescriptorImpl]
Inferred types:
    <TReferenceElement : KtElement> -> KtDestructuringDeclaration

'targetDeclaration' @ [39:59] ==> value-parameter targetDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.DestructuringDeclarationReferenceSearcher.<init>[ValueParameterDescriptorImpl]

'searchScope' @ [39:78] ==> value-parameter searchScope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.DestructuringDeclarationReferenceSearcher.<init>[ValueParameterDescriptorImpl]

'consumer' @ [39:91] ==> value-parameter consumer: Processor<PsiReference> defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.DestructuringDeclarationReferenceSearcher.<init>[ValueParameterDescriptorImpl]

'optimizer' @ [39:101] ==> value-parameter optimizer: SearchRequestCollector defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.DestructuringDeclarationReferenceSearcher.<init>[ValueParameterDescriptorImpl]

'options' @ [39:112] ==> value-parameter options: KotlinReferencesSearchOptions defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.DestructuringDeclarationReferenceSearcher.<init>[ValueParameterDescriptorImpl]

'listOf' @ [39:137] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'if (targetDeclaration is KtParameter) {
            targetDeclaration.dataClassComponentFunction()
        }
        else {
            super.resolveTargetToDescriptor()
        }' @ [42:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FunctionDescriptor?, elseBranch: FunctionDescriptor?): FunctionDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FunctionDescriptor?

'targetDeclaration' @ [42:20] ==> protected final val targetDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.DestructuringDeclarationReferenceSearcher[PropertyDescriptorImpl]

'targetDeclaration' @ [43:13] ==> protected final val targetDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.DestructuringDeclarationReferenceSearcher[PropertyDescriptorImpl]

'dataClassComponentFunction' @ [43:31] ==> public fun KtParameter.dataClassComponentFunction(): FunctionDescriptor? defined in org.jetbrains.kotlin.idea.search.usagesSearch in file searchHelpers.kt[SimpleFunctionDescriptorImpl]

'super' @ [46:13] ==> <this> defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.DestructuringDeclarationReferenceSearcher[LazyClassReceiverParameterDescriptor]

'resolveTargetToDescriptor' @ [46:19] ==> protected open fun resolveTargetToDescriptor(): FunctionDescriptor? defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher[SimpleFunctionDescriptorImpl]

'element' @ [51:40] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.DestructuringDeclarationReferenceSearcher.extractReference[ValueParameterDescriptorImpl]

'destructuringDeclaration' @ [52:23] ==> val destructuringDeclaration: KtDestructuringDeclaration defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.DestructuringDeclarationReferenceSearcher.extractReference[LocalVariableDescriptor]

'entries' @ [52:48] ==> public final val KtDestructuringDeclaration.entries: (MutableList<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>..List<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>)[MyPropertyDescriptor]

'entries' @ [53:13] ==> val entries: (MutableList<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>..List<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.DestructuringDeclarationReferenceSearcher.extractReference[LocalVariableDescriptor]

'size' @ [53:21] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'componentIndex' @ [53:28] ==> private final val componentIndex: Int defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.DestructuringDeclarationReferenceSearcher[PropertyDescriptorImpl]

'entries' @ [54:16] ==> val entries: (MutableList<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>..List<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.DestructuringDeclarationReferenceSearcher.extractReference[LocalVariableDescriptor]

'componentIndex' @ [54:24] ==> private final val componentIndex: Int defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.DestructuringDeclarationReferenceSearcher[PropertyDescriptorImpl]

'references' @ [54:44] ==> public final val KtDestructuringDeclarationEntry.references: (Array<(PsiReference..PsiReference?)>..Array<out (PsiReference..PsiReference?)>)[MyPropertyDescriptor]

'firstIsInstance' @ [54:55] ==> public inline fun <reified T> Array<*>.firstIsInstance(): KtDestructuringDeclarationReference defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> KtDestructuringDeclarationReference

'ref' @ [57:58] ==> value-parameter ref: PsiReference defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.DestructuringDeclarationReferenceSearcher.isReferenceToCheck[ValueParameterDescriptorImpl]

'expression' @ [60:22] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.DestructuringDeclarationReferenceSearcher.processPossibleReceiverExpression[ValueParameterDescriptorImpl]

'parent' @ [60:33] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (parent) {
            is KtDestructuringDeclaration -> parent

            is KtContainerNode -> {
                if (parent.node.elementType == KtNodeTypes.LOOP_RANGE) {
                    (parent.parent as KtForExpression).destructuringDeclaration
                }
                else {
                    null
                }
            }

            else -> null
        }' @ [61:40] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtDestructuringDeclaration?, entry1: KtDestructuringDeclaration?, entry2: KtDestructuringDeclaration?): KtDestructuringDeclaration?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtDestructuringDeclaration?

'parent' @ [61:46] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.DestructuringDeclarationReferenceSearcher.processPossibleReceiverExpression[LocalVariableDescriptor]

'parent' @ [62:46] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.DestructuringDeclarationReferenceSearcher.processPossibleReceiverExpression[LocalVariableDescriptor]

'if (parent.node.elementType == KtNodeTypes.LOOP_RANGE) {
                    (parent.parent as KtForExpression).destructuringDeclaration
                }
                else {
                    null
                }' @ [65:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtDestructuringDeclaration?, elseBranch: KtDestructuringDeclaration?): KtDestructuringDeclaration?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtDestructuringDeclaration?

'parent' @ [65:21] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.DestructuringDeclarationReferenceSearcher.processPossibleReceiverExpression[LocalVariableDescriptor]

'node' @ [65:28] ==> public final val KtContainerNode.node: ASTNode[MyPropertyDescriptor]

'elementType' @ [65:33] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'LOOP_RANGE' @ [65:60] ==> public final val LOOP_RANGE: (KtNodeType..KtNodeType?) defined in org.jetbrains.kotlin.KtNodeTypes[JavaPropertyDescriptor]

'parent' @ [66:22] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.DestructuringDeclarationReferenceSearcher.processPossibleReceiverExpression[LocalVariableDescriptor]

'parent' @ [66:29] ==> public final val KtContainerNode.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'destructuringDeclaration' @ [66:56] ==> public final val KtForExpression.destructuringDeclaration: KtDestructuringDeclaration?[MyPropertyDescriptor]

'destructuringDeclaration' @ [76:13] ==> val destructuringDeclaration: KtDestructuringDeclaration? defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.DestructuringDeclarationReferenceSearcher.processPossibleReceiverExpression[LocalVariableDescriptor]

'processReferenceElement' @ [77:13] ==> protected final fun processReferenceElement(element: KtDestructuringDeclaration): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.DestructuringDeclarationReferenceSearcher[SimpleFunctionDescriptorImpl]

'destructuringDeclaration' @ [77:37] ==> val destructuringDeclaration: KtDestructuringDeclaration? defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.DestructuringDeclarationReferenceSearcher.processPossibleReceiverExpression[LocalVariableDescriptor]

