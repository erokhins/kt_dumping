'arrayOf' @ [55:44] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Class<out PsiElement>): Array<Class<out PsiElement>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Class<out PsiElement>

'KtFile' @ [56:17] ==> public constructor KtFile(p0: (FileViewProvider..FileViewProvider?), p1: Boolean) defined in org.jetbrains.kotlin.psi.KtFile[JavaClassConstructorDescriptor]

'java' @ [56:31] ==> public val <T> KClass<KtFile>.java: Class<KtFile> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtFile

'java' @ [57:40] ==> public val <T> KClass<KtClassOrObject>.java: Class<KtClassOrObject> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtClassOrObject

'java' @ [58:35] ==> public val <T> KClass<KtProperty>.java: Class<KtProperty> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtProperty

'java' @ [59:40] ==> public val <T> KClass<KtNamedFunction>.java: Class<KtNamedFunction> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtNamedFunction

'KtFunctionLiteral' @ [60:17] ==> public constructor KtFunctionLiteral(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtFunctionLiteral[JavaClassConstructorDescriptor]

'java' @ [60:42] ==> public val <T> KClass<KtFunctionLiteral>.java: Class<KtFunctionLiteral> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtFunctionLiteral

'java' @ [61:47] ==> public val <T> KClass<KtAnonymousInitializer>.java: Class<KtAnonymousInitializer> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtAnonymousInitializer

'CLASS_ELEMENT_TYPES' @ [64:33] ==> internal final val CLASS_ELEMENT_TYPES: Array<Class<out PsiElement>> defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.Companion[PropertyDescriptorImpl]

'elementType' @ [65:21] ==> val elementType: Class<out PsiElement> defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.Companion.getRelevantElement[LocalVariableDescriptor]

'isInstance' @ [65:33] ==> public open fun isInstance(p0: (Any..Any?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'element' @ [65:44] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.Companion.getRelevantElement[ValueParameterDescriptorImpl]

'element' @ [66:28] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.Companion.getRelevantElement[ValueParameterDescriptorImpl]

'runReadAction' @ [71:20] ==> public fun <T> runReadAction(action: () -> PsiElement?): PsiElement? defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement?

'getNonStrictParentOfType' @ [71:48] ==> @SafeVarargs @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getNonStrictParentOfType(@Nullable p0: PsiElement?, @NotNull vararg p1: (Class<out (PsiElement..PsiElement?)>..Class<out (PsiElement..PsiElement?)>?)): PsiElement? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'element' @ [71:73] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.Companion.getRelevantElement[ValueParameterDescriptorImpl]

'CLASS_ELEMENT_TYPES' @ [71:83] ==> internal final val CLASS_ELEMENT_TYPES: Array<Class<out PsiElement>> defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.Companion[PropertyDescriptorImpl]

'InlineCallableUsagesSearcher' @ [75:40] ==> public constructor InlineCallableUsagesSearcher(myDebugProcess: DebugProcess, scopes: List<GlobalSearchScope>) defined in org.jetbrains.kotlin.idea.debugger.InlineCallableUsagesSearcher[ClassConstructorDescriptorImpl]

'debugProcess' @ [75:69] ==> private final val debugProcess: DebugProcess defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider[PropertyDescriptorImpl]

'scopes' @ [75:83] ==> value-parameter scopes: List<GlobalSearchScope> defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.<init>[ValueParameterDescriptorImpl]

'with' @ [80:80] ==> @InlineOnly public inline fun <T, R> with(receiver: DebugProcess, block: DebugProcess.() -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DebugProcess
    <R> -> Nothing

'debugProcess' @ [80:86] ==> private final val debugProcess: DebugProcess defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider[PropertyDescriptorImpl]

'position' @ [81:26] ==> value-parameter position: SourcePosition defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getClassesForPosition[ValueParameterDescriptorImpl]

'line' @ [81:35] ==> public final val SourcePosition.line: Int[MyPropertyDescriptor]

'doGetClassesForPosition' @ [83:16] ==> private final fun doGetClassesForPosition(position: SourcePosition): Set<String> defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider[SimpleFunctionDescriptorImpl]

'position' @ [83:40] ==> value-parameter position: SourcePosition defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getClassesForPosition[ValueParameterDescriptorImpl]

'flatMap' @ [84:18] ==> public inline fun <T, R> Iterable<String>.flatMap(transform: (String) -> Iterable<(ReferenceType..ReferenceType?)>): List<(ReferenceType..ReferenceType?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> (com.sun.jdi.ReferenceType..com.sun.jdi.ReferenceType?)

'virtualMachineProxy' @ [84:41] ==> public final val DebugProcess.virtualMachineProxy: (VirtualMachineProxy..VirtualMachineProxy?)[MyPropertyDescriptor]

'classesByName' @ [84:61] ==> public abstract fun classesByName(@NotNull p0: String): (MutableList<(ReferenceType..ReferenceType?)>..List<(ReferenceType..ReferenceType?)>?) defined in com.intellij.debugger.engine.jdi.VirtualMachineProxy[JavaMethodDescriptor]

'className' @ [84:75] ==> value-parameter className: String defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getClassesForPosition.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'flatMap' @ [85:18] ==> public inline fun <T, R> Iterable<(ReferenceType..ReferenceType?)>.flatMap(transform: ((ReferenceType..ReferenceType?)) -> Iterable<ReferenceType>): List<ReferenceType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.jdi.ReferenceType..com.sun.jdi.ReferenceType?)
    <R> -> ReferenceType

'findTargetClasses' @ [85:45] ==> private fun DebugProcess.findTargetClasses(outerClass: ReferenceType, lineAt: Int): List<ReferenceType> defined in org.jetbrains.kotlin.idea.debugger in file DebuggerClassNameProvider.kt[SimpleFunctionDescriptorImpl]

'referenceType' @ [85:63] ==> value-parameter referenceType: (ReferenceType..ReferenceType?) defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getClassesForPosition.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'lineNumber' @ [85:78] ==> val lineNumber: Int defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getClassesForPosition.<anonymous>[LocalVariableDescriptor]

'doGetClassesForPosition' @ [92:16] ==> private final fun doGetClassesForPosition(position: SourcePosition): Set<String> defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider[SimpleFunctionDescriptorImpl]

'position' @ [92:40] ==> value-parameter position: SourcePosition defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForPosition[ValueParameterDescriptorImpl]

'toList' @ [92:50] ==> public fun <T> Iterable<String>.toList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'runReadAction' @ [96:31] ==> public fun <T> runReadAction(action: () -> PsiElement?): PsiElement? defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement?

'getRelevantElement' @ [96:47] ==> internal final fun getRelevantElement(element: PsiElement): PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.Companion[SimpleFunctionDescriptorImpl]

'position' @ [96:66] ==> value-parameter position: SourcePosition defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.doGetClassesForPosition[ValueParameterDescriptorImpl]

'elementAt' @ [96:75] ==> public final val SourcePosition.elementAt: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'getOrComputeClassNames' @ [98:22] ==> public final fun <T : PsiElement> getOrComputeClassNames(psiElement: PsiElement?, create: (PsiElement) -> KotlinDebuggerCaches.ComputedClassNames): List<String> defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion[FunctionImportedFromObject]
Inferred types:
    <T : PsiElement> -> PsiElement

'relevantElement' @ [98:45] ==> val relevantElement: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.doGetClassesForPosition[LocalVariableDescriptor]

'getOuterClassNamesForElement' @ [99:13] ==> @PublishedApi @Suppress internal final tailrec fun getOuterClassNamesForElement(element: PsiElement?): KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider[SimpleFunctionDescriptorImpl]

'element' @ [99:42] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.doGetClassesForPosition.<anonymous>[ValueParameterDescriptorImpl]

'toMutableSet' @ [100:11] ==> public fun <T> Iterable<String>.toMutableSet(): MutableSet<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'position' @ [102:24] ==> value-parameter position: SourcePosition defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.doGetClassesForPosition[ValueParameterDescriptorImpl]

'readAction' @ [102:33] ==> public inline fun <U, V> SourcePosition.readAction(crossinline f: (SourcePosition) -> List<KtFunction>): List<KtFunction> defined in org.jetbrains.kotlin.idea.debugger[SimpleFunctionDescriptorImpl]
Inferred types:
    <U> -> SourcePosition
    <V> -> List<KtFunction>

'getLambdasAtLineIfAny' @ [102:46] ==> public fun getLambdasAtLineIfAny(sourcePosition: SourcePosition): List<KtFunction> defined in org.jetbrains.kotlin.idea.debugger.breakpoints in file breakpointTypeUtils.kt[SimpleFunctionDescriptorImpl]

'result' @ [103:13] ==> val result: MutableSet<String> defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.doGetClassesForPosition[LocalVariableDescriptor]

'getOrComputeClassNames' @ [103:23] ==> public final fun <T : PsiElement> getOrComputeClassNames(psiElement: KtFunction?, create: (KtFunction) -> KotlinDebuggerCaches.ComputedClassNames): List<String> defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion[FunctionImportedFromObject]
Inferred types:
    <T : PsiElement> -> KtFunction

'lambda' @ [103:46] ==> val lambda: KtFunction defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.doGetClassesForPosition[LocalVariableDescriptor]

'getOuterClassNamesForElement' @ [104:17] ==> @PublishedApi @Suppress internal final tailrec fun getOuterClassNamesForElement(element: PsiElement?): KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider[SimpleFunctionDescriptorImpl]

'element' @ [104:46] ==> value-parameter element: KtFunction defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.doGetClassesForPosition.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [108:16] ==> val result: MutableSet<String> defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.doGetClassesForPosition[LocalVariableDescriptor]

'PublishedApi' @ [111:5] ==> public constructor PublishedApi() defined in kotlin.PublishedApi[DeserializedClassConstructorDescriptor]

'Suppress' @ [112:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'element' @ [114:13] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[ValueParameterDescriptorImpl]

'EMPTY' @ [114:37] ==> public final val EMPTY: KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ComputedClassNames.Companion[PropertyImportedFromObject]

'when (element) {
            is KtFile -> {
                val fileClassName = runReadAction { NoResolveFileClassesProvider.getFileClassInternalName(element) }.toJdiName()
                ComputedClassNames.Cached(fileClassName)
            }
            is KtClassOrObject -> {
                val enclosingElementForLocal = runReadAction { KtPsiUtil.getEnclosingElementForLocalDeclaration(element) }
                when {
                    enclosingElementForLocal != null ->
                        // A local class
                        getOuterClassNamesForElement(enclosingElementForLocal)
                    runReadAction { element.isObjectLiteral() } ->
                        getOuterClassNamesForElement(element.relevantParentInReadAction)
                    else ->
                        // Guaranteed to be non-local class or object
                        element.readAction {
                            if (it is KtClass && runReadAction { it.isInterface() }) {
                                val name = getNameForNonLocalClass(it)

                                if (name != null)
                                    Cached(listOf(name, name + JvmAbi.DEFAULT_IMPLS_SUFFIX))
                                else
                                    ComputedClassNames.EMPTY
                            }
                            else {
                                getNameForNonLocalClass(it)?.let { ComputedClassNames.Cached(it) } ?: ComputedClassNames.EMPTY
                            }
                        }
                }
            }
            is KtProperty -> {
                val nonInlineClasses = if (runReadAction { element.isTopLevel }) {
                    // Top level property
                    getOuterClassNamesForElement(element.relevantParentInReadAction)
                }
                else {
                    val enclosingElementForLocal = runReadAction { KtPsiUtil.getEnclosingElementForLocalDeclaration(element) }
                    if (enclosingElementForLocal != null) {
                        // Local class
                        getOuterClassNamesForElement(enclosingElementForLocal)
                    }
                    else {
                        val containingClassOrFile = runReadAction {
                            PsiTreeUtil.getParentOfType(element, KtFile::class.java, KtClassOrObject::class.java)
                        }

                        if (containingClassOrFile is KtObjectDeclaration && containingClassOrFile.isCompanionInReadAction) {
                            // Properties from the companion object can be placed in the companion object's containing class
                            (getOuterClassNamesForElement(containingClassOrFile.relevantParentInReadAction) +
                                    getOuterClassNamesForElement(containingClassOrFile)).distinct()
                        }
                        else if (containingClassOrFile != null) {
                            getOuterClassNamesForElement(containingClassOrFile)
                        }
                        else {
                            getOuterClassNamesForElement(element.relevantParentInReadAction)
                        }
                    }
                }

                if (findInlineUseSites && (
                        element.isInlineInReadAction ||
                        runReadAction { element.accessors.any { it.hasModifier(KtTokens.INLINE_KEYWORD) } })
                ) {
                    nonInlineClasses + inlineUsagesSearcher.findInlinedCalls(element) { this.getOuterClassNamesForElement(it) }
                }
                else {
                    return NonCached(nonInlineClasses.classNames)
                }
            }
            is KtNamedFunction -> {
                val typeMapper = KotlinDebuggerCaches.getOrCreateTypeMapper(element)

                val classNamesOfContainingDeclaration = getOuterClassNamesForElement(element.relevantParentInReadAction)

                val nonInlineClasses: ComputedClassNames = if (runReadAction { element.name == null || element.isLocal }) {
                    classNamesOfContainingDeclaration + ComputedClassNames.Cached(
                            asmTypeForAnonymousClass(typeMapper.bindingContext, element).internalName.toJdiName())
                }
                else {
                    classNamesOfContainingDeclaration
                }

                if (!findInlineUseSites || !element.isInlineInReadAction) {
                    return NonCached(nonInlineClasses.classNames)
                }

                val inlineCallSiteClasses = inlineUsagesSearcher.findInlinedCalls(element) { this.getOuterClassNamesForElement(it) }

                nonInlineClasses + inlineCallSiteClasses
            }
            is KtAnonymousInitializer -> {
                val initializerOwner = runReadAction { element.containingDeclaration }

                if (initializerOwner is KtObjectDeclaration && initializerOwner.isCompanionInReadAction) {
                    return getOuterClassNamesForElement(runReadAction { initializerOwner.containingClassOrObject })
                }

                getOuterClassNamesForElement(initializerOwner)
            }
            is KtFunctionLiteral -> {
                val typeMapper = KotlinDebuggerCaches.getOrCreateTypeMapper(element)

                val nonInlinedLambdaClassName = runReadAction {
                    asmTypeForAnonymousClass(typeMapper.bindingContext, element).internalName.toJdiName()
                }

                if (!alwaysReturnLambdaParentClass && !InlineUtil.isInlinedArgument(element, typeMapper.bindingContext, true)) {
                    return ComputedClassNames.Cached(nonInlinedLambdaClassName)
                }

                ComputedClassNames.Cached(nonInlinedLambdaClassName) + getOuterClassNamesForElement(element.relevantParentInReadAction)
            }
            else -> getOuterClassNamesForElement(element.relevantParentInReadAction)
        }' @ [116:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KotlinDebuggerCaches.ComputedClassNames, entry1: KotlinDebuggerCaches.ComputedClassNames, entry2: KotlinDebuggerCaches.ComputedClassNames, entry3: KotlinDebuggerCaches.ComputedClassNames, entry4: KotlinDebuggerCaches.ComputedClassNames, entry5: KotlinDebuggerCaches.ComputedClassNames, entry6: KotlinDebuggerCaches.ComputedClassNames): KotlinDebuggerCaches.ComputedClassNames[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ComputedClassNames

'element' @ [116:22] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[ValueParameterDescriptorImpl]

'runReadAction' @ [118:37] ==> public fun <T> runReadAction(action: () -> String): String defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'NoResolveFileClassesProvider' @ [118:53] ==> public object NoResolveFileClassesProvider : JvmFileClassesProvider defined in org.jetbrains.kotlin.fileClasses[FakeCallableDescriptorForObject]

'getFileClassInternalName' @ [118:82] ==> public fun JvmFileClassesProvider.getFileClassInternalName(file: KtFile): String defined in org.jetbrains.kotlin.fileClasses[DeserializedSimpleFunctionDescriptor]

'element' @ [118:107] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[ValueParameterDescriptorImpl]

'toJdiName' @ [118:118] ==> private fun String.toJdiName(): String defined in org.jetbrains.kotlin.idea.debugger in file DebuggerClassNameProvider.kt[SimpleFunctionDescriptorImpl]

'Cached' @ [119:36] ==> public final fun Cached(className: String): KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ComputedClassNames.Companion[SimpleFunctionDescriptorImpl]

'fileClassName' @ [119:43] ==> val fileClassName: String defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[LocalVariableDescriptor]

'runReadAction' @ [122:48] ==> public fun <T> runReadAction(action: () -> KtElement?): KtElement? defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement?

'getEnclosingElementForLocalDeclaration' @ [122:74] ==> @Nullable public open fun getEnclosingElementForLocalDeclaration(@NotNull p0: KtDeclaration): KtElement? defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'element' @ [122:113] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[ValueParameterDescriptorImpl]

'when {
                    enclosingElementForLocal != null ->
                        // A local class
                        getOuterClassNamesForElement(enclosingElementForLocal)
                    runReadAction { element.isObjectLiteral() } ->
                        getOuterClassNamesForElement(element.relevantParentInReadAction)
                    else ->
                        // Guaranteed to be non-local class or object
                        element.readAction {
                            if (it is KtClass && runReadAction { it.isInterface() }) {
                                val name = getNameForNonLocalClass(it)

                                if (name != null)
                                    Cached(listOf(name, name + JvmAbi.DEFAULT_IMPLS_SUFFIX))
                                else
                                    ComputedClassNames.EMPTY
                            }
                            else {
                                getNameForNonLocalClass(it)?.let { ComputedClassNames.Cached(it) } ?: ComputedClassNames.EMPTY
                            }
                        }
                }' @ [123:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KotlinDebuggerCaches.ComputedClassNames, entry1: KotlinDebuggerCaches.ComputedClassNames, entry2: KotlinDebuggerCaches.ComputedClassNames): KotlinDebuggerCaches.ComputedClassNames[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ComputedClassNames

'enclosingElementForLocal' @ [124:21] ==> val enclosingElementForLocal: KtElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[LocalVariableDescriptor]

'getOuterClassNamesForElement' @ [126:25] ==> @PublishedApi @Suppress internal final tailrec fun getOuterClassNamesForElement(element: PsiElement?): KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider[SimpleFunctionDescriptorImpl]

'enclosingElementForLocal' @ [126:54] ==> val enclosingElementForLocal: KtElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[LocalVariableDescriptor]

'runReadAction' @ [127:21] ==> public fun <T> runReadAction(action: () -> Boolean): Boolean defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'element' @ [127:37] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[ValueParameterDescriptorImpl]

'isObjectLiteral' @ [127:45] ==> public fun KtClassOrObject.isObjectLiteral(): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'getOuterClassNamesForElement' @ [128:25] ==> @PublishedApi @Suppress internal final tailrec fun getOuterClassNamesForElement(element: PsiElement?): KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider[SimpleFunctionDescriptorImpl]

'element' @ [128:54] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[ValueParameterDescriptorImpl]

'relevantParentInReadAction' @ [128:62] ==> private final val PsiElement.relevantParentInReadAction: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider[PropertyDescriptorImpl]

'element' @ [131:25] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[ValueParameterDescriptorImpl]

'readAction' @ [131:33] ==> public inline fun <U, V> KtClassOrObject.readAction(crossinline f: (KtClassOrObject) -> KotlinDebuggerCaches.ComputedClassNames): KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger[SimpleFunctionDescriptorImpl]
Inferred types:
    <U> -> KtClassOrObject
    <V> -> ComputedClassNames

'if (it is KtClass && runReadAction { it.isInterface() }) {
                                val name = getNameForNonLocalClass(it)

                                if (name != null)
                                    Cached(listOf(name, name + JvmAbi.DEFAULT_IMPLS_SUFFIX))
                                else
                                    ComputedClassNames.EMPTY
                            }
                            else {
                                getNameForNonLocalClass(it)?.let { ComputedClassNames.Cached(it) } ?: ComputedClassNames.EMPTY
                            }' @ [132:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinDebuggerCaches.ComputedClassNames, elseBranch: KotlinDebuggerCaches.ComputedClassNames): KotlinDebuggerCaches.ComputedClassNames[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ComputedClassNames

'it' @ [132:33] ==> value-parameter it: KtClassOrObject defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement.<anonymous>[ValueParameterDescriptorImpl]

'runReadAction' @ [132:50] ==> public fun <T> runReadAction(action: () -> Boolean): Boolean defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'it' @ [132:66] ==> value-parameter it: KtClassOrObject defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement.<anonymous>[ValueParameterDescriptorImpl]

'isInterface' @ [132:69] ==> public final fun isInterface(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'getNameForNonLocalClass' @ [133:44] ==> private final fun getNameForNonLocalClass(nonLocalClassOrObject: KtClassOrObject): String? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider[SimpleFunctionDescriptorImpl]

'it' @ [133:68] ==> value-parameter it: KtClassOrObject defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement.<anonymous>[ValueParameterDescriptorImpl]

'if (name != null)
                                    Cached(listOf(name, name + JvmAbi.DEFAULT_IMPLS_SUFFIX))
                                else
                                    ComputedClassNames.EMPTY' @ [135:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinDebuggerCaches.ComputedClassNames, elseBranch: KotlinDebuggerCaches.ComputedClassNames): KotlinDebuggerCaches.ComputedClassNames[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ComputedClassNames

'name' @ [135:37] ==> val name: String? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement.<anonymous>[LocalVariableDescriptor]

'Cached' @ [136:37] ==> public final fun Cached(classNames: List<String>): KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ComputedClassNames.Companion[FunctionImportedFromObject]

'listOf' @ [136:44] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'name' @ [136:51] ==> val name: String? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement.<anonymous>[LocalVariableDescriptor]

'name' @ [136:57] ==> val name: String? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement.<anonymous>[LocalVariableDescriptor]

'DEFAULT_IMPLS_SUFFIX' @ [136:71] ==> public const final val DEFAULT_IMPLS_SUFFIX: String defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaPropertyDescriptor]

'EMPTY' @ [138:56] ==> public final val EMPTY: KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ComputedClassNames.Companion[PropertyDescriptorImpl]

'getNameForNonLocalClass' @ [141:33] ==> private final fun getNameForNonLocalClass(nonLocalClassOrObject: KtClassOrObject): String? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider[SimpleFunctionDescriptorImpl]

'it' @ [141:57] ==> value-parameter it: KtClassOrObject defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [141:62] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> KotlinDebuggerCaches.ComputedClassNames): KotlinDebuggerCaches.ComputedClassNames defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> ComputedClassNames

'ComputedClassNames' @ [141:68] ==> public companion object defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ComputedClassNames[FakeCallableDescriptorForObject]

'Cached' @ [141:87] ==> public final fun Cached(className: String): KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ComputedClassNames.Companion[SimpleFunctionDescriptorImpl]

'it' @ [141:94] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'EMPTY' @ [141:122] ==> public final val EMPTY: KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ComputedClassNames.Companion[PropertyDescriptorImpl]

'if (runReadAction { element.isTopLevel }) {
                    // Top level property
                    getOuterClassNamesForElement(element.relevantParentInReadAction)
                }
                else {
                    val enclosingElementForLocal = runReadAction { KtPsiUtil.getEnclosingElementForLocalDeclaration(element) }
                    if (enclosingElementForLocal != null) {
                        // Local class
                        getOuterClassNamesForElement(enclosingElementForLocal)
                    }
                    else {
                        val containingClassOrFile = runReadAction {
                            PsiTreeUtil.getParentOfType(element, KtFile::class.java, KtClassOrObject::class.java)
                        }

                        if (containingClassOrFile is KtObjectDeclaration && containingClassOrFile.isCompanionInReadAction) {
                            // Properties from the companion object can be placed in the companion object's containing class
                            (getOuterClassNamesForElement(containingClassOrFile.relevantParentInReadAction) +
                                    getOuterClassNamesForElement(containingClassOrFile)).distinct()
                        }
                        else if (containingClassOrFile != null) {
                            getOuterClassNamesForElement(containingClassOrFile)
                        }
                        else {
                            getOuterClassNamesForElement(element.relevantParentInReadAction)
                        }
                    }
                }' @ [147:40] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinDebuggerCaches.ComputedClassNames, elseBranch: KotlinDebuggerCaches.ComputedClassNames): KotlinDebuggerCaches.ComputedClassNames[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ComputedClassNames

'runReadAction' @ [147:44] ==> public fun <T> runReadAction(action: () -> Boolean): Boolean defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'element' @ [147:60] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[ValueParameterDescriptorImpl]

'isTopLevel' @ [147:68] ==> public final val KtProperty.isTopLevel: Boolean[MyPropertyDescriptor]

'getOuterClassNamesForElement' @ [149:21] ==> @PublishedApi @Suppress internal final tailrec fun getOuterClassNamesForElement(element: PsiElement?): KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider[SimpleFunctionDescriptorImpl]

'element' @ [149:50] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[ValueParameterDescriptorImpl]

'relevantParentInReadAction' @ [149:58] ==> private final val PsiElement.relevantParentInReadAction: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider[PropertyDescriptorImpl]

'runReadAction' @ [152:52] ==> public fun <T> runReadAction(action: () -> KtElement?): KtElement? defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement?

'getEnclosingElementForLocalDeclaration' @ [152:78] ==> @Nullable public open fun getEnclosingElementForLocalDeclaration(@NotNull p0: KtDeclaration): KtElement? defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'element' @ [152:117] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[ValueParameterDescriptorImpl]

'if (enclosingElementForLocal != null) {
                        // Local class
                        getOuterClassNamesForElement(enclosingElementForLocal)
                    }
                    else {
                        val containingClassOrFile = runReadAction {
                            PsiTreeUtil.getParentOfType(element, KtFile::class.java, KtClassOrObject::class.java)
                        }

                        if (containingClassOrFile is KtObjectDeclaration && containingClassOrFile.isCompanionInReadAction) {
                            // Properties from the companion object can be placed in the companion object's containing class
                            (getOuterClassNamesForElement(containingClassOrFile.relevantParentInReadAction) +
                                    getOuterClassNamesForElement(containingClassOrFile)).distinct()
                        }
                        else if (containingClassOrFile != null) {
                            getOuterClassNamesForElement(containingClassOrFile)
                        }
                        else {
                            getOuterClassNamesForElement(element.relevantParentInReadAction)
                        }
                    }' @ [153:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinDebuggerCaches.ComputedClassNames, elseBranch: KotlinDebuggerCaches.ComputedClassNames): KotlinDebuggerCaches.ComputedClassNames[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ComputedClassNames

'enclosingElementForLocal' @ [153:25] ==> val enclosingElementForLocal: KtElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[LocalVariableDescriptor]

'getOuterClassNamesForElement' @ [155:25] ==> @PublishedApi @Suppress internal final tailrec fun getOuterClassNamesForElement(element: PsiElement?): KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider[SimpleFunctionDescriptorImpl]

'enclosingElementForLocal' @ [155:54] ==> val enclosingElementForLocal: KtElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[LocalVariableDescriptor]

'runReadAction' @ [158:53] ==> public fun <T> runReadAction(action: () -> PsiElement?): PsiElement? defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement?

'getParentOfType' @ [159:41] ==> @SafeVarargs @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull vararg p1: (Class<out (PsiElement..PsiElement?)>..Class<out (PsiElement..PsiElement?)>?)): PsiElement? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'element' @ [159:57] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[ValueParameterDescriptorImpl]

'KtFile' @ [159:66] ==> public constructor KtFile(p0: (FileViewProvider..FileViewProvider?), p1: Boolean) defined in org.jetbrains.kotlin.psi.KtFile[JavaClassConstructorDescriptor]

'java' @ [159:80] ==> public val <T> KClass<KtFile>.java: Class<KtFile> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtFile

'java' @ [159:109] ==> public val <T> KClass<KtClassOrObject>.java: Class<KtClassOrObject> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtClassOrObject

'if (containingClassOrFile is KtObjectDeclaration && containingClassOrFile.isCompanionInReadAction) {
                            // Properties from the companion object can be placed in the companion object's containing class
                            (getOuterClassNamesForElement(containingClassOrFile.relevantParentInReadAction) +
                                    getOuterClassNamesForElement(containingClassOrFile)).distinct()
                        }
                        else if (containingClassOrFile != null) {
                            getOuterClassNamesForElement(containingClassOrFile)
                        }
                        else {
                            getOuterClassNamesForElement(element.relevantParentInReadAction)
                        }' @ [162:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinDebuggerCaches.ComputedClassNames, elseBranch: KotlinDebuggerCaches.ComputedClassNames): KotlinDebuggerCaches.ComputedClassNames[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ComputedClassNames

'containingClassOrFile' @ [162:29] ==> val containingClassOrFile: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[LocalVariableDescriptor]

'containingClassOrFile' @ [162:77] ==> val containingClassOrFile: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[LocalVariableDescriptor]

'isCompanionInReadAction' @ [162:99] ==> private final val KtObjectDeclaration.isCompanionInReadAction: Boolean defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider[PropertyDescriptorImpl]

'getOuterClassNamesForElement' @ [164:30] ==> @PublishedApi @Suppress internal final tailrec fun getOuterClassNamesForElement(element: PsiElement?): KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider[SimpleFunctionDescriptorImpl]

'containingClassOrFile' @ [164:59] ==> val containingClassOrFile: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[LocalVariableDescriptor]

'relevantParentInReadAction' @ [164:81] ==> private final val PsiElement.relevantParentInReadAction: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider[PropertyDescriptorImpl]

'getOuterClassNamesForElement' @ [165:37] ==> @PublishedApi @Suppress internal final tailrec fun getOuterClassNamesForElement(element: PsiElement?): KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider[SimpleFunctionDescriptorImpl]

'containingClassOrFile' @ [165:66] ==> val containingClassOrFile: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[LocalVariableDescriptor]

'distinct' @ [165:90] ==> public final fun distinct(): KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ComputedClassNames[SimpleFunctionDescriptorImpl]

'if (containingClassOrFile != null) {
                            getOuterClassNamesForElement(containingClassOrFile)
                        }
                        else {
                            getOuterClassNamesForElement(element.relevantParentInReadAction)
                        }' @ [167:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinDebuggerCaches.ComputedClassNames, elseBranch: KotlinDebuggerCaches.ComputedClassNames): KotlinDebuggerCaches.ComputedClassNames[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ComputedClassNames

'containingClassOrFile' @ [167:34] ==> val containingClassOrFile: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[LocalVariableDescriptor]

'getOuterClassNamesForElement' @ [168:29] ==> @PublishedApi @Suppress internal final tailrec fun getOuterClassNamesForElement(element: PsiElement?): KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider[SimpleFunctionDescriptorImpl]

'containingClassOrFile' @ [168:58] ==> val containingClassOrFile: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[LocalVariableDescriptor]

'getOuterClassNamesForElement' @ [171:29] ==> @PublishedApi @Suppress internal final tailrec fun getOuterClassNamesForElement(element: PsiElement?): KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider[SimpleFunctionDescriptorImpl]

'element' @ [171:58] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[ValueParameterDescriptorImpl]

'relevantParentInReadAction' @ [171:66] ==> private final val PsiElement.relevantParentInReadAction: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider[PropertyDescriptorImpl]

'if (findInlineUseSites && (
                        element.isInlineInReadAction ||
                        runReadAction { element.accessors.any { it.hasModifier(KtTokens.INLINE_KEYWORD) } })
                ) {
                    nonInlineClasses + inlineUsagesSearcher.findInlinedCalls(element) { this.getOuterClassNamesForElement(it) }
                }
                else {
                    return NonCached(nonInlineClasses.classNames)
                }' @ [176:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinDebuggerCaches.ComputedClassNames, elseBranch: KotlinDebuggerCaches.ComputedClassNames): KotlinDebuggerCaches.ComputedClassNames[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ComputedClassNames

'findInlineUseSites' @ [176:21] ==> public final val findInlineUseSites: Boolean defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider[PropertyDescriptorImpl]

'element' @ [177:25] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[ValueParameterDescriptorImpl]

'isInlineInReadAction' @ [177:33] ==> private final val KtDeclaration.isInlineInReadAction: Boolean defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider[PropertyDescriptorImpl]

'runReadAction' @ [178:25] ==> public fun <T> runReadAction(action: () -> Boolean): Boolean defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'element' @ [178:41] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[ValueParameterDescriptorImpl]

'accessors' @ [178:49] ==> public final val KtProperty.accessors: (MutableList<(KtPropertyAccessor..KtPropertyAccessor?)>..List<(KtPropertyAccessor..KtPropertyAccessor?)>)[MyPropertyDescriptor]

'any' @ [178:59] ==> public inline fun <T> Iterable<(KtPropertyAccessor..KtPropertyAccessor?)>.any(predicate: ((KtPropertyAccessor..KtPropertyAccessor?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtPropertyAccessor..org.jetbrains.kotlin.psi.KtPropertyAccessor?)

'it' @ [178:65] ==> value-parameter it: (KtPropertyAccessor..KtPropertyAccessor?) defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'hasModifier' @ [178:68] ==> public open fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtPropertyAccessor[JavaMethodDescriptor]

'INLINE_KEYWORD' @ [178:89] ==> public final val INLINE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'nonInlineClasses' @ [180:21] ==> val nonInlineClasses: KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[LocalVariableDescriptor]

'inlineUsagesSearcher' @ [180:40] ==> private final val inlineUsagesSearcher: InlineCallableUsagesSearcher defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider[PropertyDescriptorImpl]

'findInlinedCalls' @ [180:61] ==> public final fun findInlinedCalls(declaration: KtDeclaration, bindingContext: BindingContext = ..., transformer: (PsiElement) -> KotlinDebuggerCaches.ComputedClassNames): KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger.InlineCallableUsagesSearcher[SimpleFunctionDescriptorImpl]

'element' @ [180:78] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[ValueParameterDescriptorImpl]

'this' @ [180:89] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider[LazyClassReceiverParameterDescriptor]

'getOuterClassNamesForElement' @ [180:94] ==> @PublishedApi @Suppress internal final tailrec fun getOuterClassNamesForElement(element: PsiElement?): KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider[SimpleFunctionDescriptorImpl]

'it' @ [180:123] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement.<anonymous>[ValueParameterDescriptorImpl]

'NonCached' @ [183:28] ==> public final fun NonCached(classNames: List<String>): KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ComputedClassNames.Companion[FunctionImportedFromObject]

'nonInlineClasses' @ [183:38] ==> val nonInlineClasses: KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[LocalVariableDescriptor]

'classNames' @ [183:55] ==> public final val classNames: List<String> defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ComputedClassNames[PropertyDescriptorImpl]

'KotlinDebuggerCaches' @ [187:34] ==> public companion object defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches[FakeCallableDescriptorForObject]

'getOrCreateTypeMapper' @ [187:55] ==> public final fun getOrCreateTypeMapper(psiElement: PsiElement): KotlinTypeMapper defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion[SimpleFunctionDescriptorImpl]

'element' @ [187:77] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[ValueParameterDescriptorImpl]

'getOuterClassNamesForElement' @ [189:57] ==> @PublishedApi @Suppress internal final tailrec fun getOuterClassNamesForElement(element: PsiElement?): KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider[SimpleFunctionDescriptorImpl]

'element' @ [189:86] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[ValueParameterDescriptorImpl]

'relevantParentInReadAction' @ [189:94] ==> private final val PsiElement.relevantParentInReadAction: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider[PropertyDescriptorImpl]

'if (runReadAction { element.name == null || element.isLocal }) {
                    classNamesOfContainingDeclaration + ComputedClassNames.Cached(
                            asmTypeForAnonymousClass(typeMapper.bindingContext, element).internalName.toJdiName())
                }
                else {
                    classNamesOfContainingDeclaration
                }' @ [191:60] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinDebuggerCaches.ComputedClassNames, elseBranch: KotlinDebuggerCaches.ComputedClassNames): KotlinDebuggerCaches.ComputedClassNames[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ComputedClassNames

'runReadAction' @ [191:64] ==> public fun <T> runReadAction(action: () -> Boolean): Boolean defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'element' @ [191:80] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[ValueParameterDescriptorImpl]

'name' @ [191:88] ==> public final val KtNamedFunction.name: String?[MyPropertyDescriptor]

'element' @ [191:104] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[ValueParameterDescriptorImpl]

'isLocal' @ [191:112] ==> public final val KtNamedFunction.isLocal: Boolean[MyPropertyDescriptor]

'classNamesOfContainingDeclaration' @ [192:21] ==> val classNamesOfContainingDeclaration: KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[LocalVariableDescriptor]

'Cached' @ [192:76] ==> public final fun Cached(className: String): KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ComputedClassNames.Companion[SimpleFunctionDescriptorImpl]

'asmTypeForAnonymousClass' @ [193:29] ==> @NotNull public open fun asmTypeForAnonymousClass(@NotNull p0: BindingContext, @NotNull p1: KtElement): Type defined in org.jetbrains.kotlin.codegen.binding.CodegenBinding[JavaMethodDescriptor]

'typeMapper' @ [193:54] ==> val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[LocalVariableDescriptor]

'bindingContext' @ [193:65] ==> public final val KotlinTypeMapper.bindingContext: BindingContext[MyPropertyDescriptor]

'element' @ [193:81] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[ValueParameterDescriptorImpl]

'internalName' @ [193:90] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'toJdiName' @ [193:103] ==> private fun String.toJdiName(): String defined in org.jetbrains.kotlin.idea.debugger in file DebuggerClassNameProvider.kt[SimpleFunctionDescriptorImpl]

'classNamesOfContainingDeclaration' @ [196:21] ==> val classNamesOfContainingDeclaration: KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[LocalVariableDescriptor]

'!' @ [199:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'findInlineUseSites' @ [199:22] ==> public final val findInlineUseSites: Boolean defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider[PropertyDescriptorImpl]

'!' @ [199:44] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [199:45] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[ValueParameterDescriptorImpl]

'isInlineInReadAction' @ [199:53] ==> private final val KtDeclaration.isInlineInReadAction: Boolean defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider[PropertyDescriptorImpl]

'NonCached' @ [200:28] ==> public final fun NonCached(classNames: List<String>): KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ComputedClassNames.Companion[FunctionImportedFromObject]

'nonInlineClasses' @ [200:38] ==> val nonInlineClasses: KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[LocalVariableDescriptor]

'classNames' @ [200:55] ==> public final val classNames: List<String> defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ComputedClassNames[PropertyDescriptorImpl]

'inlineUsagesSearcher' @ [203:45] ==> private final val inlineUsagesSearcher: InlineCallableUsagesSearcher defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider[PropertyDescriptorImpl]

'findInlinedCalls' @ [203:66] ==> public final fun findInlinedCalls(declaration: KtDeclaration, bindingContext: BindingContext = ..., transformer: (PsiElement) -> KotlinDebuggerCaches.ComputedClassNames): KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger.InlineCallableUsagesSearcher[SimpleFunctionDescriptorImpl]

'element' @ [203:83] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[ValueParameterDescriptorImpl]

'this' @ [203:94] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider[LazyClassReceiverParameterDescriptor]

'getOuterClassNamesForElement' @ [203:99] ==> @PublishedApi @Suppress internal final tailrec fun getOuterClassNamesForElement(element: PsiElement?): KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider[SimpleFunctionDescriptorImpl]

'it' @ [203:128] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement.<anonymous>[ValueParameterDescriptorImpl]

'nonInlineClasses' @ [205:17] ==> val nonInlineClasses: KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[LocalVariableDescriptor]

'inlineCallSiteClasses' @ [205:36] ==> val inlineCallSiteClasses: KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[LocalVariableDescriptor]

'runReadAction' @ [208:40] ==> public fun <T> runReadAction(action: () -> KtDeclaration): KtDeclaration defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'element' @ [208:56] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[ValueParameterDescriptorImpl]

'containingDeclaration' @ [208:64] ==> public abstract val containingDeclaration: KtDeclaration defined in org.jetbrains.kotlin.psi.KtAnonymousInitializer[DeserializedPropertyDescriptor]

'initializerOwner' @ [210:21] ==> val initializerOwner: KtDeclaration defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[LocalVariableDescriptor]

'initializerOwner' @ [210:64] ==> val initializerOwner: KtDeclaration defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[LocalVariableDescriptor]

'isCompanionInReadAction' @ [210:81] ==> private final val KtObjectDeclaration.isCompanionInReadAction: Boolean defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider[PropertyDescriptorImpl]

'getOuterClassNamesForElement' @ [211:28] ==> @PublishedApi @Suppress internal final tailrec fun getOuterClassNamesForElement(element: PsiElement?): KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider[SimpleFunctionDescriptorImpl]

'runReadAction' @ [211:57] ==> public fun <T> runReadAction(action: () -> KtClassOrObject?): KtClassOrObject? defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClassOrObject?

'initializerOwner' @ [211:73] ==> val initializerOwner: KtDeclaration defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[LocalVariableDescriptor]

'containingClassOrObject' @ [211:90] ==> public val KtDeclaration.containingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'getOuterClassNamesForElement' @ [214:17] ==> @PublishedApi @Suppress internal final tailrec fun getOuterClassNamesForElement(element: PsiElement?): KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider[SimpleFunctionDescriptorImpl]

'initializerOwner' @ [214:46] ==> val initializerOwner: KtDeclaration defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[LocalVariableDescriptor]

'KotlinDebuggerCaches' @ [217:34] ==> public companion object defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches[FakeCallableDescriptorForObject]

'getOrCreateTypeMapper' @ [217:55] ==> public final fun getOrCreateTypeMapper(psiElement: PsiElement): KotlinTypeMapper defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion[SimpleFunctionDescriptorImpl]

'element' @ [217:77] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[ValueParameterDescriptorImpl]

'runReadAction' @ [219:49] ==> public fun <T> runReadAction(action: () -> String): String defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'asmTypeForAnonymousClass' @ [220:21] ==> @NotNull public open fun asmTypeForAnonymousClass(@NotNull p0: BindingContext, @NotNull p1: KtElement): Type defined in org.jetbrains.kotlin.codegen.binding.CodegenBinding[JavaMethodDescriptor]

'typeMapper' @ [220:46] ==> val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[LocalVariableDescriptor]

'bindingContext' @ [220:57] ==> public final val KotlinTypeMapper.bindingContext: BindingContext[MyPropertyDescriptor]

'element' @ [220:73] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[ValueParameterDescriptorImpl]

'internalName' @ [220:82] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'toJdiName' @ [220:95] ==> private fun String.toJdiName(): String defined in org.jetbrains.kotlin.idea.debugger in file DebuggerClassNameProvider.kt[SimpleFunctionDescriptorImpl]

'!' @ [223:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'alwaysReturnLambdaParentClass' @ [223:22] ==> public final val alwaysReturnLambdaParentClass: Boolean defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider[PropertyDescriptorImpl]

'!' @ [223:55] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isInlinedArgument' @ [223:67] ==> public open fun isInlinedArgument(@NotNull p0: KtFunction, @NotNull p1: BindingContext, p2: Boolean): Boolean defined in org.jetbrains.kotlin.resolve.inline.InlineUtil[JavaMethodDescriptor]

'element' @ [223:85] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[ValueParameterDescriptorImpl]

'typeMapper' @ [223:94] ==> val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[LocalVariableDescriptor]

'bindingContext' @ [223:105] ==> public final val KotlinTypeMapper.bindingContext: BindingContext[MyPropertyDescriptor]

'ComputedClassNames' @ [224:28] ==> public companion object defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ComputedClassNames[FakeCallableDescriptorForObject]

'Cached' @ [224:47] ==> public final fun Cached(className: String): KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ComputedClassNames.Companion[SimpleFunctionDescriptorImpl]

'nonInlinedLambdaClassName' @ [224:54] ==> val nonInlinedLambdaClassName: String defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[LocalVariableDescriptor]

'ComputedClassNames' @ [227:17] ==> public companion object defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ComputedClassNames[FakeCallableDescriptorForObject]

'Cached' @ [227:36] ==> public final fun Cached(className: String): KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ComputedClassNames.Companion[SimpleFunctionDescriptorImpl]

'nonInlinedLambdaClassName' @ [227:43] ==> val nonInlinedLambdaClassName: String defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[LocalVariableDescriptor]

'getOuterClassNamesForElement' @ [227:72] ==> @PublishedApi @Suppress internal final tailrec fun getOuterClassNamesForElement(element: PsiElement?): KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider[SimpleFunctionDescriptorImpl]

'element' @ [227:101] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[ValueParameterDescriptorImpl]

'relevantParentInReadAction' @ [227:109] ==> private final val PsiElement.relevantParentInReadAction: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider[PropertyDescriptorImpl]

'getOuterClassNamesForElement' @ [229:21] ==> @PublishedApi @Suppress internal final tailrec fun getOuterClassNamesForElement(element: PsiElement?): KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider[SimpleFunctionDescriptorImpl]

'element' @ [229:50] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getOuterClassNamesForElement[ValueParameterDescriptorImpl]

'relevantParentInReadAction' @ [229:58] ==> private final val PsiElement.relevantParentInReadAction: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider[PropertyDescriptorImpl]

'KotlinDebuggerCaches' @ [234:26] ==> public companion object defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches[FakeCallableDescriptorForObject]

'getOrCreateTypeMapper' @ [234:47] ==> public final fun getOrCreateTypeMapper(psiElement: PsiElement): KotlinTypeMapper defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion[SimpleFunctionDescriptorImpl]

'nonLocalClassOrObject' @ [234:69] ==> value-parameter nonLocalClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getNameForNonLocalClass[ValueParameterDescriptorImpl]

'typeMapper' @ [235:26] ==> val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getNameForNonLocalClass[LocalVariableDescriptor]

'bindingContext' @ [235:37] ==> public final val KotlinTypeMapper.bindingContext: BindingContext[MyPropertyDescriptor]

'CLASS' @ [235:67] ==> public final val CLASS: (WritableSlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'nonLocalClassOrObject' @ [235:74] ==> value-parameter nonLocalClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getNameForNonLocalClass[ValueParameterDescriptorImpl]

'typeMapper' @ [237:20] ==> val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getNameForNonLocalClass[LocalVariableDescriptor]

'mapClass' @ [237:31] ==> @NotNull public open fun mapClass(@NotNull p0: ClassifierDescriptor): Type defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'descriptor' @ [237:40] ==> val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getNameForNonLocalClass[LocalVariableDescriptor]

'type' @ [238:13] ==> val type: Type defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getNameForNonLocalClass[LocalVariableDescriptor]

'sort' @ [238:18] ==> public final val Type.sort: Int[MyPropertyDescriptor]

'OBJECT' @ [238:31] ==> public const final val OBJECT: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'type' @ [242:16] ==> val type: Type defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.getNameForNonLocalClass[LocalVariableDescriptor]

'className' @ [242:21] ==> public final val Type.className: (String..String?)[MyPropertyDescriptor]

'runReadAction' @ [246:17] ==> public fun <T> runReadAction(action: () -> Boolean): Boolean defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'hasModifier' @ [246:33] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtDeclaration[JavaMethodDescriptor]

'INLINE_KEYWORD' @ [246:54] ==> public final val INLINE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'runReadAction' @ [249:17] ==> public fun <T> runReadAction(action: () -> Boolean): Boolean defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'isCompanion' @ [249:33] ==> public final fun isCompanion(): Boolean defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[DeserializedSimpleFunctionDescriptor]

'runReadAction' @ [252:17] ==> public fun <T> runReadAction(action: () -> PsiElement?): PsiElement? defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement?

'getRelevantElement' @ [252:33] ==> internal final fun getRelevantElement(element: PsiElement): PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.Companion[SimpleFunctionDescriptorImpl]

'this' @ [252:52] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.relevantParentInReadAction[ReceiverParameterDescriptorImpl]

'parent' @ [252:57] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'replace' @ [255:34] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'virtualMachineProxy' @ [258:19] ==> public final val DebugProcess.virtualMachineProxy: (VirtualMachineProxy..VirtualMachineProxy?)[MyPropertyDescriptor]

'!' @ [259:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'outerClass' @ [259:10] ==> value-parameter outerClass: ReferenceType defined in org.jetbrains.kotlin.idea.debugger.findTargetClasses[ValueParameterDescriptorImpl]

'isPrepared' @ [259:21] ==> public final val ReferenceType.isPrepared: Boolean[MyPropertyDescriptor]

'emptyList' @ [259:40] ==> public fun <T> emptyList(): List<ReferenceType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReferenceType

'ArrayList' @ [261:25] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ReferenceType

'outerClass' @ [264:26] ==> value-parameter outerClass: ReferenceType defined in org.jetbrains.kotlin.idea.debugger.findTargetClasses[ValueParameterDescriptorImpl]

'allLineLocations' @ [264:37] ==> public abstract fun allLineLocations(): (MutableList<(Location..Location?)>..List<(Location..Location?)>?) defined in com.sun.jdi.ReferenceType[JavaMethodDescriptor]

'location' @ [265:32] ==> val location: (Location..Location?) defined in org.jetbrains.kotlin.idea.debugger.findTargetClasses[LocalVariableDescriptor]

'lineNumber' @ [265:41] ==> public abstract fun lineNumber(): Int defined in com.sun.jdi.Location[JavaMethodDescriptor]

'locationLine' @ [266:17] ==> val locationLine: Int defined in org.jetbrains.kotlin.idea.debugger.findTargetClasses[LocalVariableDescriptor]

'lineAt' @ [271:17] ==> value-parameter lineAt: Int defined in org.jetbrains.kotlin.idea.debugger.findTargetClasses[ValueParameterDescriptorImpl]

'locationLine' @ [271:27] ==> val locationLine: Int defined in org.jetbrains.kotlin.idea.debugger.findTargetClasses[LocalVariableDescriptor]

'location' @ [272:30] ==> val location: (Location..Location?) defined in org.jetbrains.kotlin.idea.debugger.findTargetClasses[LocalVariableDescriptor]

'method' @ [272:39] ==> public abstract fun method(): (Method..Method?) defined in com.sun.jdi.Location[JavaMethodDescriptor]

'method' @ [273:21] ==> val method: (Method..Method?) defined in org.jetbrains.kotlin.idea.debugger.findTargetClasses[LocalVariableDescriptor]

'DebuggerUtils' @ [273:39] ==> public object DebuggerUtils defined in org.jetbrains.kotlin.idea.debugger in file DebuggerUtils.kt[FakeCallableDescriptorForObject]

'isSynthetic' @ [273:53] ==> public open fun isSynthetic(p0: (TypeComponent..TypeComponent?)): Boolean defined in com.intellij.debugger.engine.DebuggerUtils[JavaMethodDescriptor]

'method' @ [273:65] ==> val method: (Method..Method?) defined in org.jetbrains.kotlin.idea.debugger.findTargetClasses[LocalVariableDescriptor]

'method' @ [273:76] ==> val method: (Method..Method?) defined in org.jetbrains.kotlin.idea.debugger.findTargetClasses[LocalVariableDescriptor]

'isBridge' @ [273:83] ==> public final val Method.isBridge: Boolean[MyPropertyDescriptor]

'targetClasses' @ [278:17] ==> val targetClasses: ArrayList<ReferenceType> defined in org.jetbrains.kotlin.idea.debugger.findTargetClasses[LocalVariableDescriptor]

'outerClass' @ [278:34] ==> value-parameter outerClass: ReferenceType defined in org.jetbrains.kotlin.idea.debugger.findTargetClasses[ValueParameterDescriptorImpl]

'vmProxy' @ [292:27] ==> val vmProxy: (VirtualMachineProxy..VirtualMachineProxy?) defined in org.jetbrains.kotlin.idea.debugger.findTargetClasses[LocalVariableDescriptor]

'nestedTypes' @ [292:35] ==> public abstract fun nestedTypes(p0: (ReferenceType..ReferenceType?)): (MutableList<(ReferenceType..ReferenceType?)>..List<(ReferenceType..ReferenceType?)>?) defined in com.intellij.debugger.engine.jdi.VirtualMachineProxy[JavaMethodDescriptor]

'outerClass' @ [292:47] ==> value-parameter outerClass: ReferenceType defined in org.jetbrains.kotlin.idea.debugger.findTargetClasses[ValueParameterDescriptorImpl]

'nestedTypes' @ [293:24] ==> val nestedTypes: (MutableList<(ReferenceType..ReferenceType?)>..List<(ReferenceType..ReferenceType?)>?) defined in org.jetbrains.kotlin.idea.debugger.findTargetClasses[LocalVariableDescriptor]

'targetClasses' @ [294:13] ==> val targetClasses: ArrayList<ReferenceType> defined in org.jetbrains.kotlin.idea.debugger.findTargetClasses[LocalVariableDescriptor]

'findTargetClasses' @ [294:30] ==> private fun DebugProcess.findTargetClasses(outerClass: ReferenceType, lineAt: Int): List<ReferenceType> defined in org.jetbrains.kotlin.idea.debugger in file DebuggerClassNameProvider.kt[SimpleFunctionDescriptorImpl]

'nested' @ [294:48] ==> val nested: (ReferenceType..ReferenceType?) defined in org.jetbrains.kotlin.idea.debugger.findTargetClasses[LocalVariableDescriptor]

'lineAt' @ [294:56] ==> value-parameter lineAt: Int defined in org.jetbrains.kotlin.idea.debugger.findTargetClasses[ValueParameterDescriptorImpl]

'targetClasses' @ [299:12] ==> val targetClasses: ArrayList<ReferenceType> defined in org.jetbrains.kotlin.idea.debugger.findTargetClasses[LocalVariableDescriptor]

