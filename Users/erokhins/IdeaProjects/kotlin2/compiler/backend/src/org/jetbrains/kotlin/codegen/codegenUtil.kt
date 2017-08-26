'if (TypeUtils.isNullableType(kotlinType)) {
        val nope = Label()
        val end = Label()

        with(v) {
            dup()

            ifnull(nope)

            TypeIntrinsics.instanceOf(this, kotlinType, asmType)

            goTo(end)

            mark(nope)
            pop()
            iconst(1)

            mark(end)
        }
    }
    else {
        TypeIntrinsics.instanceOf(v, kotlinType, asmType)
    }' @ [74:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isNullableType' @ [74:19] ==> public open fun isNullableType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'kotlinType' @ [74:34] ==> value-parameter kotlinType: KotlinType defined in org.jetbrains.kotlin.codegen.generateIsCheck[ValueParameterDescriptorImpl]

'Label' @ [75:20] ==> public constructor Label() defined in org.jetbrains.org.objectweb.asm.Label[JavaClassConstructorDescriptor]

'Label' @ [76:19] ==> public constructor Label() defined in org.jetbrains.org.objectweb.asm.Label[JavaClassConstructorDescriptor]

'with' @ [78:9] ==> @InlineOnly public inline fun <T, R> with(receiver: InstructionAdapter, block: InstructionAdapter.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> InstructionAdapter
    <R> -> Unit

'v' @ [78:14] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.generateIsCheck[ValueParameterDescriptorImpl]

'dup' @ [79:13] ==> public open fun dup(): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'ifnull' @ [81:13] ==> public open fun ifnull(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'nope' @ [81:20] ==> val nope: Label defined in org.jetbrains.kotlin.codegen.generateIsCheck[LocalVariableDescriptor]

'TypeIntrinsics' @ [83:13] ==> public object TypeIntrinsics defined in org.jetbrains.kotlin.codegen.intrinsics in file TypeIntrinsics.kt[FakeCallableDescriptorForObject]

'instanceOf' @ [83:28] ==> @JvmStatic public final fun instanceOf(v: InstructionAdapter, jetType: KotlinType, boxedAsmType: Type): Unit defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics[SimpleFunctionDescriptorImpl]

'this' @ [83:39] ==> <this> defined in org.jetbrains.kotlin.codegen.generateIsCheck.<anonymous>[ReceiverParameterDescriptorImpl]

'kotlinType' @ [83:45] ==> value-parameter kotlinType: KotlinType defined in org.jetbrains.kotlin.codegen.generateIsCheck[ValueParameterDescriptorImpl]

'asmType' @ [83:57] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.codegen.generateIsCheck[ValueParameterDescriptorImpl]

'goTo' @ [85:13] ==> public open fun goTo(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'end' @ [85:18] ==> val end: Label defined in org.jetbrains.kotlin.codegen.generateIsCheck[LocalVariableDescriptor]

'mark' @ [87:13] ==> public open fun mark(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'nope' @ [87:18] ==> val nope: Label defined in org.jetbrains.kotlin.codegen.generateIsCheck[LocalVariableDescriptor]

'pop' @ [88:13] ==> public open fun pop(): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'iconst' @ [89:13] ==> public open fun iconst(p0: Int): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'mark' @ [91:13] ==> public open fun mark(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'end' @ [91:18] ==> val end: Label defined in org.jetbrains.kotlin.codegen.generateIsCheck[LocalVariableDescriptor]

'TypeIntrinsics' @ [95:9] ==> public object TypeIntrinsics defined in org.jetbrains.kotlin.codegen.intrinsics in file TypeIntrinsics.kt[FakeCallableDescriptorForObject]

'instanceOf' @ [95:24] ==> @JvmStatic public final fun instanceOf(v: InstructionAdapter, jetType: KotlinType, boxedAsmType: Type): Unit defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics[SimpleFunctionDescriptorImpl]

'v' @ [95:35] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.generateIsCheck[ValueParameterDescriptorImpl]

'kotlinType' @ [95:38] ==> value-parameter kotlinType: KotlinType defined in org.jetbrains.kotlin.codegen.generateIsCheck[ValueParameterDescriptorImpl]

'asmType' @ [95:50] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.codegen.generateIsCheck[ValueParameterDescriptorImpl]

'if (!isSafe) {
        if (!TypeUtils.isNullableType(kotlinType)) {
            generateNullCheckForNonSafeAs(v, kotlinType)
        }
    }
    else {
        with(v) {
            dup()
            TypeIntrinsics.instanceOf(v, kotlinType, asmType)
            val ok = Label()
            ifne(ok)
            pop()
            aconst(null)
            mark(ok)
        }
    }' @ [105:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [105:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isSafe' @ [105:10] ==> value-parameter isSafe: Boolean defined in org.jetbrains.kotlin.codegen.generateAsCast[ValueParameterDescriptorImpl]

'!' @ [106:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isNullableType' @ [106:24] ==> public open fun isNullableType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'kotlinType' @ [106:39] ==> value-parameter kotlinType: KotlinType defined in org.jetbrains.kotlin.codegen.generateAsCast[ValueParameterDescriptorImpl]

'generateNullCheckForNonSafeAs' @ [107:13] ==> private fun generateNullCheckForNonSafeAs(v: InstructionAdapter, type: KotlinType): Unit defined in org.jetbrains.kotlin.codegen in file codegenUtil.kt[SimpleFunctionDescriptorImpl]

'v' @ [107:43] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.generateAsCast[ValueParameterDescriptorImpl]

'kotlinType' @ [107:46] ==> value-parameter kotlinType: KotlinType defined in org.jetbrains.kotlin.codegen.generateAsCast[ValueParameterDescriptorImpl]

'with' @ [111:9] ==> @InlineOnly public inline fun <T, R> with(receiver: InstructionAdapter, block: InstructionAdapter.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> InstructionAdapter
    <R> -> Unit

'v' @ [111:14] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.generateAsCast[ValueParameterDescriptorImpl]

'dup' @ [112:13] ==> public open fun dup(): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'TypeIntrinsics' @ [113:13] ==> public object TypeIntrinsics defined in org.jetbrains.kotlin.codegen.intrinsics in file TypeIntrinsics.kt[FakeCallableDescriptorForObject]

'instanceOf' @ [113:28] ==> @JvmStatic public final fun instanceOf(v: InstructionAdapter, jetType: KotlinType, boxedAsmType: Type): Unit defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics[SimpleFunctionDescriptorImpl]

'v' @ [113:39] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.generateAsCast[ValueParameterDescriptorImpl]

'kotlinType' @ [113:42] ==> value-parameter kotlinType: KotlinType defined in org.jetbrains.kotlin.codegen.generateAsCast[ValueParameterDescriptorImpl]

'asmType' @ [113:54] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.codegen.generateAsCast[ValueParameterDescriptorImpl]

'Label' @ [114:22] ==> public constructor Label() defined in org.jetbrains.org.objectweb.asm.Label[JavaClassConstructorDescriptor]

'ifne' @ [115:13] ==> public open fun ifne(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'ok' @ [115:18] ==> val ok: Label defined in org.jetbrains.kotlin.codegen.generateAsCast.<anonymous>[LocalVariableDescriptor]

'pop' @ [116:13] ==> public open fun pop(): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'aconst' @ [117:13] ==> public open fun aconst(p0: (Any..Any?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'mark' @ [118:13] ==> public open fun mark(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'ok' @ [118:18] ==> val ok: Label defined in org.jetbrains.kotlin.codegen.generateAsCast.<anonymous>[LocalVariableDescriptor]

'TypeIntrinsics' @ [122:5] ==> public object TypeIntrinsics defined in org.jetbrains.kotlin.codegen.intrinsics in file TypeIntrinsics.kt[FakeCallableDescriptorForObject]

'checkcast' @ [122:20] ==> @JvmStatic public final fun checkcast(v: InstructionAdapter, kotlinType: KotlinType, asmType: Type, safe: Boolean): Unit defined in org.jetbrains.kotlin.codegen.intrinsics.TypeIntrinsics[SimpleFunctionDescriptorImpl]

'v' @ [122:30] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.generateAsCast[ValueParameterDescriptorImpl]

'kotlinType' @ [122:33] ==> value-parameter kotlinType: KotlinType defined in org.jetbrains.kotlin.codegen.generateAsCast[ValueParameterDescriptorImpl]

'asmType' @ [122:45] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.codegen.generateAsCast[ValueParameterDescriptorImpl]

'isSafe' @ [122:54] ==> value-parameter isSafe: Boolean defined in org.jetbrains.kotlin.codegen.generateAsCast[ValueParameterDescriptorImpl]

'with' @ [129:5] ==> @InlineOnly public inline fun <T, R> with(receiver: InstructionAdapter, block: InstructionAdapter.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> InstructionAdapter
    <R> -> Unit

'v' @ [129:10] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.generateNullCheckForNonSafeAs[ValueParameterDescriptorImpl]

'dup' @ [130:9] ==> public open fun dup(): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'Label' @ [131:23] ==> public constructor Label() defined in org.jetbrains.org.objectweb.asm.Label[JavaClassConstructorDescriptor]

'ifnonnull' @ [132:9] ==> public open fun ifnonnull(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'nonnull' @ [132:19] ==> val nonnull: Label defined in org.jetbrains.kotlin.codegen.generateNullCheckForNonSafeAs.<anonymous>[LocalVariableDescriptor]

'genThrow' @ [133:17] ==> public open fun genThrow(@NotNull v: InstructionAdapter, @NotNull exception: String, @Nullable message: String?): Unit defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'v' @ [133:26] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.generateNullCheckForNonSafeAs[ValueParameterDescriptorImpl]

'+' @ [133:57] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'DescriptorRenderer' @ [133:99] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'FQ_NAMES_IN_TYPES' @ [133:118] ==> @field:JvmField public final val FQ_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'renderType' @ [133:136] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'type' @ [133:147] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.codegen.generateNullCheckForNonSafeAs[ValueParameterDescriptorImpl]

'mark' @ [134:9] ==> public open fun mark(p0: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'nonnull' @ [134:14] ==> val nonnull: Label defined in org.jetbrains.kotlin.codegen.generateNullCheckForNonSafeAs.<anonymous>[LocalVariableDescriptor]

'valueParametersSignature' @ [139:11] ==> public final val valueParametersSignature: String? defined in org.jetbrains.kotlin.load.java.BuiltinMethodsWithSpecialGenericSignature.SpecialSignatureInfo[DeserializedPropertyDescriptor]

'let' @ [139:37] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> String?): String? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String?

'sourceSignature' @ [139:43] ==> value-parameter sourceSignature: String? defined in org.jetbrains.kotlin.codegen.replaceValueParametersIn[ValueParameterDescriptorImpl]

'replace' @ [139:60] ==> @InlineOnly public inline fun CharSequence.replace(regex: Regex, replacement: String): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toRegex' @ [139:80] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [139:94] ==> value-parameter it: String defined in org.jetbrains.kotlin.codegen.replaceValueParametersIn.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [142:22] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.codegen.populateCompanionBackingFieldNamesToOuterContextIfNeeded[ValueParameterDescriptorImpl]

'bindingContext' @ [142:28] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'get' @ [142:43] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>?), p1: (PsiElement..PsiElement?)): ClassDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> ClassDescriptor

'CLASS' @ [142:62] ==> public final val CLASS: (WritableSlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'companion' @ [142:69] ==> value-parameter companion: KtObjectDeclaration defined in org.jetbrains.kotlin.codegen.populateCompanionBackingFieldNamesToOuterContextIfNeeded[ValueParameterDescriptorImpl]

'descriptor' @ [144:9] ==> val descriptor: ClassDescriptor? defined in org.jetbrains.kotlin.codegen.populateCompanionBackingFieldNamesToOuterContextIfNeeded[LocalVariableDescriptor]

'isError' @ [144:42] ==> public open fun isError(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'descriptor' @ [144:50] ==> val descriptor: ClassDescriptor? defined in org.jetbrains.kotlin.codegen.populateCompanionBackingFieldNamesToOuterContextIfNeeded[LocalVariableDescriptor]

'!' @ [148:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isCompanionObjectWithBackingFieldsInOuter' @ [148:17] ==> public open fun isCompanionObjectWithBackingFieldsInOuter(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaMethodDescriptor]

'descriptor' @ [148:59] ==> val descriptor: ClassDescriptor? defined in org.jetbrains.kotlin.codegen.populateCompanionBackingFieldNamesToOuterContextIfNeeded[LocalVariableDescriptor]

'companion' @ [151:22] ==> value-parameter companion: KtObjectDeclaration defined in org.jetbrains.kotlin.codegen.populateCompanionBackingFieldNamesToOuterContextIfNeeded[ValueParameterDescriptorImpl]

'declarations' @ [151:32] ==> public final val KtObjectDeclaration.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'filterIsInstance' @ [151:45] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<KtProperty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtProperty

'properties' @ [153:5] ==> val properties: List<KtProperty> defined in org.jetbrains.kotlin.codegen.populateCompanionBackingFieldNamesToOuterContextIfNeeded[LocalVariableDescriptor]

'forEach' @ [153:16] ==> @HidesMembers public inline fun <T> Iterable<KtProperty>.forEach(action: (KtProperty) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtProperty

'state' @ [154:34] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.codegen.populateCompanionBackingFieldNamesToOuterContextIfNeeded[ValueParameterDescriptorImpl]

'bindingContext' @ [154:40] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'get' @ [154:55] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(PsiElement..PsiElement?), (VariableDescriptor..VariableDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (VariableDescriptor..VariableDescriptor?)>?), p1: (PsiElement..PsiElement?)): VariableDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> VariableDescriptor

'VARIABLE' @ [154:74] ==> public final val VARIABLE: (WritableSlice<(PsiElement..PsiElement?), (VariableDescriptor..VariableDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (VariableDescriptor..VariableDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [154:84] ==> value-parameter it: KtProperty defined in org.jetbrains.kotlin.codegen.populateCompanionBackingFieldNamesToOuterContextIfNeeded.<anonymous>[ValueParameterDescriptorImpl]

'variableDescriptor' @ [155:13] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.codegen.populateCompanionBackingFieldNamesToOuterContextIfNeeded.<anonymous>[LocalVariableDescriptor]

'outerContext' @ [156:13] ==> value-parameter outerContext: FieldOwnerContext<*> defined in org.jetbrains.kotlin.codegen.populateCompanionBackingFieldNamesToOuterContextIfNeeded[ValueParameterDescriptorImpl]

'getFieldName' @ [156:26] ==> @NotNull public open fun getFieldName(@NotNull possiblySubstitutedDescriptor: PropertyDescriptor, isDelegated: Boolean): String defined in org.jetbrains.kotlin.codegen.context.FieldOwnerContext[JavaMethodDescriptor]

'variableDescriptor' @ [156:39] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.codegen.populateCompanionBackingFieldNamesToOuterContextIfNeeded.<anonymous>[LocalVariableDescriptor]

'it' @ [156:59] ==> value-parameter it: KtProperty defined in org.jetbrains.kotlin.codegen.populateCompanionBackingFieldNamesToOuterContextIfNeeded.<anonymous>[ValueParameterDescriptorImpl]

'hasDelegate' @ [156:62] ==> public open fun hasDelegate(): Boolean defined in org.jetbrains.kotlin.psi.KtProperty[JavaMethodDescriptor]

'supertypes' @ [164:9] ==> value-parameter supertypes: List<ClassDescriptor> defined in org.jetbrains.kotlin.codegen.mapSupertypesNames[ValueParameterDescriptorImpl]

'map' @ [164:20] ==> public inline fun <T, R> Iterable<ClassDescriptor>.map(transform: (ClassDescriptor) -> (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor
    <R> -> (kotlin.String..kotlin.String?)

'typeMapper' @ [164:26] ==> value-parameter typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.codegen.mapSupertypesNames[ValueParameterDescriptorImpl]

'mapSupertype' @ [164:37] ==> @NotNull public open fun mapSupertype(@NotNull jetType: KotlinType, @Nullable signatureVisitor: JvmSignatureWriter?): Type defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'it' @ [164:50] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.codegen.mapSupertypesNames.<anonymous>[ValueParameterDescriptorImpl]

'defaultType' @ [164:53] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'signatureVisitor' @ [164:66] ==> value-parameter signatureVisitor: JvmSignatureWriter? defined in org.jetbrains.kotlin.codegen.mapSupertypesNames[ValueParameterDescriptorImpl]

'internalName' @ [164:84] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'toTypedArray' @ [164:99] ==> public inline fun <reified T> Collection<String>.toTypedArray(): Array<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String

'isSealedClass' @ [175:29] ==> public open fun isSealedClass(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [175:43] ==> value-parameter descriptor: ClassDescriptor? defined in org.jetbrains.kotlin.codegen.sortTopLevelClassesAndPrepareContextForSealedClasses.prepareContextIfNeeded[ValueParameterDescriptorImpl]

'packagePartContext' @ [177:13] ==> value-parameter packagePartContext: PackageContext defined in org.jetbrains.kotlin.codegen.sortTopLevelClassesAndPrepareContextForSealedClasses[ValueParameterDescriptorImpl]

'intoClass' @ [177:32] ==> @NotNull public open fun intoClass(@NotNull descriptor: ClassDescriptor, @NotNull kind: OwnerKind, @NotNull state: GenerationState): ClassContext defined in org.jetbrains.kotlin.codegen.context.PackageContext[JavaMethodDescriptor]

'descriptor' @ [177:42] ==> value-parameter descriptor: ClassDescriptor? defined in org.jetbrains.kotlin.codegen.sortTopLevelClassesAndPrepareContextForSealedClasses.prepareContextIfNeeded[ValueParameterDescriptorImpl]

'OwnerKind' @ [177:56] ==> public companion object defined in org.jetbrains.kotlin.codegen.OwnerKind[FakeCallableDescriptorForObject]

'IMPLEMENTATION' @ [177:66] ==> enum entry IMPLEMENTATION defined in org.jetbrains.kotlin.codegen.OwnerKind[FakeCallableDescriptorForObject]

'state' @ [177:82] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.codegen.sortTopLevelClassesAndPrepareContextForSealedClasses[ValueParameterDescriptorImpl]

'when (classOrObjects.size) {
        0 -> return emptyList()
        1 -> {
            prepareContextIfNeeded(state.bindingContext.get(BindingContext.CLASS, classOrObjects.first()))
            return classOrObjects
        }
    }' @ [182:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'classOrObjects' @ [182:11] ==> value-parameter classOrObjects: List<KtClassOrObject> defined in org.jetbrains.kotlin.codegen.sortTopLevelClassesAndPrepareContextForSealedClasses[ValueParameterDescriptorImpl]

'size' @ [182:26] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'emptyList' @ [183:21] ==> public fun <T> emptyList(): List<KtClassOrObject> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClassOrObject

'prepareContextIfNeeded' @ [185:13] ==> local final fun prepareContextIfNeeded(descriptor: ClassDescriptor?): Unit defined in org.jetbrains.kotlin.codegen.sortTopLevelClassesAndPrepareContextForSealedClasses[SimpleFunctionDescriptorImpl]

'state' @ [185:36] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.codegen.sortTopLevelClassesAndPrepareContextForSealedClasses[ValueParameterDescriptorImpl]

'bindingContext' @ [185:42] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'get' @ [185:57] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>?), p1: (PsiElement..PsiElement?)): ClassDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> ClassDescriptor

'CLASS' @ [185:76] ==> public final val CLASS: (WritableSlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'classOrObjects' @ [185:83] ==> value-parameter classOrObjects: List<KtClassOrObject> defined in org.jetbrains.kotlin.codegen.sortTopLevelClassesAndPrepareContextForSealedClasses[ValueParameterDescriptorImpl]

'first' @ [185:98] ==> public fun <T> List<KtClassOrObject>.first(): KtClassOrObject defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClassOrObject

'classOrObjects' @ [186:20] ==> value-parameter classOrObjects: List<KtClassOrObject> defined in org.jetbrains.kotlin.codegen.sortTopLevelClassesAndPrepareContextForSealedClasses[ValueParameterDescriptorImpl]

'ArrayList' @ [190:18] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtClassOrObject

'classOrObjects' @ [190:45] ==> value-parameter classOrObjects: List<KtClassOrObject> defined in org.jetbrains.kotlin.codegen.sortTopLevelClassesAndPrepareContextForSealedClasses[ValueParameterDescriptorImpl]

'size' @ [190:60] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'LinkedHashMap' @ [191:27] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ClassDescriptor
    <V : (Any..Any?)> -> KtClassOrObject

'classOrObjects' @ [192:27] ==> value-parameter classOrObjects: List<KtClassOrObject> defined in org.jetbrains.kotlin.codegen.sortTopLevelClassesAndPrepareContextForSealedClasses[ValueParameterDescriptorImpl]

'state' @ [193:26] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.codegen.sortTopLevelClassesAndPrepareContextForSealedClasses[ValueParameterDescriptorImpl]

'bindingContext' @ [193:32] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'get' @ [193:47] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>?), p1: (PsiElement..PsiElement?)): ClassDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiElement
    <V : (Any..Any?)> -> ClassDescriptor

'CLASS' @ [193:66] ==> public final val CLASS: (WritableSlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (ClassDescriptor..ClassDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'classOrObject' @ [193:73] ==> val classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.codegen.sortTopLevelClassesAndPrepareContextForSealedClasses[LocalVariableDescriptor]

'if (descriptor == null) {
            result.add(classOrObject)
        }
        else {
            prepareContextIfNeeded(descriptor)
            descriptorToPsi[descriptor] = classOrObject
        }' @ [194:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'descriptor' @ [194:13] ==> val descriptor: ClassDescriptor? defined in org.jetbrains.kotlin.codegen.sortTopLevelClassesAndPrepareContextForSealedClasses[LocalVariableDescriptor]

'result' @ [195:13] ==> val result: ArrayList<KtClassOrObject> defined in org.jetbrains.kotlin.codegen.sortTopLevelClassesAndPrepareContextForSealedClasses[LocalVariableDescriptor]

'add' @ [195:20] ==> public open fun add(element: KtClassOrObject): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'classOrObject' @ [195:24] ==> val classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.codegen.sortTopLevelClassesAndPrepareContextForSealedClasses[LocalVariableDescriptor]

'prepareContextIfNeeded' @ [198:13] ==> local final fun prepareContextIfNeeded(descriptor: ClassDescriptor?): Unit defined in org.jetbrains.kotlin.codegen.sortTopLevelClassesAndPrepareContextForSealedClasses[SimpleFunctionDescriptorImpl]

'descriptor' @ [198:36] ==> val descriptor: ClassDescriptor? defined in org.jetbrains.kotlin.codegen.sortTopLevelClassesAndPrepareContextForSealedClasses[LocalVariableDescriptor]

'descriptorToPsi' @ [199:13] ==> val descriptorToPsi: LinkedHashMap<ClassDescriptor, KtClassOrObject> defined in org.jetbrains.kotlin.codegen.sortTopLevelClassesAndPrepareContextForSealedClasses[LocalVariableDescriptor]

'descriptor' @ [199:29] ==> val descriptor: ClassDescriptor? defined in org.jetbrains.kotlin.codegen.sortTopLevelClassesAndPrepareContextForSealedClasses[LocalVariableDescriptor]

'classOrObject' @ [199:43] ==> val classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.codegen.sortTopLevelClassesAndPrepareContextForSealedClasses[LocalVariableDescriptor]

'topologicalOrder' @ [204:33] ==> public final fun <N : (Any..Any?)> topologicalOrder(@NotNull p0: (MutableIterable<(ClassDescriptor..ClassDescriptor?)>..Iterable<(ClassDescriptor..ClassDescriptor?)>), @NotNull p1: ((ClassDescriptor..ClassDescriptor?)) -> (MutableIterable<(ClassDescriptor..ClassDescriptor?)>..Iterable<(ClassDescriptor..ClassDescriptor?)>)): (MutableList<(ClassDescriptor..ClassDescriptor?)>..List<(ClassDescriptor..ClassDescriptor?)>?) defined in org.jetbrains.kotlin.utils.DFS[SamAdapterFunctionDescriptor]
Inferred types:
    <N : (Any..Any?)> -> ClassDescriptor

'descriptorToPsi' @ [204:50] ==> val descriptorToPsi: LinkedHashMap<ClassDescriptor, KtClassOrObject> defined in org.jetbrains.kotlin.codegen.sortTopLevelClassesAndPrepareContextForSealedClasses[LocalVariableDescriptor]

'keys' @ [204:66] ==> public open val keys: MutableSet<ClassDescriptor> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'reversed' @ [204:71] ==> public fun <T> Iterable<ClassDescriptor>.reversed(): List<ClassDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor

'it' @ [205:9] ==> value-parameter it: (ClassDescriptor..ClassDescriptor?) defined in org.jetbrains.kotlin.codegen.sortTopLevelClassesAndPrepareContextForSealedClasses.<anonymous>[ValueParameterDescriptorImpl]

'typeConstructor' @ [205:12] ==> public final val ClassDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'supertypes' @ [205:28] ==> public final val TypeConstructor.supertypes: Collection<(KotlinType..KotlinType?)>[MyPropertyDescriptor]

'map' @ [205:39] ==> public inline fun <T, R> Iterable<(KotlinType..KotlinType?)>.map(transform: ((KotlinType..KotlinType?)) -> ClassDescriptor?): List<ClassDescriptor?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)
    <R> -> ClassDescriptor?

'it' @ [205:45] ==> value-parameter it: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.codegen.sortTopLevelClassesAndPrepareContextForSealedClasses.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'constructor' @ [205:48] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [205:60] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'filter' @ [205:104] ==> public inline fun <T> Iterable<ClassDescriptor?>.filter(predicate: (ClassDescriptor?) -> Boolean): List<ClassDescriptor?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor?

'it' @ [205:113] ==> value-parameter it: ClassDescriptor? defined in org.jetbrains.kotlin.codegen.sortTopLevelClassesAndPrepareContextForSealedClasses.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'descriptorToPsi' @ [205:119] ==> val descriptorToPsi: LinkedHashMap<ClassDescriptor, KtClassOrObject> defined in org.jetbrains.kotlin.codegen.sortTopLevelClassesAndPrepareContextForSealedClasses[LocalVariableDescriptor]

'keys' @ [205:135] ==> public open val keys: MutableSet<ClassDescriptor> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'sortedDescriptors' @ [207:5] ==> val sortedDescriptors: (MutableList<(ClassDescriptor..ClassDescriptor?)>..List<(ClassDescriptor..ClassDescriptor?)>?) defined in org.jetbrains.kotlin.codegen.sortTopLevelClassesAndPrepareContextForSealedClasses[LocalVariableDescriptor]

'mapTo' @ [207:23] ==> public inline fun <T, R, C : MutableCollection<in KtClassOrObject>> Iterable<(ClassDescriptor..ClassDescriptor?)>.mapTo(destination: ArrayList<KtClassOrObject>, transform: ((ClassDescriptor..ClassDescriptor?)) -> KtClassOrObject): ArrayList<KtClassOrObject> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ClassDescriptor..org.jetbrains.kotlin.descriptors.ClassDescriptor?)
    <R> -> KtClassOrObject
    <C : MutableCollection<in R>> -> ArrayList<KtClassOrObject>

'result' @ [207:29] ==> val result: ArrayList<KtClassOrObject> defined in org.jetbrains.kotlin.codegen.sortTopLevelClassesAndPrepareContextForSealedClasses[LocalVariableDescriptor]

'descriptorToPsi' @ [207:39] ==> val descriptorToPsi: LinkedHashMap<ClassDescriptor, KtClassOrObject> defined in org.jetbrains.kotlin.codegen.sortTopLevelClassesAndPrepareContextForSealedClasses[LocalVariableDescriptor]

'it' @ [207:55] ==> value-parameter it: (ClassDescriptor..ClassDescriptor?) defined in org.jetbrains.kotlin.codegen.sortTopLevelClassesAndPrepareContextForSealedClasses.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [208:12] ==> val result: ArrayList<KtClassOrObject> defined in org.jetbrains.kotlin.codegen.sortTopLevelClassesAndPrepareContextForSealedClasses[LocalVariableDescriptor]

'this' @ [212:9] ==> <this> defined in org.jetbrains.kotlin.codegen.isDefinitelyNotDefaultImplsMethod[ReceiverParameterDescriptorImpl]

'this' @ [212:49] ==> <this> defined in org.jetbrains.kotlin.codegen.isDefinitelyNotDefaultImplsMethod[ReceiverParameterDescriptorImpl]

'annotations' @ [212:54] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor[DeserializedPropertyDescriptor]

'hasAnnotation' @ [212:66] ==> public open fun hasAnnotation(fqName: FqName): Boolean defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[DeserializedSimpleFunctionDescriptor]

'PLATFORM_DEPENDENT_ANNOTATION_FQ_NAME' @ [212:80] ==> public val PLATFORM_DEPENDENT_ANNOTATION_FQ_NAME: FqName defined in org.jetbrains.kotlin.descriptors.deserialization[DeserializedPropertyDescriptor]

'this' @ [224:14] ==> <this> defined in org.jetbrains.kotlin.codegen.generateMethod[ReceiverParameterDescriptorImpl]

'newMethod' @ [224:19] ==> @NotNull public abstract fun newMethod(@NotNull origin: JvmDeclarationOrigin, access: Int, @NotNull name: String, @NotNull desc: String, @Nullable signature: String?, @Nullable exceptions: (Array<(String..String?)>?..Array<out (String..String?)>?)): MethodVisitor defined in org.jetbrains.kotlin.codegen.ClassBuilder[JavaMethodDescriptor]

'origin' @ [224:29] ==> value-parameter origin: JvmDeclarationOrigin defined in org.jetbrains.kotlin.codegen.generateMethod[ValueParameterDescriptorImpl]

'access' @ [224:37] ==> value-parameter access: Int defined in org.jetbrains.kotlin.codegen.generateMethod[ValueParameterDescriptorImpl]

'method' @ [224:45] ==> value-parameter method: Method defined in org.jetbrains.kotlin.codegen.generateMethod[ValueParameterDescriptorImpl]

'name' @ [224:52] ==> public final val Method.name: (String..String?)[MyPropertyDescriptor]

'method' @ [224:58] ==> value-parameter method: Method defined in org.jetbrains.kotlin.codegen.generateMethod[ValueParameterDescriptorImpl]

'descriptor' @ [224:65] ==> public final val Method.descriptor: (String..String?)[MyPropertyDescriptor]

'state' @ [226:9] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.codegen.generateMethod[ValueParameterDescriptorImpl]

'classBuilderMode' @ [226:15] ==> public final val classBuilderMode: ClassBuilderMode defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'generateBodies' @ [226:32] ==> public final val generateBodies: Boolean defined in org.jetbrains.kotlin.codegen.ClassBuilderMode[JavaPropertyDescriptor]

'InstructionAdapter' @ [227:18] ==> public constructor InstructionAdapter(p0: (MethodVisitor..MethodVisitor?)) defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaClassConstructorDescriptor]

'mv' @ [227:37] ==> val mv: MethodVisitor defined in org.jetbrains.kotlin.codegen.generateMethod[LocalVariableDescriptor]

'iv' @ [228:9] ==> val iv: InstructionAdapter defined in org.jetbrains.kotlin.codegen.generateMethod[LocalVariableDescriptor]

'visitCode' @ [228:12] ==> public open fun visitCode(): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'iv' @ [229:9] ==> val iv: InstructionAdapter defined in org.jetbrains.kotlin.codegen.generateMethod[LocalVariableDescriptor]

'invoke' @ [229:12] ==> public abstract operator fun InstructionAdapter.invoke(): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'iv' @ [230:9] ==> val iv: InstructionAdapter defined in org.jetbrains.kotlin.codegen.generateMethod[LocalVariableDescriptor]

'areturn' @ [230:12] ==> public open fun areturn(p0: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'method' @ [230:20] ==> value-parameter method: Method defined in org.jetbrains.kotlin.codegen.generateMethod[ValueParameterDescriptorImpl]

'returnType' @ [230:27] ==> public final val Method.returnType: (Type..Type?)[MyPropertyDescriptor]

'endVisit' @ [231:25] ==> public open fun endVisit(mv: (MethodVisitor..MethodVisitor?), @Nullable description: String?, @Nullable method: PsiElement?): Unit defined in org.jetbrains.kotlin.codegen.FunctionCodegen[JavaMethodDescriptor]

'mv' @ [231:34] ==> val mv: MethodVisitor defined in org.jetbrains.kotlin.codegen.generateMethod[LocalVariableDescriptor]

'debugString' @ [231:38] ==> value-parameter debugString: String defined in org.jetbrains.kotlin.codegen.generateMethod[ValueParameterDescriptorImpl]

'element' @ [231:51] ==> value-parameter element: PsiElement? defined in org.jetbrains.kotlin.codegen.generateMethod[ValueParameterDescriptorImpl]

'!' @ [239:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'restrictedInheritance' @ [239:10] ==> value-parameter restrictedInheritance: List<FunctionDescriptor> defined in org.jetbrains.kotlin.codegen.reportTarget6InheritanceErrorIfNeeded[ValueParameterDescriptorImpl]

'isEmpty' @ [239:32] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'restrictedInheritance' @ [240:23] ==> value-parameter restrictedInheritance: List<FunctionDescriptor> defined in org.jetbrains.kotlin.codegen.reportTarget6InheritanceErrorIfNeeded[ValueParameterDescriptorImpl]

'groupBy' @ [240:45] ==> public inline fun <T, K> Iterable<FunctionDescriptor>.groupBy(keySelector: (FunctionDescriptor) -> ClassDescriptor): Map<ClassDescriptor, List<FunctionDescriptor>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor
    <K> -> ClassDescriptor

'descriptor' @ [240:69] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.reportTarget6InheritanceErrorIfNeeded.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [240:80] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'component1' @ [242:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<ClassDescriptor, List<FunctionDescriptor>>.component1(): ClassDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ClassDescriptor
    <V> -> List<FunctionDescriptor>

'component2' @ [242:20] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<ClassDescriptor, List<FunctionDescriptor>>.component2(): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ClassDescriptor
    <V> -> List<FunctionDescriptor>

'groupBy' @ [242:30] ==> val groupBy: Map<ClassDescriptor, List<FunctionDescriptor>> defined in org.jetbrains.kotlin.codegen.reportTarget6InheritanceErrorIfNeeded[LocalVariableDescriptor]

'state' @ [243:13] ==> value-parameter state: GenerationState defined in org.jetbrains.kotlin.codegen.reportTarget6InheritanceErrorIfNeeded[ValueParameterDescriptorImpl]

'diagnostics' @ [243:19] ==> public final val diagnostics: DiagnosticSink defined in org.jetbrains.kotlin.codegen.state.GenerationState[PropertyDescriptorImpl]

'report' @ [243:31] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'TARGET6_INTERFACE_INHERITANCE' @ [244:31] ==> public final val TARGET6_INTERFACE_INHERITANCE: (DiagnosticFactory3<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>..DiagnosticFactory3<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?), (DeclarationDescriptor..DeclarationDescriptor?), (String..String?)>?) defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.ErrorsJvm[JavaPropertyDescriptor]

'on' @ [244:61] ==> @NotNull public open fun on(@NotNull p0: PsiElement, @NotNull p1: DeclarationDescriptor, @NotNull p2: DeclarationDescriptor, @NotNull p3: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory3[JavaMethodDescriptor]

'classElement' @ [245:29] ==> value-parameter classElement: PsiElement defined in org.jetbrains.kotlin.codegen.reportTarget6InheritanceErrorIfNeeded[ValueParameterDescriptorImpl]

'classDescriptor' @ [245:43] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.codegen.reportTarget6InheritanceErrorIfNeeded[ValueParameterDescriptorImpl]

'key' @ [245:60] ==> val key: ClassDescriptor defined in org.jetbrains.kotlin.codegen.reportTarget6InheritanceErrorIfNeeded[LocalVariableDescriptor]

'value' @ [246:29] ==> val value: List<FunctionDescriptor> defined in org.jetbrains.kotlin.codegen.reportTarget6InheritanceErrorIfNeeded[LocalVariableDescriptor]

'joinToString' @ [246:35] ==> public fun <T> Iterable<FunctionDescriptor>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((FunctionDescriptor) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'Renderers' @ [247:33] ==> public object Renderers defined in org.jetbrains.kotlin.diagnostics.rendering[FakeCallableDescriptorForObject]

'COMPACT' @ [247:43] ==> @field:JvmField public final val COMPACT: SmartDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[DeserializedPropertyDescriptor]

'render' @ [247:51] ==> public open fun render(obj: DeclarationDescriptor, renderingContext: RenderingContext): String defined in org.jetbrains.kotlin.diagnostics.rendering.SmartDescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'getDirectMember' @ [247:73] ==> @NotNull public open fun getDirectMember(@NotNull descriptor: CallableMemberDescriptor): CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.JvmCodegenUtil[JavaMethodDescriptor]

'it' @ [247:89] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.reportTarget6InheritanceErrorIfNeeded.<anonymous>[ValueParameterDescriptorImpl]

'RenderingContext' @ [247:94] ==> public companion object defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext[FakeCallableDescriptorForObject]

'Empty' @ [247:111] ==> public object Empty : RenderingContext defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext[FakeCallableDescriptorForObject]

'isJvmStaticIn' @ [256:9] ==> private fun CallableDescriptor.isJvmStaticIn(predicate: (DeclarationDescriptor) -> Boolean): Boolean defined in org.jetbrains.kotlin.codegen[SimpleFunctionDescriptorImpl]

'isNonCompanionObject' @ [257:29] ==> public open fun isNonCompanionObject(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'it' @ [257:50] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.codegen.isJvmStaticInObjectOrClass.<anonymous>[ValueParameterDescriptorImpl]

'isClassOrEnumClass' @ [260:29] ==> public open fun isClassOrEnumClass(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'it' @ [260:48] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.codegen.isJvmStaticInObjectOrClass.<anonymous>[ValueParameterDescriptorImpl]

'isJvmStaticIn' @ [264:9] ==> private fun CallableDescriptor.isJvmStaticIn(predicate: (DeclarationDescriptor) -> Boolean): Boolean defined in org.jetbrains.kotlin.codegen[SimpleFunctionDescriptorImpl]

'isCompanionObject' @ [264:41] ==> public open fun isCompanionObject(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'it' @ [264:59] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.codegen.isJvmStaticInCompanionObject.<anonymous>[ValueParameterDescriptorImpl]

'when (this) {
            is PropertyAccessorDescriptor -> {
                val propertyDescriptor = correspondingProperty
                predicate(propertyDescriptor.containingDeclaration) &&
                (hasJvmStaticAnnotation() || propertyDescriptor.hasJvmStaticAnnotation())
            }
            else -> predicate(containingDeclaration) && hasJvmStaticAnnotation()
        }' @ [267:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'this' @ [267:15] ==> <this> defined in org.jetbrains.kotlin.codegen.isJvmStaticIn[ReceiverParameterDescriptorImpl]

'correspondingProperty' @ [269:42] ==> public final val PropertyAccessorDescriptor.correspondingProperty: PropertyDescriptor[MyPropertyDescriptor]

'invoke' @ [270:17] ==> public abstract operator fun invoke(p1: DeclarationDescriptor): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'propertyDescriptor' @ [270:27] ==> val propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.codegen.isJvmStaticIn[LocalVariableDescriptor]

'containingDeclaration' @ [270:46] ==> public final val PropertyDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'hasJvmStaticAnnotation' @ [271:18] ==> public fun DeclarationDescriptor.hasJvmStaticAnnotation(): Boolean defined in org.jetbrains.kotlin.resolve.annotations[DeserializedSimpleFunctionDescriptor]

'propertyDescriptor' @ [271:46] ==> val propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.codegen.isJvmStaticIn[LocalVariableDescriptor]

'hasJvmStaticAnnotation' @ [271:65] ==> public fun DeclarationDescriptor.hasJvmStaticAnnotation(): Boolean defined in org.jetbrains.kotlin.resolve.annotations[DeserializedSimpleFunctionDescriptor]

'invoke' @ [273:21] ==> public abstract operator fun invoke(p1: DeclarationDescriptor): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'containingDeclaration' @ [273:31] ==> public final val CallableDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'hasJvmStaticAnnotation' @ [273:57] ==> public fun DeclarationDescriptor.hasJvmStaticAnnotation(): Boolean defined in org.jetbrains.kotlin.resolve.annotations[DeserializedSimpleFunctionDescriptor]

'filterNot' @ [276:77] ==> public inline fun <T> Iterable<VariableDescriptor>.filterNot(predicate: (VariableDescriptor) -> Boolean): List<VariableDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariableDescriptor

'it' @ [276:89] ==> value-parameter it: VariableDescriptor defined in org.jetbrains.kotlin.codegen.filterOutDescriptorsWithSpecialNames.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [276:92] ==> public final val VariableDescriptor.name: Name[MyPropertyDescriptor]

'isSpecial' @ [276:97] ==> public final val Name.isSpecial: Boolean[MyPropertyDescriptor]

'JvmField' @ [279:26] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'JvmField' @ [279:52] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'expression' @ [282:18] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.codegen.calcTypeForIEEE754ArithmeticIfNeeded[ValueParameterDescriptorImpl]

'kotlinType' @ [282:29] ==> public fun KtExpression?.kotlinType(bindingContext: BindingContext): KotlinType? defined in org.jetbrains.kotlin.codegen[SimpleFunctionDescriptorImpl]

'bindingContext' @ [282:40] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.codegen.calcTypeForIEEE754ArithmeticIfNeeded[ValueParameterDescriptorImpl]

'isDoubleOrNullableDouble' @ [284:24] ==> public open fun isDoubleOrNullableDouble(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'ktType' @ [284:49] ==> val ktType: KotlinType defined in org.jetbrains.kotlin.codegen.calcTypeForIEEE754ArithmeticIfNeeded[LocalVariableDescriptor]

'TypeAndNullability' @ [285:16] ==> public constructor TypeAndNullability(type: Type, isNullable: Boolean) defined in org.jetbrains.kotlin.codegen.TypeAndNullability[ClassConstructorDescriptorImpl]

'DOUBLE_TYPE' @ [285:40] ==> public final val DOUBLE_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'isNullableType' @ [285:63] ==> public open fun isNullableType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'ktType' @ [285:78] ==> val ktType: KotlinType defined in org.jetbrains.kotlin.codegen.calcTypeForIEEE754ArithmeticIfNeeded[LocalVariableDescriptor]

'isFloatOrNullableFloat' @ [288:24] ==> public open fun isFloatOrNullableFloat(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'ktType' @ [288:47] ==> val ktType: KotlinType defined in org.jetbrains.kotlin.codegen.calcTypeForIEEE754ArithmeticIfNeeded[LocalVariableDescriptor]

'TypeAndNullability' @ [289:16] ==> public constructor TypeAndNullability(type: Type, isNullable: Boolean) defined in org.jetbrains.kotlin.codegen.TypeAndNullability[ClassConstructorDescriptorImpl]

'FLOAT_TYPE' @ [289:40] ==> public final val FLOAT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'isNullableType' @ [289:62] ==> public open fun isNullableType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'ktType' @ [289:77] ==> val ktType: KotlinType defined in org.jetbrains.kotlin.codegen.calcTypeForIEEE754ArithmeticIfNeeded[LocalVariableDescriptor]

'DataFlowValueFactory' @ [292:20] ==> public object DataFlowValueFactory defined in org.jetbrains.kotlin.resolve.calls.smartcasts[FakeCallableDescriptorForObject]

'createDataFlowValue' @ [292:41] ==> @JvmStatic public final fun createDataFlowValue(expression: KtExpression, type: KotlinType, bindingContext: BindingContext, containingDeclarationOrModule: DeclarationDescriptor): DataFlowValue defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[DeserializedSimpleFunctionDescriptor]

'expression' @ [292:61] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.codegen.calcTypeForIEEE754ArithmeticIfNeeded[ValueParameterDescriptorImpl]

'ktType' @ [292:75] ==> val ktType: KotlinType defined in org.jetbrains.kotlin.codegen.calcTypeForIEEE754ArithmeticIfNeeded[LocalVariableDescriptor]

'bindingContext' @ [292:83] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.codegen.calcTypeForIEEE754ArithmeticIfNeeded[ValueParameterDescriptorImpl]

'descriptor' @ [292:99] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.codegen.calcTypeForIEEE754ArithmeticIfNeeded[ValueParameterDescriptorImpl]

'bindingContext' @ [293:23] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.codegen.calcTypeForIEEE754ArithmeticIfNeeded[ValueParameterDescriptorImpl]

'getDataFlowInfoBefore' @ [293:38] ==> public fun BindingContext.getDataFlowInfoBefore(position: PsiElement): DataFlowInfo defined in org.jetbrains.kotlin.resolve.bindingContextUtil[DeserializedSimpleFunctionDescriptor]

'expression' @ [293:60] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.codegen.calcTypeForIEEE754ArithmeticIfNeeded[ValueParameterDescriptorImpl]

'getStableTypes' @ [293:72] ==> public abstract fun getStableTypes(key: DataFlowValue): Set<KotlinType> defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo[DeserializedSimpleFunctionDescriptor]

'dataFlow' @ [293:87] ==> val dataFlow: DataFlowValue defined in org.jetbrains.kotlin.codegen.calcTypeForIEEE754ArithmeticIfNeeded[LocalVariableDescriptor]

'stableTypes' @ [294:12] ==> val stableTypes: Set<KotlinType> defined in org.jetbrains.kotlin.codegen.calcTypeForIEEE754ArithmeticIfNeeded[LocalVariableDescriptor]

'firstNotNullResult' @ [294:24] ==> public inline fun <T, R : Any> Iterable<KotlinType>.firstNotNullResult(transform: (KotlinType) -> TypeAndNullability?): TypeAndNullability? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R : Any> -> TypeAndNullability

'when {
            KotlinBuiltIns.isDoubleOrNullableDouble(it) -> TypeAndNullability(Type.DOUBLE_TYPE, TypeUtils.isNullableType(it))
            KotlinBuiltIns.isFloatOrNullableFloat(it) -> TypeAndNullability(Type.FLOAT_TYPE, TypeUtils.isNullableType(it))
            else -> null
        }' @ [295:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: TypeAndNullability?, entry1: TypeAndNullability?, entry2: TypeAndNullability?): TypeAndNullability?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> TypeAndNullability?

'isDoubleOrNullableDouble' @ [296:28] ==> public open fun isDoubleOrNullableDouble(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'it' @ [296:53] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.codegen.calcTypeForIEEE754ArithmeticIfNeeded.<anonymous>[ValueParameterDescriptorImpl]

'TypeAndNullability' @ [296:60] ==> public constructor TypeAndNullability(type: Type, isNullable: Boolean) defined in org.jetbrains.kotlin.codegen.TypeAndNullability[ClassConstructorDescriptorImpl]

'DOUBLE_TYPE' @ [296:84] ==> public final val DOUBLE_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'isNullableType' @ [296:107] ==> public open fun isNullableType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'it' @ [296:122] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.codegen.calcTypeForIEEE754ArithmeticIfNeeded.<anonymous>[ValueParameterDescriptorImpl]

'isFloatOrNullableFloat' @ [297:28] ==> public open fun isFloatOrNullableFloat(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'it' @ [297:51] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.codegen.calcTypeForIEEE754ArithmeticIfNeeded.<anonymous>[ValueParameterDescriptorImpl]

'TypeAndNullability' @ [297:58] ==> public constructor TypeAndNullability(type: Type, isNullable: Boolean) defined in org.jetbrains.kotlin.codegen.TypeAndNullability[ClassConstructorDescriptorImpl]

'FLOAT_TYPE' @ [297:82] ==> public final val FLOAT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'isNullableType' @ [297:104] ==> public open fun isNullableType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'it' @ [297:119] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.codegen.calcTypeForIEEE754ArithmeticIfNeeded.<anonymous>[ValueParameterDescriptorImpl]

'typeMapper' @ [303:56] ==> value-parameter typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.codegen.asmType[ValueParameterDescriptorImpl]

'mapType' @ [303:67] ==> @NotNull public open fun mapType(@NotNull jetType: KotlinType): Type defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'this' @ [303:75] ==> <this> defined in org.jetbrains.kotlin.codegen.asmType[ReceiverParameterDescriptorImpl]

'this' @ [306:9] ==> <this> defined in org.jetbrains.kotlin.codegen.asmType[ReceiverParameterDescriptorImpl]

'kotlinType' @ [306:14] ==> public fun KtExpression?.kotlinType(bindingContext: BindingContext): KotlinType? defined in org.jetbrains.kotlin.codegen[SimpleFunctionDescriptorImpl]

'bindingContext' @ [306:25] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.codegen.asmType[ValueParameterDescriptorImpl]

'asmType' @ [306:42] ==> public fun KotlinType.asmType(typeMapper: KotlinTypeMapper): Type defined in org.jetbrains.kotlin.codegen[SimpleFunctionDescriptorImpl]

'typeMapper' @ [306:50] ==> value-parameter typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.codegen.asmType[ValueParameterDescriptorImpl]

'VOID_TYPE' @ [306:70] ==> public final val VOID_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'this' @ [308:64] ==> <this> defined in org.jetbrains.kotlin.codegen.kotlinType[ReceiverParameterDescriptorImpl]

'let' @ [308:70] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> KotlinType?): KotlinType? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> KotlinType?

'bindingContext' @ [308:74] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.codegen.kotlinType[ValueParameterDescriptorImpl]

'mutableListOf' @ [310:69] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<Pair<Int, Type>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<Int, Type>

'apply' @ [310:102] ==> @InlineOnly public inline fun <T> MutableList<Pair<Int, Type>>.apply(block: MutableList<Pair<Int, Type>>.() -> Unit): MutableList<Pair<Int, Type>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutableList<Pair<Int, Type>>

'this@withVariableIndices' @ [312:18] ==> <this> defined in org.jetbrains.kotlin.codegen.withVariableIndices[ReceiverParameterDescriptorImpl]

'add' @ [313:9] ==> public abstract fun add(element: Pair<Int, Type>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'index' @ [313:13] ==> var index: Int defined in org.jetbrains.kotlin.codegen.withVariableIndices.<anonymous>[LocalVariableDescriptor]

'type' @ [313:22] ==> val type: Type defined in org.jetbrains.kotlin.codegen.withVariableIndices.<anonymous>[LocalVariableDescriptor]

'index' @ [314:9] ==> var index: Int defined in org.jetbrains.kotlin.codegen.withVariableIndices.<anonymous>[LocalVariableDescriptor]

'type' @ [314:18] ==> val type: Type defined in org.jetbrains.kotlin.codegen.withVariableIndices.<anonymous>[LocalVariableDescriptor]

'size' @ [314:23] ==> public final val Type.size: Int[MyPropertyDescriptor]

'valueParameters' @ [319:9] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'size' @ [319:25] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'typeParameters' @ [319:38] ==> public final val FunctionDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'size' @ [319:53] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'returnType' @ [321:22] ==> public final val FunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'AssertionError' @ [321:42] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'toString' @ [321:57] ==> public open fun toString(): String defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor[DeserializedSimpleFunctionDescriptor]

'valueParameters' @ [322:21] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'type' @ [322:40] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'!' @ [324:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isArray' @ [324:25] ==> public open fun isArray(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'returnType' @ [324:33] ==> val returnType: KotlinType defined in org.jetbrains.kotlin.codegen.isGenericToArray[LocalVariableDescriptor]

'!' @ [324:48] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isArray' @ [324:64] ==> public open fun isArray(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'paramType' @ [324:72] ==> val paramType: KotlinType defined in org.jetbrains.kotlin.codegen.isGenericToArray[LocalVariableDescriptor]

'typeParameters' @ [326:23] ==> public final val FunctionDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'defaultType' @ [326:41] ==> public final val TypeParameterDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'DEFAULT' @ [327:30] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'equalTypes' @ [327:38] ==> public abstract fun equalTypes(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'elementType' @ [327:49] ==> val elementType: SimpleType defined in org.jetbrains.kotlin.codegen.isGenericToArray[LocalVariableDescriptor]

'builtIns' @ [327:62] ==> public val DeclarationDescriptor.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'getArrayElementType' @ [327:71] ==> @NotNull public open fun getArrayElementType(@NotNull p0: KotlinType): KotlinType defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'returnType' @ [327:91] ==> val returnType: KotlinType defined in org.jetbrains.kotlin.codegen.isGenericToArray[LocalVariableDescriptor]

'DEFAULT' @ [328:30] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'equalTypes' @ [328:38] ==> public abstract fun equalTypes(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'elementType' @ [328:49] ==> val elementType: SimpleType defined in org.jetbrains.kotlin.codegen.isGenericToArray[LocalVariableDescriptor]

'builtIns' @ [328:62] ==> public val DeclarationDescriptor.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'getArrayElementType' @ [328:71] ==> @NotNull public open fun getArrayElementType(@NotNull p0: KotlinType): KotlinType defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'paramType' @ [328:91] ==> val paramType: KotlinType defined in org.jetbrains.kotlin.codegen.isGenericToArray[LocalVariableDescriptor]

'!' @ [332:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'valueParameters' @ [332:10] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'isEmpty' @ [332:26] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'!' @ [332:39] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'typeParameters' @ [332:40] ==> public final val FunctionDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'isEmpty' @ [332:55] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'returnType' @ [334:22] ==> public final val FunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'returnType' @ [335:12] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.codegen.isNonGenericToArray[LocalVariableDescriptor]

'isArray' @ [335:49] ==> public open fun isArray(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'returnType' @ [335:57] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.codegen.isNonGenericToArray[LocalVariableDescriptor]

'this' @ [339:9] ==> <this> defined in org.jetbrains.kotlin.codegen.isToArrayFromCollection[ReceiverParameterDescriptorImpl]

'containingDeclaration' @ [341:37] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'containingClassDescriptor' @ [342:9] ==> val containingClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.codegen.isToArrayFromCollection[LocalVariableDescriptor]

'source' @ [342:35] ==> public final val ClassDescriptor.source: SourceElement[MyPropertyDescriptor]

'NO_SOURCE' @ [342:59] ==> public final val NO_SOURCE: (SourceElement..SourceElement?) defined in org.jetbrains.kotlin.descriptors.SourceElement[JavaPropertyDescriptor]

'builtIns' @ [344:27] ==> public val DeclarationDescriptor.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'collection' @ [344:36] ==> public final val KotlinBuiltIns.collection: ClassDescriptor[MyPropertyDescriptor]

'!' @ [345:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isSubclass' @ [345:10] ==> public open fun isSubclass(@NotNull p0: ClassDescriptor, @NotNull p1: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'containingClassDescriptor' @ [345:21] ==> val containingClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.codegen.isToArrayFromCollection[LocalVariableDescriptor]

'collectionClass' @ [345:48] ==> val collectionClass: ClassDescriptor defined in org.jetbrains.kotlin.codegen.isToArrayFromCollection[LocalVariableDescriptor]

'isGenericToArray' @ [347:12] ==> public fun FunctionDescriptor.isGenericToArray(): Boolean defined in org.jetbrains.kotlin.codegen in file codegenUtil.kt[SimpleFunctionDescriptorImpl]

'isNonGenericToArray' @ [347:34] ==> public fun FunctionDescriptor.isNonGenericToArray(): Boolean defined in org.jetbrains.kotlin.codegen in file codegenUtil.kt[SimpleFunctionDescriptorImpl]

'byClassId' @ [350:55] ==> @NotNull public open fun byClassId(@NotNull p0: ClassId): JvmClassName defined in org.jetbrains.kotlin.resolve.jvm.JvmClassName[JavaMethodDescriptor]

'ClassId' @ [350:65] ==> public constructor ClassId(@NotNull p0: FqName, @NotNull p1: Name) defined in org.jetbrains.kotlin.name.ClassId[JavaClassConstructorDescriptor]

'parent' @ [350:73] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'shortName' @ [350:83] ==> @NotNull public open fun shortName(): Name defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'internalName' @ [350:97] ==> public final val JvmClassName.internalName: String[MyPropertyDescriptor]

'getObjectType' @ [351:48] ==> public open fun getObjectType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'topLevelClassInternalName' @ [351:62] ==> public fun FqName.topLevelClassInternalName(): String defined in org.jetbrains.kotlin.codegen[SimpleFunctionDescriptorImpl]

'codegen' @ [354:40] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.initializeVariablesForDestructuredLambdaParameters[ValueParameterDescriptorImpl]

'isShouldMarkLineNumbers' @ [354:48] ==> public final var ExpressionCodegen.isShouldMarkLineNumbers: Boolean[MyPropertyDescriptor]

'codegen' @ [357:5] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.initializeVariablesForDestructuredLambdaParameters[ValueParameterDescriptorImpl]

'isShouldMarkLineNumbers' @ [357:13] ==> public final var ExpressionCodegen.isShouldMarkLineNumbers: Boolean[MyPropertyDescriptor]

'valueParameters' @ [359:33] ==> value-parameter valueParameters: List<ValueParameterDescriptor> defined in org.jetbrains.kotlin.codegen.initializeVariablesForDestructuredLambdaParameters[ValueParameterDescriptorImpl]

'parameterDescriptor' @ [360:13] ==> val parameterDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.codegen.initializeVariablesForDestructuredLambdaParameters[LocalVariableDescriptor]

'parameterDescriptor' @ [362:23] ==> val parameterDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.codegen.initializeVariablesForDestructuredLambdaParameters[LocalVariableDescriptor]

'destructuringVariables' @ [362:43] ==> public final val destructuringVariables: List<VariableDescriptor> defined in org.jetbrains.kotlin.descriptors.impl.ValueParameterDescriptorImpl.WithDestructuringDeclaration[DeserializedPropertyDescriptor]

'filterOutDescriptorsWithSpecialNames' @ [362:66] ==> public fun Collection<VariableDescriptor>.filterOutDescriptorsWithSpecialNames(): List<VariableDescriptor> defined in org.jetbrains.kotlin.codegen[SimpleFunctionDescriptorImpl]

'codegen' @ [363:13] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.initializeVariablesForDestructuredLambdaParameters[ValueParameterDescriptorImpl]

'myFrameMap' @ [363:21] ==> public final val myFrameMap: (FrameMap..FrameMap?) defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaPropertyDescriptor]

'enter' @ [363:32] ==> public open fun enter(descriptor: (DeclarationDescriptor..DeclarationDescriptor?), type: (Type..Type?)): Int defined in org.jetbrains.kotlin.codegen.FrameMap[JavaMethodDescriptor]

'entry' @ [363:38] ==> val entry: VariableDescriptor defined in org.jetbrains.kotlin.codegen.initializeVariablesForDestructuredLambdaParameters[LocalVariableDescriptor]

'codegen' @ [363:45] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.initializeVariablesForDestructuredLambdaParameters[ValueParameterDescriptorImpl]

'typeMapper' @ [363:53] ==> public/*package*/ final val typeMapper: (KotlinTypeMapper..KotlinTypeMapper?) defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaPropertyDescriptor]

'mapType' @ [363:64] ==> @NotNull public open fun mapType(@NotNull jetType: KotlinType): Type defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'entry' @ [363:72] ==> val entry: VariableDescriptor defined in org.jetbrains.kotlin.codegen.initializeVariablesForDestructuredLambdaParameters[LocalVariableDescriptor]

'type' @ [363:78] ==> public final val VariableDescriptor.type: KotlinType[MyPropertyDescriptor]

'?:' @ [367:17] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtDestructuringDeclaration?, right: KtDestructuringDeclaration): KtDestructuringDeclaration[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtDestructuringDeclaration

'DescriptorToSourceUtils' @ [367:18] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [367:42] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'parameterDescriptor' @ [367:66] ==> val parameterDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.codegen.initializeVariablesForDestructuredLambdaParameters[LocalVariableDescriptor]

'destructuringDeclaration' @ [367:105] ==> public final val KtParameter.destructuringDeclaration: KtDestructuringDeclaration?[MyPropertyDescriptor]

'error' @ [368:20] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'parameterDescriptor' @ [368:69] ==> val parameterDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.codegen.initializeVariablesForDestructuredLambdaParameters[LocalVariableDescriptor]

'codegen' @ [370:9] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.initializeVariablesForDestructuredLambdaParameters[ValueParameterDescriptorImpl]

'initializeDestructuringDeclarationVariables' @ [370:17] ==> public open fun initializeDestructuringDeclarationVariables(@NotNull destructuringDeclaration: KtDestructuringDeclaration, @NotNull receiver: ReceiverValue, @NotNull receiverStackValue: StackValue): Unit defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaMethodDescriptor]

'destructuringDeclaration' @ [371:17] ==> val destructuringDeclaration: KtDestructuringDeclaration defined in org.jetbrains.kotlin.codegen.initializeVariablesForDestructuredLambdaParameters[LocalVariableDescriptor]

'TransientReceiver' @ [372:17] ==> public constructor TransientReceiver(@NotNull p0: KotlinType) defined in org.jetbrains.kotlin.resolve.scopes.receivers.TransientReceiver[JavaClassConstructorDescriptor]

'parameterDescriptor' @ [372:35] ==> val parameterDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.codegen.initializeVariablesForDestructuredLambdaParameters[LocalVariableDescriptor]

'type' @ [372:55] ==> public final val ValueParameterDescriptorImpl.WithDestructuringDeclaration.type: KotlinType[MyPropertyDescriptor]

'codegen' @ [373:17] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.initializeVariablesForDestructuredLambdaParameters[ValueParameterDescriptorImpl]

'findLocalOrCapturedValue' @ [373:25] ==> @Nullable public open fun findLocalOrCapturedValue(@NotNull descriptor: DeclarationDescriptor): StackValue? defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaMethodDescriptor]

'parameterDescriptor' @ [373:50] ==> val parameterDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.codegen.initializeVariablesForDestructuredLambdaParameters[LocalVariableDescriptor]

'error' @ [373:74] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'parameterDescriptor' @ [373:116] ==> val parameterDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.codegen.initializeVariablesForDestructuredLambdaParameters[LocalVariableDescriptor]

'codegen' @ [377:5] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.initializeVariablesForDestructuredLambdaParameters[ValueParameterDescriptorImpl]

'isShouldMarkLineNumbers' @ [377:13] ==> public final var ExpressionCodegen.isShouldMarkLineNumbers: Boolean[MyPropertyDescriptor]

'savedIsShouldMarkLineNumbers' @ [377:39] ==> val savedIsShouldMarkLineNumbers: Boolean defined in org.jetbrains.kotlin.codegen.initializeVariablesForDestructuredLambdaParameters[LocalVariableDescriptor]

'unwrapInitialDescriptorForSuspendFunction' @ [380:58] ==> @Suppress public fun <D : CallableDescriptor?> D.unwrapInitialDescriptorForSuspendFunction(): D defined in org.jetbrains.kotlin.codegen.coroutines[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor?> -> D

'enterTemp' @ [383:17] ==> public open fun enterTemp(type: (Type..Type?)): Int defined in org.jetbrains.kotlin.codegen.FrameMap[JavaMethodDescriptor]

'type' @ [383:27] ==> value-parameter type: Type defined in org.jetbrains.kotlin.codegen.useTmpVar[ValueParameterDescriptorImpl]

'invoke' @ [384:5] ==> public abstract operator fun invoke(index: @ParameterName Int): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'index' @ [384:11] ==> val index: Int defined in org.jetbrains.kotlin.codegen.useTmpVar[LocalVariableDescriptor]

'leaveTemp' @ [385:5] ==> public open fun leaveTemp(type: (Type..Type?)): Unit defined in org.jetbrains.kotlin.codegen.FrameMap[JavaMethodDescriptor]

'type' @ [385:15] ==> value-parameter type: Type defined in org.jetbrains.kotlin.codegen.useTmpVar[ValueParameterDescriptorImpl]

'frameMap' @ [393:5] ==> value-parameter frameMap: FrameMap defined in org.jetbrains.kotlin.codegen.generateNewInstanceDupAndPlaceBeforeStackTop[ValueParameterDescriptorImpl]

'useTmpVar' @ [393:14] ==> public inline fun FrameMap.useTmpVar(type: Type, block: (index: Int) -> Unit): Unit defined in org.jetbrains.kotlin.codegen[SimpleFunctionDescriptorImpl]

'topStackType' @ [393:24] ==> value-parameter topStackType: Type defined in org.jetbrains.kotlin.codegen.generateNewInstanceDupAndPlaceBeforeStackTop[ValueParameterDescriptorImpl]

'store' @ [394:9] ==> public open fun store(p0: Int, p1: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'index' @ [394:15] ==> value-parameter index: Int defined in org.jetbrains.kotlin.codegen.generateNewInstanceDupAndPlaceBeforeStackTop.<anonymous>[ValueParameterDescriptorImpl]

'topStackType' @ [394:22] ==> value-parameter topStackType: Type defined in org.jetbrains.kotlin.codegen.generateNewInstanceDupAndPlaceBeforeStackTop[ValueParameterDescriptorImpl]

'anew' @ [395:9] ==> public open fun anew(p0: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'getObjectType' @ [395:19] ==> public open fun getObjectType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'newInstanceInternalName' @ [395:33] ==> value-parameter newInstanceInternalName: String defined in org.jetbrains.kotlin.codegen.generateNewInstanceDupAndPlaceBeforeStackTop[ValueParameterDescriptorImpl]

'dup' @ [396:9] ==> public open fun dup(): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'load' @ [397:9] ==> public open fun load(p0: Int, p1: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'index' @ [397:14] ==> value-parameter index: Int defined in org.jetbrains.kotlin.codegen.generateNewInstanceDupAndPlaceBeforeStackTop.<anonymous>[ValueParameterDescriptorImpl]

'topStackType' @ [397:21] ==> value-parameter topStackType: Type defined in org.jetbrains.kotlin.codegen.generateNewInstanceDupAndPlaceBeforeStackTop[ValueParameterDescriptorImpl]

'type' @ [402:16] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.codegen.extractReificationArgument[ValueParameterDescriptorImpl]

'type' @ [404:22] ==> var type: KotlinType defined in org.jetbrains.kotlin.codegen.extractReificationArgument[LocalVariableDescriptor]

'isMarkedNullable' @ [404:27] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'isArray' @ [405:27] ==> public open fun isArray(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [405:35] ==> var type: KotlinType defined in org.jetbrains.kotlin.codegen.extractReificationArgument[LocalVariableDescriptor]

'arrayDepth' @ [406:9] ==> var arrayDepth: Int defined in org.jetbrains.kotlin.codegen.extractReificationArgument[LocalVariableDescriptor]

'type' @ [407:9] ==> var type: KotlinType defined in org.jetbrains.kotlin.codegen.extractReificationArgument[LocalVariableDescriptor]

'type' @ [407:16] ==> var type: KotlinType defined in org.jetbrains.kotlin.codegen.extractReificationArgument[LocalVariableDescriptor]

'arguments' @ [407:21] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'type' @ [407:34] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'?:' @ [410:31] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: TypeParameterDescriptor?, right: TypeParameterDescriptor): TypeParameterDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> TypeParameterDescriptor

'getTypeParameterDescriptorOrNull' @ [410:41] ==> @Nullable public open fun getTypeParameterDescriptorOrNull(@NotNull p0: KotlinType): TypeParameterDescriptor? defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'type' @ [410:74] ==> var type: KotlinType defined in org.jetbrains.kotlin.codegen.extractReificationArgument[LocalVariableDescriptor]

'Pair' @ [412:12] ==> public constructor Pair<out A, out B>(first: TypeParameterDescriptor, second: ReificationArgument) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> TypeParameterDescriptor
    <out B> -> ReificationArgument

'parameterDescriptor' @ [412:17] ==> val parameterDescriptor: TypeParameterDescriptor defined in org.jetbrains.kotlin.codegen.extractReificationArgument[LocalVariableDescriptor]

'ReificationArgument' @ [412:38] ==> public constructor ReificationArgument(parameterName: String, nullable: Boolean, arrayDepth: Int) defined in org.jetbrains.kotlin.codegen.inline.ReificationArgument[ClassConstructorDescriptorImpl]

'parameterDescriptor' @ [412:58] ==> val parameterDescriptor: TypeParameterDescriptor defined in org.jetbrains.kotlin.codegen.extractReificationArgument[LocalVariableDescriptor]

'name' @ [412:78] ==> public final val TypeParameterDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [412:83] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'isNullable' @ [412:95] ==> val isNullable: Boolean defined in org.jetbrains.kotlin.codegen.extractReificationArgument[LocalVariableDescriptor]

'arrayDepth' @ [412:107] ==> var arrayDepth: Int defined in org.jetbrains.kotlin.codegen.extractReificationArgument[LocalVariableDescriptor]

'function' @ [416:9] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.unwrapInitialSignatureDescriptor[ValueParameterDescriptorImpl]

'initialSignatureDescriptor' @ [416:18] ==> public final val FunctionDescriptor.initialSignatureDescriptor: FunctionDescriptor?[MyPropertyDescriptor]

'function' @ [416:48] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.codegen.unwrapInitialSignatureDescriptor[ValueParameterDescriptorImpl]

'generateReceiverValue' @ [419:9] ==> @NotNull public open fun generateReceiverValue(@Nullable receiverValue: ReceiverValue?, isSuper: Boolean): StackValue defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaMethodDescriptor]

'rangeCall' @ [419:31] ==> value-parameter rangeCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.codegen.generateCallReceiver[ValueParameterDescriptorImpl]

'extensionReceiver' @ [419:41] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'rangeCall' @ [419:62] ==> value-parameter rangeCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.codegen.generateCallReceiver[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [419:72] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'gen' @ [422:9] ==> public open fun gen(expr: (KtElement..KtElement?)): (StackValue..StackValue?) defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaMethodDescriptor]

'!!' @ [422:13] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: KtExpression?): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> KtExpression

'getSingleArgumentExpression' @ [422:31] ==> @Nullable public open fun getSingleArgumentExpression(@NotNull resolvedCall: ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>): KtExpression? defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaMethodDescriptor]

'rangeCall' @ [422:59] ==> value-parameter rangeCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.codegen.generateCallSingleArgument[ValueParameterDescriptorImpl]

