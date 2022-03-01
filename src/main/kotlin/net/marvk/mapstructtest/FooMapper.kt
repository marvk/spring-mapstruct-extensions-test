package net.marvk.mapstructtest

import org.mapstruct.Mapper
import org.springframework.core.convert.converter.Converter

@Mapper
interface FooMapper : Converter<Foo, FooDto> {
    override fun convert(source: Foo): FooDto
}
