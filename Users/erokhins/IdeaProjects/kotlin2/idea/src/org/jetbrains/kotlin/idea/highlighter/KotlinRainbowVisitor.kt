'RainbowVisitor' @ [37:30] ==> public constructor RainbowVisitor() defined in com.intellij.codeInsight.daemon.RainbowVisitor[JavaClassConstructorDescriptor]

'file' @ [38:51] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.suitableForFile[ValueParameterDescriptorImpl]

'KotlinRainbowVisitor' @ [40:28] ==> public constructor KotlinRainbowVisitor() defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor[ClassConstructorDescriptorImpl]

'when {
            element.isRainbowDeclaration() -> {
                val rainbowElement = (element as KtNamedDeclaration).nameIdentifier ?: return
                addRainbowHighlight(element, rainbowElement)
            }
            element is KtSimpleNameExpression -> {
                val qualifiedExpression = PsiTreeUtil.getParentOfType(element, KtQualifiedExpression::class.java, true,
                                                                      KtLambdaExpression::class.java, KtValueArgumentList::class.java)
                if (qualifiedExpression?.selectorExpression?.isAncestor(element) == true) return

                val bindingContext = element.analyze(BodyResolveMode.PARTIAL_WITH_DIAGNOSTICS)
                val targets = element.getReferenceTargets(bindingContext)
                val targetVariable = targets.firstIsInstanceOrNull<VariableDescriptor>()
                if (targetVariable != null) {
                    val targetElement = DescriptorToSourceUtils.getSourceFromDescriptor(targetVariable)
                    if (targetElement.isRainbowDeclaration()) {
                        addRainbowHighlight(targetElement!!, element)
                    }
                    else if (targetElement == null && element.getReferencedName() == "it") {
                        addRainbowHighlight(element, element)
                    }
                }
            }
            element is KDocName -> {
                val target = element.reference?.resolve() ?: return
                if (target.isRainbowDeclaration()) {
                    addRainbowHighlight(target, element, KDOC_LINK)
                }
            }
        }' @ [43:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'element' @ [44:13] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.visit[ValueParameterDescriptorImpl]

'isRainbowDeclaration' @ [44:21] ==> private final fun PsiElement?.isRainbowDeclaration(): Boolean defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor[SimpleFunctionDescriptorImpl]

'?:' @ [45:38] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiElement?, right: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiElement

'element' @ [45:39] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.visit[ValueParameterDescriptorImpl]

'nameIdentifier' @ [45:70] ==> public final val KtNamedDeclaration.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'addRainbowHighlight' @ [46:17] ==> private final fun addRainbowHighlight(target: PsiElement, rainbowElement: PsiElement, attributesKey: TextAttributesKey? = ...): Unit defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor[SimpleFunctionDescriptorImpl]

'element' @ [46:37] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.visit[ValueParameterDescriptorImpl]

'rainbowElement' @ [46:46] ==> val rainbowElement: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.visit[LocalVariableDescriptor]

'element' @ [48:13] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.visit[ValueParameterDescriptorImpl]

'getParentOfType' @ [49:55] ==> @SafeVarargs @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(KtQualifiedExpression..KtQualifiedExpression?)>, p2: Boolean, @NotNull vararg p3: (Class<out (PsiElement..PsiElement?)>..Class<out (PsiElement..PsiElement?)>?)): KtQualifiedExpression? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtQualifiedExpression..org.jetbrains.kotlin.psi.KtQualifiedExpression?)

'element' @ [49:71] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.visit[ValueParameterDescriptorImpl]

'java' @ [49:109] ==> public val <T> KClass<KtQualifiedExpression>.java: Class<KtQualifiedExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtQualifiedExpression

'KtLambdaExpression' @ [50:71] ==> public constructor KtLambdaExpression(p0: (CharSequence..CharSequence?)) defined in org.jetbrains.kotlin.psi.KtLambdaExpression[JavaClassConstructorDescriptor]

'java' @ [50:97] ==> public val <T> KClass<KtLambdaExpression>.java: Class<KtLambdaExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtLambdaExpression

'KtValueArgumentList' @ [50:103] ==> public constructor KtValueArgumentList(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtValueArgumentList[JavaClassConstructorDescriptor]

'java' @ [50:130] ==> public val <T> KClass<KtValueArgumentList>.java: Class<KtValueArgumentList> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtValueArgumentList

'qualifiedExpression' @ [51:21] ==> val qualifiedExpression: KtQualifiedExpression? defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.visit[LocalVariableDescriptor]

'selectorExpression' @ [51:42] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'isAncestor' @ [51:62] ==> public fun PsiElement?.isAncestor(element: PsiElement, strict: Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'element' @ [51:73] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.visit[ValueParameterDescriptorImpl]

'element' @ [53:38] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.visit[ValueParameterDescriptorImpl]

'analyze' @ [53:46] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL_WITH_DIAGNOSTICS' @ [53:70] ==> enum entry PARTIAL_WITH_DIAGNOSTICS defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'element' @ [54:31] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.visit[ValueParameterDescriptorImpl]

'getReferenceTargets' @ [54:39] ==> public fun KtExpression.getReferenceTargets(context: BindingContext): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.bindingContextUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [54:59] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.visit[LocalVariableDescriptor]

'targets' @ [55:38] ==> val targets: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.visit[LocalVariableDescriptor]

'firstIsInstanceOrNull' @ [55:46] ==> public inline fun <reified T : Any> Iterable<*>.firstIsInstanceOrNull(): VariableDescriptor? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> VariableDescriptor

'targetVariable' @ [56:21] ==> val targetVariable: VariableDescriptor? defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.visit[LocalVariableDescriptor]

'DescriptorToSourceUtils' @ [57:41] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'getSourceFromDescriptor' @ [57:65] ==> @JvmStatic public final fun getSourceFromDescriptor(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'targetVariable' @ [57:89] ==> val targetVariable: VariableDescriptor? defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.visit[LocalVariableDescriptor]

'if (targetElement.isRainbowDeclaration()) {
                        addRainbowHighlight(targetElement!!, element)
                    }
                    else if (targetElement == null && element.getReferencedName() == "it") {
                        addRainbowHighlight(element, element)
                    }' @ [58:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'targetElement' @ [58:25] ==> val targetElement: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.visit[LocalVariableDescriptor]

'isRainbowDeclaration' @ [58:39] ==> private final fun PsiElement?.isRainbowDeclaration(): Boolean defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor[SimpleFunctionDescriptorImpl]

'addRainbowHighlight' @ [59:25] ==> private final fun addRainbowHighlight(target: PsiElement, rainbowElement: PsiElement, attributesKey: TextAttributesKey? = ...): Unit defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor[SimpleFunctionDescriptorImpl]

'targetElement' @ [59:45] ==> val targetElement: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.visit[LocalVariableDescriptor]

'element' @ [59:62] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.visit[ValueParameterDescriptorImpl]

'targetElement' @ [61:30] ==> val targetElement: PsiElement? defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.visit[LocalVariableDescriptor]

'element' @ [61:55] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.visit[ValueParameterDescriptorImpl]

'getReferencedName' @ [61:63] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'addRainbowHighlight' @ [62:25] ==> private final fun addRainbowHighlight(target: PsiElement, rainbowElement: PsiElement, attributesKey: TextAttributesKey? = ...): Unit defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor[SimpleFunctionDescriptorImpl]

'element' @ [62:45] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.visit[ValueParameterDescriptorImpl]

'element' @ [62:54] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.visit[ValueParameterDescriptorImpl]

'element' @ [66:13] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.visit[ValueParameterDescriptorImpl]

'element' @ [67:30] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.visit[ValueParameterDescriptorImpl]

'reference' @ [67:38] ==> public final val KDocName.reference: PsiReference?[MyPropertyDescriptor]

'resolve' @ [67:49] ==> @Nullable public abstract fun resolve(): PsiElement? defined in com.intellij.psi.PsiReference[JavaMethodDescriptor]

'target' @ [68:21] ==> val target: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.visit[LocalVariableDescriptor]

'isRainbowDeclaration' @ [68:28] ==> private final fun PsiElement?.isRainbowDeclaration(): Boolean defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor[SimpleFunctionDescriptorImpl]

'addRainbowHighlight' @ [69:21] ==> private final fun addRainbowHighlight(target: PsiElement, rainbowElement: PsiElement, attributesKey: TextAttributesKey? = ...): Unit defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor[SimpleFunctionDescriptorImpl]

'target' @ [69:41] ==> val target: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.visit[LocalVariableDescriptor]

'element' @ [69:49] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.visit[ValueParameterDescriptorImpl]

'KDOC_LINK' @ [69:58] ==> public final val KDOC_LINK: (TextAttributesKey..TextAttributesKey?) defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightingColors[JavaPropertyDescriptor]

'target' @ [77:38] ==> value-parameter target: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.addRainbowHighlight[ValueParameterDescriptorImpl]

'parents' @ [77:45] ==> public val PsiElement.parents: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'takeWhile' @ [78:18] ==> public fun <T> Sequence<PsiElement>.takeWhile(predicate: (PsiElement) -> Boolean): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [78:30] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.addRainbowHighlight.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [78:54] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.addRainbowHighlight.<anonymous>[ValueParameterDescriptorImpl]

'isAnonymousFunction' @ [78:57] ==> private fun PsiElement.isAnonymousFunction(): Boolean defined in org.jetbrains.kotlin.idea.highlighter in file KotlinRainbowVisitor.kt[SimpleFunctionDescriptorImpl]

'it' @ [78:82] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.addRainbowHighlight.<anonymous>[ValueParameterDescriptorImpl]

'filter' @ [79:18] ==> public fun <T> Sequence<PsiElement>.filter(predicate: (PsiElement) -> Boolean): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [79:27] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.addRainbowHighlight.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [79:55] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.addRainbowHighlight.<anonymous>[ValueParameterDescriptorImpl]

'isAnonymousFunction' @ [79:58] ==> private fun PsiElement.isAnonymousFunction(): Boolean defined in org.jetbrains.kotlin.idea.highlighter in file KotlinRainbowVisitor.kt[SimpleFunctionDescriptorImpl]

'iterator' @ [80:18] ==> public abstract operator fun iterator(): Iterator<PsiElement> defined in kotlin.sequences.Sequence[DeserializedSimpleFunctionDescriptor]

'attributesKey' @ [82:33] ==> value-parameter attributesKey: TextAttributesKey? = ... defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.addRainbowHighlight[ValueParameterDescriptorImpl]

'if (target is KtParameter) PARAMETER else LOCAL_VARIABLE' @ [82:51] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (TextAttributesKey..TextAttributesKey?), elseBranch: (TextAttributesKey..TextAttributesKey?)): (TextAttributesKey..TextAttributesKey?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (com.intellij.openapi.editor.colors.TextAttributesKey..com.intellij.openapi.editor.colors.TextAttributesKey?)

'target' @ [82:55] ==> value-parameter target: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.addRainbowHighlight[ValueParameterDescriptorImpl]

'PARAMETER' @ [82:78] ==> public final val PARAMETER: (TextAttributesKey..TextAttributesKey?) defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightingColors[JavaPropertyDescriptor]

'LOCAL_VARIABLE' @ [82:93] ==> public final val LOCAL_VARIABLE: (TextAttributesKey..TextAttributesKey?) defined in org.jetbrains.kotlin.idea.highlighter.KotlinHighlightingColors[JavaPropertyDescriptor]

'lambdaSequenceIterator' @ [83:13] ==> val lambdaSequenceIterator: Iterator<PsiElement> defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.addRainbowHighlight[LocalVariableDescriptor]

'hasNext' @ [83:36] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'lambdaSequenceIterator' @ [84:26] ==> val lambdaSequenceIterator: Iterator<PsiElement> defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.addRainbowHighlight[LocalVariableDescriptor]

'next' @ [84:49] ==> public abstract operator fun next(): PsiElement defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'lambdaSequenceIterator' @ [86:20] ==> val lambdaSequenceIterator: Iterator<PsiElement> defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.addRainbowHighlight[LocalVariableDescriptor]

'hasNext' @ [86:43] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'lambdaNestingLevel' @ [87:17] ==> var lambdaNestingLevel: Int defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.addRainbowHighlight[LocalVariableDescriptor]

'lambda' @ [88:17] ==> var lambda: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.addRainbowHighlight[LocalVariableDescriptor]

'lambdaSequenceIterator' @ [88:26] ==> val lambdaSequenceIterator: Iterator<PsiElement> defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.addRainbowHighlight[LocalVariableDescriptor]

'next' @ [88:49] ==> public abstract operator fun next(): PsiElement defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'addInfo' @ [90:13] ==> protected/*protected and package*/ open fun addInfo(@Nullable p0: HighlightInfo?): Unit defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor[JavaMethodDescriptor]

'getInfo' @ [90:21] ==> protected/*protected and package*/ open fun getInfo(@NotNull p0: PsiElement, @NotNull p1: PsiElement, @NotNull p2: String, @Nullable p3: TextAttributesKey?): (HighlightInfo..HighlightInfo?) defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor[JavaMethodDescriptor]

'lambda' @ [90:29] ==> var lambda: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.addRainbowHighlight[LocalVariableDescriptor]

'rainbowElement' @ [90:37] ==> value-parameter rainbowElement: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.addRainbowHighlight[ValueParameterDescriptorImpl]

'lambdaNestingLevel' @ [90:55] ==> var lambdaNestingLevel: Int defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.addRainbowHighlight[LocalVariableDescriptor]

'rainbowElement' @ [90:75] ==> value-parameter rainbowElement: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.addRainbowHighlight[ValueParameterDescriptorImpl]

'text' @ [90:90] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'attributesKeyToUse' @ [90:98] ==> val attributesKeyToUse: (TextAttributesKey..TextAttributesKey?) defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.addRainbowHighlight[LocalVariableDescriptor]

'target' @ [94:23] ==> value-parameter target: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.addRainbowHighlight[ValueParameterDescriptorImpl]

'getStrictParentOfType' @ [94:30] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtDeclarationWithBody? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtDeclarationWithBody

'addInfo' @ [95:9] ==> protected/*protected and package*/ open fun addInfo(@Nullable p0: HighlightInfo?): Unit defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor[JavaMethodDescriptor]

'getInfo' @ [95:17] ==> protected/*protected and package*/ open fun getInfo(@NotNull p0: PsiElement, @NotNull p1: PsiElement, @NotNull p2: String, @Nullable p3: TextAttributesKey?): (HighlightInfo..HighlightInfo?) defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor[JavaMethodDescriptor]

'context' @ [95:25] ==> val context: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.addRainbowHighlight[LocalVariableDescriptor]

'rainbowElement' @ [95:34] ==> value-parameter rainbowElement: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.addRainbowHighlight[ValueParameterDescriptorImpl]

'rainbowElement' @ [95:50] ==> value-parameter rainbowElement: PsiElement defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.addRainbowHighlight[ValueParameterDescriptorImpl]

'text' @ [95:65] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'attributesKeyToUse' @ [95:71] ==> val attributesKeyToUse: (TextAttributesKey..TextAttributesKey?) defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.addRainbowHighlight[LocalVariableDescriptor]

'this' @ [99:14] ==> <this> defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.isRainbowDeclaration[ReceiverParameterDescriptorImpl]

'isLocal' @ [99:36] ==> public final val KtProperty.isLocal: Boolean[MyPropertyDescriptor]

'this' @ [100:14] ==> <this> defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.isRainbowDeclaration[ReceiverParameterDescriptorImpl]

'getStrictParentOfType' @ [100:37] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtPrimaryConstructor? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtPrimaryConstructor

'this' @ [101:13] ==> <this> defined in org.jetbrains.kotlin.idea.highlighter.KotlinRainbowVisitor.isRainbowDeclaration[ReceiverParameterDescriptorImpl]

'this' @ [104:57] ==> <this> defined in org.jetbrains.kotlin.idea.highlighter.isAnonymousFunction[ReceiverParameterDescriptorImpl]

'nameIdentifier' @ [104:84] ==> public final val KtNamedFunction.nameIdentifier: PsiElement?[MyPropertyDescriptor]

