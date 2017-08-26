'KotlinQuickFixAction<KtNamedDeclaration>' @ [46:7] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtNamedDeclaration) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtNamedDeclaration

'declaration' @ [46:48] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.<init>[ValueParameterDescriptorImpl]

'text' @ [49:36] ==> public final val MigrateExternalExtensionFix.text: String[MyPropertyDescriptor]

'element' @ [52:27] ==> protected final val element: KtNamedDeclaration? defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix[PropertyDescriptorImpl]

'when {
            isMemberExtensionDeclaration(declaration) -> fixExtensionMemberDeclaration(declaration, editor)
            isMemberDeclaration(declaration) -> {
                val containingClass = declaration.containingClassOrObject
                if (containingClass != null) {
                    fixNativeClass(containingClass)
                }
            }
            declaration is KtClassOrObject -> fixNativeClass(declaration)
        }' @ [54:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'isMemberExtensionDeclaration' @ [55:13] ==> private final fun isMemberExtensionDeclaration(psiElement: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.Companion[SimpleFunctionDescriptorImpl]

'declaration' @ [55:42] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.invoke[LocalVariableDescriptor]

'fixExtensionMemberDeclaration' @ [55:58] ==> private final fun fixExtensionMemberDeclaration(declaration: KtNamedDeclaration, editor: Editor?): Unit defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix[SimpleFunctionDescriptorImpl]

'declaration' @ [55:88] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.invoke[LocalVariableDescriptor]

'editor' @ [55:101] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.invoke[ValueParameterDescriptorImpl]

'isMemberDeclaration' @ [56:13] ==> private final fun isMemberDeclaration(psiElement: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.Companion[SimpleFunctionDescriptorImpl]

'declaration' @ [56:33] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.invoke[LocalVariableDescriptor]

'declaration' @ [57:39] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.invoke[LocalVariableDescriptor]

'containingClassOrObject' @ [57:51] ==> public val KtDeclaration.containingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'containingClass' @ [58:21] ==> val containingClass: KtClassOrObject? defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.invoke[LocalVariableDescriptor]

'fixNativeClass' @ [59:21] ==> private final fun fixNativeClass(containingClass: KtClassOrObject): Unit defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix[SimpleFunctionDescriptorImpl]

'containingClass' @ [59:36] ==> val containingClass: KtClassOrObject? defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.invoke[LocalVariableDescriptor]

'declaration' @ [62:13] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.invoke[LocalVariableDescriptor]

'fixNativeClass' @ [62:47] ==> private final fun fixNativeClass(containingClass: KtClassOrObject): Unit defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix[SimpleFunctionDescriptorImpl]

'declaration' @ [62:62] ==> val declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.invoke[LocalVariableDescriptor]

'containingClass' @ [67:28] ==> value-parameter containingClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixNativeClass[ValueParameterDescriptorImpl]

'declarations' @ [67:44] ==> public final val KtClassOrObject.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'filterIsInstance' @ [67:57] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<KtCallableDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtCallableDeclaration

'filter' @ [67:99] ==> public inline fun <T> Iterable<KtCallableDeclaration>.filter(predicate: (KtCallableDeclaration) -> Boolean): List<KtCallableDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtCallableDeclaration

'isMemberDeclaration' @ [67:108] ==> private final fun isMemberDeclaration(psiElement: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.Companion[SimpleFunctionDescriptorImpl]

'it' @ [67:128] ==> value-parameter it: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixNativeClass.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [67:135] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isMemberExtensionDeclaration' @ [67:136] ==> private final fun isMemberExtensionDeclaration(psiElement: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.Companion[SimpleFunctionDescriptorImpl]

'it' @ [67:165] ==> value-parameter it: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixNativeClass.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [67:172] ==> public inline fun <T, R> Iterable<KtCallableDeclaration>.map(transform: (KtCallableDeclaration) -> Pair<KtCallableDeclaration, MigrateExternalExtensionFix.JsNativeAnnotations>): List<Pair<KtCallableDeclaration, MigrateExternalExtensionFix.JsNativeAnnotations>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtCallableDeclaration
    <R> -> Pair<KtCallableDeclaration, JsNativeAnnotations>

'it' @ [68:14] ==> value-parameter it: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixNativeClass.<anonymous>[ValueParameterDescriptorImpl]

'fetchJsNativeAnnotations' @ [68:20] ==> private final fun fetchJsNativeAnnotations(declaration: KtNamedDeclaration): MigrateExternalExtensionFix.JsNativeAnnotations defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix[SimpleFunctionDescriptorImpl]

'it' @ [68:45] ==> value-parameter it: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixNativeClass.<anonymous>[ValueParameterDescriptorImpl]

'filter' @ [69:11] ==> public inline fun <T> Iterable<Pair<KtCallableDeclaration, MigrateExternalExtensionFix.JsNativeAnnotations>>.filter(predicate: (Pair<KtCallableDeclaration, MigrateExternalExtensionFix.JsNativeAnnotations>) -> Boolean): List<Pair<KtCallableDeclaration, MigrateExternalExtensionFix.JsNativeAnnotations>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<KtCallableDeclaration, JsNativeAnnotations>

'it' @ [70:13] ==> value-parameter it: Pair<KtCallableDeclaration, MigrateExternalExtensionFix.JsNativeAnnotations> defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixNativeClass.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [70:16] ==> public final val second: MigrateExternalExtensionFix.JsNativeAnnotations defined in kotlin.Pair[DeserializedPropertyDescriptor]

'annotations' @ [70:23] ==> public final val annotations: List<KtAnnotationEntry> defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.JsNativeAnnotations[PropertyDescriptorImpl]

'isNotEmpty' @ [70:35] ==> @InlineOnly public inline fun <T> Collection<KtAnnotationEntry>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtAnnotationEntry

'membersToFix' @ [73:9] ==> val membersToFix: List<Pair<KtCallableDeclaration, MigrateExternalExtensionFix.JsNativeAnnotations>> defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixNativeClass[LocalVariableDescriptor]

'asReversed' @ [73:22] ==> public fun <T> List<Pair<KtCallableDeclaration, MigrateExternalExtensionFix.JsNativeAnnotations>>.asReversed(): List<Pair<KtCallableDeclaration, MigrateExternalExtensionFix.JsNativeAnnotations>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<KtCallableDeclaration, JsNativeAnnotations>

'forEach' @ [73:35] ==> @HidesMembers public inline fun <T> Iterable<Pair<KtCallableDeclaration, MigrateExternalExtensionFix.JsNativeAnnotations>>.forEach(action: (Pair<KtCallableDeclaration, MigrateExternalExtensionFix.JsNativeAnnotations>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<KtCallableDeclaration, JsNativeAnnotations>

'component1' @ [73:46] ==> public final operator fun component1(): KtCallableDeclaration defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [73:65] ==> public final operator fun component2(): MigrateExternalExtensionFix.JsNativeAnnotations defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'if (annotations.nativeAnnotation != null && !annotations.isGetter && !annotations.isSetter && !annotations.isInvoke) {
                convertNativeAnnotationToJsName(memberDeclaration, annotations)
                annotations.nativeAnnotation.delete()
            } else {
                val externalDeclaration = ConvertMemberToExtensionIntention.convert(memberDeclaration)
                fixExtensionMemberDeclaration(externalDeclaration, null) // editor is null as we are not going to open any live templates
            }' @ [74:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'annotations' @ [74:17] ==> val annotations: MigrateExternalExtensionFix.JsNativeAnnotations defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixNativeClass.<anonymous>[LocalVariableDescriptor]

'nativeAnnotation' @ [74:29] ==> public final val nativeAnnotation: KtAnnotationEntry? defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.JsNativeAnnotations[PropertyDescriptorImpl]

'!' @ [74:57] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'annotations' @ [74:58] ==> val annotations: MigrateExternalExtensionFix.JsNativeAnnotations defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixNativeClass.<anonymous>[LocalVariableDescriptor]

'isGetter' @ [74:70] ==> public final val isGetter: Boolean defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.JsNativeAnnotations[PropertyDescriptorImpl]

'!' @ [74:82] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'annotations' @ [74:83] ==> val annotations: MigrateExternalExtensionFix.JsNativeAnnotations defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixNativeClass.<anonymous>[LocalVariableDescriptor]

'isSetter' @ [74:95] ==> public final val isSetter: Boolean defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.JsNativeAnnotations[PropertyDescriptorImpl]

'!' @ [74:107] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'annotations' @ [74:108] ==> val annotations: MigrateExternalExtensionFix.JsNativeAnnotations defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixNativeClass.<anonymous>[LocalVariableDescriptor]

'isInvoke' @ [74:120] ==> public final val isInvoke: Boolean defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.JsNativeAnnotations[PropertyDescriptorImpl]

'convertNativeAnnotationToJsName' @ [75:17] ==> private final fun convertNativeAnnotationToJsName(declaration: KtNamedDeclaration, annotations: MigrateExternalExtensionFix.JsNativeAnnotations): Unit defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix[SimpleFunctionDescriptorImpl]

'memberDeclaration' @ [75:49] ==> val memberDeclaration: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixNativeClass.<anonymous>[LocalVariableDescriptor]

'annotations' @ [75:68] ==> val annotations: MigrateExternalExtensionFix.JsNativeAnnotations defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixNativeClass.<anonymous>[LocalVariableDescriptor]

'annotations' @ [76:17] ==> val annotations: MigrateExternalExtensionFix.JsNativeAnnotations defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixNativeClass.<anonymous>[LocalVariableDescriptor]

'nativeAnnotation' @ [76:29] ==> public final val nativeAnnotation: KtAnnotationEntry? defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.JsNativeAnnotations[PropertyDescriptorImpl]

'delete' @ [76:46] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtAnnotationEntry[JavaMethodDescriptor]

'ConvertMemberToExtensionIntention' @ [78:43] ==> public companion object defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention[FakeCallableDescriptorForObject]

'convert' @ [78:77] ==> public final fun convert(element: KtCallableDeclaration): KtCallableDeclaration defined in org.jetbrains.kotlin.idea.intentions.declarations.ConvertMemberToExtensionIntention.Companion[SimpleFunctionDescriptorImpl]

'memberDeclaration' @ [78:85] ==> val memberDeclaration: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixNativeClass.<anonymous>[LocalVariableDescriptor]

'fixExtensionMemberDeclaration' @ [79:17] ==> private final fun fixExtensionMemberDeclaration(declaration: KtNamedDeclaration, editor: Editor?): Unit defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix[SimpleFunctionDescriptorImpl]

'externalDeclaration' @ [79:47] ==> val externalDeclaration: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixNativeClass.<anonymous>[LocalVariableDescriptor]

'fetchJsNativeAnnotations' @ [84:32] ==> private final fun fetchJsNativeAnnotations(declaration: KtNamedDeclaration): MigrateExternalExtensionFix.JsNativeAnnotations defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix[SimpleFunctionDescriptorImpl]

'containingClass' @ [84:57] ==> value-parameter containingClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixNativeClass[ValueParameterDescriptorImpl]

'fixAnnotations' @ [85:9] ==> private final fun fixAnnotations(declaration: KtNamedDeclaration, annotations: MigrateExternalExtensionFix.JsNativeAnnotations, editor: Editor?): Unit defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix[SimpleFunctionDescriptorImpl]

'containingClass' @ [85:24] ==> value-parameter containingClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixNativeClass[ValueParameterDescriptorImpl]

'classAnnotations' @ [85:41] ==> val classAnnotations: MigrateExternalExtensionFix.JsNativeAnnotations defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixNativeClass[LocalVariableDescriptor]

'ArrayList' @ [95:33] ==> public final fun <E> <init>(): ArrayList<KtAnnotationEntry> /* = ArrayList<KtAnnotationEntry> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> KtAnnotationEntry

'declaration' @ [97:9] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fetchJsNativeAnnotations[ValueParameterDescriptorImpl]

'modifierList' @ [97:21] ==> public final val KtNamedDeclaration.modifierList: KtModifierList?[MyPropertyDescriptor]

'annotationEntries' @ [97:35] ==> public final val KtModifierList.annotationEntries: (MutableList<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>)[MyPropertyDescriptor]

'forEach' @ [97:54] ==> @HidesMembers public inline fun <T> Iterable<(KtAnnotationEntry..KtAnnotationEntry?)>.forEach(action: ((KtAnnotationEntry..KtAnnotationEntry?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtAnnotationEntry..org.jetbrains.kotlin.psi.KtAnnotationEntry?)

'when {
                it.isJsAnnotation(PredefinedAnnotation.NATIVE_GETTER) -> {
                    isGetter = true
                    nativeAnnotations.add(it)
                }
                it.isJsAnnotation(PredefinedAnnotation.NATIVE_SETTER) -> {
                    isSetter = true
                    nativeAnnotations.add(it)
                }
                it.isJsAnnotation(PredefinedAnnotation.NATIVE_INVOKE) -> {
                    isInvoke = true
                    nativeAnnotations.add(it)
                }
                it.isJsAnnotation(PredefinedAnnotation.NATIVE) -> {
                    nativeAnnotations.add(it)
                    nativeAnnotation = it
                }
            }' @ [98:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any, entry2: Any, entry3: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'it' @ [99:17] ==> value-parameter it: (KtAnnotationEntry..KtAnnotationEntry?) defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fetchJsNativeAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'isJsAnnotation' @ [99:20] ==> private final fun KtAnnotationEntry.isJsAnnotation(vararg predefinedAnnotations: PredefinedAnnotation): Boolean defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.Companion[SimpleFunctionDescriptorImpl]

'PredefinedAnnotation' @ [99:35] ==> public companion object defined in org.jetbrains.kotlin.js.PredefinedAnnotation[FakeCallableDescriptorForObject]

'NATIVE_GETTER' @ [99:56] ==> enum entry NATIVE_GETTER defined in org.jetbrains.kotlin.js.PredefinedAnnotation[FakeCallableDescriptorForObject]

'isGetter' @ [100:21] ==> var isGetter: Boolean defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fetchJsNativeAnnotations[LocalVariableDescriptor]

'nativeAnnotations' @ [101:21] ==> val nativeAnnotations: ArrayList<KtAnnotationEntry> /* = ArrayList<KtAnnotationEntry> */ defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fetchJsNativeAnnotations[LocalVariableDescriptor]

'add' @ [101:39] ==> public open fun add(element: KtAnnotationEntry): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'it' @ [101:43] ==> value-parameter it: (KtAnnotationEntry..KtAnnotationEntry?) defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fetchJsNativeAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [103:17] ==> value-parameter it: (KtAnnotationEntry..KtAnnotationEntry?) defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fetchJsNativeAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'isJsAnnotation' @ [103:20] ==> private final fun KtAnnotationEntry.isJsAnnotation(vararg predefinedAnnotations: PredefinedAnnotation): Boolean defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.Companion[SimpleFunctionDescriptorImpl]

'PredefinedAnnotation' @ [103:35] ==> public companion object defined in org.jetbrains.kotlin.js.PredefinedAnnotation[FakeCallableDescriptorForObject]

'NATIVE_SETTER' @ [103:56] ==> enum entry NATIVE_SETTER defined in org.jetbrains.kotlin.js.PredefinedAnnotation[FakeCallableDescriptorForObject]

'isSetter' @ [104:21] ==> var isSetter: Boolean defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fetchJsNativeAnnotations[LocalVariableDescriptor]

'nativeAnnotations' @ [105:21] ==> val nativeAnnotations: ArrayList<KtAnnotationEntry> /* = ArrayList<KtAnnotationEntry> */ defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fetchJsNativeAnnotations[LocalVariableDescriptor]

'add' @ [105:39] ==> public open fun add(element: KtAnnotationEntry): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'it' @ [105:43] ==> value-parameter it: (KtAnnotationEntry..KtAnnotationEntry?) defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fetchJsNativeAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [107:17] ==> value-parameter it: (KtAnnotationEntry..KtAnnotationEntry?) defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fetchJsNativeAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'isJsAnnotation' @ [107:20] ==> private final fun KtAnnotationEntry.isJsAnnotation(vararg predefinedAnnotations: PredefinedAnnotation): Boolean defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.Companion[SimpleFunctionDescriptorImpl]

'PredefinedAnnotation' @ [107:35] ==> public companion object defined in org.jetbrains.kotlin.js.PredefinedAnnotation[FakeCallableDescriptorForObject]

'NATIVE_INVOKE' @ [107:56] ==> enum entry NATIVE_INVOKE defined in org.jetbrains.kotlin.js.PredefinedAnnotation[FakeCallableDescriptorForObject]

'isInvoke' @ [108:21] ==> var isInvoke: Boolean defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fetchJsNativeAnnotations[LocalVariableDescriptor]

'nativeAnnotations' @ [109:21] ==> val nativeAnnotations: ArrayList<KtAnnotationEntry> /* = ArrayList<KtAnnotationEntry> */ defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fetchJsNativeAnnotations[LocalVariableDescriptor]

'add' @ [109:39] ==> public open fun add(element: KtAnnotationEntry): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'it' @ [109:43] ==> value-parameter it: (KtAnnotationEntry..KtAnnotationEntry?) defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fetchJsNativeAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [111:17] ==> value-parameter it: (KtAnnotationEntry..KtAnnotationEntry?) defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fetchJsNativeAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'isJsAnnotation' @ [111:20] ==> private final fun KtAnnotationEntry.isJsAnnotation(vararg predefinedAnnotations: PredefinedAnnotation): Boolean defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.Companion[SimpleFunctionDescriptorImpl]

'PredefinedAnnotation' @ [111:35] ==> public companion object defined in org.jetbrains.kotlin.js.PredefinedAnnotation[FakeCallableDescriptorForObject]

'NATIVE' @ [111:56] ==> enum entry NATIVE defined in org.jetbrains.kotlin.js.PredefinedAnnotation[FakeCallableDescriptorForObject]

'nativeAnnotations' @ [112:21] ==> val nativeAnnotations: ArrayList<KtAnnotationEntry> /* = ArrayList<KtAnnotationEntry> */ defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fetchJsNativeAnnotations[LocalVariableDescriptor]

'add' @ [112:39] ==> public open fun add(element: KtAnnotationEntry): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'it' @ [112:43] ==> value-parameter it: (KtAnnotationEntry..KtAnnotationEntry?) defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fetchJsNativeAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'nativeAnnotation' @ [113:21] ==> var nativeAnnotation: KtAnnotationEntry? defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fetchJsNativeAnnotations[LocalVariableDescriptor]

'it' @ [113:40] ==> value-parameter it: (KtAnnotationEntry..KtAnnotationEntry?) defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fetchJsNativeAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'JsNativeAnnotations' @ [117:16] ==> public constructor JsNativeAnnotations(annotations: List<KtAnnotationEntry>, nativeAnnotation: KtAnnotationEntry?, isGetter: Boolean, isSetter: Boolean, isInvoke: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.JsNativeAnnotations[ClassConstructorDescriptorImpl]

'nativeAnnotations' @ [117:36] ==> val nativeAnnotations: ArrayList<KtAnnotationEntry> /* = ArrayList<KtAnnotationEntry> */ defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fetchJsNativeAnnotations[LocalVariableDescriptor]

'nativeAnnotation' @ [117:55] ==> var nativeAnnotation: KtAnnotationEntry? defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fetchJsNativeAnnotations[LocalVariableDescriptor]

'isGetter' @ [117:73] ==> var isGetter: Boolean defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fetchJsNativeAnnotations[LocalVariableDescriptor]

'isSetter' @ [117:83] ==> var isSetter: Boolean defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fetchJsNativeAnnotations[LocalVariableDescriptor]

'isInvoke' @ [117:93] ==> var isInvoke: Boolean defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fetchJsNativeAnnotations[LocalVariableDescriptor]

'declaration' @ [121:20] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[ValueParameterDescriptorImpl]

'nameAsSafeName' @ [121:32] ==> public final val KtNamedDeclaration.nameAsSafeName: Name[MyPropertyDescriptor]

'fetchJsNativeAnnotations' @ [122:27] ==> private final fun fetchJsNativeAnnotations(declaration: KtNamedDeclaration): MigrateExternalExtensionFix.JsNativeAnnotations defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix[SimpleFunctionDescriptorImpl]

'declaration' @ [122:52] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[ValueParameterDescriptorImpl]

'fixAnnotations' @ [123:9] ==> private final fun fixAnnotations(declaration: KtNamedDeclaration, annotations: MigrateExternalExtensionFix.JsNativeAnnotations, editor: Editor?): Unit defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix[SimpleFunctionDescriptorImpl]

'declaration' @ [123:24] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[ValueParameterDescriptorImpl]

'annotations' @ [123:37] ==> val annotations: MigrateExternalExtensionFix.JsNativeAnnotations defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[LocalVariableDescriptor]

'editor' @ [123:50] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [125:28] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'declaration' @ [125:41] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[ValueParameterDescriptorImpl]

'ktPsiFactory' @ [126:20] ==> val ktPsiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[LocalVariableDescriptor]

'buildExpression' @ [126:33] ==> public fun KtPsiFactory.buildExpression(build: BuilderByPattern<KtExpression>.() -> Unit): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'appendName' @ [127:13] ==> public final fun appendName(name: Name): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'identifier' @ [127:29] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'when {
                annotations.isGetter -> {
                    appendFixedText("()")
                    if (declaration is KtNamedFunction) {
                        appendParameters(declaration, "[", "]")
                    }
                }
                annotations.isSetter -> {
                    appendFixedText("()")
                    if (declaration is KtNamedFunction) {
                        appendParameters(declaration, "[", "]", skipLast = true)
                        declaration.valueParameters.last().nameAsName?.let {
                            appendFixedText(" = ")
                            appendName(it)
                        }
                    }
                }
                annotations.isInvoke -> {
                    appendFixedText("()")
                    if (declaration is KtNamedFunction) {
                        appendParameters(declaration, "(", ")")
                    }
                }
                else -> {
                    appendFixedText("().")
                    appendName(name)
                    if (declaration is KtNamedFunction) {
                        appendParameters(declaration, "(", ")")
                    }
                }
            }' @ [128:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'annotations' @ [129:17] ==> val annotations: MigrateExternalExtensionFix.JsNativeAnnotations defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[LocalVariableDescriptor]

'isGetter' @ [129:29] ==> public final val isGetter: Boolean defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.JsNativeAnnotations[PropertyDescriptorImpl]

'appendFixedText' @ [130:21] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'declaration' @ [131:25] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[ValueParameterDescriptorImpl]

'appendParameters' @ [132:25] ==> private final fun BuilderByPattern<KtExpression>.appendParameters(declaration: KtNamedFunction, lParenth: String, rParenth: String, skipLast: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix[SimpleFunctionDescriptorImpl]

'declaration' @ [132:42] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[ValueParameterDescriptorImpl]

'annotations' @ [135:17] ==> val annotations: MigrateExternalExtensionFix.JsNativeAnnotations defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[LocalVariableDescriptor]

'isSetter' @ [135:29] ==> public final val isSetter: Boolean defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.JsNativeAnnotations[PropertyDescriptorImpl]

'appendFixedText' @ [136:21] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'declaration' @ [137:25] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[ValueParameterDescriptorImpl]

'appendParameters' @ [138:25] ==> private final fun BuilderByPattern<KtExpression>.appendParameters(declaration: KtNamedFunction, lParenth: String, rParenth: String, skipLast: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix[SimpleFunctionDescriptorImpl]

'declaration' @ [138:42] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[ValueParameterDescriptorImpl]

'declaration' @ [139:25] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[ValueParameterDescriptorImpl]

'valueParameters' @ [139:37] ==> public final val KtNamedFunction.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'last' @ [139:53] ==> public fun <T> List<(KtParameter..KtParameter?)>.last(): (KtParameter..KtParameter?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'nameAsName' @ [139:60] ==> public final val KtParameter.nameAsName: Name?[MyPropertyDescriptor]

'let' @ [139:72] ==> @InlineOnly public inline fun <T, R> Name.let(block: (Name) -> BuilderByPattern<KtExpression>): BuilderByPattern<KtExpression> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name
    <R> -> BuilderByPattern<KtExpression>

'appendFixedText' @ [140:29] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'appendName' @ [141:29] ==> public final fun appendName(name: Name): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'it' @ [141:40] ==> value-parameter it: Name defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'annotations' @ [145:17] ==> val annotations: MigrateExternalExtensionFix.JsNativeAnnotations defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[LocalVariableDescriptor]

'isInvoke' @ [145:29] ==> public final val isInvoke: Boolean defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.JsNativeAnnotations[PropertyDescriptorImpl]

'appendFixedText' @ [146:21] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'declaration' @ [147:25] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[ValueParameterDescriptorImpl]

'appendParameters' @ [148:25] ==> private final fun BuilderByPattern<KtExpression>.appendParameters(declaration: KtNamedFunction, lParenth: String, rParenth: String, skipLast: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix[SimpleFunctionDescriptorImpl]

'declaration' @ [148:42] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[ValueParameterDescriptorImpl]

'appendFixedText' @ [152:21] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'appendName' @ [153:21] ==> public final fun appendName(name: Name): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'name' @ [153:32] ==> val name: Name defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[LocalVariableDescriptor]

'declaration' @ [154:25] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[ValueParameterDescriptorImpl]

'appendParameters' @ [155:25] ==> private final fun BuilderByPattern<KtExpression>.appendParameters(declaration: KtNamedFunction, lParenth: String, rParenth: String, skipLast: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix[SimpleFunctionDescriptorImpl]

'declaration' @ [155:42] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[ValueParameterDescriptorImpl]

'if (declaration is KtNamedFunction) {
            declaration.bodyExpression?.delete()
            declaration.equalsToken?.delete()

            if (annotations.isSetter || annotations.isInvoke) {
                val blockBody = ktPsiFactory.createSingleStatementBlock(body)
                declaration.add(blockBody)
            } else {
                declaration.add(ktPsiFactory.createEQ())
                declaration.add(body)
            }
        }
        else if (declaration is KtProperty) {
            declaration.setter?.delete()
            declaration.getter?.delete()
            val getter = ktPsiFactory.createPropertyGetter(body)
            declaration.add(getter)

            if (declaration.isVar) {
                val setterBody = ktPsiFactory.buildExpression {
                    appendName(Name.identifier("asDynamic"))
                    appendFixedText("().")
                    appendName(name)
                    appendFixedText(" = ")
                    appendName(Name.identifier("value"))
                }

                val setterStubProperty = ktPsiFactory.createProperty("val x: Unit set(value) { Unit }")
                val block = setterStubProperty.setter!!.bodyExpression as KtBlockExpression
                block.statements.single().replace(setterBody)
                declaration.add(setterStubProperty.setter!!)
            }
        }' @ [161:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'declaration' @ [161:13] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[ValueParameterDescriptorImpl]

'declaration' @ [162:13] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[ValueParameterDescriptorImpl]

'bodyExpression' @ [162:25] ==> public final val KtNamedFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'delete' @ [162:41] ==> public abstract fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'declaration' @ [163:13] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[ValueParameterDescriptorImpl]

'equalsToken' @ [163:25] ==> public final val KtNamedFunction.equalsToken: PsiElement?[MyPropertyDescriptor]

'delete' @ [163:38] ==> public abstract fun delete(): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'if (annotations.isSetter || annotations.isInvoke) {
                val blockBody = ktPsiFactory.createSingleStatementBlock(body)
                declaration.add(blockBody)
            } else {
                declaration.add(ktPsiFactory.createEQ())
                declaration.add(body)
            }' @ [165:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (PsiElement..PsiElement?), elseBranch: (PsiElement..PsiElement?)): (PsiElement..PsiElement?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'annotations' @ [165:17] ==> val annotations: MigrateExternalExtensionFix.JsNativeAnnotations defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[LocalVariableDescriptor]

'isSetter' @ [165:29] ==> public final val isSetter: Boolean defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.JsNativeAnnotations[PropertyDescriptorImpl]

'annotations' @ [165:41] ==> val annotations: MigrateExternalExtensionFix.JsNativeAnnotations defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[LocalVariableDescriptor]

'isInvoke' @ [165:53] ==> public final val isInvoke: Boolean defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.JsNativeAnnotations[PropertyDescriptorImpl]

'ktPsiFactory' @ [166:33] ==> val ktPsiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[LocalVariableDescriptor]

'createSingleStatementBlock' @ [166:46] ==> public final fun createSingleStatementBlock(statement: KtExpression): KtBlockExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'body' @ [166:73] ==> val body: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[LocalVariableDescriptor]

'declaration' @ [167:17] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[ValueParameterDescriptorImpl]

'add' @ [167:29] ==> public abstract fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'blockBody' @ [167:33] ==> val blockBody: KtBlockExpression defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[LocalVariableDescriptor]

'declaration' @ [169:17] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[ValueParameterDescriptorImpl]

'add' @ [169:29] ==> public abstract fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'ktPsiFactory' @ [169:33] ==> val ktPsiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[LocalVariableDescriptor]

'createEQ' @ [169:46] ==> public final fun createEQ(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'declaration' @ [170:17] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[ValueParameterDescriptorImpl]

'add' @ [170:29] ==> public abstract fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'body' @ [170:33] ==> val body: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[LocalVariableDescriptor]

'declaration' @ [173:18] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[ValueParameterDescriptorImpl]

'declaration' @ [174:13] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[ValueParameterDescriptorImpl]

'setter' @ [174:25] ==> public final val KtProperty.setter: KtPropertyAccessor?[MyPropertyDescriptor]

'delete' @ [174:33] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtPropertyAccessor[JavaMethodDescriptor]

'declaration' @ [175:13] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[ValueParameterDescriptorImpl]

'getter' @ [175:25] ==> public final val KtProperty.getter: KtPropertyAccessor?[MyPropertyDescriptor]

'delete' @ [175:33] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtPropertyAccessor[JavaMethodDescriptor]

'ktPsiFactory' @ [176:26] ==> val ktPsiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[LocalVariableDescriptor]

'createPropertyGetter' @ [176:39] ==> public final fun createPropertyGetter(expression: KtExpression): KtPropertyAccessor defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'body' @ [176:60] ==> val body: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[LocalVariableDescriptor]

'declaration' @ [177:13] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[ValueParameterDescriptorImpl]

'add' @ [177:25] ==> public abstract fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'getter' @ [177:29] ==> val getter: KtPropertyAccessor defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[LocalVariableDescriptor]

'declaration' @ [179:17] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[ValueParameterDescriptorImpl]

'isVar' @ [179:29] ==> public final val KtProperty.isVar: Boolean[MyPropertyDescriptor]

'ktPsiFactory' @ [180:34] ==> val ktPsiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[LocalVariableDescriptor]

'buildExpression' @ [180:47] ==> public fun KtPsiFactory.buildExpression(build: BuilderByPattern<KtExpression>.() -> Unit): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'appendName' @ [181:21] ==> public final fun appendName(name: Name): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'identifier' @ [181:37] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'appendFixedText' @ [182:21] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'appendName' @ [183:21] ==> public final fun appendName(name: Name): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'name' @ [183:32] ==> val name: Name defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[LocalVariableDescriptor]

'appendFixedText' @ [184:21] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'appendName' @ [185:21] ==> public final fun appendName(name: Name): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'identifier' @ [185:37] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'ktPsiFactory' @ [188:42] ==> val ktPsiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[LocalVariableDescriptor]

'createProperty' @ [188:55] ==> public final fun createProperty(text: String): KtProperty defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'setterStubProperty' @ [189:29] ==> val setterStubProperty: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[LocalVariableDescriptor]

'setter' @ [189:48] ==> public final val KtProperty.setter: KtPropertyAccessor?[MyPropertyDescriptor]

'bodyExpression' @ [189:57] ==> public final val KtPropertyAccessor.bodyExpression: KtExpression?[MyPropertyDescriptor]

'block' @ [190:17] ==> val block: KtBlockExpression defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[LocalVariableDescriptor]

'statements' @ [190:23] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'single' @ [190:34] ==> public fun <T> List<(KtExpression..KtExpression?)>.single(): (KtExpression..KtExpression?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'replace' @ [190:43] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'setterBody' @ [190:51] ==> val setterBody: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[LocalVariableDescriptor]

'declaration' @ [191:17] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[ValueParameterDescriptorImpl]

'add' @ [191:29] ==> public abstract fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'setterStubProperty' @ [191:33] ==> val setterStubProperty: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixExtensionMemberDeclaration[LocalVariableDescriptor]

'setter' @ [191:52] ==> public final val KtProperty.setter: KtPropertyAccessor?[MyPropertyDescriptor]

'annotations' @ [197:9] ==> value-parameter annotations: MigrateExternalExtensionFix.JsNativeAnnotations defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixAnnotations[ValueParameterDescriptorImpl]

'annotations' @ [197:21] ==> public final val annotations: List<KtAnnotationEntry> defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.JsNativeAnnotations[PropertyDescriptorImpl]

'forEach' @ [197:33] ==> @HidesMembers public inline fun <T> Iterable<KtAnnotationEntry>.forEach(action: (KtAnnotationEntry) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtAnnotationEntry

'it' @ [197:43] ==> value-parameter it: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'delete' @ [197:46] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtAnnotationEntry[JavaMethodDescriptor]

'if (declaration is KtClassOrObject) {
            declaration.addModifier(KtTokens.EXTERNAL_KEYWORD)
        } else {
            declaration.addModifier(KtTokens.INLINE_KEYWORD)
            declaration.removeModifier(KtTokens.EXTERNAL_KEYWORD)
        }' @ [199:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'declaration' @ [199:13] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixAnnotations[ValueParameterDescriptorImpl]

'declaration' @ [200:13] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixAnnotations[ValueParameterDescriptorImpl]

'addModifier' @ [200:25] ==> public abstract fun addModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'EXTERNAL_KEYWORD' @ [200:46] ==> public final val EXTERNAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'declaration' @ [202:13] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixAnnotations[ValueParameterDescriptorImpl]

'addModifier' @ [202:25] ==> public abstract fun addModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'INLINE_KEYWORD' @ [202:46] ==> public final val INLINE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'declaration' @ [203:13] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixAnnotations[ValueParameterDescriptorImpl]

'removeModifier' @ [203:25] ==> public abstract fun removeModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'EXTERNAL_KEYWORD' @ [203:49] ==> public final val EXTERNAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'declaration' @ [206:13] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixAnnotations[ValueParameterDescriptorImpl]

'declaration' @ [207:13] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixAnnotations[ValueParameterDescriptorImpl]

'addAnnotation' @ [207:25] ==> public fun KtModifierListOwner.addAnnotation(annotationFqName: FqName, annotationInnerText: String? = ..., whiteSpaceText: String = ..., addToExistingAnnotation: ((KtAnnotationEntry) -> Boolean)? = ...): Boolean defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'FQ_NAMES' @ [207:54] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'suppress' @ [207:63] ==> public final val suppress: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'convertNativeAnnotationToJsName' @ [210:9] ==> private final fun convertNativeAnnotationToJsName(declaration: KtNamedDeclaration, annotations: MigrateExternalExtensionFix.JsNativeAnnotations): Unit defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix[SimpleFunctionDescriptorImpl]

'declaration' @ [210:41] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixAnnotations[ValueParameterDescriptorImpl]

'annotations' @ [210:54] ==> value-parameter annotations: MigrateExternalExtensionFix.JsNativeAnnotations defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixAnnotations[ValueParameterDescriptorImpl]

'declaration' @ [212:13] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixAnnotations[ValueParameterDescriptorImpl]

'!' @ [212:42] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'declaration' @ [212:43] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixAnnotations[ValueParameterDescriptorImpl]

'hasDeclaredReturnType' @ [212:55] ==> public abstract fun hasDeclaredReturnType(): Boolean defined in org.jetbrains.kotlin.psi.KtFunction[JavaMethodDescriptor]

'!' @ [212:82] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'annotations' @ [212:83] ==> value-parameter annotations: MigrateExternalExtensionFix.JsNativeAnnotations defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixAnnotations[ValueParameterDescriptorImpl]

'isSetter' @ [212:95] ==> public final val isSetter: Boolean defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.JsNativeAnnotations[PropertyDescriptorImpl]

'!' @ [212:107] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'annotations' @ [212:108] ==> value-parameter annotations: MigrateExternalExtensionFix.JsNativeAnnotations defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixAnnotations[ValueParameterDescriptorImpl]

'isInvoke' @ [212:120] ==> public final val isInvoke: Boolean defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.JsNativeAnnotations[PropertyDescriptorImpl]

'editor' @ [212:132] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixAnnotations[ValueParameterDescriptorImpl]

'SpecifyTypeExplicitlyIntention' @ [213:13] ==> public companion object defined in org.jetbrains.kotlin.idea.intentions.SpecifyTypeExplicitlyIntention[FakeCallableDescriptorForObject]

'addTypeAnnotation' @ [213:44] ==> public final fun addTypeAnnotation(editor: Editor?, declaration: KtCallableDeclaration, exprType: KotlinType): Unit defined in org.jetbrains.kotlin.idea.intentions.SpecifyTypeExplicitlyIntention.Companion[SimpleFunctionDescriptorImpl]

'editor' @ [213:62] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixAnnotations[ValueParameterDescriptorImpl]

'declaration' @ [213:70] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixAnnotations[ValueParameterDescriptorImpl]

'declaration' @ [213:83] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.fixAnnotations[ValueParameterDescriptorImpl]

'builtIns' @ [213:95] ==> public val KtElement.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.idea.project[DeserializedPropertyDescriptor]

'unitType' @ [213:104] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'annotations' @ [218:32] ==> value-parameter annotations: MigrateExternalExtensionFix.JsNativeAnnotations defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.convertNativeAnnotationToJsName[ValueParameterDescriptorImpl]

'nativeAnnotation' @ [218:44] ==> public final val nativeAnnotation: KtAnnotationEntry? defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.JsNativeAnnotations[PropertyDescriptorImpl]

'nativeAnnotation' @ [219:13] ==> val nativeAnnotation: KtAnnotationEntry? defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.convertNativeAnnotationToJsName[LocalVariableDescriptor]

'nativeAnnotation' @ [219:41] ==> val nativeAnnotation: KtAnnotationEntry? defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.convertNativeAnnotationToJsName[LocalVariableDescriptor]

'valueArguments' @ [219:58] ==> public final val KtAnnotationEntry.valueArguments: (MutableList<out (ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>)[MyPropertyDescriptor]

'isNotEmpty' @ [219:73] ==> @InlineOnly public inline fun <T> Collection<(ValueArgument..ValueArgument?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.ValueArgument..org.jetbrains.kotlin.psi.ValueArgument?)

'declaration' @ [220:13] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.convertNativeAnnotationToJsName[ValueParameterDescriptorImpl]

'addAnnotation' @ [220:25] ==> public fun KtModifierListOwner.addAnnotation(annotationFqName: FqName, annotationInnerText: String? = ..., whiteSpaceText: String = ..., addToExistingAnnotation: ((KtAnnotationEntry) -> Boolean)? = ...): Boolean defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'FqName' @ [220:39] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'nativeAnnotation' @ [220:57] ==> val nativeAnnotation: KtAnnotationEntry? defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.convertNativeAnnotationToJsName[LocalVariableDescriptor]

'valueArguments' @ [220:74] ==> public final val KtAnnotationEntry.valueArguments: (MutableList<out (ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>)[MyPropertyDescriptor]

'joinToString' @ [220:89] ==> public fun <T> Iterable<(ValueArgument..ValueArgument?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((ValueArgument..ValueArgument?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.ValueArgument..org.jetbrains.kotlin.psi.ValueArgument?)

'it' @ [220:104] ==> value-parameter it: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.convertNativeAnnotationToJsName.<anonymous>[ValueParameterDescriptorImpl]

'asElement' @ [220:107] ==> public abstract fun asElement(): KtElement defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'text' @ [220:119] ==> public final val KtElement.text: (String..String?)[MyPropertyDescriptor]

'appendFixedText' @ [225:9] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'lParenth' @ [225:25] ==> value-parameter lParenth: String defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.appendParameters[ValueParameterDescriptorImpl]

'component1' @ [226:15] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [226:22] ==> public final operator fun component2(): (KtParameter..KtParameter?) defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'declaration' @ [226:32] ==> value-parameter declaration: KtNamedFunction defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.appendParameters[ValueParameterDescriptorImpl]

'valueParameters' @ [226:44] ==> public final val KtNamedFunction.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'let' @ [226:60] ==> @InlineOnly public inline fun <T, R> (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>).let(block: ((MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)) -> List<(KtParameter..KtParameter?)>): List<(KtParameter..KtParameter?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.collections.MutableList<(org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)>..kotlin.collections.List<(org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)>)
    <R> -> List<(org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)>

'if (skipLast) it.take(it.size-1) else it' @ [226:66] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<(KtParameter..KtParameter?)>, elseBranch: List<(KtParameter..KtParameter?)>): List<(KtParameter..KtParameter?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<(org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)>

'skipLast' @ [226:70] ==> value-parameter skipLast: Boolean = ... defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.appendParameters[ValueParameterDescriptorImpl]

'it' @ [226:80] ==> value-parameter it: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>) defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.appendParameters.<anonymous>[ValueParameterDescriptorImpl]

'take' @ [226:83] ==> public fun <T> Iterable<(KtParameter..KtParameter?)>.take(n: Int): List<(KtParameter..KtParameter?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'it' @ [226:88] ==> value-parameter it: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>) defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.appendParameters.<anonymous>[ValueParameterDescriptorImpl]

'size' @ [226:91] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'it' @ [226:104] ==> value-parameter it: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>) defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.appendParameters.<anonymous>[ValueParameterDescriptorImpl]

'withIndex' @ [226:109] ==> public fun <T> Iterable<(KtParameter..KtParameter?)>.withIndex(): Iterable<IndexedValue<(KtParameter..KtParameter?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'param' @ [227:13] ==> val param: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.appendParameters[LocalVariableDescriptor]

'nameAsName' @ [227:19] ==> public final val KtParameter.nameAsName: Name?[MyPropertyDescriptor]

'let' @ [227:31] ==> @InlineOnly public inline fun <T, R> Name.let(block: (Name) -> BuilderByPattern<KtExpression>): BuilderByPattern<KtExpression> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name
    <R> -> BuilderByPattern<KtExpression>

'index' @ [228:21] ==> val index: Int defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.appendParameters[LocalVariableDescriptor]

'appendFixedText' @ [229:21] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'appendName' @ [231:17] ==> public final fun appendName(name: Name): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'paramName' @ [231:28] ==> value-parameter paramName: Name defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.appendParameters.<anonymous>[ValueParameterDescriptorImpl]

'appendFixedText' @ [234:9] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'rParenth' @ [234:25] ==> value-parameter rParenth: String defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.appendParameters[ValueParameterDescriptorImpl]

'KotlinSingleIntentionActionFactory' @ [237:24] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'analyze' @ [239:34] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [239:58] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'bindingContext' @ [240:40] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.Companion.isJsAnnotation[LocalVariableDescriptor]

'ANNOTATION' @ [240:70] ==> public final val ANNOTATION: (WritableSlice<(KtAnnotationEntry..KtAnnotationEntry?), (AnnotationDescriptor..AnnotationDescriptor?)>..WritableSlice<(KtAnnotationEntry..KtAnnotationEntry?), (AnnotationDescriptor..AnnotationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'this' @ [240:82] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.Companion.isJsAnnotation[ReceiverParameterDescriptorImpl]

'annotationDescriptor' @ [241:20] ==> val annotationDescriptor: AnnotationDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.Companion.isJsAnnotation[LocalVariableDescriptor]

'predefinedAnnotations' @ [241:52] ==> value-parameter vararg predefinedAnnotations: PredefinedAnnotation defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.Companion.isJsAnnotation[ValueParameterDescriptorImpl]

'any' @ [241:74] ==> public inline fun <T> Array<out PredefinedAnnotation>.any(predicate: (PredefinedAnnotation) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PredefinedAnnotation

'annotationDescriptor' @ [241:80] ==> val annotationDescriptor: AnnotationDescriptor? defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.Companion.isJsAnnotation[LocalVariableDescriptor]

'fqName' @ [241:101] ==> public open val fqName: FqName? defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor[DeserializedPropertyDescriptor]

'it' @ [241:111] ==> value-parameter it: PredefinedAnnotation defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.Companion.isJsAnnotation.<anonymous>[ValueParameterDescriptorImpl]

'fqName' @ [241:114] ==> public final val fqName: FqName defined in org.jetbrains.kotlin.js.PredefinedAnnotation[DeserializedPropertyDescriptor]

'isJsAnnotation' @ [245:20] ==> private final fun KtAnnotationEntry.isJsAnnotation(vararg predefinedAnnotations: PredefinedAnnotation): Boolean defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.Companion[SimpleFunctionDescriptorImpl]

'PredefinedAnnotation' @ [245:35] ==> public companion object defined in org.jetbrains.kotlin.js.PredefinedAnnotation[FakeCallableDescriptorForObject]

'NATIVE' @ [245:56] ==> enum entry NATIVE defined in org.jetbrains.kotlin.js.PredefinedAnnotation[FakeCallableDescriptorForObject]

'PredefinedAnnotation' @ [245:64] ==> public companion object defined in org.jetbrains.kotlin.js.PredefinedAnnotation[FakeCallableDescriptorForObject]

'NATIVE_GETTER' @ [245:85] ==> enum entry NATIVE_GETTER defined in org.jetbrains.kotlin.js.PredefinedAnnotation[FakeCallableDescriptorForObject]

'PredefinedAnnotation' @ [245:100] ==> public companion object defined in org.jetbrains.kotlin.js.PredefinedAnnotation[FakeCallableDescriptorForObject]

'NATIVE_SETTER' @ [245:121] ==> enum entry NATIVE_SETTER defined in org.jetbrains.kotlin.js.PredefinedAnnotation[FakeCallableDescriptorForObject]

'PredefinedAnnotation' @ [245:136] ==> public companion object defined in org.jetbrains.kotlin.js.PredefinedAnnotation[FakeCallableDescriptorForObject]

'NATIVE_INVOKE' @ [245:157] ==> enum entry NATIVE_INVOKE defined in org.jetbrains.kotlin.js.PredefinedAnnotation[FakeCallableDescriptorForObject]

'psiElement' @ [249:21] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.Companion.isMemberExtensionDeclaration[ValueParameterDescriptorImpl]

'psiElement' @ [249:54] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.Companion.isMemberExtensionDeclaration[ValueParameterDescriptorImpl]

'receiverTypeReference' @ [249:65] ==> public final val KtNamedFunction.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'psiElement' @ [250:21] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.Companion.isMemberExtensionDeclaration[ValueParameterDescriptorImpl]

'psiElement' @ [250:49] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.Companion.isMemberExtensionDeclaration[ValueParameterDescriptorImpl]

'receiverTypeReference' @ [250:60] ==> public final val KtProperty.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'psiElement' @ [254:21] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.Companion.isMemberDeclaration[ValueParameterDescriptorImpl]

'psiElement' @ [254:54] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.Companion.isMemberDeclaration[ValueParameterDescriptorImpl]

'receiverTypeReference' @ [254:65] ==> public final val KtNamedFunction.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'psiElement' @ [255:21] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.Companion.isMemberDeclaration[ValueParameterDescriptorImpl]

'psiElement' @ [255:49] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.Companion.isMemberDeclaration[ValueParameterDescriptorImpl]

'receiverTypeReference' @ [255:60] ==> public final val KtProperty.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'diagnostic' @ [259:21] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.Companion.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [259:32] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'when (diagnostic.factory) {
                ErrorsJs.WRONG_EXTERNAL_DECLARATION -> {
                    if (isMemberExtensionDeclaration(e) && e.getParentOfType<KtClassOrObject>(true) == null) {
                        return MigrateExternalExtensionFix(e as KtNamedDeclaration)
                    }
                }
                Errors.DEPRECATION_ERROR, Errors.DEPRECATION -> {
                    if (e.getParentOfType<KtAnnotationEntry>(false)?.isJsNativeAnnotation() == true) {
                        e.getParentOfType<KtNamedDeclaration>(false)?.let {
                            return MigrateExternalExtensionFix(it)
                        }
                    }
                    if ((e as? KtNamedDeclaration)?.modifierList?.annotationEntries?.any { it.isJsNativeAnnotation() } == true) {
                        return MigrateExternalExtensionFix(e as KtNamedDeclaration)
                    }
                }
            }' @ [260:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'diagnostic' @ [260:19] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.Companion.createAction[ValueParameterDescriptorImpl]

'factory' @ [260:30] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'WRONG_EXTERNAL_DECLARATION' @ [261:26] ==> public final val WRONG_EXTERNAL_DECLARATION: (DiagnosticFactory1<(KtExpression..KtExpression?), (String..String?)>..DiagnosticFactory1<(KtExpression..KtExpression?), (String..String?)>?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.ErrorsJs[JavaPropertyDescriptor]

'isMemberExtensionDeclaration' @ [262:25] ==> private final fun isMemberExtensionDeclaration(psiElement: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.Companion[SimpleFunctionDescriptorImpl]

'e' @ [262:54] ==> val e: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.Companion.createAction[LocalVariableDescriptor]

'e' @ [262:60] ==> val e: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.Companion.createAction[LocalVariableDescriptor]

'getParentOfType' @ [262:62] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtClassOrObject

'MigrateExternalExtensionFix' @ [263:32] ==> public constructor MigrateExternalExtensionFix(declaration: KtNamedDeclaration) defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix[ClassConstructorDescriptorImpl]

'e' @ [263:60] ==> val e: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.Companion.createAction[LocalVariableDescriptor]

'DEPRECATION_ERROR' @ [266:24] ==> public final val DEPRECATION_ERROR: (DiagnosticFactory2<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>..DiagnosticFactory2<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'DEPRECATION' @ [266:50] ==> public final val DEPRECATION: (DiagnosticFactory2<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>..DiagnosticFactory2<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'e' @ [267:25] ==> val e: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.Companion.createAction[LocalVariableDescriptor]

'getParentOfType' @ [267:27] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtAnnotationEntry? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtAnnotationEntry

'isJsNativeAnnotation' @ [267:70] ==> private final fun KtAnnotationEntry.isJsNativeAnnotation(): Boolean defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.Companion[SimpleFunctionDescriptorImpl]

'e' @ [268:25] ==> val e: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.Companion.createAction[LocalVariableDescriptor]

'getParentOfType' @ [268:27] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtNamedDeclaration? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtNamedDeclaration

'let' @ [268:71] ==> @InlineOnly public inline fun <T, R> KtNamedDeclaration.let(block: (KtNamedDeclaration) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration
    <R> -> Nothing

'MigrateExternalExtensionFix' @ [269:36] ==> public constructor MigrateExternalExtensionFix(declaration: KtNamedDeclaration) defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix[ClassConstructorDescriptorImpl]

'it' @ [269:64] ==> value-parameter it: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.Companion.createAction.<anonymous>[ValueParameterDescriptorImpl]

'==' @ [272:25] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'e' @ [272:26] ==> val e: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.Companion.createAction[LocalVariableDescriptor]

'modifierList' @ [272:53] ==> public final val KtNamedDeclaration.modifierList: KtModifierList?[MyPropertyDescriptor]

'annotationEntries' @ [272:67] ==> public final val KtModifierList.annotationEntries: (MutableList<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>)[MyPropertyDescriptor]

'any' @ [272:86] ==> public inline fun <T> Iterable<(KtAnnotationEntry..KtAnnotationEntry?)>.any(predicate: ((KtAnnotationEntry..KtAnnotationEntry?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtAnnotationEntry..org.jetbrains.kotlin.psi.KtAnnotationEntry?)

'it' @ [272:92] ==> value-parameter it: (KtAnnotationEntry..KtAnnotationEntry?) defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.Companion.createAction.<anonymous>[ValueParameterDescriptorImpl]

'isJsNativeAnnotation' @ [272:95] ==> private final fun KtAnnotationEntry.isJsNativeAnnotation(): Boolean defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.Companion[SimpleFunctionDescriptorImpl]

'MigrateExternalExtensionFix' @ [273:32] ==> public constructor MigrateExternalExtensionFix(declaration: KtNamedDeclaration) defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix[ClassConstructorDescriptorImpl]

'e' @ [273:60] ==> val e: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.migration.MigrateExternalExtensionFix.Companion.createAction[LocalVariableDescriptor]

